package com.allen.vhr.controller;

import com.allen.vhr.entity.Oplog;
import com.allen.vhr.service.OplogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Oplog)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
@RestController
@RequestMapping("oplog")
public class OplogController {
    /**
     * 服务对象
     */
    @Resource
    private OplogService oplogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Oplog selectOne(Integer id) {
        return this.oplogService.queryById(id);
    }

}