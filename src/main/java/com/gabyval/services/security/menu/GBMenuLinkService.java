/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.menu;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.security.menu.GbMenulinks;
import com.gabyval.spring.DAO.security.menu.GBMenuLinkDAO;
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
public class GBMenuLinkService {
    @Autowired
    private GBMenuLinkDAO gBMenuLinkDAO;
    
    public void save(Object o_to_save) throws GBPersistenceException {
        gBMenuLinkDAO.save(o_to_save);
    }

    public GbMenulinks load(Serializable o_id) throws GBPersistenceException {
        return (GbMenulinks) gBMenuLinkDAO.load(o_id);
    }
    
    public List<Object> getAll() throws GBPersistenceException {
        return gBMenuLinkDAO.getAll();
    }    

    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException {
        return gBMenuLinkDAO.runSQL(query_name, parameters);
    }  
}
