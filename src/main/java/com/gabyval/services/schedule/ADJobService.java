/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.schedule;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.schedule.AdJob;
import com.gabyval.spring.DAO.schedule.ADJobDAO;
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
public class ADJobService {
    @Autowired
    private ADJobDAO aDJobDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        aDJobDAO.save(o_to_save);
    }

    public AdJob load(Serializable o_id) throws GBPersistenceException {
        return (AdJob) aDJobDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return aDJobDAO.getAll();
    }    

    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        return aDJobDAO.runSQL(sql_sentence);
    }  
}
