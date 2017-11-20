package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tg000013;


import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000013 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000013
 */
@Scope("singleton")
@Repository("Tg000013DAO")
public class Tg000013DAO extends HibernateDaoImpl<Tg000013, String>
    implements ITg000013DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000013DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000013DAO) ctx.getBean("Tg000013DAO");
    }
}
