/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.schedule;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "ad_execute_job")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdExecuteJob.findAll", query = "SELECT a FROM AdExecuteJob a"),
    @NamedQuery(name = "AdExecuteJob.findByJobId", query = "SELECT a FROM AdExecuteJob a WHERE a.jobId = :jobId"),
    @NamedQuery(name = "AdExecuteJob.findByCreateDt", query = "SELECT a FROM AdExecuteJob a WHERE a.createDt = :createDt"),
    @NamedQuery(name = "AdExecuteJob.findByExecTime", query = "SELECT a FROM AdExecuteJob a WHERE a.execTime = :execTime"),
    @NamedQuery(name = "AdExecuteJob.findByLastExec", query = "SELECT a FROM AdExecuteJob a WHERE a.lastExec = :lastExec"),
    @NamedQuery(name = "AdExecuteJob.findByMsgError", query = "SELECT a FROM AdExecuteJob a WHERE a.msgError = :msgError"),
    @NamedQuery(name = "AdExecuteJob.findByRowversion", query = "SELECT a FROM AdExecuteJob a WHERE a.rowversion = :rowversion"),
    @NamedQuery(name = "AdExecuteJob.findByRunState", query = "SELECT a FROM AdExecuteJob a WHERE a.runState = :runState")})
public class AdExecuteJob implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JOB_ID")
    private Integer jobId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXEC_TIME")
    private int execTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LAST_EXEC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastExec;
    @Size(max = 200)
    @Column(name = "MSG_ERROR")
    private String msgError;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rowversion")
    private int rowversion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RUN_STATE")
    private int runState;
    @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private AdJob adJob;

    public AdExecuteJob() {
    }

    public AdExecuteJob(Integer jobId) {
        this.jobId = jobId;
    }

    public AdExecuteJob(Integer jobId, Date createDt, int execTime, Date lastExec, int rowversion, int runState) {
        this.jobId = jobId;
        this.createDt = createDt;
        this.execTime = execTime;
        this.lastExec = lastExec;
        this.rowversion = rowversion;
        this.runState = runState;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public int getExecTime() {
        return execTime;
    }

    public void setExecTime(int execTime) {
        this.execTime = execTime;
    }

    public Date getLastExec() {
        return lastExec;
    }

    public void setLastExec(Date lastExec) {
        this.lastExec = lastExec;
    }

    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    public int getRunState() {
        return runState;
    }

    public void setRunState(int runState) {
        this.runState = runState;
    }

    public AdJob getAdJob() {
        return adJob;
    }

    public void setAdJob(AdJob adJob) {
        this.adJob = adJob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobId != null ? jobId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdExecuteJob)) {
            return false;
        }
        AdExecuteJob other = (AdExecuteJob) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.AdExecuteJob[ jobId=" + jobId + " ]";
    }
    
}
