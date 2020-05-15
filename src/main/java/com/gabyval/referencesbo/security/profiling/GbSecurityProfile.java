/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.profiling;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author OvalleGA
 */
@Entity
@Table(name = "gb_security_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbSecurityProfile.findAll", query = "SELECT g FROM GbSecurityProfile g"),
    @NamedQuery(name = "GbSecurityProfile.findByGbProfile", query = "SELECT g FROM GbSecurityProfile g WHERE g.gbProfile = :gbProfile"),
    @NamedQuery(name = "GbSecurityProfile.findByCreateDt", query = "SELECT g FROM GbSecurityProfile g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbSecurityProfile.findByGbLastUserXge", query = "SELECT g FROM GbSecurityProfile g WHERE g.gbLastUserXge = :gbLastUserXge"),
    @NamedQuery(name = "GbSecurityProfile.findByGbLastXgeDt", query = "SELECT g FROM GbSecurityProfile g WHERE g.gbLastXgeDt = :gbLastXgeDt"),
    @NamedQuery(name = "GbSecurityProfile.findByGbProfileDesc", query = "SELECT g FROM GbSecurityProfile g WHERE g.gbProfileDesc = :gbProfileDesc"),
    @NamedQuery(name = "GbSecurityProfile.findByGbProfileStatus", query = "SELECT g FROM GbSecurityProfile g WHERE g.gbProfileStatus = :gbProfileStatus"),
    @NamedQuery(name = "GbSecurityProfile.findByRowversion", query = "SELECT g FROM GbSecurityProfile g WHERE g.rowversion = :rowversion")})
public class GbSecurityProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_PROFILE")
    private String gbProfile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GB_LAST_USER_XGE")
    private String gbLastUserXge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_XGE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastXgeDt;
    @Size(max = 200)
    @Column(name = "GB_PROFILE_DESC")
    private String gbProfileDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_PROFILE_STATUS")
    private int gbProfileStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbSecurityProfile")
    private List<GbMenuProfiling> gbMenuProfilingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbSecurityProfile")
    private List<GbUserProfiling> gbUserProfilingList;

    public GbSecurityProfile() {
    }

    public GbSecurityProfile(String gbProfile) {
        this.gbProfile = gbProfile;
    }

    public GbSecurityProfile(String gbProfile, Date createDt, String gbLastUserXge, Date gbLastXgeDt, int gbProfileStatus, int rowversion) {
        this.gbProfile = gbProfile;
        this.createDt = createDt;
        this.gbLastUserXge = gbLastUserXge;
        this.gbLastXgeDt = gbLastXgeDt;
        this.gbProfileStatus = gbProfileStatus;
        this.rowversion = rowversion;
    }

    public String getGbProfile() {
        return gbProfile;
    }

    public void setGbProfile(String gbProfile) {
        this.gbProfile = gbProfile;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getGbLastUserXge() {
        return gbLastUserXge;
    }

    public void setGbLastUserXge(String gbLastUserXge) {
        this.gbLastUserXge = gbLastUserXge;
    }

    public Date getGbLastXgeDt() {
        return gbLastXgeDt;
    }

    public void setGbLastXgeDt(Date gbLastXgeDt) {
        this.gbLastXgeDt = gbLastXgeDt;
    }

    public String getGbProfileDesc() {
        return gbProfileDesc;
    }

    public void setGbProfileDesc(String gbProfileDesc) {
        this.gbProfileDesc = gbProfileDesc;
    }

    public int getGbProfileStatus() {
        return gbProfileStatus;
    }

    public void setGbProfileStatus(int gbProfileStatus) {
        this.gbProfileStatus = gbProfileStatus;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    @XmlTransient
    public List<GbMenuProfiling> getGbMenuProfilingList() {
        return gbMenuProfilingList;
    }

    public void setGbMenuProfilingList(List<GbMenuProfiling> gbMenuProfilingList) {
        this.gbMenuProfilingList = gbMenuProfilingList;
    }

    @XmlTransient
    public List<GbUserProfiling> getGbUserProfilingList() {
        return gbUserProfilingList;
    }

    public void setGbUserProfilingList(List<GbUserProfiling> gbUserProfilingList) {
        this.gbUserProfilingList = gbUserProfilingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbProfile != null ? gbProfile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbSecurityProfile)) {
            return false;
        }
        GbSecurityProfile other = (GbSecurityProfile) object;
        if ((this.gbProfile == null && other.gbProfile != null) || (this.gbProfile != null && !this.gbProfile.equals(other.gbProfile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbSecurityProfile[ gbProfile=" + gbProfile + " ]";
    }
    
}
