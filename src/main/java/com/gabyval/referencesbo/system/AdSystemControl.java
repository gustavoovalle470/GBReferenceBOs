/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.system;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "ad_system_control", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdSystemControl.findAll", query = "SELECT a FROM AdSystemControl a")
    , @NamedQuery(name = "AdSystemControl.findBySystemControlId", query = "SELECT a FROM AdSystemControl a WHERE a.systemControlId = :systemControlId")
    , @NamedQuery(name = "AdSystemControl.findBySystemPause", query = "SELECT a FROM AdSystemControl a WHERE a.systemPause = :systemPause")
    , @NamedQuery(name = "AdSystemControl.findBySystemWorkDay", query = "SELECT a FROM AdSystemControl a WHERE a.systemWorkDay = :systemWorkDay")
    , @NamedQuery(name = "AdSystemControl.findByLastCloseDt", query = "SELECT a FROM AdSystemControl a WHERE a.lastCloseDt = :lastCloseDt")
    , @NamedQuery(name = "AdSystemControl.findByNextCloseDt", query = "SELECT a FROM AdSystemControl a WHERE a.nextCloseDt = :nextCloseDt")
    , @NamedQuery(name = "AdSystemControl.findByCreateDt", query = "SELECT a FROM AdSystemControl a WHERE a.createDt = :createDt")
    , @NamedQuery(name = "AdSystemControl.findByRowversion", query = "SELECT a FROM AdSystemControl a WHERE a.rowversion = :rowversion")})
public class AdSystemControl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SYSTEM_CONTROL_ID")
    private Integer systemControlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SYSTEM_PAUSE")
    private String systemPause;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SYSTEM_WORK_DAY")
    private String systemWorkDay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_CLOSE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastCloseDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NEXT_CLOSE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextCloseDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;

    public AdSystemControl() {
    }

    public AdSystemControl(Integer systemControlId) {
        this.systemControlId = systemControlId;
    }

    public AdSystemControl(Integer systemControlId, String systemPause, String systemWorkDay, Date lastCloseDt, Date nextCloseDt, Date createDt, int rowversion) {
        this.systemControlId = systemControlId;
        this.systemPause = systemPause;
        this.systemWorkDay = systemWorkDay;
        this.lastCloseDt = lastCloseDt;
        this.nextCloseDt = nextCloseDt;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public Integer getSystemControlId() {
        return systemControlId;
    }

    public void setSystemControlId(Integer systemControlId) {
        this.systemControlId = systemControlId;
    }

    public String getSystemPause() {
        return systemPause;
    }

    public void setSystemPause(String systemPause) {
        this.systemPause = systemPause;
    }

    public String getSystemWorkDay() {
        return systemWorkDay;
    }

    public void setSystemWorkDay(String systemWorkDay) {
        this.systemWorkDay = systemWorkDay;
    }

    public Date getLastCloseDt() {
        return lastCloseDt;
    }

    public void setLastCloseDt(Date lastCloseDt) {
        this.lastCloseDt = lastCloseDt;
    }

    public Date getNextCloseDt() {
        return nextCloseDt;
    }

    public void setNextCloseDt(Date nextCloseDt) {
        this.nextCloseDt = nextCloseDt;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemControlId != null ? systemControlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdSystemControl)) {
            return false;
        }
        AdSystemControl other = (AdSystemControl) object;
        if ((this.systemControlId == null && other.systemControlId != null) || (this.systemControlId != null && !this.systemControlId.equals(other.systemControlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.AdSystemControl[ systemControlId=" + systemControlId + " ]";
    }
    
}
