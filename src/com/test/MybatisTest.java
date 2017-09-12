package com.test;

import java.util.List;

import com.service.CategoryService;
import com.util.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.webapp.*;
import com.mapper.CategoryMapper;
import com.pojo.Category;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:/springMVC.xml")
@ContextConfiguration("/resources/applicationContext.xml")
public class MybatisTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryService categoryService;

//    @Test
//    public void testAdd() {
//      for(int i =0;i<100;i++){
//      Category category = new Category();
//      category.setName("new Category");
//      categoryMapper.add(category);
//    }
//
//    }

    @Test
    public void testAOP(){
     categoryService.deleteAll();
    // categoryService.addTwo();
    }

//    @Test
//    public void testTotal() {
//        int total = categoryMapper.total();
//        System.out.println(total);
//    }
//
//    @Test
//    public void testList() {
//        Page p = new Page();
//        p.setStart(2);
//        p.setCount(3);
//        List<Category> cs=categoryMapper.list(p);
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
//    }

}
