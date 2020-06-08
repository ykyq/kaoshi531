package com.mapper;

import com.common.CommonMapper;
import com.entity.TabElecinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TabElecinfoMapper extends CommonMapper<TabElecinfo> {
    List<Map> selectElec();
}