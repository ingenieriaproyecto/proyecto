package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tp000003;

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
 * Tp000003 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tp000003
 */
@Scope("singleton")
@Repository("Tp000003DAO")
public class Tp000003DAO extends HibernateDaoImpl<Tp000003, String>
    implements ITp000003DAO {
    private static final Logger log = LoggerFactory.getLogger(Tp000003DAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static ITp000003DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITp000003DAO) ctx.getBean("Tp000003DAO");
    }
}
