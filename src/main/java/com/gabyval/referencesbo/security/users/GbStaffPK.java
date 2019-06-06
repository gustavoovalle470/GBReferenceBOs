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
public class GbStaffPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GB_USERNAME")
    private String gbUsername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GB_ID_TYPE_CNAME")
    private String gbIdTypeCname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_ID_TYPE")
    private int gbIdType;

    public GbStaffPK() {
    }

    public GbStaffPK(String gbUsername, String gbIdTypeCname, int gbIdType) {
        this.gbUsername = gbUsername;
        this.gbIdTypeCname = gbIdTypeCname;
        this.gbIdType = gbIdType;
    }

    public String getGbUsername() {
        return gbUsername;
    }

    public void setGbUsername(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public String getGbIdTypeCname() {
        return gbIdTypeCname;
    }

    public void setGbIdTypeCname(String gbIdTypeCname) {
        this.gbIdTypeCname = gbIdTypeCname;
    }

    public int getGbIdType() {
        return gbIdType;
    }

    public void setGbIdType(int gbIdType) {
        this.gbIdType = gbIdType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbUsername != null ? gbUsername.hashCode() : 0);
        hash += (gbIdTypeCname != null ? gbIdTypeCname.hashCode() : 0);
        hash += (int) gbIdType;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbStaffPK)) {
            return false;
        }
        GbStaffPK other = (GbStaffPK) object;
        if ((this.gbUsername == null && other.gbUsername != null) || (this.gbUsername != null && !this.gbUsername.equals(other.gbUsername))) {
            return false;
        }
        if ((this.gbIdTypeCname == null && other.gbIdTypeCname != null) || (this.gbIdTypeCname != null && !this.gbIdTypeCname.equals(other.gbIdTypeCname))) {
            return false;
        }
        if (this.gbIdType != other.gbIdType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbStaffPK[ gbUsername=" + gbUsername + ", gbIdTypeCname=" + gbIdTypeCname + ", gbIdType=" + gbIdType + " ]";
    }
    
}
