package com.allen.vhr.controller;

import com.allen.vhr.entity.Employeeremove;
import com.allen.vhr.service.EmployeeremoveService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employeeremove)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("employeeremove")
public class EmployeeremoveController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeremoveService employeeremoveService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employeeremove selectOne(Integer id) {
        return this.employeeremoveService.queryById(id);
    }

}