/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.profiling;

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
public class GbUserProfilingPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_PROFILE")
    private String gbProfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_USERNAME")
    private String gbUsername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_LAST_USER_UP")
    private String gbLastUserUp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_USER_CREATE")
    private String gbUserCreate;

    public GbUserProfilingPK() {
    }

    public GbUserProfilingPK(String gbProfile, String gbUsername, String gbLastUserUp, String gbUserCreate) {
        this.gbProfile = gbProfile;
        this.gbUsername = gbUsername;
        this.gbLastUserUp = gbLastUserUp;
        this.gbUserCreate = gbUserCreate;
    }

    public String getGbProfile() {
        return gbProfile;
    }

    public void setGbProfile(String gbProfile) {
        this.gbProfile = gbProfile;
    }

    public String getGbUsername() {
        return gbUsername;
    }

    public void setGbUsername(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public String getGbLastUserUp() {
        return gbLastUserUp;
    }

    public void setGbLastUserUp(String gbLastUserUp) {
        this.gbLastUserUp = gbLastUserUp;
    }

    public String getGbUserCreate() {
        return gbUserCreate;
    }

    public void setGbUserCreate(String gbUserCreate) {
        this.gbUserCreate = gbUserCreate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbProfile != null ? gbProfile.hashCode() : 0);
        hash += (gbUsername != null ? gbUsername.hashCode() : 0);
        hash += (gbLastUserUp != null ? gbLastUserUp.hashCode() : 0);
        hash += (gbUserCreate != null ? gbUserCreate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbUserProfilingPK)) {
            return false;
        }
        GbUserProfilingPK other = (GbUserProfilingPK) object;
        if ((this.gbProfile == null && other.gbProfile != null) || (this.gbProfile != null && !this.gbProfile.equals(other.gbProfile))) {
            return false;
        }
        if ((this.gbUsername == null && other.gbUsername != null) || (this.gbUsername != null && !this.gbUsername.equals(other.gbUsername))) {
            return false;
        }
        if ((this.gbLastUserUp == null && other.gbLastUserUp != null) || (this.gbLastUserUp != null && !this.gbLastUserUp.equals(other.gbLastUserUp))) {
            return false;
        }
        if ((this.gbUserCreate == null && other.gbUserCreate != null) || (this.gbUserCreate != null && !this.gbUserCreate.equals(other.gbUserCreate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbUserProfilingPK[ gbProfile=" + gbProfile + ", gbUsername=" + gbUsername + ", gbLastUserUp=" + gbLastUserUp + ", gbUserCreate=" + gbUserCreate + " ]";
    }
    
}
