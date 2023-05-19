package com.lc.service;

import com.lc.bean.UserAddress;

import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/19
 * @Description
 */
public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(String userId);
}
