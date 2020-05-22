package com.im.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.member.entity.UmsMemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author 玩你个球儿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 21:42:22
 */
public interface UmsMemberCollectSubjectService extends IService<UmsMemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

