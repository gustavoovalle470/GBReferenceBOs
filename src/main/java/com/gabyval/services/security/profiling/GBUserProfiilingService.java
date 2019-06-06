/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.profiling;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.profiling.GbUserProfiling;
import com.gabyval.spring.DAO.security.porfiling.GBUserProfilingDAO;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OvalleGA
 */
@Service
@Transactional
public class GBUserProfiilingService {
    @Autowired
    private GBUserProfilingDAO gBUserProfilingDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        gBUserProfilingDAO.save(o_to_save);
    }

    public GbUserProfiling load(Serializable o_id) throws GBPersistenceException {
        return (GbUserProfiling) gBUserProfilingDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return gBUserProfilingDAO.getAll();
    }    

    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        return gBUserProfilingDAO.runSQL(sql_sentence);
    }  
}
