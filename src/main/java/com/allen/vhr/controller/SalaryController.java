package com.allen.vhr.controller;

import com.allen.vhr.entity.Salary;
import com.allen.vhr.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Salary)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:26
 */
@RestController
@RequestMapping("salary")
public class SalaryController {
    /**
     * 服务对象
     */
    @Resource
    private SalaryService salaryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Salary selectOne(Integer id) {
        return this.salaryService.queryById(id);
    }

}