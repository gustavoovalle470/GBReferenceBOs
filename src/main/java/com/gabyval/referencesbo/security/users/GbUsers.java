/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.users;

import com.gabyval.referencesbo.system.AdCatalogs;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "gb_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbUsers.findAll", query = "SELECT g FROM GbUsers g"),
    @NamedQuery(name = "GbUsers.findByGbUsername", query = "SELECT g FROM GbUsers g WHERE g.gbUsername = :gbUsername"),
    @NamedQuery(name = "GbUsers.findByCreateDt", query = "SELECT g FROM GbUsers g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbUsers.findByGbLastLogginDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastLogginDt = :gbLastLogginDt"),
    @NamedQuery(name = "GbUsers.findByGbLastPwdXgeDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastPwdXgeDt = :gbLastPwdXgeDt"),
    @NamedQuery(name = "GbUsers.findByGbLastXgeDt", query = "SELECT g FROM GbUsers g WHERE g.gbLastXgeDt = :gbLastXgeDt"),
    @NamedQuery(name = "GbUsers.findByGbPassword", query = "SELECT g FROM GbUsers g WHERE g.gbPassword = :gbPassword"),
    @NamedQuery(name = "GbUsers.findByGbUserSystem", query = "SELECT g FROM GbUsers g WHERE g.gbUserSystem = :gbUserSystem"),
    @NamedQuery(name = "GbUsers.findByRowversion", query = "SELECT g FROM GbUsers g WHERE g.rowversion = :rowversion")})
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
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_LOGGIN_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastLogginDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_PWD_XGE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastPwdXgeDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_LAST_XGE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbLastXgeDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "GB_PASSWORD")
    private String gbPassword;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_USER_SYSTEM")
    private int gbUserSystem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROWVERSION")
    private int rowversion;
    @JoinColumns({
        @JoinColumn(name = "GB_LOGIN_STATUS", referencedColumnName = "CATALOG_ITEM_ID"),
        @JoinColumn(name = "GB_LOGIN_STATUS_CNAME", referencedColumnName = "CATALOG_NAME")})
    @ManyToOne(optional = false)
    private AdCatalogs loginStatus;
    @JoinColumns({
        @JoinColumn(name = "GB_OPRATIVE_STATUS", referencedColumnName = "CATALOG_ITEM_ID"),
        @JoinColumn(name = "GB_OPERATIVE_CNAME", referencedColumnName = "CATALOG_NAME")})
    @ManyToOne(optional = false)
    private AdCatalogs operativeStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbLastUserXge")
    private List<GbUsers> gbUsersList;
    @JoinColumn(name = "GB_LAST_USER_XGE", referencedColumnName = "GB_USERNAME")
    @ManyToOne(optional = false)
    private GbUsers gbLastUserXge;

    public GbUsers() {
    }

    public GbUsers(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public GbUsers(String gbUsername, Date createDt, Date gbLastLogginDt, Date gbLastPwdXgeDt, Date gbLastXgeDt, String gbPassword, int gbUserSystem, int rowversion) {
        this.gbUsername = gbUsername;
        this.createDt = createDt;
        this.gbLastLogginDt = gbLastLogginDt;
        this.gbLastPwdXgeDt = gbLastPwdXgeDt;
        this.gbLastXgeDt = gbLastXgeDt;
        this.gbPassword = gbPassword;
        this.gbUserSystem = gbUserSystem;
        this.rowversion = rowversion;
    }

    public String getGbUsername() {
        return gbUsername;
    }

    public void setGbUsername(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getGbLastLogginDt() {
        return gbLastLogginDt;
    }

    public void setGbLastLogginDt(Date gbLastLogginDt) {
        this.gbLastLogginDt = gbLastLogginDt;
    }

    public Date getGbLastPwdXgeDt() {
        return gbLastPwdXgeDt;
    }

    public void setGbLastPwdXgeDt(Date gbLastPwdXgeDt) {
        this.gbLastPwdXgeDt = gbLastPwdXgeDt;
    }

    public Date getGbLastXgeDt() {
        return gbLastXgeDt;
    }

    public void setGbLastXgeDt(Date gbLastXgeDt) {
        this.gbLastXgeDt = gbLastXgeDt;
    }

    public String getGbPassword() {
        return gbPassword;
    }

    public void setGbPassword(String gbPassword) {
        this.gbPassword = gbPassword;
    }

    public int getGbUserSystem() {
        return gbUserSystem;
    }

    public void setGbUserSystem(int gbUserSystem) {
        this.gbUserSystem = gbUserSystem;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public AdCatalogs getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(AdCatalogs loginStatus) {
        this.loginStatus = loginStatus;
    }

    public AdCatalogs getOperativeStatus() {
        return operativeStatus;
    }

    public void setOperativeStatus(AdCatalogs operativeStatus) {
        this.operativeStatus = operativeStatus;
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

    @XmlTransient
    public List<GbUsers> getGbUsersList() {
        return gbUsersList;
    }

    public void setGbUsersList(List<GbUsers> gbUsersList) {
        this.gbUsersList = gbUsersList;
    }

    public GbUsers getGbLastUserXge() {
        return gbLastUserXge;
    }

    public void setGbLastUserXge(GbUsers gbLastUserXge) {
        this.gbLastUserXge = gbLastUserXge;
    }

    public int getDaysPassedLastXgePwd() {
        Date today=Calendar.getInstance().getTime();
        return (int) ((today.getTime()-getGbLastPwdXgeDt().getTime())/86400000);
    }
}
