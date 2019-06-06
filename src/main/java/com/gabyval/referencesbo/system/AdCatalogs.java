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
@Table(name = "ad_catalogs", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdCatalogs.findAll", query = "SELECT a FROM AdCatalogs a")
    , @NamedQuery(name = "AdCatalogs.findByCatalogId", query = "SELECT a FROM AdCatalogs a WHERE a.catalogId = :catalogId")
    , @NamedQuery(name = "AdCatalogs.findByCatalogName", query = "SELECT a FROM AdCatalogs a WHERE a.catalogName = :catalogName")
    , @NamedQuery(name = "AdCatalogs.findByCatalogItemId", query = "SELECT a FROM AdCatalogs a WHERE a.catalogItemId = :catalogItemId")
    , @NamedQuery(name = "AdCatalogs.findByCatalogItem", query = "SELECT a FROM AdCatalogs a WHERE a.catalogItem = :catalogItem")
    , @NamedQuery(name = "AdCatalogs.findByCatalogDescription", query = "SELECT a FROM AdCatalogs a WHERE a.catalogDescription = :catalogDescription")
    , @NamedQuery(name = "AdCatalogs.findByCreateDt", query = "SELECT a FROM AdCatalogs a WHERE a.createDt = :createDt")
    , @NamedQuery(name = "AdCatalogs.findByRowversion", query = "SELECT a FROM AdCatalogs a WHERE a.rowversion = :rowversion")})
public class AdCatalogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CATALOG_ID")
    private Integer catalogId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CATALOG_NAME")
    private String catalogName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATALOG_ITEM_ID")
    private int catalogItemId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CATALOG_ITEM")
    private String catalogItem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "CATALOG_DESCRIPTION")
    private String catalogDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;

    public AdCatalogs() {
    }

    public AdCatalogs(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public AdCatalogs(Integer catalogId, String catalogName, int catalogItemId, String catalogItem, String catalogDescription, Date createDt, int rowversion) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.catalogItemId = catalogItemId;
        this.catalogItem = catalogItem;
        this.catalogDescription = catalogDescription;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getCatalogItemId() {
        return catalogItemId;
    }

    public void setCatalogItemId(int catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    public String getCatalogItem() {
        return catalogItem;
    }

    public void setCatalogItem(String catalogItem) {
        this.catalogItem = catalogItem;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
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
        hash += (catalogId != null ? catalogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdCatalogs)) {
            return false;
        }
        AdCatalogs other = (AdCatalogs) object;
        if ((this.catalogId == null && other.catalogId != null) || (this.catalogId != null && !this.catalogId.equals(other.catalogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.AdCatalogs[ catalogId=" + catalogId + " ]";
    }
    
}
