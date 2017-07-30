package org.flygether.entity;

import java.util.Collection;

public interface IEntityHome {

    Collection findAll();
    Collection findAllActive();
    IEntity findByPk(int pk);
    IEntity findByCode(String code);
    Collection findByQuery(String paramString);

    void refresh(IEntity paramIEntity);
    void update(IEntity paramIEntity);
    void save(IEntity paramIEntity);
    void delete(IEntity paramIEntity);
}
