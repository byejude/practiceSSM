package com.controller;

import com.pojo.Category;
import com.service.CategoryService;
import com.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * Created by byebyejude on 2017/9/9.
 */
@Controller

@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        //  List<Category> cg = categoryService.list();
        //  mav.addObject("cg",cg);
        //  mav.setViewName("listCategory");
        //  return mav;
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(), 5);
        List<Category> cs = categoryService.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
        //int total = categoryService.total();
        int total = (int) new PageInfo<>(cs).getTotal();
        //  page.caculateLast(total);
        mav.addObject("cs", cs);
        mav.setViewName("listCategory");
        return mav;
    }

    @RequestMapping()
    public ModelAndView editCategory(Category  category){
        Category c = categoryService.get(category.getId());
        ModelAndView mav = new ModelAndView();
        mav.addObject("c",c);
        mav.setViewName("editCategory");
        return mav;
    }

        



    }
}
