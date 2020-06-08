package com.service;

import com.entity.TabRoom;
import com.mapper.TabRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabRoomServiceImpl implements TabRoomService{
    @Autowired
    TabRoomMapper mapper;

    @Override
    public List<TabRoom> selectRoom() {
        return mapper.selectAll();
    }
}
