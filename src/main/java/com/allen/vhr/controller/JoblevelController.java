package com.allen.vhr.controller;

import com.allen.vhr.entity.Joblevel;
import com.allen.vhr.service.JoblevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Joblevel)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("joblevel")
public class JoblevelController {
    /**
     * 服务对象
     */
    @Resource
    private JoblevelService joblevelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Joblevel selectOne(Integer id) {
        return this.joblevelService.queryById(id);
    }

}