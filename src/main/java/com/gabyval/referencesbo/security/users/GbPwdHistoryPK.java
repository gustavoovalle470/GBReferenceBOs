/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.users;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author OvalleGA
 */
@Embeddable
public class GbPwdHistoryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_PWD_SAVED")
    private String gbPwdSaved;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_USERNAME")
    private String gbUsername;

    public GbPwdHistoryPK() {
    }

    public GbPwdHistoryPK(String gbPwdSaved, String gbUsername) {
        this.gbPwdSaved = gbPwdSaved;
        this.gbUsername = gbUsername;
    }

    public String getGbPwdSaved() {
        return gbPwdSaved;
    }

    public void setGbPwdSaved(String gbPwdSaved) {
        this.gbPwdSaved = gbPwdSaved;
    }

    public String getGbUsername() {
        return gbUsername;
    }

    public void setGbUsername(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbPwdSaved != null ? gbPwdSaved.hashCode() : 0);
        hash += (gbUsername != null ? gbUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbPwdHistoryPK)) {
            return false;
        }
        GbPwdHistoryPK other = (GbPwdHistoryPK) object;
        if ((this.gbPwdSaved == null && other.gbPwdSaved != null) || (this.gbPwdSaved != null && !this.gbPwdSaved.equals(other.gbPwdSaved))) {
            return false;
        }
        if ((this.gbUsername == null && other.gbUsername != null) || (this.gbUsername != null && !this.gbUsername.equals(other.gbUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbPwdHistoryPK[ gbPwdSaved=" + gbPwdSaved + ", gbUsername=" + gbUsername + " ]";
    }
    
}
