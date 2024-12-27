# Nimap_Infotech_Task

Overview<br>
This project is a RESTful API built with Spring Boot, featuring CRUD operations for Categories and Products with a one-to-many relationship. It uses JPA and Hibernate for database interactions and supports server-side pagination.<br>

Key Features<br>
Category Management<br>

CRUD operations with endpoints:<br>
GET /api/categories?page={page}: Get paginated categories.<br>
POST /api/categories: Create a new category.<br>
GET /api/categories/{id}: Fetch a category by ID.<br>
PUT /api/categories/{id}: Update a category by ID.<br>
DELETE /api/categories/{id}: Delete a category by ID.<br>

Product Management<br>
CRUD operations with endpoints:<br>
GET /api/products?page={page}: Get paginated products.<br>
POST /api/products: Create a product.<br>
GET /api/products/{id}: Fetch product with category details.<br>
PUT /api/products/{id}: Update a product.<br>
DELETE /api/products/{id}: Delete a product.<br>

Category-Product Relationship<br>
One-to-Many: A category can have multiple products.<br>
 
