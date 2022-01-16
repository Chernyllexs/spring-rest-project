INSERT INTO books (book_name, book_price, book_quantity, book_warehouse)
VALUES
('Java tutorial', 369.99, 8, 'Sovetcky'),
('Java tutorial', 369.99, 12, 'Prioksky'),
('Java tutorial', 369.99, 23, 'Leninsky'),
('Java tutorial', 369.99, 8, 'Kanavinsky'),
('SQL tutorial', 856.25, 13, 'Kanavinsky'),
('SQL tutorial', 856.25, 12, 'Leninsky'),
('Spring Boot', 937.49, 1, 'Sormovsky'),
('Spring Boot', 937.49, 22, 'Prioksky'),
('Windows for grandma', 1500, 2, 'Prioksky'),
('Spring Boot', 1038.49, 13, 'Kanavinsky'),
('THE BIBLE', 99999.99, 13, 'Kanavinsky'),
('Spring Boot', 937.49, 7, 'Sovetcky');



INSERT INTO customers (customer_surname, customer_discount, customer_district)
VALUES
('Zharinov', 13 ,'Sovetckiy'),
('Kucherova', 0 ,'Sovetckiy'),
('Bolshakov', 1.3 ,'Sovetckiy'),
('Dmitriev', 1.9 ,'Prioksky'),
('Antonov', 0.9 ,'Prioksky'),
('Nikonova', 10.5 ,'Nizhegorodsky'),
('Trueshkina', 1.9 ,'Nizhegorodsky'),
('Gradilenko', 0.1 ,'Prioksky'),
('Kazakov', 2.2 ,'Leninsky');


INSERT INTO shops (shop_name, shop_discount, shop_district)
VALUES
('Mir knig', 20 ,'Sovetckiy'),
('Galileo', 15 ,'Sovetckiy'),
('Dostoevsky shop', 18 ,'Prioksky'),
('Dostoevsky shop', 19 ,'Sormovsky'),
('Chitaina', 13 ,'Leninsky');



INSERT INTO purchases (customer_id, shop_id, book_id, order_quantity, order_amount, order_date)
VALUES
(1, 3, 2, 2, 2500, '2022-01-08'),
(2, 2, 6, 1, 3360, '2021-10-13'),
(1, 1, 4, 1, 4575, '2021-10-15'),
(3, 1, 2, 11, 1454, '2021-10-15'),
(2, 2, 7, 2, 2058, '2021-12-31'),
(1, 2, 5, 20, 92908, '2021-12-31'),
(3, 3, 4, 3, 3335, '2021-03-26'),
(1, 3, 6, 8, 5333, '2021-03-26'),
(4, 5, 6, 8, 73339, '2021-03-22'),
(2, 3, 2, 6, 3330, '2021-03-26'),
(3, 3, 1, 5, 12000, '2022-01-02');

