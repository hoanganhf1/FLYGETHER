package org.flygether.entity;

import java.util.Date;

public interface IEntity {
    int getPk();
    void setPk(int pk);

    String getCode();
    void setCode(String code);

    Date getDateCreated();
    void setDateCreated(Date dateCreated);

    Date getDateModified();
    void setDateModified(Date dateModified);

    Date getDateDeleted();
    void setDateDeleted(Date dateDeleted);

    String getNote();
    void setNote(String note);

    int getVersion();
    void setVersion(int version);
}
