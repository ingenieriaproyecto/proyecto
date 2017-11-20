package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tp000004;


import org.hibernate.SessionFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;


import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tp000004 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tp000004
 */
@Scope("singleton")
@Repository("Tp000004DAO")
public class Tp000004DAO extends HibernateDaoImpl<Tp000004, String>
    implements ITp000004DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITp000004DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITp000004DAO) ctx.getBean("Tp000004DAO");
    }
}
