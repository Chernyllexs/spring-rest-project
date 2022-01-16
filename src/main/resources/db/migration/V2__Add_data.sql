INSERT INTO books (book_name, book_price, book_quantity, book_warehouse)
VALUES
('Java tutorial', 9.99, 8, 'Sovetcky'),
('Java tutorial', 9.99, 2, 'Prioksky'),
('Java tutorial', 9.99, 3, 'Leninsky'),
('Java tutorial', 9.99, 8, 'Kanavinsky'),
('SQL tutorial', 8.25, 13, 'Kanavinsky'),
('SQL tutorial', 8.25, 1, 'Leninsky'),
('Spring Boot', 37.49, 1, 'Sormovsky'),
('Spring Boot', 37.49, 2, 'Prioksky'),
('Spring Boot', 37.49, 13, 'Kanavinsky'),
('Spring Boot', 37.49, 7, 'Sovetcky');



INSERT INTO customers (customer_surname, customer_discount, customer_district)
VALUES
('Zharinov', 13 ,'Sovetckiy'),
('Dmitriev', 1.9 ,'Prioksky'),
('Kazakov', 2.2 ,'Leninsky');


INSERT INTO shops (shop_name, shop_discount, shop_district)
VALUES
('Mir knig', 20 ,'Sovetckiy'),
('Dostoevsky shop', 18 ,'Prioksky'),
('Chitaina', 13 ,'Leninsky');



INSERT INTO purchases (customer_id, shop_id, book_id, order_quantity, order_amount, order_date)
VALUES
(1, 3, 2, 2, 20, '2022-01-08'),
(2, 2, 3, 1, 30, '2021-11-13'),
(1, 1, 1, 1, 45, '2021-10-15'),
(2, 2, 2, 2, 28, '2021-12-31'),
(3, 3, 3, 3, 333, '2021-03-26'),
(3, 3, 1, 5, 200, '2022-01-02');

