package com.atguigu.service;

import com.atguigu.pojo.Headline;
import com.atguigu.pojo.vo.PortalVo;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author woliw
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2023-09-26 18:25:20
*/
public interface HeadlineService extends IService<Headline> {
    //首页数据查询
    Result findNewsPage(PortalVo portalVo);
    //根据ID查看详情
    Result showHeadlineDetail(Integer hid);
    //发布头条方法
    Result publish(Headline headline,String token);
    //修改头条数据
    Result updateData(Headline headline);
}
