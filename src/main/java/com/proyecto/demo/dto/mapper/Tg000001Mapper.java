package com.proyecto.demo.dto.mapper;


import com.proyecto.demo.modelo.Tg000001;

import com.proyecto.demo.modelo.dto.Tg000001DTO;



import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Component
@Scope("singleton")
public class Tg000001Mapper implements ITg000001Mapper {
   

    @Transactional(readOnly = true)
    public Tg000001DTO tg000001ToTg000001DTO(Tg000001 tg000001)
        throws Exception {
        try {
            Tg000001DTO tg000001DTO = new Tg000001DTO();

            tg000001DTO.setCodBanco(tg000001.getCodBanco());
            tg000001DTO.setNomBanco((tg000001.getNomBanco() != null)
                ? tg000001.getNomBanco() : null);

            return tg000001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000001 tg000001DTOToTg000001(Tg000001DTO tg000001DTO)
        throws Exception {
        try {
            Tg000001 tg000001 = new Tg000001();

            tg000001.setCodBanco(tg000001DTO.getCodBanco());
            tg000001.setNomBanco((tg000001DTO.getNomBanco() != null)
                ? tg000001DTO.getNomBanco() : null);

            return tg000001;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000001DTO> listTg000001ToListTg000001DTO(
        List<Tg000001> listTg000001) throws Exception {
        try {
            List<Tg000001DTO> tg000001DTOs = new ArrayList<Tg000001DTO>();

            for (Tg000001 tg000001 : listTg000001) {
                Tg000001DTO tg000001DTO = tg000001ToTg000001DTO(tg000001);

                tg000001DTOs.add(tg000001DTO);
            }

            return tg000001DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000001> listTg000001DTOToListTg000001(
        List<Tg000001DTO> listTg000001DTO) throws Exception {
        try {
            List<Tg000001> listTg000001 = new ArrayList<Tg000001>();

            for (Tg000001DTO tg000001DTO : listTg000001DTO) {
                Tg000001 tg000001 = tg000001DTOToTg000001(tg000001DTO);

                listTg000001.add(tg000001);
            }

            return listTg000001;
        } catch (Exception e) {
            throw e;
        }
    }
}
