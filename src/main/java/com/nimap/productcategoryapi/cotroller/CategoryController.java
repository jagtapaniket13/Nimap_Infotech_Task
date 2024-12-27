package com.nimap.productcategoryapi.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.productcategoryapi.model.Category;
import com.nimap.productcategoryapi.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categorySer;

	// get all categories with pagination
	@GetMapping
	public ResponseEntity<Page<Category>> getAllCategories(Pageable pageable) {
		Page<Category> categories = categorySer.getAllCategories(pageable);
		return ResponseEntity.ok(categories);
	}

	// Get Category by id
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
		Category categ = categorySer.getCategoryById(id);
		return ResponseEntity.ok(categ);
	}

	// Create new Category
	@PostMapping
	public ResponseEntity<Category> createCategory(@RequestBody Category category) {
		Category createCategory = categorySer.createCategory(category);
		return ResponseEntity.ok(createCategory);
	}

	
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) {
	    // Logic to update the category
	    Category updatedCategory = categorySer.updateCategory(id, categoryDetails);
	    return ResponseEntity.ok(updatedCategory);
	}

	
	// Delete category by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
		categorySer.deleteCategory(id);
		return ResponseEntity.noContent().build();
	}
}
