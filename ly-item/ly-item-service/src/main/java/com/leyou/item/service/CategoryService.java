package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        //查询条件，mappper会使用对象中的非空成员变量作为查询条件
        Category t=new Category();
        t.setParentId(pid);
        List<Category> list = categoryMapper.select(t);
        //if(list==null||list.isEmpty())
        //判断查询结果
        if(CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FUND);
        }
        return list;
    }

    public List<Category> queryByIds(List<Long>ids){
        List<Category> list = categoryMapper.selectByIdList(ids);
        //判断查询结果
        if(CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FUND);
        }
        return list;
    }
}
