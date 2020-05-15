package com.gabyval.persistence.exception;

/**
 * Clase de la excepciones de persistencia..
 * @version 1.0
 * @since 14/05/2020
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *******************************                                                                              ****************************************
 * *******************************  ********** ********** ******    **      ** **      ** ********** **         ****************************************
 * *******************************  ********** **********  ******   **      ** **      ** ********** **         ****************************************
 * *******************************  **         **      **  **  **   **      ** **      ** **      ** **         ****************************************
 * *******************************  **         **      **  **  **   **      ** **      ** **      ** **         ****************************************
 * *******************************  **         **      **  ******    **    **  **      ** **      ** **         ****************************************
 * *******************************  **    **** **********  *******    **  **   **      ** ********** **         ****************************************
 * *******************************  **    **** **********  ********    ****    **      ** ********** **         ****************************************
 * *******************************  **      ** **      **  **    **     **     **      ** **      ** **         ****************************************
 * *******************************  **      ** **      **  **    **     **      **    **  **      ** **         ****************************************
 * *******************************  **      ** **      **  **   **      **       **  **   **      ** **         ****************************************
 * *******************************  ********** **      **  **  **       **        ****    **      ** ********** ****************************************
 * *******************************  ********** **      ** ******        **         **     **      ** ********** ****************************************
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * |---------------------------------------------------------------------------------------------------------------------------------------------------|
 * |                                                        Control de versiones                                                                       |
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 * | Version |    Fecha     |  Responsable   |                                                  Comentarios                                            |
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 * |   1.0   |  14/05/2020  |      GAOQ      | Creacion y certificacion de la clase.                                                                   |  
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 */
public class GBPersistenceException extends Exception{
    private String message;//Mensaje de la excepcion.
    private Exception original_exception;//Excepcion original.

    /**
     * Crea una nueva excepcion dado su mensaje y excepcion original.
     * @param message String el mensaje de la excepcion.
     * @param original_exception Excepcion que origina esta.
     */
    public GBPersistenceException(String message, Exception original_exception){
        this.message=message;
        this.original_exception=original_exception;
    }
    
    /**
     * Regresa el mensaje de la excepcion.
     * @return el mensaje
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Modifica el mensaje de la excepcion.
     * @param message el nuevo mensaje.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Devuelve el valor de la excepcion original.
     * @return Exception la excepcion original.
     */
    public Exception getOriginal_exception() {
        return original_exception;
    }

    /**
     * Modifica el valor de la excepcion original.
     * @param original_exception la nueva excepcion.
     */
    public void setOriginal_exception(Exception original_exception) {
        this.original_exception = original_exception;
    }
}
