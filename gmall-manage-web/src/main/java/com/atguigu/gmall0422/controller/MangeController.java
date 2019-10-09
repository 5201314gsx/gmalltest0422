package com.atguigu.gmall0422.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0422.bean.BaseAttrInfo;
import com.atguigu.gmall0422.bean.BaseAttrValue;
import com.atguigu.gmall0422.service.MangeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MangeController {

    @Reference
    private MangeService mangeService;

    @RequestMapping("getCatalog1")
    public List getCatalog1(){
        return mangeService.getCatalog1();
    }
    @RequestMapping("getCatalog2")
    public List getCatalog2(String catalog1Id){
        return mangeService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    public List getgetCatalog3(String catalog2Id){
        return mangeService.getCatalog3(catalog2Id);
    }


    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> attrInfoList(String catalog3Id){
        return mangeService.getAttrInfoList(catalog3Id);
    }

    @RequestMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
        mangeService.saveBaseAttrInfo(baseAttrInfo);
        return "ok";
    }

    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String attrId){
      BaseAttrInfo baseAttrInfo=  mangeService.getBaseAttrInfo(attrId);

        return  baseAttrInfo.getAttrValueList();
    }

}
