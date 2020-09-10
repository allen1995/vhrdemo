package com.allen.vhr.controller;

import com.allen.vhr.entity.MailSendLog;
import com.allen.vhr.service.MailSendLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MailSendLog)表控制层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@RestController
@RequestMapping("mailSendLog")
public class MailSendLogController {
    /**
     * 服务对象
     */
    @Resource
    private MailSendLogService mailSendLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MailSendLog selectOne( id) {
        return this.mailSendLogService.queryById(id);
    }

}