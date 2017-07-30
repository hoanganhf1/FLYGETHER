package com.flygether.entity;

import org.flygether.entity.IEntity;
import org.flygether.entity.IEntityHome;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public abstract class EntityHome extends HibernateDaoSupport implements IEntityHome {

    private final Class entityClass;
    private final String entityType;

    public EntityHome(String entityType, Class entityClass) {
        this.entityType = entityType;
        this.entityClass = entityClass;
    }

    @Override
    public Collection findAll() {
        return getHibernateTemplate().loadAll(this.entityClass);
    }

    @Override
    public Collection findAllActive() {
        Collection entitiesActive = new ArrayList();
        Collection entities = getHibernateTemplate().loadAll(this.entityClass);
        Iterator iterator = entities.iterator();
        while (iterator.hasNext()) {
            IEntity entity = (IEntity) iterator.next();
            if (entity.getDateDeleted() != null) {
                entitiesActive.add(entity);
            }
        }
        return entitiesActive;
    }

    @Override
    public IEntity findByPk(int pk) {
        return (IEntity) getHibernateTemplate().load(this.entityClass, pk);
    }

    @Override
    public IEntity findByCode(String code) {
        return null;
    }

    @Override
    public Collection findByQuery(String paramString) {
        return getHibernateTemplate().find(paramString);
    }

    @Override
    public void refresh(IEntity paramIEntity) {
        getHibernateTemplate().refresh(paramIEntity);
    }

    @Override
    public void update(IEntity paramIEntity) {
        getHibernateTemplate().update(paramIEntity);
    }

    @Override
    public void save(IEntity paramIEntity) {
        getHibernateTemplate().save(paramIEntity);
    }

    @Override
    public void delete(IEntity paramIEntity) {
        getHibernateTemplate().delete(paramIEntity);
    }
}
