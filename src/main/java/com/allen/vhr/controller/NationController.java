package com.allen.vhr.controller;

import com.allen.vhr.entity.Nation;
import com.allen.vhr.service.NationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Nation)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
@RestController
@RequestMapping("nation")
public class NationController {
    /**
     * 服务对象
     */
    @Resource
    private NationService nationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Nation selectOne(Integer id) {
        return this.nationService.queryById(id);
    }

}