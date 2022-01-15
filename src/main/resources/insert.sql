INSERT INTO bookDtos (book_name, book_price, book_quantity, book_warehouse)
VALUES
('Java tutorial', 9.99, 8, 'Sovetckiy'),
('SQL tutorial', 8.25, 13, 'Kanavusky'),
('Spring Boot', 37.49, 1, 'Sormovo');

SELECT * FROM bookDtos

_____________________________________________________________________________

INSERT INTO customers (customer_surname, customer_discount, customer_district) 
VALUES
('Zharinov', 13 ,'Sovetckiy'),
('Dmitriev', 1.9 ,'Prioksky'),
('Kazakov', 2.2 ,'Leninsky');

SELECT * FROM customers

_______________________________________________________________________________

INSERT INTO shops (shop_name, shop_discount, shop_district) 
VALUES
('Mir knig', 20 ,'Sovetckiy'),
('Dostoevsky shop', 18 ,'Prioksky'),
('Chitaina', 13 ,'Leninsky');

SELECT * FROM shops

_______________________________________________________________________________order_date

INSERT INTO purchases (customer_id, shop_id, book_id, order_quantity, order_amount) 
VALUES
(1, 3, 2, 2, 20),
(2, 2, 3, 1, 30),
(3, 3, 1, 5, 200);

SELECT * FROM purchases