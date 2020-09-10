package com.allen.vhr.controller;

import com.allen.vhr.entity.Hr;
import com.allen.vhr.service.HrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Hr)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("hr")
public class HrController {
    /**
     * 服务对象
     */
    @Resource
    private HrService hrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hr selectOne(Integer id) {
        return this.hrService.queryById(id);
    }

}