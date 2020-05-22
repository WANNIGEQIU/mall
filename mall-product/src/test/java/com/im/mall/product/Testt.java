package com.im.mall.product;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.mall.product.entity.BrandEntity;
import com.im.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes =ProductApp.class )
public class Testt {
    @Autowired
    BrandService brandService;

    @Test
    public void aVoid() {
        BaseMapper<BrandEntity> baseMapper = brandService.getBaseMapper();
        System.out.println(baseMapper);
        List<BrandEntity> brandEntities = baseMapper.selectList(null);
        for (BrandEntity brandEntity : brandEntities) {
            System.out.println(brandEntity);
        }

    }
}
