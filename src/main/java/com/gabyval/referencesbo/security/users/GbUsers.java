/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.users;

import com.gabyval.referencesbo.security.profiling.GbUserProfiling;
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
@Table(name = "gb_users", catalog = "db_gabyval", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbUsers.findAll", query = "SELECT g FROM GbUsers g")
    , @NamedQuery(name = "GbUsers.findByGbUsername", query = "SELECT g FROM GbUsers g WHERE g.gbUsername = :gbUsername")
    , @NamedQuery(name = "GbUsers.findByGbPassword", query = "SELECT g FROM GbUsers g WHERE g.gbPassword = :gbPassword")
    , @NamedQuery(name = "GbUsers.findByGbLoginStatus", query = "SELECT g FROM GbUsers g WHERE g.gbLoginStatus = :gbLoginStatus")
    , @NamedQuery(name = "GbUsers.findByGbOprativeStatus", query = "SELECT g FROM GbUsers g WHERE g.gbOprativeStatus = :gbOprativeStatus")
    , @NamedQuery(name = "GbUsers.findByGbLastPwdXgeDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastPwdXgeDt = :gbLastPwdXgeDt")
    , @NamedQuery(name = "GbUsers.findByGbLastLogginDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastLogginDt = :gbLastLogginDt")
    , @NamedQuery(name = "GbUsers.findByGbLastXgeDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastXgeDt = :gbLastXgeDt")
    , @NamedQuery(name = "GbUsers.findByGbLastUserXge", query = "SELECT g FROM GbUsers g WHERE g.gbLastUserXge = :gbLastUserXge")
    , @NamedQuery(name = "GbUsers.findByGbUserSystem", query = "SELECT g FROM GbUsers g WHERE g.gbUserSystem = :gbUserSystem")
    , @NamedQuery(name = "GbUsers.findByCreateDt", query = "SELECT g FROM GbUsers g WHERE g.createDt = :createDt")
    , @NamedQuery(name = "GbUsers.findByRowversion", query = "SELECT g FROM GbUsers g WHERE g.rowversion = :rowversion")})
public class GbUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_USERNAME")
    private String gbUsername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "GB_PASSWORD")
    private String gbPassword;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LOGIN_STATUS")
    private int gbLoginStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_OPRATIVE_STATUS")
    private int gbOprativeStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_PWD_XGE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastPwdXgeDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_LOGGIN_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastLogginDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_XGE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastXgeDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GB_LAST_USER_XGE")
    private String gbLastUserXge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_USER_SYSTEM")
    private int gbUserSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbUsers")
    private List<GbUserProfiling> gbUserProfilingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbUsers")
    private List<GbPwdHistory> gbPwdHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbUsers")
    private List<GbStaff> gbStaffList;

    public GbUsers() {
    }

    public GbUsers(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public GbUsers(String gbUsername, String gbPassword, int gbLoginStatus, int gbOprativeStatus, Date gbLastPwdXgeDt, Date gbLastLogginDt, Date gbLastXgeDt, String gbLastUserXge, int gbUserSystem, Date createDt, int rowversion) {
        this.gbUsername = gbUsername;
        this.gbPassword = gbPassword;
        this.gbLoginStatus = gbLoginStatus;
        this.gbOprativeStatus = gbOprativeStatus;
        this.gbLastPwdXgeDt = gbLastPwdXgeDt;
        this.gbLastLogginDt = gbLastLogginDt;
        this.gbLastXgeDt = gbLastXgeDt;
        this.gbLastUserXge = gbLastUserXge;
        this.gbUserSystem = gbUserSystem;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public String getGbUsername() {
        return gbUsername;
    }

    public void setGbUsername(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public String getGbPassword() {
        return gbPassword;
    }

    public void setGbPassword(String gbPassword) {
        this.gbPassword = gbPassword;
    }

    public int getGbLoginStatus() {
        return gbLoginStatus;
    }

    public void setGbLoginStatus(int gbLoginStatus) {
        this.gbLoginStatus = gbLoginStatus;
    }

    public int getGbOprativeStatus() {
        return gbOprativeStatus;
    }

    public void setGbOprativeStatus(int gbOprativeStatus) {
        this.gbOprativeStatus = gbOprativeStatus;
    }

    public Date getGbLastPwdXgeDt() {
        return gbLastPwdXgeDt;
    }

    public void setGbLastPwdXgeDt(Date gbLastPwdXgeDt) {
        this.gbLastPwdXgeDt = gbLastPwdXgeDt;
    }

    public Date getGbLastLogginDt() {
        return gbLastLogginDt;
    }

    public void setGbLastLogginDt(Date gbLastLogginDt) {
        this.gbLastLogginDt = gbLastLogginDt;
    }

    public Date getGbLastXgeDt() {
        return gbLastXgeDt;
    }

    public void setGbLastXgeDt(Date gbLastXgeDt) {
        this.gbLastXgeDt = gbLastXgeDt;
    }

    public String getGbLastUserXge() {
        return gbLastUserXge;
    }

    public void setGbLastUserXge(String gbLastUserXge) {
        this.gbLastUserXge = gbLastUserXge;
    }

    public int getGbUserSystem() {
        return gbUserSystem;
    }

    public void setGbUserSystem(int gbUserSystem) {
        this.gbUserSystem = gbUserSystem;
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

    @XmlTransient
    public List<GbUserProfiling> getGbUserProfilingList() {
        return gbUserProfilingList;
    }

    public void setGbUserProfilingList(List<GbUserProfiling> gbUserProfilingList) {
        this.gbUserProfilingList = gbUserProfilingList;
    }

    @XmlTransient
    public List<GbPwdHistory> getGbPwdHistoryList() {
        return gbPwdHistoryList;
    }

    public void setGbPwdHistoryList(List<GbPwdHistory> gbPwdHistoryList) {
        this.gbPwdHistoryList = gbPwdHistoryList;
    }

    @XmlTransient
    public List<GbStaff> getGbStaffList() {
        return gbStaffList;
    }

    public void setGbStaffList(List<GbStaff> gbStaffList) {
        this.gbStaffList = gbStaffList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbUsername != null ? gbUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbUsers)) {
            return false;
        }
        GbUsers other = (GbUsers) object;
        if ((this.gbUsername == null && other.gbUsername != null) || (this.gbUsername != null && !this.gbUsername.equals(other.gbUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbUsers[ gbUsername=" + gbUsername + " ]";
    }
    
}
