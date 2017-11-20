package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tr000004;
import com.proyecto.demo.modelo.Tr000004Id;

import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tr000004 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tr000004
 */
@Scope("singleton")
@Repository("Tr000004DAO")
public class Tr000004DAO extends HibernateDaoImpl<Tr000004, Tr000004Id>
    implements ITr000004DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITr000004DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITr000004DAO) ctx.getBean("Tr000004DAO");
    }
}
