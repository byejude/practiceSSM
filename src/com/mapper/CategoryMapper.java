package com.mapper;

import com.pojo.Category;
import com.util.Page;

import java.util.List;

/**
 * Created by byebyejude on 2017/9/9.
 */
public interface CategoryMapper {
    public void add(Category category);

    public void delete(int id);

    public Category get(int id);

    public void update(Category category);

    public List<Category> list();

    public int count();
    
   // public List<Category> list(Page page);

   // public int total();

}
