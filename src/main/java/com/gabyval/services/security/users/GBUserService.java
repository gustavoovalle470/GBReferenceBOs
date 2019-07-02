/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.users.GbUsers;
import com.gabyval.spring.DAO.security.users.GBUserDAO;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OvalleGA
 */
@Service
@Transactional
public class GBUserService {
    @Autowired
    private GBUserDAO gBUserDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        gBUserDAO.save(o_to_save);
    }

    public GbUsers load(Serializable o_id) throws GBPersistenceException {
        return (GbUsers) gBUserDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return gBUserDAO.getAll();
    }    

    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return gBUserDAO.runSQL(query_name, parameters);
    }  
}
