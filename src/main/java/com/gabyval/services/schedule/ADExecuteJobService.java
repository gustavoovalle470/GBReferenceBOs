/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.schedule;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.schedule.AdExecuteJob;
import com.gabyval.spring.DAO.schedule.ADExecuteJobDAO;
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
public class ADExecuteJobService {
    @Autowired
    private ADExecuteJobDAO adExecuteJobDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        adExecuteJobDAO.save(o_to_save);
    }

    public AdExecuteJob load(Serializable o_id) throws GBPersistenceException {
        return (AdExecuteJob) adExecuteJobDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return adExecuteJobDAO.getAll();
    }    

    public List<Object> runSQL(String sql_sentence) throws GBPersistenceException {
        return adExecuteJobDAO.runSQL(sql_sentence);
    }  
}
