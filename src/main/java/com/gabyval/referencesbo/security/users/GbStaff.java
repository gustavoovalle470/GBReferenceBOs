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
import javax.persistence.Lob;
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
@Table(name = "gb_staff", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbStaff.findAll", query = "SELECT g FROM GbStaff g")
    , @NamedQuery(name = "GbStaff.findByGbUsername", query = "SELECT g FROM GbStaff g WHERE g.gbStaffPK.gbUsername = :gbUsername")
    , @NamedQuery(name = "GbStaff.findByGbStaffName", query = "SELECT g FROM GbStaff g WHERE g.gbStaffName = :gbStaffName")
    , @NamedQuery(name = "GbStaff.findByGbStaffSurname", query = "SELECT g FROM GbStaff g WHERE g.gbStaffSurname = :gbStaffSurname")
    , @NamedQuery(name = "GbStaff.findByGbIdTypeCname", query = "SELECT g FROM GbStaff g WHERE g.gbStaffPK.gbIdTypeCname = :gbIdTypeCname")
    , @NamedQuery(name = "GbStaff.findByGbIdType", query = "SELECT g FROM GbStaff g WHERE g.gbStaffPK.gbIdType = :gbIdType")
    , @NamedQuery(name = "GbStaff.findByGbIdNumber", query = "SELECT g FROM GbStaff g WHERE g.gbIdNumber = :gbIdNumber")
    , @NamedQuery(name = "GbStaff.findByGbPhoneNumber", query = "SELECT g FROM GbStaff g WHERE g.gbPhoneNumber = :gbPhoneNumber")
    , @NamedQuery(name = "GbStaff.findByGbMobileNumber", query = "SELECT g FROM GbStaff g WHERE g.gbMobileNumber = :gbMobileNumber")
    , @NamedQuery(name = "GbStaff.findByGbEmail", query = "SELECT g FROM GbStaff g WHERE g.gbEmail = :gbEmail")
    , @NamedQuery(name = "GbStaff.findByGbBirthdate", query = "SELECT g FROM GbStaff g WHERE g.gbBirthdate = :gbBirthdate")
    , @NamedQuery(name = "GbStaff.findByGbGender", query = "SELECT g FROM GbStaff g WHERE g.gbGender = :gbGender")
    , @NamedQuery(name = "GbStaff.findByCreateDt", query = "SELECT g FROM GbStaff g WHERE g.createDt = :createDt")
    , @NamedQuery(name = "GbStaff.findByRowversion", query = "SELECT g FROM GbStaff g WHERE g.rowversion = :rowversion")})
public class GbStaff implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GbStaffPK gbStaffPK;
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
    @Size(min = 1, max = 20)
    @Column(name = "GB_ID_NUMBER")
    private String gbIdNumber;
    @Lob
    @Column(name = "GB_PHOTO")
    private byte[] gbPhoto;
    @Size(max = 20)
    @Column(name = "GB_PHONE_NUMBER")
    private String gbPhoneNumber;
    @Size(max = 20)
    @Column(name = "GB_MOBILE_NUMBER")
    private String gbMobileNumber;
    @Size(max = 200)
    @Column(name = "GB_EMAIL")
    private String gbEmail;
    @Column(name = "GB_BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date gbBirthdate;
    @Column(name = "GB_GENDER")
    private Integer gbGender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;
    @JoinColumn(name = "GB_USERNAME", referencedColumnName = "GB_USERNAME", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GbUsers gbUsers;

    public GbStaff() {
    }

    public GbStaff(GbStaffPK gbStaffPK) {
        this.gbStaffPK = gbStaffPK;
    }

    public GbStaff(GbStaffPK gbStaffPK, String gbStaffName, String gbStaffSurname, String gbIdNumber, Date createDt, int rowversion) {
        this.gbStaffPK = gbStaffPK;
        this.gbStaffName = gbStaffName;
        this.gbStaffSurname = gbStaffSurname;
        this.gbIdNumber = gbIdNumber;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public GbStaff(String gbUsername, String gbIdTypeCname, int gbIdType) {
        this.gbStaffPK = new GbStaffPK(gbUsername, gbIdTypeCname, gbIdType);
    }

    public GbStaffPK getGbStaffPK() {
        return gbStaffPK;
    }

    public void setGbStaffPK(GbStaffPK gbStaffPK) {
        this.gbStaffPK = gbStaffPK;
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

    public String getGbIdNumber() {
        return gbIdNumber;
    }

    public void setGbIdNumber(String gbIdNumber) {
        this.gbIdNumber = gbIdNumber;
    }

    public byte[] getGbPhoto() {
        return gbPhoto;
    }

    public void setGbPhoto(byte[] gbPhoto) {
        this.gbPhoto = gbPhoto;
    }

    public String getGbPhoneNumber() {
        return gbPhoneNumber;
    }

    public void setGbPhoneNumber(String gbPhoneNumber) {
        this.gbPhoneNumber = gbPhoneNumber;
    }

    public String getGbMobileNumber() {
        return gbMobileNumber;
    }

    public void setGbMobileNumber(String gbMobileNumber) {
        this.gbMobileNumber = gbMobileNumber;
    }

    public String getGbEmail() {
        return gbEmail;
    }

    public void setGbEmail(String gbEmail) {
        this.gbEmail = gbEmail;
    }

    public Date getGbBirthdate() {
        return gbBirthdate;
    }

    public void setGbBirthdate(Date gbBirthdate) {
        this.gbBirthdate = gbBirthdate;
    }

    public Integer getGbGender() {
        return gbGender;
    }

    public void setGbGender(Integer gbGender) {
        this.gbGender = gbGender;
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

    public GbUsers getGbUsers() {
        return gbUsers;
    }

    public void setGbUsers(GbUsers gbUsers) {
        this.gbUsers = gbUsers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbStaffPK != null ? gbStaffPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbStaff)) {
            return false;
        }
        GbStaff other = (GbStaff) object;
        if ((this.gbStaffPK == null && other.gbStaffPK != null) || (this.gbStaffPK != null && !this.gbStaffPK.equals(other.gbStaffPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.GbStaff[ gbStaffPK=" + gbStaffPK + " ]";
    }
    
}
