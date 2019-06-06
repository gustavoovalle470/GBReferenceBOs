/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.persistence.exception;

/**
 *
 * @author OvalleGA
 */
public class GBPersistenceException extends Exception{
    private String message;
    private Exception original_exception;

    public GBPersistenceException(String message, Exception original_exception){
        this.message=message;
        this.original_exception=original_exception;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getOriginal_exception() {
        return original_exception;
    }

    public void setOriginal_exception(Exception original_exception) {
        this.original_exception = original_exception;
    }
}
