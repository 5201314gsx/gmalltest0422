package com.atguigu.gmall0422.service;


import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;

import java.util.List;


public interface UserService {
    List<UserInfo> finAll();

    List<UserInfo> findByUserInfo(UserInfo userInfo);

    List<UserInfo> findByLikeUserInfo(String loginName);

    void  addUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void delUserInfo(UserInfo userInfo);
    //查用户地址
    List<UserAddress> findUserAddressByUserId(String userId);
}
