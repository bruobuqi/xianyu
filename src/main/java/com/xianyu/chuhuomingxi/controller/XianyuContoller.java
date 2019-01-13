package com.xianyu.chuhuomingxi.controller;


import com.xianyu.chuhuomingxi.entity.JinghuoDetail;
import com.xianyu.chuhuomingxi.entity.Xianyumaster;
import com.xianyu.chuhuomingxi.service.XianyuMasterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class XianyuContoller {
    @Resource
    XianyuMasterService xianyuMasterService;
    @RequestMapping("/test")
    public  List<Xianyumaster> nihao(){
      List<Xianyumaster> list= xianyuMasterService.getAllMaster();
        return list;
    }
    @RequestMapping("/test2")
    public  List<JinghuoDetail> nihao2(){
        List<JinghuoDetail> list= xianyuMasterService.getAllMaster2();
        return list;
    }

}
