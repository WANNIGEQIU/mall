package com.im.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ç©ä½ ä¸ªçå¿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 15:02:51
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

