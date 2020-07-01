/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.services.system;

import com.gabyval.persistence.exception.GBPersistenceException;
import com.gabyval.referencesbo.GBSentencesRBOs;
import com.gabyval.referencesbo.system.AdCatalogs;
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
public class ADCatalogService extends GabyvalService{

    @Override
    public Object load(Serializable o_id) throws GBPersistenceException {
        return (AdCatalogs) persistence.load(o_id, AdCatalogs.class);
    }

    @Override
    public List<Object> getAll() throws GBPersistenceException {
        return persistence.getAll(GBSentencesRBOs.ADCATALOGS_FINDALL);
    }
}
