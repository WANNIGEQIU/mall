package com.im.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.order.entity.OmsOrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author 玩你个球儿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 20:03:34
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

