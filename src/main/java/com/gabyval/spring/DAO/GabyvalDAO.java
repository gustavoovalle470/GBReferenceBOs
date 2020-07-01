/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.schedule.AdExecuteJob;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author OvalleGA
 */
@Repository
public class GabyvalDAO implements IGabyvalDAO{
    @Autowired
    private SessionFactory session;
    
    @Override
    public void save(Object o_to_save) throws GBPersistenceException {
        if(o_to_save == null || session == null){
            throw new GBPersistenceException("The object can't save, the session or the object is null. Contact whit system administrator.", null);
        }
        try{
         session.getCurrentSession().saveOrUpdate(o_to_save);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator. "+e.getMessage(), e);
        }
    }

    @Override
    public Object load(Serializable o_id, Class class_to_load) throws GBPersistenceException {
        if(o_id == null || session == null){
            throw new GBPersistenceException("The object can't load, the session or the object id is null. Contact whit system administrator.", null);
        }
        try{
            return session.getCurrentSession().get(class_to_load, o_id);
        }catch(HibernateException e){
            throw new GBPersistenceException("The load operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public List<Object> getAll(String findAllExpression) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().getNamedQuery(findAllExpression).list();
    }    
    
    @Override
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in ADExecuteJobDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        Query q = session.getCurrentSession().getNamedQuery(query_name);
        if(parameters != null){
            for(String parameter:parameters.keySet()){
                q.setParameter(parameter, parameters.get(parameter));
            }
        }
        return q.list();
    }

    @Override
    public void update(Object object_to_update) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object can't update item, the session is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().update(object_to_update);
        }catch(HibernateException e){
            throw new GBPersistenceException("The update operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public void delete(Object object_to_delete) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object can't delete item, the session is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().delete(object_to_delete);
        }catch(HibernateException e){
            throw new GBPersistenceException("The update operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public void refresh(Object object_to_refresh) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object can't refresh item, the session is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().refresh(object_to_refresh);
        }catch(HibernateException e){
            throw new GBPersistenceException("The update operation can't finished, try again or contact with system administrator.", e);
        }
    }
}
