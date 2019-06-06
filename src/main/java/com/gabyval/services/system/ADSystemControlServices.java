/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.system.AdSystemControl;
import com.gabyval.spring.DAO.system.ADSystemControlDAO;
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
public class ADSystemControlServices {
    @Autowired
    private ADSystemControlDAO aDNoWorkingDaysDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        aDNoWorkingDaysDAO.save(o_to_save);
    }

    public AdSystemControl load(Serializable o_id) throws GBPersistenceException {
        return (AdSystemControl) aDNoWorkingDaysDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return aDNoWorkingDaysDAO.getAll();
    }    

    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        return aDNoWorkingDaysDAO.runSQL(sql_sentence);
    } 
}
