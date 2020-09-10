package com.allen.vhr.controller;

import com.allen.vhr.entity.Adjustsalary;
import com.allen.vhr.service.AdjustsalaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Adjustsalary)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:22
 */
@RestController
@RequestMapping("adjustsalary")
public class AdjustsalaryController {
    /**
     * 服务对象
     */
    @Resource
    private AdjustsalaryService adjustsalaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Adjustsalary selectOne(Integer id) {
        return this.adjustsalaryService.queryById(id);
    }

}