package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tg000002;


import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;


import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000002 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000002
 */
@Scope("singleton")
@Repository("Tg000002DAO")
public class Tg000002DAO extends HibernateDaoImpl<Tg000002, String>
    implements ITg000002DAO {
  
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000002DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000002DAO) ctx.getBean("Tg000002DAO");
    }
}
