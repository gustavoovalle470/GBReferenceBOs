/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.profiling;

import com.gabyval.referencesbo.security.menu.GbMenulinks;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OvalleGA
 */
@Entity
@Table(name = "gb_menu_profiling", catalog = "db_gabyval", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbMenuProfiling.findAll", query = "SELECT g FROM GbMenuProfiling g")
    , @NamedQuery(name = "GbMenuProfiling.findByGbProfile", query = "SELECT g FROM GbMenuProfiling g WHERE g.gbMenuProfilingPK.gbProfile = :gbProfile")
    , @NamedQuery(name = "GbMenuProfiling.findByGbMenuId", query = "SELECT g FROM GbMenuProfiling g WHERE g.gbMenuProfilingPK.gbMenuId = :gbMenuId")
    , @NamedQuery(name = "GbMenuProfiling.findByCreateDt", query = "SELECT g FROM GbMenuProfiling g WHERE g.createDt = :createDt")
    , @NamedQuery(name = "GbMenuProfiling.findByRowversion", query = "SELECT g FROM GbMenuProfiling g WHERE g.rowversion = :rowversion")})
public class GbMenuProfiling implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GbMenuProfilingPK gbMenuProfilingPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;
    @JoinColumn(name = "GB_MENU_ID", referencedColumnName = "GB_MENU_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbMenulinks gbMenulinks;
    @JoinColumn(name = "GB_PROFILE", referencedColumnName = "GB_PROFILE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbSecurityProfile gbSecurityProfile;

    public GbMenuProfiling() {
    }

    public GbMenuProfiling(GbMenuProfilingPK gbMenuProfilingPK) {
        this.gbMenuProfilingPK = gbMenuProfilingPK;
    }

    public GbMenuProfiling(GbMenuProfilingPK gbMenuProfilingPK, Date createDt, int rowversion) {
        this.gbMenuProfilingPK = gbMenuProfilingPK;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public GbMenuProfiling(String gbProfile, String gbMenuId) {
        this.gbMenuProfilingPK = new GbMenuProfilingPK(gbProfile, gbMenuId);
    }

    public GbMenuProfilingPK getGbMenuProfilingPK() {
        return gbMenuProfilingPK;
    }

    public void setGbMenuProfilingPK(GbMenuProfilingPK gbMenuProfilingPK) {
        this.gbMenuProfilingPK = gbMenuProfilingPK;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public GbMenulinks getGbMenulinks() {
        return gbMenulinks;
    }

    public void setGbMenulinks(GbMenulinks gbMenulinks) {
        this.gbMenulinks = gbMenulinks;
    }

    public GbSecurityProfile getGbSecurityProfile() {
        return gbSecurityProfile;
    }

    public void setGbSecurityProfile(GbSecurityProfile gbSecurityProfile) {
        this.gbSecurityProfile = gbSecurityProfile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbMenuProfilingPK != null ? gbMenuProfilingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbMenuProfiling)) {
            return false;
        }
        GbMenuProfiling other = (GbMenuProfiling) object;
        if ((this.gbMenuProfilingPK == null && other.gbMenuProfilingPK != null) || (this.gbMenuProfilingPK != null && !this.gbMenuProfilingPK.equals(other.gbMenuProfilingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbMenuProfiling[ gbMenuProfilingPK=" + gbMenuProfilingPK + " ]";
    }
    
}
