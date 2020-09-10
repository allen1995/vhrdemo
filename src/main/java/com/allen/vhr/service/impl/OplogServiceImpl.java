package com.allen.vhr.service.impl;

import com.allen.vhr.entity.Oplog;
import com.allen.vhr.dao.OplogDao;
import com.allen.vhr.service.OplogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Oplog)表服务实现类
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
@Service("oplogService")
public class OplogServiceImpl implements OplogService {
    @Resource
    private OplogDao oplogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Oplog queryById(Integer id) {
        return this.oplogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Oplog> queryAllByLimit(int offset, int limit) {
        return this.oplogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param oplog 实例对象
     * @return 实例对象
     */
    @Override
    public Oplog insert(Oplog oplog) {
        this.oplogDao.insert(oplog);
        return oplog;
    }

    /**
     * 修改数据
     *
     * @param oplog 实例对象
     * @return 实例对象
     */
    @Override
    public Oplog update(Oplog oplog) {
        this.oplogDao.update(oplog);
        return this.queryById(oplog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.oplogDao.deleteById(id) > 0;
    }
}