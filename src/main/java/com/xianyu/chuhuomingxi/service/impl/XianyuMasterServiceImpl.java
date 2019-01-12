package com.xianyu.chuhuomingxi.service.impl;

import com.xianyu.chuhuomingxi.entity.XianyuMaster;
import com.xianyu.chuhuomingxi.service.XianyuMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XianyuMasterServiceImpl implements XianyuMasterService {
    @Resource
    XianyumasterMapper xianyumasterMapper;

    @Override
    public List<XianyuMaster> getAllMaster() {
        List<XianyuMaster> list=xianyumasterMapper.selectAll();
        return list;
    }
}
