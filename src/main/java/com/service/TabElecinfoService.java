package com.service;

import com.entity.ResultData;
import com.entity.TabElecinfo;

import java.util.List;
import java.util.Map;

public interface TabElecinfoService {
    List<Map> selectElec();
    TabElecinfo selectElecByid(TabElecinfo tabElecinfo);
    ResultData insertElec(TabElecinfo tabElecinfo);
    ResultData updateElec(TabElecinfo tabElecinfo);
    ResultData deleteElec(TabElecinfo tabElecinfo);
}
