package com.atguigu.gmall0422.gmallusermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;
import com.atguigu.gmall0422.gmallusermanage.mapper.UserAddressMapper;
import com.atguigu.gmall0422.gmallusermanage.mapper.UserInfoMapper;
import com.atguigu.gmall0422.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> finAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByLikeUserInfo(String loginName) {
        return null;
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {

    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {

    }

    @Override
    public void delUserInfo(UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
//        UserAddress userAddress = new UserAddress();
//        userAddress.setUserId(userId);
//        return  userAddressMapper.select(userAddress);
        Example example = new Example(UserAddress.class);
        example.createCriteria().andEqualTo("userId",userId);
        return  userAddressMapper.selectByExample(example);
    }
}
