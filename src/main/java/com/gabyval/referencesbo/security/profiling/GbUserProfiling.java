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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OvalleGA
 */
@Entity
@Table(name = "gb_user_profiling", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbUserProfiling.findAll", query = "SELECT g FROM GbUserProfiling g")
    , @NamedQuery(name = "GbUserProfiling.findByGbUsername", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbUsername = :gbUsername")
    , @NamedQuery(name = "GbUserProfiling.findByGbProfile", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserProfilingPK.gbProfile = :gbProfile")
    , @NamedQuery(name = "GbUserProfiling.findByGbUserCreate", query = "SELECT g FROM GbUserProfiling g WHERE g.gbUserCreate = :gbUserCreate")
    , @NamedQuery(name = "GbUserProfiling.findByGbLastUserUp", query = "SELECT g FROM GbUserProfiling g WHERE g.gbLastUserUp = :gbLastUserUp")
    , @NamedQuery(name = "GbUserProfiling.findByGbLastUpDt", query = "SELECT g FROM GbUserProfiling g WHERE g.gbLastUpDt = :gbLastUpDt")
    , @NamedQuery(name = "GbUserProfiling.findByCreateDt", query = "SELECT g FROM GbUserProfiling g WHERE g.createDt = :createDt")
    , @NamedQuery(name = "GbUserProfiling.findByRowversion", query = "SELECT g FROM GbUserProfiling g WHERE g.rowversion = :rowversion")})
public class GbUserProfiling implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GbUserProfilingPK gbUserProfilingPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_USER_CREATE")
    private String gbUserCreate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_LAST_USER_UP")
    private String gbLastUserUp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_UP_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastUpDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;
    @JoinColumn(name = "GB_PROFILE", referencedColumnName = "GB_PROFILE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbSecurityProfile gbSecurityProfile;
    @JoinColumn(name = "GB_USERNAME", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers;

    public GbUserProfiling() {
    }

    public GbUserProfiling(GbUserProfilingPK gbUserProfilingPK) {
        this.gbUserProfilingPK = gbUserProfilingPK;
    }

    public GbUserProfiling(GbUserProfilingPK gbUserProfilingPK, String gbUserCreate, String gbLastUserUp, Date gbLastUpDt, Date createDt, int rowversion) {
        this.gbUserProfilingPK = gbUserProfilingPK;
        this.gbUserCreate = gbUserCreate;
        this.gbLastUserUp = gbLastUserUp;
        this.gbLastUpDt = gbLastUpDt;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public GbUserProfiling(String gbUsername, String gbProfile) {
        this.gbUserProfilingPK = new GbUserProfilingPK(gbUsername, gbProfile);
    }

    public GbUserProfilingPK getGbUserProfilingPK() {
        return gbUserProfilingPK;
    }

    public void setGbUserProfilingPK(GbUserProfilingPK gbUserProfilingPK) {
        this.gbUserProfilingPK = gbUserProfilingPK;
    }

    public String getGbUserCreate() {
        return gbUserCreate;
    }

    public void setGbUserCreate(String gbUserCreate) {
        this.gbUserCreate = gbUserCreate;
    }

    public String getGbLastUserUp() {
        return gbLastUserUp;
    }

    public void setGbLastUserUp(String gbLastUserUp) {
        this.gbLastUserUp = gbLastUserUp;
    }

    public Date getGbLastUpDt() {
        return gbLastUpDt;
    }

    public void setGbLastUpDt(Date gbLastUpDt) {
        this.gbLastUpDt = gbLastUpDt;
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
        return "com.gabyval.referencesbo.GbUserProfiling[ gbUserProfilingPK=" + gbUserProfilingPK + " ]";
    }
    
}
