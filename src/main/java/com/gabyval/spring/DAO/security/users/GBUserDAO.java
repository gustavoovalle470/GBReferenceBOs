/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.users.GbUsers;
import com.gabyval.spring.DAO.IGabyvalDAO;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author OvalleGA
 */
@Repository
public class GBUserDAO implements IGabyvalDAO{
    
    @Autowired
    private SessionFactory session;
    
    @Override
    public void save(Object o_to_save) throws GBPersistenceException {
        if(o_to_save == null || session == null){
            throw new GBPersistenceException("The object in GBUserDAO can't save, the session or the object is null. Contact whit system administrator.", null);
        }
        try{
            session.getCurrentSession().saveOrUpdate(o_to_save);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public GbUsers load(Serializable o_id) throws GBPersistenceException {
        if(o_id == null || session == null){
            throw new GBPersistenceException("The object in GBUserDAO can't load, the session or the object id is null. Contact whit system administrator.", null);
        }
        try{
            return (GbUsers) session.getCurrentSession().get(GbUsers.class, o_id);
        }catch(HibernateException e){
            throw new GBPersistenceException("The save operation can't finished, try again or contact with system administrator.", e);
        }
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBUserDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().createQuery("From GbUsers").list();
    }    

    @Override
    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        if(session == null){
            throw new GBPersistenceException("The object in GBUserDAO can't get all items, the session is null. Contact whit system administrator.", null);
        }
        return session.getCurrentSession().createQuery(sql_sentence).list();
    }  
}
