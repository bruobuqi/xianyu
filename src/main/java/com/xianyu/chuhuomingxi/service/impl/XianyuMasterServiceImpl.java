package com.xianyu.chuhuomingxi.service.impl;


import com.xianyu.chuhuomingxi.entity.JinghuoDetail;
import com.xianyu.chuhuomingxi.entity.Xianyumaster;
import com.xianyu.chuhuomingxi.mapper.JinghuoDetailMapper;
import com.xianyu.chuhuomingxi.mapper.XianyumasterMapper;
import com.xianyu.chuhuomingxi.service.XianyuMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XianyuMasterServiceImpl implements XianyuMasterService {
    @Resource
    XianyumasterMapper xianyumasterMapper;
@Resource
JinghuoDetailMapper jinghuoDetailMapper;
    @Override
    public List<Xianyumaster> getAllMaster() {
        List<Xianyumaster> list=xianyumasterMapper.selectAll();
        return list;
    }

    @Override
    public List<JinghuoDetail> getAllMaster2() {
        List<JinghuoDetail> list=    jinghuoDetailMapper.selectAll();
        return list;
    }
}
