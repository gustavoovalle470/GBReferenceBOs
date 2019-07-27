/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.system.AdCatalogs;
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
public class ADCatalogDAO implements IGabyvalDAO{
    
    @Autowired
    private SessionFactory session;

    @Override
    public void save(Object o_to_save) throws GBPersistenceException {
        if(o_to_save == null || session == null){
            throw new GBPersistenceException("The object in ADCatalogDAO can't save, the session or the object is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().saveOrUpdate(o_to_save);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public AdCatalogs load(Serializable o_id) throws GBPersistenceException {
        if(o_id == null || session == null){
            throw new GBPersistenceException("The object in ADCatalogDAO can't load, the session or the object id is null. Contact whit system administrator.", null);
        }
        try{
            return (AdCatalogs) session.getCurrentSession().get(AdCatalogs.class, o_id);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in ADCatalogDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().getNamedQuery(GBSentencesRBOs.ADCATALOGS_FINDALL).list();
    }    

    @Override
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in ADCatalogDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        Query q = session.getCurrentSession().getNamedQuery(query_name);
        if(parameters != null){
            for(String parameter:parameters.keySet()){
                q.setParameter(parameter, parameters.get(parameter));
            }
        }
        return q.list();
    }  
}
