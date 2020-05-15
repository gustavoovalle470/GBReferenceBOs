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
@Table(name = "ad_no_working_days")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdNoWorkingDays.findAll", query = "SELECT a FROM AdNoWorkingDays a"),
    @NamedQuery(name = "AdNoWorkingDays.findByNoWorkingDayId", query = "SELECT a FROM AdNoWorkingDays a WHERE a.noWorkingDayId = :noWorkingDayId"),
    @NamedQuery(name = "AdNoWorkingDays.findByCreateDt", query = "SELECT a FROM AdNoWorkingDays a WHERE a.createDt = :createDt"),
    @NamedQuery(name = "AdNoWorkingDays.findByDateDescription", query = "SELECT a FROM AdNoWorkingDays a WHERE a.dateDescription = :dateDescription"),
    @NamedQuery(name = "AdNoWorkingDays.findByNoWorkingDate", query = "SELECT a FROM AdNoWorkingDays a WHERE a.noWorkingDate = :noWorkingDate"),
    @NamedQuery(name = "AdNoWorkingDays.findByRowversion", query = "SELECT a FROM AdNoWorkingDays a WHERE a.rowversion = :rowversion")})
public class AdNoWorkingDays implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NO_WORKING_DAY_ID")
    private Integer noWorkingDayId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DATE_DESCRIPTION")
    private String dateDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NO_WORKING_DATE")
    @Temporal(TemporalType.DATE)
    private Date noWorkingDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;

    public AdNoWorkingDays() {
    }

    public AdNoWorkingDays(Integer noWorkingDayId) {
        this.noWorkingDayId = noWorkingDayId;
    }

    public AdNoWorkingDays(Integer noWorkingDayId, Date createDt, String dateDescription, Date noWorkingDate, int rowversion) {
        this.noWorkingDayId = noWorkingDayId;
        this.createDt = createDt;
        this.dateDescription = dateDescription;
        this.noWorkingDate = noWorkingDate;
        this.rowversion = rowversion;
    }

    public Integer getNoWorkingDayId() {
        return noWorkingDayId;
    }

    public void setNoWorkingDayId(Integer noWorkingDayId) {
        this.noWorkingDayId = noWorkingDayId;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getDateDescription() {
        return dateDescription;
    }

    public void setDateDescription(String dateDescription) {
        this.dateDescription = dateDescription;
    }

    public Date getNoWorkingDate() {
        return noWorkingDate;
    }

    public void setNoWorkingDate(Date noWorkingDate) {
        this.noWorkingDate = noWorkingDate;
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
        hash += (noWorkingDayId != null ? noWorkingDayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdNoWorkingDays)) {
            return false;
        }
        AdNoWorkingDays other = (AdNoWorkingDays) object;
        if ((this.noWorkingDayId == null && other.noWorkingDayId != null) || (this.noWorkingDayId != null && !this.noWorkingDayId.equals(other.noWorkingDayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.AdNoWorkingDays[ noWorkingDayId=" + noWorkingDayId + " ]";
    }
    
}
