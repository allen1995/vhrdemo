package com.allen.vhr.controller;

import com.allen.vhr.entity.HrRole;
import com.allen.vhr.service.HrRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (HrRole)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("hrRole")
public class HrRoleController {
    /**
     * 服务对象
     */
    @Resource
    private HrRoleService hrRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public HrRole selectOne(Integer id) {
        return this.hrRoleService.queryById(id);
    }

}