/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.users.GbPwdHistory;
import com.gabyval.spring.DAO.security.users.GBPwdHistoryDAO;
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
public class GBPwdHistoryService {
    @Autowired
    private GBPwdHistoryDAO gBPwdHistoryDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        gBPwdHistoryDAO.save(o_to_save);
    }

    public GbPwdHistory load(Serializable o_id) throws GBPersistenceException {
        return (GbPwdHistory) gBPwdHistoryDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return gBPwdHistoryDAO.getAll();
    }    
    
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException{
        return gBPwdHistoryDAO.runSQL(query_name, parameters);
    }
}
