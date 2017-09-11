package com.service;

import com.mapper.CategoryMapper;
import com.pojo.Category;
import com.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by byebyejude on 2017/9/9.
 */
@Service
public class CatgoryServiceImp implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public void add(Category category) {
      categoryMapper.add(category);
    }

    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    }

    @Override
    public void delete(Category category) {
       categoryMapper.delete(category.getId());
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }
//    @Override
//    public List<Category> list(Page page){
//       return categoryMapper.list(page);
//    }
//
//    @Override
//    public int total(){
//        return categoryMapper.total();
//    }

}
