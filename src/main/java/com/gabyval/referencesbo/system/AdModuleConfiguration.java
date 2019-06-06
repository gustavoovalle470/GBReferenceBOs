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
@Table(name = "ad_module_configuration", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdModuleConfiguration.findAll", query = "SELECT a FROM AdModuleConfiguration a")
    , @NamedQuery(name = "AdModuleConfiguration.findByModuleConfigId", query = "SELECT a FROM AdModuleConfiguration a WHERE a.moduleConfigId = :moduleConfigId")
    , @NamedQuery(name = "AdModuleConfiguration.findByModuleConfigName", query = "SELECT a FROM AdModuleConfiguration a WHERE a.moduleConfigName = :moduleConfigName")
    , @NamedQuery(name = "AdModuleConfiguration.findByModuleConfigType", query = "SELECT a FROM AdModuleConfiguration a WHERE a.moduleConfigType = :moduleConfigType")
    , @NamedQuery(name = "AdModuleConfiguration.findByModuleConfigValue", query = "SELECT a FROM AdModuleConfiguration a WHERE a.moduleConfigValue = :moduleConfigValue")
    , @NamedQuery(name = "AdModuleConfiguration.findByModuleConfigDesc", query = "SELECT a FROM AdModuleConfiguration a WHERE a.moduleConfigDesc = :moduleConfigDesc")
    , @NamedQuery(name = "AdModuleConfiguration.findByCreateDt", query = "SELECT a FROM AdModuleConfiguration a WHERE a.createDt = :createDt")
    , @NamedQuery(name = "AdModuleConfiguration.findByRowversion", query = "SELECT a FROM AdModuleConfiguration a WHERE a.rowversion = :rowversion")})
public class AdModuleConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MODULE_CONFIG_ID")
    private Integer moduleConfigId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MODULE_CONFIG_NAME")
    private String moduleConfigName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "MODULE_CONFIG_TYPE")
    private String moduleConfigType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MODULE_CONFIG_VALUE")
    private String moduleConfigValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "MODULE_CONFIG_DESC")
    private String moduleConfigDesc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;

    public AdModuleConfiguration() {
    }

    public AdModuleConfiguration(Integer moduleConfigId) {
        this.moduleConfigId = moduleConfigId;
    }

    public AdModuleConfiguration(Integer moduleConfigId, String moduleConfigName, String moduleConfigType, String moduleConfigValue, String moduleConfigDesc, Date createDt, int rowversion) {
        this.moduleConfigId = moduleConfigId;
        this.moduleConfigName = moduleConfigName;
        this.moduleConfigType = moduleConfigType;
        this.moduleConfigValue = moduleConfigValue;
        this.moduleConfigDesc = moduleConfigDesc;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public Integer getModuleConfigId() {
        return moduleConfigId;
    }

    public void setModuleConfigId(Integer moduleConfigId) {
        this.moduleConfigId = moduleConfigId;
    }

    public String getModuleConfigName() {
        return moduleConfigName;
    }

    public void setModuleConfigName(String moduleConfigName) {
        this.moduleConfigName = moduleConfigName;
    }

    public String getModuleConfigType() {
        return moduleConfigType;
    }

    public void setModuleConfigType(String moduleConfigType) {
        this.moduleConfigType = moduleConfigType;
    }

    public String getModuleConfigValue() {
        return moduleConfigValue;
    }

    public void setModuleConfigValue(String moduleConfigValue) {
        this.moduleConfigValue = moduleConfigValue;
    }

    public String getModuleConfigDesc() {
        return moduleConfigDesc;
    }

    public void setModuleConfigDesc(String moduleConfigDesc) {
        this.moduleConfigDesc = moduleConfigDesc;
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
        hash += (moduleConfigId != null ? moduleConfigId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdModuleConfiguration)) {
            return false;
        }
        AdModuleConfiguration other = (AdModuleConfiguration) object;
        if ((this.moduleConfigId == null && other.moduleConfigId != null) || (this.moduleConfigId != null && !this.moduleConfigId.equals(other.moduleConfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.AdModuleConfiguration[ moduleConfigId=" + moduleConfigId + " ]";
    }
    
}
