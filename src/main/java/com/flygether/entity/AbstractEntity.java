package com.flygether.entity;

import org.flygether.entity.IEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity implements IEntity, Serializable {

    private static Logger logger = LoggerFactory.getLogger(AbstractEntity.class);

    private int pk = -1;
    private String code;
    private Date dateCreate;
    private Date dateModified;
    private Date dateDeleted;
    private String note;
    private int version;

    @Id
    @Column(name = "ID")
    @Override
    public int getPk() {
        return this.pk;
    }

    @Override
    public void setPk(int pk) {
        this.pk = pk;
    }

    @Column(name = "CODE")
    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "DATE_CREATED")
    @Override
    public Date getDateCreated() {
        return this.dateCreate;
    }

    @Override
    public void setDateCreated(Date dateCreated) {
        this.dateCreate = dateCreated;
    }

    @Column(name = "DATE_MODIFIED")
    @Override
    public Date getDateModified() {
        return this.dateModified;
    }

    @Override
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Column(name = "DATE_DELETED")
    @Override
    public Date getDateDeleted() {
        return this.dateDeleted;
    }

    @Override
    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    @Column(name = "NOTE")
    @Override
    public String getNote() {
        return this.note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    @Version
    @Column(name = "VERSION")
    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public void setVersion(int version) {
        this.version = version;
    }
}
