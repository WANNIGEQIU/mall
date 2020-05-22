package com.im.mall.coupon.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.im.mall.coupon.entity.SmsCouponEntity;
import com.im.mall.coupon.service.SmsCouponService;
import com.im.mall.common.utils.PageUtils;
import com.im.mall.common.utils.R;


/**
 * 优惠券信息
 *
 * @author 玩你个球儿
 * @email wannigeqiuer@gmail.com
 * @date 2020-05-22 20:13:53
 */
@RestController
 @RefreshScope// 动态刷新
@RequestMapping("coupon/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;

    @Value("${coupon.username}")
    private String username;


    @RequestMapping("/test")
    public R test() {
        SmsCouponEntity entity = new SmsCouponEntity();
        entity.setCouponName("满100-30");
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("coupon",entity.getCouponName());
        hashMap.put("username",username);
        return R.ok().put("result",hashMap);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
