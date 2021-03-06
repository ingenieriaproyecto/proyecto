package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tg000028;


import org.hibernate.SessionFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000028 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000028
 */
@Scope("singleton")
@Repository("Tg000028DAO")
public class Tg000028DAO extends HibernateDaoImpl<Tg000028, String>
    implements ITg000028DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000028DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000028DAO) ctx.getBean("Tg000028DAO");
    }
}
