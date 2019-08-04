package com.topica.responsitory;

import com.topica.model.ReleaseEntity;

import java.util.List;

public interface ReleaseDao {
    public void saveRelease (ReleaseEntity r);
    public List<ReleaseEntity> getAllRelease();
    public void deleteRelease(int id);
    public void upDateRelease(ReleaseEntity re);
}
