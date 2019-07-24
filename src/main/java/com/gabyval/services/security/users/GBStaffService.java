/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.users.GbStaff;
import com.gabyval.spring.DAO.security.users.GBStaffDAO;
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
public class GBStaffService {
    @Autowired
    private GBStaffDAO gBStaffDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        gBStaffDAO.save(o_to_save);
    }

    public GbStaff load(Serializable o_id) throws GBPersistenceException {
        return (GbStaff) gBStaffDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return gBStaffDAO.getAll();
    }    

    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return gBStaffDAO.runSQL(query_name, parameters);
    }  
    
    public void refresh(Object object_to_update){
        gBStaffDAO.refresh(object_to_update);
    }
}
