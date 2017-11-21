package com.proyecto.demo.modelo.control;

import com.proyecto.demo.dataaccess.dao.*;
import com.proyecto.demo.dto.mapper.ITg000001Mapper;
import com.proyecto.demo.exceptions.*;
import com.proyecto.demo.modelo.*;
import com.proyecto.demo.modelo.dto.Tg000001DTO;
import com.proyecto.demo.utilities.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



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
@Service("Tg000001Logic")
public class Tg000001Logic implements ITg000001Logic {
    private static final Logger log = LoggerFactory.getLogger(Tg000001Logic.class);

    /**
     * DAO injected by Spring that manages Tg000001 entities
     *
     */
    @Autowired
    private ITg000001DAO tg000001DAO;
    @Autowired
    private ITg000001Mapper tg000001Mapper;
    @Autowired
    private Validator validator;

    /**
    * DAO injected by Spring that manages Tg000008 entities
    *
    */
    @Autowired
    private ITg000008DAO tg000008DAO;

    /**
    * DAO injected by Spring that manages Tlp00001 entities
    *
    */
    @Autowired
    private ITlp00001DAO tlp00001DAO;

    public void validateTg000001(Tg000001 tg000001) throws Exception {
        try {
            Set<ConstraintViolation<Tg000001>> constraintViolations = validator.validate(tg000001);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tg000001> constraintViolation : constraintViolations) {
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
    public List<Tg000001> getTg000001() throws Exception {
        log.debug("finding all Tg000001 instances");

        List<Tg000001> list = new ArrayList<Tg000001>();

        try {
            list = tg000001DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tg000001 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tg000001");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTg000001(Tg000001 entity) throws Exception {
        log.debug("saving Tg000001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tg000001");
            }

            validateTg000001(entity);

            if (getTg000001(entity.getCodBanco()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tg000001DAO.save(entity);

            log.debug("save Tg000001 successful");
        } catch (Exception e) {
            log.error("save Tg000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTg000001(Tg000001 entity) throws Exception {
        log.debug("deleting Tg000001 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tg000001");
        }

        if (entity.getCodBanco() == null) {
            throw new ZMessManager().new EmptyFieldException("codBanco");
        }

        List<Tg000008> tg000008s = null;
        List<Tlp00001> tlp00001s = null;

        try {
            tg000008s = tg000008DAO.findByProperty("tg000001.codBanco",
                    entity.getCodBanco());

            if (Utilities.validationsList(tg000008s) == true) {
                throw new ZMessManager().new DeletingException("tg000008s");
            }

            tlp00001s = tlp00001DAO.findByProperty("tg000001.codBanco",
                    entity.getCodBanco());

            if (Utilities.validationsList(tlp00001s) == true) {
                throw new ZMessManager().new DeletingException("tlp00001s");
            }

            tg000001DAO.delete(entity);

            log.debug("delete Tg000001 successful");
        } catch (Exception e) {
            log.error("delete Tg000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTg000001(Tg000001 entity) throws Exception {
        log.debug("updating Tg000001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tg000001");
            }

            validateTg000001(entity);

            tg000001DAO.update(entity);

            log.debug("update Tg000001 successful");
        } catch (Exception e) {
            log.error("update Tg000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000001DTO> getDataTg000001() throws Exception {
        try {
            List<Tg000001> tg000001 = tg000001DAO.findAll();

            List<Tg000001DTO> tg000001DTO = new ArrayList<Tg000001DTO>();

            for (Tg000001 tg000001Tmp : tg000001) {
                Tg000001DTO tg000001DTO2 = tg000001Mapper.tg000001ToTg000001DTO(tg000001Tmp);
                tg000001DTO.add(tg000001DTO2);
            }

            return tg000001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000001 getTg000001(String codBanco) throws Exception {
        log.debug("getting Tg000001 instance");

        Tg000001 entity = null;

        try {
            entity = tg000001DAO.findById(codBanco);
        } catch (Exception e) {
            log.error("get Tg000001 failed", e);
            throw new ZMessManager().new FindingException("Tg000001");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tg000001> findPageTg000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tg000001> entity = null;

        try {
            entity = tg000001DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tg000001 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTg000001() throws Exception {
        Long entity = null;

        try {
            entity = tg000001DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tg000001 Count");
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
    public List<Tg000001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tg000001> list = new ArrayList<Tg000001>();
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
            list = tg000001DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
