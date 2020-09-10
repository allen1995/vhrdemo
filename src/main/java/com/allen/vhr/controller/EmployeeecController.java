package com.allen.vhr.controller;

import com.allen.vhr.entity.Employeeec;
import com.allen.vhr.service.EmployeeecService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employeeec)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("employeeec")
public class EmployeeecController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeecService employeeecService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employeeec selectOne(Integer id) {
        return this.employeeecService.queryById(id);
    }

}