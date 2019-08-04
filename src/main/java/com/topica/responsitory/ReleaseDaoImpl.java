package com.topica.responsitory;

import com.topica.model.ReleaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ReleaseDaoImpl implements ReleaseDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveRelease(ReleaseEntity r) {
    entityManager.persist(r);
    }

    @Override
    public List<ReleaseEntity> getAllRelease() {
        return null;
    }

    @Override
    public void deleteRelease(int id) {

    }

    @Override
    public void upDateRelease(ReleaseEntity re) {

    }
}
