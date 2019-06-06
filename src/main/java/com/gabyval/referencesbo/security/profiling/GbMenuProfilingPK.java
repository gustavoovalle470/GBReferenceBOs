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
    @Size(min = 1, max = 100)
    @Column(name = "GB_PROFILE")
    private String gbProfile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_MENU_ID")
    private String gbMenuId;

    public GbMenuProfilingPK() {
    }

    public GbMenuProfilingPK(String gbProfile, String gbMenuId) {
        this.gbProfile = gbProfile;
        this.gbMenuId = gbMenuId;
    }

    public String getGbProfile() {
        return gbProfile;
    }

    public void setGbProfile(String gbProfile) {
        this.gbProfile = gbProfile;
    }

    public String getGbMenuId() {
        return gbMenuId;
    }

    public void setGbMenuId(String gbMenuId) {
        this.gbMenuId = gbMenuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbProfile != null ? gbProfile.hashCode() : 0);
        hash += (gbMenuId != null ? gbMenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbMenuProfilingPK)) {
            return false;
        }
        GbMenuProfilingPK other = (GbMenuProfilingPK) object;
        if ((this.gbProfile == null && other.gbProfile != null) || (this.gbProfile != null && !this.gbProfile.equals(other.gbProfile))) {
            return false;
        }
        if ((this.gbMenuId == null && other.gbMenuId != null) || (this.gbMenuId != null && !this.gbMenuId.equals(other.gbMenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbMenuProfilingPK[ gbProfile=" + gbProfile + ", gbMenuId=" + gbMenuId + " ]";
    }
    
}
