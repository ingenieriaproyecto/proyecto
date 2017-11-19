package com.proyecto.demo.modelo.control;

import com.proyecto.demo.dataaccess.dao.*;
import com.proyecto.demo.dto.mapper.ITp000006Mapper;
import com.proyecto.demo.exceptions.*;
import com.proyecto.demo.modelo.*;
import com.proyecto.demo.modelo.dto.Tp000006DTO;
import com.proyecto.demo.utilities.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("Tp000006Logic")
public class Tp000006Logic implements ITp000006Logic {
    private static final Logger log = LoggerFactory.getLogger(Tp000006Logic.class);

    /**
     * DAO injected by Spring that manages Tp000006 entities
     *
     */
    @Autowired
    private ITp000006DAO tp000006DAO;
    @Autowired
    private ITp000006Mapper tp000006Mapper;
    @Autowired
    private Validator validator;

    /**
    * DAO injected by Spring that manages Tp000001 entities
    *
    */
    @Autowired
    private ITp000001DAO tp000001DAO;

    /**
    * DAO injected by Spring that manages Tr000004 entities
    *
    */
    @Autowired
    private ITr000004DAO tr000004DAO;

    public void validateTp000006(Tp000006 tp000006) throws Exception {
        try {
            Set<ConstraintViolation<Tp000006>> constraintViolations = validator.validate(tp000006);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tp000006> constraintViolation : constraintViolations) {
                    strMessage.append(constraintViolation.getPropertyPath()
                                                         .toString());
                    strMessage.append(" - ");
                    strMessage.append(constraintViolation.getMessage());
                    strMessage.append(". \n");
                }

                throw new Exception(strMessage.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000006> getTp000006() throws Exception {
        log.debug("finding all Tp000006 instances");

        List<Tp000006> list = new ArrayList<Tp000006>();

        try {
            list = tp000006DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tp000006 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tp000006");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTp000006(Tp000006 entity) throws Exception {
        log.debug("saving Tp000006 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000006");
            }

            validateTp000006(entity);

            if (getTp000006(entity.getCodCaja()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tp000006DAO.save(entity);

            log.debug("save Tp000006 successful");
        } catch (Exception e) {
            log.error("save Tp000006 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTp000006(Tp000006 entity) throws Exception {
        log.debug("deleting Tp000006 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tp000006");
        }

        if (entity.getCodCaja() == null) {
            throw new ZMessManager().new EmptyFieldException("codCaja");
        }

        List<Tp000001> tp000001s = null;
        List<Tr000004> tr000004s = null;

        try {
            tp000001s = tp000001DAO.findByProperty("tp000006.codCaja",
                    entity.getCodCaja());

            if (Utilities.validationsList(tp000001s) == true) {
                throw new ZMessManager().new DeletingException("tp000001s");
            }

            tr000004s = tr000004DAO.findByProperty("tp000006.codCaja",
                    entity.getCodCaja());

            if (Utilities.validationsList(tr000004s) == true) {
                throw new ZMessManager().new DeletingException("tr000004s");
            }

            tp000006DAO.delete(entity);

            log.debug("delete Tp000006 successful");
        } catch (Exception e) {
            log.error("delete Tp000006 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTp000006(Tp000006 entity) throws Exception {
        log.debug("updating Tp000006 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000006");
            }

            validateTp000006(entity);

            tp000006DAO.update(entity);

            log.debug("update Tp000006 successful");
        } catch (Exception e) {
            log.error("update Tp000006 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000006DTO> getDataTp000006() throws Exception {
        try {
            List<Tp000006> tp000006 = tp000006DAO.findAll();

            List<Tp000006DTO> tp000006DTO = new ArrayList<Tp000006DTO>();

            for (Tp000006 tp000006Tmp : tp000006) {
                Tp000006DTO tp000006DTO2 = tp000006Mapper.tp000006ToTp000006DTO(tp000006Tmp);
                tp000006DTO.add(tp000006DTO2);
            }

            return tp000006DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000006 getTp000006(String codCaja) throws Exception {
        log.debug("getting Tp000006 instance");

        Tp000006 entity = null;

        try {
            entity = tp000006DAO.findById(codCaja);
        } catch (Exception e) {
            log.error("get Tp000006 failed", e);
            throw new ZMessManager().new FindingException("Tp000006");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tp000006> findPageTp000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tp000006> entity = null;

        try {
            entity = tp000006DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000006 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTp000006() throws Exception {
        Long entity = null;

        try {
            entity = tp000006DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000006 Count");
        } finally {
        }

        return entity;
    }

    /**
    *
    * @param varibles
    *            este arreglo debera tener:
    *
    * [0] = String variable = (String) varibles[i]; representa como se llama la
    * variable en el pojo
    *
    * [1] = Boolean booVariable = (Boolean) varibles[i + 1]; representa si el
    * valor necesita o no ''(comillas simples)usado para campos de tipo string
    *
    * [2] = Object value = varibles[i + 2]; representa el valor que se va a
    * buscar en la BD
    *
    * [3] = String comparator = (String) varibles[i + 3]; representa que tipo
    * de busqueda voy a hacer.., ejemplo: where nombre=william o where nombre<>william,
        * en este campo iria el tipo de comparador que quiero si es = o <>
            *
            * Se itera de 4 en 4..., entonces 4 registros del arreglo representan 1
            * busqueda en un campo, si se ponen mas pues el continuara buscando en lo
            * que se le ingresen en los otros 4
            *
            *
            * @param variablesBetween
            *
            * la diferencia son estas dos posiciones
            *
            * [0] = String variable = (String) varibles[j]; la variable ne la BD que va
            * a ser buscada en un rango
            *
            * [1] = Object value = varibles[j + 1]; valor 1 para buscar en un rango
            *
            * [2] = Object value2 = varibles[j + 2]; valor 2 para buscar en un rango
            * ejempolo: a > 1 and a < 5 --> 1 seria value y 5 seria value2
                *
                * [3] = String comparator1 = (String) varibles[j + 3]; comparador 1
                * ejemplo: a comparator1 1 and a < 5
                    *
                    * [4] = String comparator2 = (String) varibles[j + 4]; comparador 2
                    * ejemplo: a comparador1>1  and a comparador2<5  (el original: a > 1 and a <
                            * 5) *
                            * @param variablesBetweenDates(en
                            *            este caso solo para mysql)
                            *  [0] = String variable = (String) varibles[k]; el nombre de la variable que hace referencia a
                            *            una fecha
                            *
                            * [1] = Object object1 = varibles[k + 2]; fecha 1 a comparar(deben ser
                            * dates)
                            *
                            * [2] = Object object2 = varibles[k + 3]; fecha 2 a comparar(deben ser
                            * dates)
                            *
                            * esto hace un between entre las dos fechas.
                            *
                            * @return lista con los objetos que se necesiten
                            * @throws Exception
                            */
    @Transactional(readOnly = true)
    public List<Tp000006> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tp000006> list = new ArrayList<Tp000006>();
        String where = new String();
        String tempWhere = new String();

        if (variables != null) {
            for (int i = 0; i < variables.length; i++) {
                if ((variables[i] != null) && (variables[i + 1] != null) &&
                        (variables[i + 2] != null) &&
                        (variables[i + 3] != null)) {
                    String variable = (String) variables[i];
                    Boolean booVariable = (Boolean) variables[i + 1];
                    Object value = variables[i + 2];
                    String comparator = (String) variables[i + 3];

                    if (booVariable.booleanValue()) {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " \'" +
                            value + "\' )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " \'" + value + "\' )");
                    } else {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " " +
                            value + " )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " " + value + " )");
                    }
                }

                i = i + 3;
            }
        }

        if (variablesBetween != null) {
            for (int j = 0; j < variablesBetween.length; j++) {
                if ((variablesBetween[j] != null) &&
                        (variablesBetween[j + 1] != null) &&
                        (variablesBetween[j + 2] != null) &&
                        (variablesBetween[j + 3] != null) &&
                        (variablesBetween[j + 4] != null)) {
                    String variable = (String) variablesBetween[j];
                    Object value = variablesBetween[j + 1];
                    Object value2 = variablesBetween[j + 2];
                    String comparator1 = (String) variablesBetween[j + 3];
                    String comparator2 = (String) variablesBetween[j + 4];
                    tempWhere = (tempWhere.length() == 0)
                        ? ("(" + value + " " + comparator1 + " " + variable +
                        " and " + variable + " " + comparator2 + " " + value2 +
                        " )")
                        : (tempWhere + " AND (" + value + " " + comparator1 +
                        " " + variable + " and " + variable + " " +
                        comparator2 + " " + value2 + " )");
                }

                j = j + 4;
            }
        }

        if (variablesBetweenDates != null) {
            for (int k = 0; k < variablesBetweenDates.length; k++) {
                if ((variablesBetweenDates[k] != null) &&
                        (variablesBetweenDates[k + 1] != null) &&
                        (variablesBetweenDates[k + 2] != null)) {
                    String variable = (String) variablesBetweenDates[k];
                    Object object1 = variablesBetweenDates[k + 1];
                    Object object2 = variablesBetweenDates[k + 2];
                    String value = null;
                    String value2 = null;

                    try {
                        Date date1 = (Date) object1;
                        Date date2 = (Date) object2;
                        value = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date1);
                        value2 = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date2);
                    } catch (Exception e) {
                        list = null;
                        throw e;
                    }

                    tempWhere = (tempWhere.length() == 0)
                        ? ("(model." + variable + " between " + value +
                        " and " + value2 + ")")
                        : (tempWhere + " AND (model." + variable + " between " +
                        value + " and " + value2 + ")");
                }

                k = k + 2;
            }
        }

        if (tempWhere.length() == 0) {
            where = null;
        } else {
            where = "(" + tempWhere + ")";
        }

        try {
            list = tp000006DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
