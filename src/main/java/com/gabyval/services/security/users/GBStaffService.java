/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.security.users;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.security.users.GbStaff;
import com.gabyval.services.GabyvalService;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OvalleGA
 */
@Service
@Transactional
public class GBStaffService extends GabyvalService{
    
    @Override
    public Object load(Serializable o_id) throws GBPersistenceException {
        return (GbStaff) persistence.load(o_id, GbStaff.class);
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        return persistence.getAll(GBSentencesRBOs.GBSTAFF_FINDALL);
    }
}
