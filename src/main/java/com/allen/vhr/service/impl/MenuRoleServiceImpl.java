package com.allen.vhr.service.impl;

import com.allen.vhr.entity.MenuRole;
import com.allen.vhr.dao.MenuRoleDao;
import com.allen.vhr.service.MenuRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MenuRole)表服务实现类
 *
 * @author makejava
 * @since 2020-09-10 16:29:24
 */
@Service("menuRoleService")
public class MenuRoleServiceImpl implements MenuRoleService {
    @Resource
    private MenuRoleDao menuRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MenuRole queryById(Integer id) {
        return this.menuRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<MenuRole> queryAllByLimit(int offset, int limit) {
        return this.menuRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param menuRole 实例对象
     * @return 实例对象
     */
    @Override
    public MenuRole insert(MenuRole menuRole) {
        this.menuRoleDao.insert(menuRole);
        return menuRole;
    }

    /**
     * 修改数据
     *
     * @param menuRole 实例对象
     * @return 实例对象
     */
    @Override
    public MenuRole update(MenuRole menuRole) {
        this.menuRoleDao.update(menuRole);
        return this.queryById(menuRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuRoleDao.deleteById(id) > 0;
    }
}