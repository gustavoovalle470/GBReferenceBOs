/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.system.AdMessages;
import com.gabyval.spring.DAO.system.ADMessageDAO;
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
public class ADMessageService {
    @Autowired
    private ADMessageDAO aDMessageDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        aDMessageDAO.save(o_to_save);
    }

    public AdMessages load(Serializable o_id) throws GBPersistenceException {
        return (AdMessages) aDMessageDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return aDMessageDAO.getAll();
    }    

   public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return aDMessageDAO.runSQL(query_name, parameters);
    } 
}
