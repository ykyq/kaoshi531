package com.controller;

import com.entity.TabRoom;
import com.service.TabRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    TabRoomService service;

    @RequestMapping("/selectRoom")
    public List<TabRoom> selectRoom(){
        return service.selectRoom();
    }
}
