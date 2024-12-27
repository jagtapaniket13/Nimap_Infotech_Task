# Nimap_Infotech_Task

Overview
This project is a RESTful API built with Spring Boot, featuring CRUD operations for Categories and Products with a one-to-many relationship. It uses JPA and Hibernate for database interactions and supports server-side pagination.

Key Features
Category Management

CRUD operations with endpoints:
GET /api/categories?page={page}: Get paginated categories.
POST /api/categories: Create a new category.
GET /api/categories/{id}: Fetch a category by ID.
PUT /api/categories/{id}: Update a category by ID.
DELETE /api/categories/{id}: Delete a category by ID.
Product Management

CRUD operations with endpoints:
GET /api/products?page={page}: Get paginated products.
POST /api/products: Create a product.
GET /api/products/{id}: Fetch product with category details.
PUT /api/products/{id}: Update a product.
DELETE /api/products/{id}: Delete a product.

Category-Product Relationship
One-to-Many: A category can have multiple products.
 
