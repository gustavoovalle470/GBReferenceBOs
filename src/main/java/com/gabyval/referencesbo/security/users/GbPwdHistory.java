/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.users;

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
@Table(name = "gb_pwd_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbPwdHistory.findAll", query = "SELECT g FROM GbPwdHistory g"),
    @NamedQuery(name = "GbPwdHistory.findByGbPwdSaved", query = "SELECT g FROM GbPwdHistory g WHERE g.gbPwdHistoryPK.gbPwdSaved = :gbPwdSaved"),
    @NamedQuery(name = "GbPwdHistory.findByGbUsername", query = "SELECT g FROM GbPwdHistory g WHERE g.gbPwdHistoryPK.gbUsername = :gbUsername"),
    @NamedQuery(name = "GbPwdHistory.findByCreateDt", query = "SELECT g FROM GbPwdHistory g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbPwdHistory.findByGbPwdInsDt", query = "SELECT g FROM GbPwdHistory g WHERE g.gbPwdInsDt = :gbPwdInsDt"),
    @NamedQuery(name = "GbPwdHistory.findByRowversion", query = "SELECT g FROM GbPwdHistory g WHERE g.rowversion = :rowversion")})
public class GbPwdHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GbPwdHistoryPK gbPwdHistoryPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_PWD_INS_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gbPwdInsDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;
    @JoinColumn(name = "GB_USERNAME", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers;

    public GbPwdHistory() {
    }

    public GbPwdHistory(GbPwdHistoryPK gbPwdHistoryPK) {
        this.gbPwdHistoryPK = gbPwdHistoryPK;
    }

    public GbPwdHistory(GbPwdHistoryPK gbPwdHistoryPK, Date createDt, Date gbPwdInsDt, int rowversion) {
        this.gbPwdHistoryPK = gbPwdHistoryPK;
        this.createDt = createDt;
        this.gbPwdInsDt = gbPwdInsDt;
        this.rowversion = rowversion;
    }

    public GbPwdHistory(String gbPwdSaved, String gbUsername) {
        this.gbPwdHistoryPK = new GbPwdHistoryPK(gbPwdSaved, gbUsername);
    }

    public GbPwdHistoryPK getGbPwdHistoryPK() {
        return gbPwdHistoryPK;
    }

    public void setGbPwdHistoryPK(GbPwdHistoryPK gbPwdHistoryPK) {
        this.gbPwdHistoryPK = gbPwdHistoryPK;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getGbPwdInsDt() {
        return gbPwdInsDt;
    }

    public void setGbPwdInsDt(Date gbPwdInsDt) {
        this.gbPwdInsDt = gbPwdInsDt;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
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
        hash += (gbPwdHistoryPK != null ? gbPwdHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbPwdHistory)) {
            return false;
        }
        GbPwdHistory other = (GbPwdHistory) object;
        if ((this.gbPwdHistoryPK == null && other.gbPwdHistoryPK != null) || (this.gbPwdHistoryPK != null && !this.gbPwdHistoryPK.equals(other.gbPwdHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbPwdHistory[ gbPwdHistoryPK=" + gbPwdHistoryPK + " ]";
    }
    
}
