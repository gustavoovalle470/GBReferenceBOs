/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.users;

import com.gabyval.referencesbo.system.AdCatalogs;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "gb_staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbStaff.findAll", query = "SELECT g FROM GbStaff g"),
    @NamedQuery(name = "GbStaff.findByGbUsername", query = "SELECT g FROM GbStaff g WHERE g.gbUsername = :gbUsername"),
    @NamedQuery(name = "GbStaff.findByCreateDt", query = "SELECT g FROM GbStaff g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbStaff.findByGbBirthdate", query = "SELECT g FROM GbStaff g WHERE g.gbBirthdate = :gbBirthdate"),
    @NamedQuery(name = "GbStaff.findByGbEmail", query = "SELECT g FROM GbStaff g WHERE g.gbEmail = :gbEmail"),
    @NamedQuery(name = "GbStaff.findByGbIdNumber", query = "SELECT g FROM GbStaff g WHERE g.gbIdNumber = :gbIdNumber"),
    @NamedQuery(name = "GbStaff.findByGbMobileNumber", query = "SELECT g FROM GbStaff g WHERE g.gbMobileNumber = :gbMobileNumber"),
    @NamedQuery(name = "GbStaff.findByGbPhoneNumber", query = "SELECT g FROM GbStaff g WHERE g.gbPhoneNumber = :gbPhoneNumber"),
    @NamedQuery(name = "GbStaff.findByGbStaffName", query = "SELECT g FROM GbStaff g WHERE g.gbStaffName = :gbStaffName"),
    @NamedQuery(name = "GbStaff.findByGbStaffSurname", query = "SELECT g FROM GbStaff g WHERE g.gbStaffSurname = :gbStaffSurname"),
    @NamedQuery(name = "GbStaff.findByPersonalData", query = "SELECT g from GbStaff g where g.gbIdNumber=:gbIdNumber AND g.gbStaffName=:gbStaffName AND g.gbStaffSurname=:gbStaffSurname"),
    @NamedQuery(name = "GbStaff.findByRowversion", query = "SELECT g FROM GbStaff g WHERE g.rowversion = :rowversion")})
public class GbStaff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "GB_USERNAME")
    private String gbUsername;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date gbBirthdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "GB_EMAIL")
    private String gbEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GB_ID_NUMBER")
    private String gbIdNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GB_MOBILE_NUMBER")
    private String gbMobileNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GB_PHONE_NUMBER")
    private String gbPhoneNumber;
    @Lob
    @Column(name = "GB_PHOTO")
    private byte[] gbPhoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "GB_STAFF_NAME")
    private String gbStaffName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "GB_STAFF_SURNAME")
    private String gbStaffSurname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROWVERSION")
    private int rowversion;
    @JoinColumns({
        @JoinColumn(name = "GB_GENDER", referencedColumnName = "CATALOG_ITEM_ID"),
        @JoinColumn(name = "GB_GENDER_CNAME", referencedColumnName = "CATALOG_NAME")})
    @ManyToOne(optional = false)
    private AdCatalogs gender;
    @JoinColumns({
        @JoinColumn(name = "GB_ID_TYPE", referencedColumnName = "CATALOG_ITEM_ID"),
        @JoinColumn(name = "GB_ID_TYPE_CNAME", referencedColumnName = "CATALOG_NAME")})
    @ManyToOne(optional = false)
    private AdCatalogs idType;
    @JoinColumn(name = "GB_USERNAME", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private GbUsers gbUsers;

    public GbStaff() {
    }

    public GbStaff(String gbUsername) {
        this.gbUsername = gbUsername;
    }

    public GbStaff(String gbUsername, Date createDt, Date gbBirthdate, String gbEmail, String gbIdNumber, String gbMobileNumber, String gbPhoneNumber, String gbStaffName, String gbStaffSurname, int rowversion) {
        this.gbUsername = gbUsername;
        this.createDt = createDt;
        this.gbBirthdate = gbBirthdate;
        this.gbEmail = gbEmail;
        this.gbIdNumber = gbIdNumber;
        this.gbMobileNumber = gbMobileNumber;
        this.gbPhoneNumber = gbPhoneNumber;
        this.gbStaffName = gbStaffName;
        this.gbStaffSurname = gbStaffSurname;
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

    public Date getGbBirthdate() {
        return gbBirthdate;
    }

    public void setGbBirthdate(Date gbBirthdate) {
        this.gbBirthdate = gbBirthdate;
    }

    public String getGbEmail() {
        return gbEmail;
    }

    public void setGbEmail(String gbEmail) {
        this.gbEmail = gbEmail;
    }

    public String getGbIdNumber() {
        return gbIdNumber;
    }

    public void setGbIdNumber(String gbIdNumber) {
        this.gbIdNumber = gbIdNumber;
    }

    public String getGbMobileNumber() {
        return gbMobileNumber;
    }

    public void setGbMobileNumber(String gbMobileNumber) {
        this.gbMobileNumber = gbMobileNumber;
    }

    public String getGbPhoneNumber() {
        return gbPhoneNumber;
    }

    public void setGbPhoneNumber(String gbPhoneNumber) {
        this.gbPhoneNumber = gbPhoneNumber;
    }

    public byte[] getGbPhoto() {
        return gbPhoto;
    }

    public void setGbPhoto(byte[] gbPhoto) {
        this.gbPhoto = gbPhoto;
    }

    public String getGbStaffName() {
        return gbStaffName;
    }

    public void setGbStaffName(String gbStaffName) {
        this.gbStaffName = gbStaffName;
    }

    public String getGbStaffSurname() {
        return gbStaffSurname;
    }

    public void setGbStaffSurname(String gbStaffSurname) {
        this.gbStaffSurname = gbStaffSurname;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public AdCatalogs getGender() {
        return gender;
    }

    public void setGender(AdCatalogs gender) {
        this.gender = gender;
    }

    public AdCatalogs getIdType() {
        return idType;
    }

    public void setIdType(AdCatalogs idType) {
        this.idType = idType;
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
        hash += (gbUsername != null ? gbUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbStaff)) {
            return false;
        }
        GbStaff other = (GbStaff) object;
        if ((this.gbUsername == null && other.gbUsername != null) || (this.gbUsername != null && !this.gbUsername.equals(other.gbUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbStaff[ gbUsername=" + gbUsername + " ]";
    }
    
}
