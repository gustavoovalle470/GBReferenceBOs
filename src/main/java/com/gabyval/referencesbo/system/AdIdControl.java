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
@Table(name = "ad_id_control", catalog = "db_gabyval", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdIdControl.findAll", query = "SELECT a FROM AdIdControl a")
    , @NamedQuery(name = "AdIdControl.findByNomTabla", query = "SELECT a FROM AdIdControl a WHERE a.nomTabla = :nomTabla")
    , @NamedQuery(name = "AdIdControl.findByNumCtrl", query = "SELECT a FROM AdIdControl a WHERE a.numCtrl = :numCtrl")
    , @NamedQuery(name = "AdIdControl.findByNumInc", query = "SELECT a FROM AdIdControl a WHERE a.numInc = :numInc")
    , @NamedQuery(name = "AdIdControl.findByCreateDt", query = "SELECT a FROM AdIdControl a WHERE a.createDt = :createDt")
    , @NamedQuery(name = "AdIdControl.findByRowversion", query = "SELECT a FROM AdIdControl a WHERE a.rowversion = :rowversion")})
public class AdIdControl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOM_TABLA")
    private String nomTabla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_CTRL")
    private int numCtrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_INC")
    private int numInc;
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    private Integer rowversion;

    public AdIdControl() {
    }

    public AdIdControl(String nomTabla) {
        this.nomTabla = nomTabla;
    }

    public AdIdControl(String nomTabla, int numCtrl, int numInc) {
        this.nomTabla = nomTabla;
        this.numCtrl = numCtrl;
        this.numInc = numInc;
    }

    public String getNomTabla() {
        return nomTabla;
    }

    public void setNomTabla(String nomTabla) {
        this.nomTabla = nomTabla;
    }

    public int getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(int numCtrl) {
        this.numCtrl = numCtrl;
    }

    public int getNumInc() {
        return numInc;
    }

    public void setNumInc(int numInc) {
        this.numInc = numInc;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomTabla != null ? nomTabla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdIdControl)) {
            return false;
        }
        AdIdControl other = (AdIdControl) object;
        if ((this.nomTabla == null && other.nomTabla != null) || (this.nomTabla != null && !this.nomTabla.equals(other.nomTabla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.AdIdControl[ nomTabla=" + nomTabla + " ]";
    }
    
}
