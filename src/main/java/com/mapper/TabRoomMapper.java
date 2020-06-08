package com.mapper;

import com.common.CommonMapper;
import com.entity.TabRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TabRoomMapper extends CommonMapper<TabRoom> {
}