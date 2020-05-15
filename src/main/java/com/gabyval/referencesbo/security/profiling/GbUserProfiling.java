/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.profiling;

import com.gabyval.referencesbo.security.users.GbUsers;
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
@Table(name = "gb_user_profiling")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbUserProfiling.findAll", query = "SELECT g FROM GbUserProfiling g"),
    @NamedQuery(name = "GbUserProfiling.findByGbProfile", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbProfile = :gbProfile"),
    @NamedQuery(name = "GbUserProfiling.findByGbUsername", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbUsername = :gbUsername"),
    @NamedQuery(name = "GbUserProfiling.findByCreateDt", query = "SELECT g FROM GbUserProfiling g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbUserProfiling.findByGbLastUpDt", query = "SELECT g FROM GbUserProfiling g WHERE g.gbLastUpDt = :gbLastUpDt"),
    @NamedQuery(name = "GbUserProfiling.findByGbLastUserUp", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbLastUserUp = :gbLastUserUp"),
    @NamedQuery(name = "GbUserProfiling.findByGbUserCreate", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbUserCreate = :gbUserCreate"),
    @NamedQuery(name = "GbUserProfiling.findByRowversion", query = "SELECT g FROM GbUserProfiling g WHERE g.rowversion = :rowversion")})
public class GbUserProfiling implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GbUserProfilingPK gbUserProfilingPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_UP_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastUpDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;
    @JoinColumn(name = "GB_PROFILE", referencedColumnName = "GB_PROFILE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbSecurityProfile gbSecurityProfile;
    @JoinColumn(name = "GB_USERNAME", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers;
    @JoinColumn(name = "GB_USER_CREATE", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers1;
    @JoinColumn(name = "GB_LAST_USER_UP", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers2;

    public GbUserProfiling() {
    }

    public GbUserProfiling(GbUserProfilingPK gbUserProfilingPK) {
        this.gbUserProfilingPK = gbUserProfilingPK;
    }

    public GbUserProfiling(GbUserProfilingPK gbUserProfilingPK, Date createDt, Date gbLastUpDt, int rowversion) {
        this.gbUserProfilingPK = gbUserProfilingPK;
        this.createDt = createDt;
        this.gbLastUpDt = gbLastUpDt;
        this.rowversion = rowversion;
    }

    public GbUserProfiling(String gbProfile, String gbUsername, String gbLastUserUp, String gbUserCreate) {
        this.gbUserProfilingPK = new GbUserProfilingPK(gbProfile, gbUsername, gbLastUserUp, gbUserCreate);
    }

    public GbUserProfilingPK getGbUserProfilingPK() {
        return gbUserProfilingPK;
    }

    public void setGbUserProfilingPK(GbUserProfilingPK gbUserProfilingPK) {
        this.gbUserProfilingPK = gbUserProfilingPK;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getGbLastUpDt() {
        return gbLastUpDt;
    }

    public void setGbLastUpDt(Date gbLastUpDt) {
        this.gbLastUpDt = gbLastUpDt;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public GbSecurityProfile getGbSecurityProfile() {
        return gbSecurityProfile;
    }

    public void setGbSecurityProfile(GbSecurityProfile gbSecurityProfile) {
        this.gbSecurityProfile = gbSecurityProfile;
    }

    public GbUsers getGbUsers() {
        return gbUsers;
    }

    public void setGbUsers(GbUsers gbUsers) {
        this.gbUsers = gbUsers;
    }

    public GbUsers getGbUsers1() {
        return gbUsers1;
    }

    public void setGbUsers1(GbUsers gbUsers1) {
        this.gbUsers1 = gbUsers1;
    }

    public GbUsers getGbUsers2() {
        return gbUsers2;
    }

    public void setGbUsers2(GbUsers gbUsers2) {
        this.gbUsers2 = gbUsers2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbUserProfilingPK != null ? gbUserProfilingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbUserProfiling)) {
            return false;
        }
        GbUserProfiling other = (GbUserProfiling) object;
        if ((this.gbUserProfilingPK == null && other.gbUserProfilingPK != null) || (this.gbUserProfilingPK != null && !this.gbUserProfilingPK.equals(other.gbUserProfilingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbUserProfiling[ gbUserProfilingPK=" + gbUserProfilingPK + " ]";
    }
    
}
