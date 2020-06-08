package com.controller;

import com.entity.ResultData;
import com.entity.TabElecinfo;
import com.service.TabElecinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/elec")
public class ElecController {
    @Autowired
    TabElecinfoService service;

    @RequestMapping("/selectElec")
    public List<Map> selectElec() {
        return service.selectElec();
    }

    @RequestMapping("/selectElecByid")
    public TabElecinfo selectElecByid(TabElecinfo tabElecinfo) {
        return service.selectElecByid(tabElecinfo);
    }

    @RequestMapping("/updateElec")
    public ResultData updateElec(@RequestBody TabElecinfo tabElecinfo) {
        if (tabElecinfo.getElecId() != null) {
            return service.updateElec(tabElecinfo);
        } else {
            return service.insertElec(tabElecinfo);
        }
    }
    @RequestMapping("/deleteElec")
    public ResultData deleteElec(TabElecinfo tabElecinfo) {
         return service.deleteElec(tabElecinfo);
    }
}
