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
import javax.persistence.Lob;
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
@Table(name = "ad_messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdMessages.findAll", query = "SELECT a FROM AdMessages a"),
    @NamedQuery(name = "AdMessages.findByMessageId", query = "SELECT a FROM AdMessages a WHERE a.messageId = :messageId"),
    @NamedQuery(name = "AdMessages.findByCreateDt", query = "SELECT a FROM AdMessages a WHERE a.createDt = :createDt"),
    @NamedQuery(name = "AdMessages.findByLastDtUpd", query = "SELECT a FROM AdMessages a WHERE a.lastDtUpd = :lastDtUpd"),
    @NamedQuery(name = "AdMessages.findByLastUserUpd", query = "SELECT a FROM AdMessages a WHERE a.lastUserUpd = :lastUserUpd"),
    @NamedQuery(name = "AdMessages.findByMessageLevel", query = "SELECT a FROM AdMessages a WHERE a.messageLevel = :messageLevel"),
    @NamedQuery(name = "AdMessages.findByMessageTitle", query = "SELECT a FROM AdMessages a WHERE a.messageTitle = :messageTitle"),
    @NamedQuery(name = "AdMessages.findByRowversion", query = "SELECT a FROM AdMessages a WHERE a.rowversion = :rowversion"),
    @NamedQuery(name = "AdMessages.findByStatus", query = "SELECT a FROM AdMessages a WHERE a.status = :status"),
    @NamedQuery(name = "AdMessages.findByUserCreate", query = "SELECT a FROM AdMessages a WHERE a.userCreate = :userCreate")})
public class AdMessages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MESSAGE_ID")
    private Integer messageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Column(name = "LAST_DT_UPD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDtUpd;
    @Size(max = 20)
    @Column(name = "LAST_USER_UPD")
    private String lastUserUpd;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "MESSAGE_DESC")
    private String messageDesc;
    @Size(max = 100)
    @Column(name = "MESSAGE_LEVEL")
    private String messageLevel;
    @Size(max = 100)
    @Column(name = "MESSAGE_TITLE")
    private String messageTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;
    @Column(name = "status")
    private Integer status;
    @Size(max = 20)
    @Column(name = "USER_CREATE")
    private String userCreate;

    public AdMessages() {
    }

    public AdMessages(Integer messageId) {
        this.messageId = messageId;
    }

    public AdMessages(Integer messageId, Date createDt, String messageDesc, int rowversion) {
        this.messageId = messageId;
        this.createDt = createDt;
        this.messageDesc = messageDesc;
        this.rowversion = rowversion;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getLastDtUpd() {
        return lastDtUpd;
    }

    public void setLastDtUpd(Date lastDtUpd) {
        this.lastDtUpd = lastDtUpd;
    }

    public String getLastUserUpd() {
        return lastUserUpd;
    }

    public void setLastUserUpd(String lastUserUpd) {
        this.lastUserUpd = lastUserUpd;
    }

    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }

    public String getMessageLevel() {
        return messageLevel;
    }

    public void setMessageLevel(String messageLevel) {
        this.messageLevel = messageLevel;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdMessages)) {
            return false;
        }
        AdMessages other = (AdMessages) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.AdMessages[ messageId=" + messageId + " ]";
    }
    
}
