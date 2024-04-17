package com.Bardolog.service;

import com.Bardolog.entity.TrackEntity;
import com.Bardolog.service.common.SimpleService;

public interface ITrackService extends SimpleService<TrackEntity>{

    public void delete(Long id);
}
