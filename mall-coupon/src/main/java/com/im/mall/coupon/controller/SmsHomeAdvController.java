package com.im.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.im.mall.coupon.entity.SmsHomeAdvEntity;
import com.im.mall.coupon.service.SmsHomeAdvService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.common.utils.R;



/**
 * 首页轮播广告
 *
 * @author 玩你个球儿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 20:13:53
 */
@RestController
@RequestMapping("coupon/smshomeadv")
public class SmsHomeAdvController {
    @Autowired
    private SmsHomeAdvService smsHomeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsHomeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsHomeAdvEntity smsHomeAdv = smsHomeAdvService.getById(id);

        return R.ok().put("smsHomeAdv", smsHomeAdv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsHomeAdvEntity smsHomeAdv){
		smsHomeAdvService.save(smsHomeAdv);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsHomeAdvEntity smsHomeAdv){
		smsHomeAdvService.updateById(smsHomeAdv);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsHomeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
