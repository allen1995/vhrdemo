package com.allen.vhr.service;

import com.allen.vhr.entity.Nation;
import java.util.List;

/**
 * (Nation)表服务接口
 *
 * @author makejava
 * @since 2020-09-10 16:29:25
 */
public interface NationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Nation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Nation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param nation 实例对象
     * @return 实例对象
     */
    Nation insert(Nation nation);

    /**
     * 修改数据
     *
     * @param nation 实例对象
     * @return 实例对象
     */
    Nation update(Nation nation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}