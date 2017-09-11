package com.service;

import com.pojo.Category;
import com.util.Page;

import java.util.List;

/**
 * Created by byebyejude on 2017/9/9.
 */

public interface CategoryService {
    List<Category> list();

   // List<Category> list(Page page);

   // int total();
    void add(Category category);

    void update(Category category);

    void delete(Category category);

    Category get(int id);


}
