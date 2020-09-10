package com.allen.vhr.service.impl;

import com.allen.vhr.entity.Salary;
import com.allen.vhr.dao.SalaryDao;
import com.allen.vhr.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Salary)表服务实现类
 *
 * @author makejava
 * @since 2020-09-10 16:29:26
 */
@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryDao salaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Salary queryById(Integer id) {
        return this.salaryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Salary> queryAllByLimit(int offset, int limit) {
        return this.salaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    @Override
    public Salary insert(Salary salary) {
        this.salaryDao.insert(salary);
        return salary;
    }

    /**
     * 修改数据
     *
     * @param salary 实例对象
     * @return 实例对象
     */
    @Override
    public Salary update(Salary salary) {
        this.salaryDao.update(salary);
        return this.queryById(salary.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.salaryDao.deleteById(id) > 0;
    }
}