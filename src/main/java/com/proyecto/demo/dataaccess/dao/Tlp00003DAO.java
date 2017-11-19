package com.proyecto.demo.dataaccess.dao;

import com.proyecto.demo.dataaccess.api.HibernateDaoImpl;
import com.proyecto.demo.modelo.Tlp00003;
import com.proyecto.demo.modelo.Tlp00003Id;

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
 * Tlp00003 entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.Tlp00003
 */
@Scope("singleton")
@Repository("Tlp00003DAO")
public class Tlp00003DAO extends HibernateDaoImpl<Tlp00003, Tlp00003Id>
    implements ITlp00003DAO {
    private static final Logger log = LoggerFactory.getLogger(Tlp00003DAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static ITlp00003DAO getFromApplicationContext(ApplicationContext ctx) {
        return (ITlp00003DAO) ctx.getBean("Tlp00003DAO");
    }
}
