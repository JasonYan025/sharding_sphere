package com.yandong.sharding_sphere.dao;

import com.yandong.sharding_sphere.domain.TOrder;

public interface TOrderMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}