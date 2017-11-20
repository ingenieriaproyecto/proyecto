package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tlp00002;
import com.proyecto.demo.modelo.Tlp00002Id;

import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tlp00002 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00002
 */
@Scope("singleton")
@Repository("Tlp00002DAO")
public class Tlp00002DAO extends HibernateDaoImpl<Tlp00002, Tlp00002Id>
    implements ITlp00002DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITlp00002DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00002DAO) ctx.getBean("Tlp00002DAO");
    }
}
