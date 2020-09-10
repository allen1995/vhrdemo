package com.allen.vhr.controller;

import com.allen.vhr.entity.Employeetrain;
import com.allen.vhr.service.EmployeetrainService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employeetrain)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("employeetrain")
public class EmployeetrainController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeetrainService employeetrainService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Employeetrain selectOne(Integer id) {
        return this.employeetrainService.queryById(id);
    }

}