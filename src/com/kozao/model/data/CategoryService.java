package com.kozao.model.data;

import java.util.List;

import com.kozao.model.objet.Category;


public interface CategoryService {

	Category addCategory(Category cat);

	Category updateCategory(Category cat);

	Category deleteCategory(int id);

	Category findCategoryById(int id);

	Category findCategoryByName(String name);

	List<Category> findAllCategory();

}
