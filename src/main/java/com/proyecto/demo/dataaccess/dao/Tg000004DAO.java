package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tg000004;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * Tg000004 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tg000004
 */
@Scope("singleton")
@Repository("Tg000004DAO")
public class Tg000004DAO extends HibernateDaoImpl<Tg000004, String>
    implements ITg000004DAO {
    private static final Logger log = LoggerFactory.getLogger(Tg000004DAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static ITg000004DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITg000004DAO) ctx.getBean("Tg000004DAO");
    }
}
