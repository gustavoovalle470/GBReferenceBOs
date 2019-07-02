/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.system.AdIdControl;
import com.gabyval.spring.DAO.system.ADIdControlDAO;
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
public class ADIdControlService {
    @Autowired
    private ADIdControlDAO aDIdControlDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        aDIdControlDAO.save(o_to_save);
    }

    public AdIdControl load(Serializable o_id) throws GBPersistenceException {
        return (AdIdControl) aDIdControlDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return aDIdControlDAO.getAll();
    }    

    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return aDIdControlDAO.runSQL(query_name, parameters);
    }
}
