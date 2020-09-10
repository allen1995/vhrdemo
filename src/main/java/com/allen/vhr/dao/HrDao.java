package com.allen.vhr.dao;

import com.allen.vhr.entity.Hr;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Hr)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
public interface HrDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hr queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Hr> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hr 实例对象
     * @return 对象列表
     */
    List<Hr> queryAll(Hr hr);

    /**
     * 通过用户名称查找用户
     * @param username
     * @return
     */
    Hr loadUserByName(String username);

    /**
     * 新增数据
     *
     * @param hr 实例对象
     * @return 影响行数
     */
    int insert(Hr hr);

    /**
     * 修改数据
     *
     * @param hr 实例对象
     * @return 影响行数
     */
    int update(Hr hr);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}