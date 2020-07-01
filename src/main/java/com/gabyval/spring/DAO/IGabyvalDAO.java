/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.spring.DAO;

import com.gabyval.persistence.exception.GBPersistenceException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * This interface define all DAO classes to implement in this project.
 * @author OvalleGA
 * @version 2.0
 * @since 06/06/2019
 */
public interface IGabyvalDAO {
        
    /**
     * This method save a object in database.
     * @param o_to_save Object the object to save.
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>The session factory is null</li>
     *      <li>The object to save is null</li>
     *      <li>The object can't be saved</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public void save(Object o_to_save) throws GBPersistenceException;
    
    /**
     * This method load a object from database.
     * @param o_id serializable Object the id to find the object in database.
     * @param class_to_load the class of the object
     * @return Object the object obtained from database. 
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>The session factory is null</li>
     *      <li>The object id to find is null</li>
     *      <li>The object can't be loaded</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public Object load(Serializable o_id, Class class_to_load) throws GBPersistenceException;
    
    /**
     * This method obtained all class objects from database.
     * @param findAllExpression name for the find all query
     * @return List<Object> all class objects from database.
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>The session factory is null</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public List<Object> getAll(String findAllExpression) throws GBPersistenceException;
    
    /**
     * This method obtained objects from SQL sentence.
     * @param query_name Query to run.
     * @param parameters the parameters to insert.
     * @return List<Object> class objects from database.
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>The session factory is null</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public List<Object> runSQL(String query_name, HashMap<String, Object> parameters) throws GBPersistenceException;
    
    /**
     * This method allow update a entry in database
     * @param object_to_update the object to update.
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>Any problem to update entry</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public void update(Object object_to_update) throws GBPersistenceException;
    
    /**
     * This method allow delete a entry in database.
     * @param object_to_delete the object to delete.
     * @throws GBPersistenceException  if:
     * <ol>
     *      <li>Any problem to update entry</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public void delete(Object object_to_delete) throws GBPersistenceException;
    
    /**
     * This method allow refresh a object in the session.
     * @param object_to_refresh the object to refresh.
     * @throws GBPersistenceException if:
     * <ol>
     *      <li>Any problem to update entry</li>
     *      <li>Any SQL exception.</li>
     * </ol>
     */
    public void refresh(Object object_to_refresh) throws GBPersistenceException;
}
