/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.spring.DAO.GabyvalDAO;
import java.io.Serializable;
import java.util.HashMap;
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
public abstract class GabyvalService {
    
    @Autowired
    protected GabyvalDAO persistence;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        persistence.save(o_to_save);
    }

    public abstract Object load(Serializable o_id) throws GBPersistenceException;

    public abstract List<Object> getAll() throws GBPersistenceException; 
    
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return persistence.runSQL(query_name, parameters);
    }
    
    public void update(Object object_to_update) throws GBPersistenceException {
        persistence.update(object_to_update);
    }

    public void delete(Object object_to_delete) throws GBPersistenceException {
        persistence.delete(object_to_delete);
    }

    public void refresh(Object object_to_refresh) throws GBPersistenceException {
        persistence.refresh(object_to_refresh);
    }
}
