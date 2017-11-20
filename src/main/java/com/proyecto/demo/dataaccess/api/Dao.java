package com.proyecto.demo.dataaccess.api;

import java.io.Serializable;

import java.util.List;



public interface Dao<T, PK extends Serializable> {
  
    void save(T newEntity) throws DaoException;

    T findById(PK id);

  
    T load(PK id);


    void update(T entity) throws DaoException;

    void saveOrUpdate(T entity) throws DaoException;


    void saveOrUpdate(T entity, boolean flush) throws DaoException;


    T merge(T entity) throws DaoException;


    void delete(T entity) throws DaoException;


    void deleteAll() throws DaoException;

 
    void deleteByProperty(String tableName, String propertyName, Object value)
        throws DaoException;

  
    void deleteById(PK id) throws DaoException;

 
    List<T> findByProperty(String propertyName, Object value);

    List<T> find(String queryString);

    List<T> find(String queryString, Object value);

 
    List<T> find(String queryString, Object... values);

   
    List<T> findByNamedParam(String queryString, String paramName, Object value);

 
    List<T> findByNamedParam(String queryString, String[] paramNames,
        Object[] values);

    
    Long count();

  
    List<T> findAll();

    public List<T> findPage(String sortColumnName, boolean sortAscending,
        int startRow, int maxResults);

    public List<T> findByCriteria(String whereCondition);
}
