package com.xianyu.chuhuomingxi.controller;

import com.xianyu.chuhuomingxi.entity.XianyuMaster;
import com.xianyu.chuhuomingxi.service.XianyuMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class XianyuContoller {
    @Resource
    XianyuMasterService xianyuMasterService;
    @RequestMapping("/test")
    public  List<XianyuMaster> nihao(){
      List<XianyuMaster> list= xianyuMasterService.getAllMaster();
        return list;
    }

}
