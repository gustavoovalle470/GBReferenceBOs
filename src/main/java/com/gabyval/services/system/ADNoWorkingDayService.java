/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.system.AdNoWorkingDays;
import com.gabyval.spring.DAO.system.ADNoWorkingDaysDAO;
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
public class ADNoWorkingDayService {
    @Autowired
    private ADNoWorkingDaysDAO aDNoWorkingDaysDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        aDNoWorkingDaysDAO.save(o_to_save);
    }

    public AdNoWorkingDays load(Serializable o_id) throws GBPersistenceException {
        return (AdNoWorkingDays) aDNoWorkingDaysDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return aDNoWorkingDaysDAO.getAll();
    }    

    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return aDNoWorkingDaysDAO.runSQL(query_name, parameters);
    } 
}
