package com.service;

import com.entity.ResultData;
import com.entity.TabElecinfo;
import com.mapper.TabElecinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TabElecinfoServiceImpl implements TabElecinfoService{
    @Autowired
    TabElecinfoMapper mapper;
    @Override
    public List<Map> selectElec() {
        return mapper.selectElec();
    }

    @Override
    public TabElecinfo selectElecByid(TabElecinfo tabElecinfo) {
        return mapper.selectOne(tabElecinfo);
    }

    @Override
    public ResultData insertElec(TabElecinfo tabElecinfo) {
        int insert = mapper.insert(tabElecinfo);
        ResultData resultData;
        if (insert>0){
            resultData=new ResultData(true,"成功",null);
        }else{
            resultData=new ResultData(false,"失败",null);
        }
        return resultData;
    }

    @Override
    public ResultData updateElec(TabElecinfo tabElecinfo) {
        int insert = mapper.updateByPrimaryKey(tabElecinfo);
        ResultData resultData;
        if (insert>0){
            resultData=new ResultData(true,"成功",null);
        }else{
            resultData=new ResultData(false,"失败",null);
        }
        return resultData;
    }

    @Override
    public ResultData deleteElec(TabElecinfo tabElecinfo) {
        int insert = mapper.deleteByPrimaryKey(tabElecinfo);
        ResultData resultData;
        if (insert>0){
            resultData=new ResultData(true,"成功",null);
        }else{
            resultData=new ResultData(false,"失败",null);
        }
        return resultData;
    }
}
