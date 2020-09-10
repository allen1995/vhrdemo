package com.allen.vhr.controller;

import com.allen.vhr.entity.Msgcontent;
import com.allen.vhr.service.MsgcontentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Msgcontent)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
@RestController
@RequestMapping("msgcontent")
public class MsgcontentController {
    /**
     * 服务对象
     */
    @Resource
    private MsgcontentService msgcontentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Msgcontent selectOne(Integer id) {
        return this.msgcontentService.queryById(id);
    }

}