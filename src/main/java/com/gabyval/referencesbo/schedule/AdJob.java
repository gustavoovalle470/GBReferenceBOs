/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.schedule;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "ad_job", catalog = "gb_database", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdJob.findAll", query = "SELECT a FROM AdJob a")
    , @NamedQuery(name = "AdJob.findByJobId", query = "SELECT a FROM AdJob a WHERE a.jobId = :jobId")
    , @NamedQuery(name = "AdJob.findByJobName", query = "SELECT a FROM AdJob a WHERE a.jobName = :jobName")
    , @NamedQuery(name = "AdJob.findByJobClass", query = "SELECT a FROM AdJob a WHERE a.jobClass = :jobClass")
    , @NamedQuery(name = "AdJob.findByJobDesc", query = "SELECT a FROM AdJob a WHERE a.jobDesc = :jobDesc")
    , @NamedQuery(name = "AdJob.findByExpCron", query = "SELECT a FROM AdJob a WHERE a.expCron = :expCron")
    , @NamedQuery(name = "AdJob.findByAutoRun", query = "SELECT a FROM AdJob a WHERE a.autoRun = :autoRun")
    , @NamedQuery(name = "AdJob.findByCreateDt", query = "SELECT a FROM AdJob a WHERE a.createDt = :createDt")
    , @NamedQuery(name = "AdJob.findByRowversion", query = "SELECT a FROM AdJob a WHERE a.rowversion = :rowversion")})
public class AdJob implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JOB_ID")
    private Integer jobId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "JOB_NAME")
    private String jobName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "JOB_CLASS")
    private String jobClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "JOB_DESC")
    private String jobDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EXP_CRON")
    private String expCron;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "AUTO_RUN")
    private String autoRun;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Basic(optional = false)
    @NotNull
    private int rowversion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "adJob")
    private AdExecuteJob adExecuteJob;

    public AdJob() {
    }

    public AdJob(Integer jobId) {
        this.jobId = jobId;
    }

    public AdJob(Integer jobId, String jobName, String jobClass, String jobDesc, String expCron, String autoRun, Date createDt, int rowversion) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobClass = jobClass;
        this.jobDesc = jobDesc;
        this.expCron = expCron;
        this.autoRun = autoRun;
        this.createDt = createDt;
        this.rowversion = rowversion;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getExpCron() {
        return expCron;
    }

    public void setExpCron(String expCron) {
        this.expCron = expCron;
    }

    public String getAutoRun() {
        return autoRun;
    }

    public void setAutoRun(String autoRun) {
        this.autoRun = autoRun;
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

    public AdExecuteJob getAdExecuteJob() {
        return adExecuteJob;
    }

    public void setAdExecuteJob(AdExecuteJob adExecuteJob) {
        this.adExecuteJob = adExecuteJob;
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
        if (!(object instanceof AdJob)) {
            return false;
        }
        AdJob other = (AdJob) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.referencesbo.AdJob[ jobId=" + jobId + " ]";
    }
    
}
