package com.allen.vhr.controller;

import com.allen.vhr.entity.Politicsstatus;
import com.allen.vhr.service.PoliticsstatusService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Politicsstatus)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
@RestController
@RequestMapping("politicsstatus")
public class PoliticsstatusController {
    /**
     * 服务对象
     */
    @Resource
    private PoliticsstatusService politicsstatusService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Politicsstatus selectOne(Integer id) {
        return this.politicsstatusService.queryById(id);
    }

}