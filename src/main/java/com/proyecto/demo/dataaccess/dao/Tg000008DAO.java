package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tg000008;
import com.proyecto.demo.modelo.Tg000008Id;


import org.hibernate.SessionFactory;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;



import org.springframework.stereotype.Repository;



import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000008 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000008
 */
@Scope("singleton")
@Repository("Tg000008DAO")
public class Tg000008DAO extends HibernateDaoImpl<Tg000008, Tg000008Id>
    implements ITg000008DAO {
   
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000008DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000008DAO) ctx.getBean("Tg000008DAO");
    }
}
