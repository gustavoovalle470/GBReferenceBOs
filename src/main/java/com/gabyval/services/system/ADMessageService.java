/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.system.AdMessages;
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
public class ADMessageService extends GabyvalService{
    
    @Override
    public Object load(Serializable o_id) throws GBPersistenceException {
        return (AdMessages) persistence.load(o_id, AdMessages.class);
    } 

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        return persistence.getAll(GBSentencesRBOs.ADMESSAGES_FINDALL);
    }
}
