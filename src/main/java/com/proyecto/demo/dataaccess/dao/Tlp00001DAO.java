package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tlp00001;
import com.proyecto.demo.modelo.Tlp00001Id;


import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tlp00001 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00001
 */
@Scope("singleton")
@Repository("Tlp00001DAO")
public class Tlp00001DAO extends HibernateDaoImpl<Tlp00001, Tlp00001Id>
    implements ITlp00001DAO {
    
    @Resource
    private SessionFactory sessionFactory;

    public static ITlp00001DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00001DAO) ctx.getBean("Tlp00001DAO");
    }
}
