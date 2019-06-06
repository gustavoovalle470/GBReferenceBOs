/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO.security.porfiling;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.profiling.GbMenuProfiling;
import com.gabyval.spring.DAO.IGabyvalDAO;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author OvalleGA
 */
@Repository
public class GBMenuProfilingDAO implements IGabyvalDAO{
    
    @Autowired
    private SessionFactory session;

    @Override
    public void save(Object o_to_save) throws GBPersistenceException {
        if(o_to_save == null || session == null){
            throw new GBPersistenceException("The object in GBMenuProfilingDAO can't save, the session or the object is null. Contact whit system administrator.", null);
        }
        Transaction tx= session.getCurrentSession().beginTransaction();
        tx.begin();
        try{
            session.getCurrentSession().saveOrUpdate(o_to_save);
            session.getCurrentSession().refresh(o_to_save);
            tx.commit();
        }catch(HibernateException e){
            tx.rollback();
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public GbMenuProfiling load(Serializable o_id) throws GBPersistenceException {
        if(o_id == null || session == null){
            throw new GBPersistenceException("The object in GBMenuProfilingDAO can't load, the session or the object id is null. Contact whit system administrator.", null);
        }
        try{
            return (GbMenuProfiling) session.getCurrentSession().get(GbMenuProfiling.class, o_id);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBMenuProfilingDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().createCriteria("From GbMenuProfiling").list();
    }    

    @Override
    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBMenuProfilingDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().createCriteria(sql_sentence).list();
    }   
}
