package com.codename1.whatsapp.server.dao;

/**
 * Simple error message DAO
 *
 * @author Shai Almog
 */
public class ErrorDAO {    
    private String error;
    private int code;
    public ErrorDAO() {
    }
    public ErrorDAO(String error, int code) {
        this.error = error;
        this.code = code;
    }
    
    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
}
