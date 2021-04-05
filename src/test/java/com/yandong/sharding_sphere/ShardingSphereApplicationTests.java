package com.yandong.sharding_sphere;

import com.yandong.sharding_sphere.dao.TOrderMapper;
import com.yandong.sharding_sphere.domain.TOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingSphereApplicationTests {

    @Autowired
    TOrderMapper tOrderMapper;

    @Test
    void insert() {
        for (int i = 0; i < 100; i++) {
            TOrder tOrder = new TOrder();
            tOrder.setTName("张三");
            tOrder.setTStatus(1);
            tOrderMapper.insert(tOrder);
        }
    }
}
