package com.yandong.sharding_sphere.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yandong.sharding_sphere.dao.TOrderMapper;
import com.yandong.sharding_sphere.domain.TOrder;
@Service
public class TOrderService{

    @Resource
    private TOrderMapper tOrderMapper;

    
    public int deleteByPrimaryKey(Integer tId) {
        return tOrderMapper.deleteByPrimaryKey(tId);
    }

    
    public int insert(TOrder record) {
        return tOrderMapper.insert(record);
    }

    
    public int insertSelective(TOrder record) {
        return tOrderMapper.insertSelective(record);
    }

    
    public TOrder selectByPrimaryKey(Integer tId) {
        return tOrderMapper.selectByPrimaryKey(tId);
    }

    
    public int updateByPrimaryKeySelective(TOrder record) {
        return tOrderMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TOrder record) {
        return tOrderMapper.updateByPrimaryKey(record);
    }

}
