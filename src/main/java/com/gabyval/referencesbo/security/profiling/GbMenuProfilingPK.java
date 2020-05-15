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
public class GbMenuProfilingPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_MENU_ID")
    private int gbMenuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_PROFILE")
    private String gbProfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_USER_CREATE")
    private String gbUserCreate;

    public GbMenuProfilingPK() {
    }

    public GbMenuProfilingPK(int gbMenuId, String gbProfile, String gbUserCreate) {
        this.gbMenuId = gbMenuId;
        this.gbProfile = gbProfile;
        this.gbUserCreate = gbUserCreate;
    }

    public int getGbMenuId() {
        return gbMenuId;
    }

    public void setGbMenuId(int gbMenuId) {
        this.gbMenuId = gbMenuId;
    }

    public String getGbProfile() {
        return gbProfile;
    }

    public void setGbProfile(String gbProfile) {
        this.gbProfile = gbProfile;
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
        hash += (int) gbMenuId;
        hash += (gbProfile != null ? gbProfile.hashCode() : 0);
        hash += (gbUserCreate != null ? gbUserCreate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbMenuProfilingPK)) {
            return false;
        }
        GbMenuProfilingPK other = (GbMenuProfilingPK) object;
        if (this.gbMenuId != other.gbMenuId) {
            return false;
        }
        if ((this.gbProfile == null && other.gbProfile != null) || (this.gbProfile != null && !this.gbProfile.equals(other.gbProfile))) {
            return false;
        }
        if ((this.gbUserCreate == null && other.gbUserCreate != null) || (this.gbUserCreate != null && !this.gbUserCreate.equals(other.gbUserCreate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbMenuProfilingPK[ gbMenuId=" + gbMenuId + ", gbProfile=" + gbProfile + ", gbUserCreate=" + gbUserCreate + " ]";
    }
    
}
