INSERT INTO books (book_name, book_price, book_quantity, book_warehouse)
VALUES
('Java tutorial', 9.99, 8, 'Sovetckiy'),
('SQL tutorial', 8.25, 13, 'Kanavusky'),
('Spring Boot', 37.49, 1, 'Sormovo');



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
(1, 3, 2, 2, 20, '2022-01-08 04:05:06'),
(2, 2, 3, 1, 30, '2021-11-13'),
(1, 1, 1, 1, 45, '2021-10-15'),
(2, 2, 2, 2, 28, '2021-12-31'),
(3, 3, 3, 3, 333, '2021-03-26'),
(3, 3, 1, 5, 200, '2022-01-02');

