/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.security.users.GbStaff;
import com.gabyval.spring.DAO.IGabyvalDAO;
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
public class GBStaffDAO implements IGabyvalDAO{
    
    @Autowired
    private SessionFactory session;

    @Override
    public void save(Object o_to_save) throws GBPersistenceException {
        if(o_to_save == null || session == null){
            throw new GBPersistenceException("The object in GBStaffDAO can't save, the session or the object is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().saveOrUpdate(o_to_save);
        }catch(HibernateException e){
            System.err.println(e);
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public GbStaff load(Serializable o_id) throws GBPersistenceException {
        Object object_from_db;
        if(o_id == null || session == null){
            throw new GBPersistenceException("The object in GBStaffDAO can't load, the session or the object id is null. Contact whit system administrator.", null);
        }
        try{             
            object_from_db = session.getCurrentSession().get(GbStaff.class, o_id);
            return (GbStaff) object_from_db;
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBStaffDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().getNamedQuery(GBSentencesRBOs.GBSTAFF_FINDALL).list();
    }    

    @Override
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBStaffDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        Query q = session.getCurrentSession().getNamedQuery(query_name);
        if(parameters != null){
            for(String parameter:parameters.keySet()){
                q.setParameter(parameter, parameters.get(parameter));
            }
        }
        return q.list();
    }
    
    public void refresh(Object object_to_refresh){
        session.getCurrentSession().refresh(object_to_refresh);
    }
}
