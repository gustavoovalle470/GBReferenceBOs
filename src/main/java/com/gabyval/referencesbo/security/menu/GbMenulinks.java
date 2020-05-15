/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabyval.referencesbo.security.menu;

import com.gabyval.referencesbo.security.profiling.GbMenuProfiling;
import com.gabyval.referencesbo.security.users.GbUsers;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author OvalleGA
 */
@Entity
@Table(name = "gb_menulinks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GbMenulinks.findAll", query = "SELECT g FROM GbMenulinks g"),
    @NamedQuery(name = "GbMenulinks.findByGbMenuId", query = "SELECT g FROM GbMenulinks g WHERE g.gbMenuId = :gbMenuId"),
    @NamedQuery(name = "GbMenulinks.findByGbMenuName", query = "SELECT g FROM GbMenulinks g WHERE g.gbMenuName = :gbMenuName"),
    @NamedQuery(name = "GbMenulinks.findByCreateDt", query = "SELECT g FROM GbMenulinks g WHERE g.createDt = :createDt"),
    @NamedQuery(name = "GbMenulinks.findByGbIcon", query = "SELECT g FROM GbMenulinks g WHERE g.gbIcon = :gbIcon"),
    @NamedQuery(name = "GbMenulinks.findByGbIsNode", query = "SELECT g FROM GbMenulinks g WHERE g.gbIsNode = :gbIsNode"),
    @NamedQuery(name = "GbMenulinks.findByGbLastDateChg", query = "SELECT g FROM GbMenulinks g WHERE g.gbLastDateChg = :gbLastDateChg"),
    @NamedQuery(name = "GbMenulinks.findByGbMenuStatus", query = "SELECT g FROM GbMenulinks g WHERE g.gbMenuStatus = :gbMenuStatus"),
    @NamedQuery(name = "GbMenulinks.findByGbPageView", query = "SELECT g FROM GbMenulinks g WHERE g.gbPageView = :gbPageView"),
    @NamedQuery(name = "GbMenulinks.findByRowversion", query = "SELECT g FROM GbMenulinks g WHERE g.rowversion = :rowversion")})
public class GbMenulinks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_MENU_ID")
    private int gbMenuId;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "GB_MENU_NAME")
    private String gbMenuName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATE_DT")
    @Temporal(TemporalType.DATE)
    private Date createDt;
    @Size(max = 100)
    @Column(name = "GB_ICON")
    private String gbIcon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_IS_NODE")
    private int gbIsNode;
    @Column(name = "GB_LAST_DATE_CHG")
    @Temporal(TemporalType.DATE)
    private Date gbLastDateChg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GB_MENU_STATUS")
    private int gbMenuStatus;
    @Size(max = 100)
    @Column(name = "GB_PAGE_VIEW")
    private String gbPageView;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROWVERSION")
    private int rowversion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gbMenulinks")
    private List<GbMenuProfiling> gbMenuProfilingList;
    @OneToMany(mappedBy = "gbMenuParId")
    private List<GbMenulinks> gbMenulinksList;
    @JoinColumn(name = "GB_MENU_PAR_ID", referencedColumnName = "GB_MENU_ID")
    @ManyToOne
    private GbMenulinks gbMenuParId;
    @JoinColumn(name = "GB_LAST_USER_CHG", referencedColumnName = "GB_USERNAME")
    @ManyToOne(optional = false)
    private GbUsers gbLastUserChg;

    public GbMenulinks() {
    }

    public GbMenulinks(String gbMenuName) {
        this.gbMenuName = gbMenuName;
    }

    public GbMenulinks(String gbMenuName, int gbMenuId, Date createDt, int gbIsNode, int gbMenuStatus, int rowversion) {
        this.gbMenuName = gbMenuName;
        this.gbMenuId = gbMenuId;
        this.createDt = createDt;
        this.gbIsNode = gbIsNode;
        this.gbMenuStatus = gbMenuStatus;
        this.rowversion = rowversion;
    }

    public int getGbMenuId() {
        return gbMenuId;
    }

    public void setGbMenuId(int gbMenuId) {
        this.gbMenuId = gbMenuId;
    }

    public String getGbMenuName() {
        return gbMenuName;
    }

    public void setGbMenuName(String gbMenuName) {
        this.gbMenuName = gbMenuName;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getGbIcon() {
        return gbIcon;
    }

    public void setGbIcon(String gbIcon) {
        this.gbIcon = gbIcon;
    }

    public int getGbIsNode() {
        return gbIsNode;
    }

    public void setGbIsNode(int gbIsNode) {
        this.gbIsNode = gbIsNode;
    }

    public Date getGbLastDateChg() {
        return gbLastDateChg;
    }

    public void setGbLastDateChg(Date gbLastDateChg) {
        this.gbLastDateChg = gbLastDateChg;
    }

    public int getGbMenuStatus() {
        return gbMenuStatus;
    }

    public void setGbMenuStatus(int gbMenuStatus) {
        this.gbMenuStatus = gbMenuStatus;
    }

    public String getGbPageView() {
        return gbPageView;
    }

    public void setGbPageView(String gbPageView) {
        this.gbPageView = gbPageView;
    }

    public int getRowversion() {
        return rowversion;
    }

    public void setRowversion(int rowversion) {
        this.rowversion = rowversion;
    }

    @XmlTransient
    public List<GbMenuProfiling> getGbMenuProfilingList() {
        return gbMenuProfilingList;
    }

    public void setGbMenuProfilingList(List<GbMenuProfiling> gbMenuProfilingList) {
        this.gbMenuProfilingList = gbMenuProfilingList;
    }

    @XmlTransient
    public List<GbMenulinks> getGbMenulinksList() {
        return gbMenulinksList;
    }

    public void setGbMenulinksList(List<GbMenulinks> gbMenulinksList) {
        this.gbMenulinksList = gbMenulinksList;
    }

    public GbMenulinks getGbMenuParId() {
        return gbMenuParId;
    }

    public void setGbMenuParId(GbMenulinks gbMenuParId) {
        this.gbMenuParId = gbMenuParId;
    }

    public GbUsers getGbLastUserChg() {
        return gbLastUserChg;
    }

    public void setGbLastUserChg(GbUsers gbLastUserChg) {
        this.gbLastUserChg = gbLastUserChg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gbMenuName != null ? gbMenuName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GbMenulinks)) {
            return false;
        }
        GbMenulinks other = (GbMenulinks) object;
        if ((this.gbMenuName == null && other.gbMenuName != null) || (this.gbMenuName != null && !this.gbMenuName.equals(other.gbMenuName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabyval.extractor.GbMenulinks[ gbMenuName=" + gbMenuName + " ]";
    }
    
}
