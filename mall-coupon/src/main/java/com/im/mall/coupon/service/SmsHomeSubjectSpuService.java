package com.im.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.coupon.entity.SmsHomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author 玩你个球儿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 20:13:53
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

