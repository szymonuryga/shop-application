insert into clients(id, first_name, last_name, email, password, city, street, street_number, flat_number) values
  (1, 'Jan', 'Kowalski', 'jan.kowalksi@o2.pl', 'abcsd12', 'Kraków', 'Murarska', 45, 12),
  (2, 'Maciej', 'Zalewski', 'maciej.zal@gmail.com', 'maciej', 'Warszawa', 'Barsla', 15, 35),
  (3, 'Aneta', 'Korczyńska', 'anetakor@wp.pl', 'aneta$1', 'Kraków', 'Gramatyka', 10, 15),
  (4, 'Wojciech', 'Sokolik', 'wojciech.sokol@gmail.com', 'wojtek123', 'Kielce', 'Lwowska', 103, 12);

insert into products(id, name, product_category) values
    (1, 'Iphone X', 'PHONE'),
    (2,'SAMSUNG UE55TU8502 55" ','TV'),
    (3,'Samsung Neo QLED QE85QN900AT','TV'),
    (4, 'Samsung S20', 'PHONE'),
    (5,'PS5','CONSOLE'),
    (6, 'PS4','CONSOLE'),
    (7,'DELL Latitude 15','COMPUTER');

insert into invoices(id, invoice_type, client_id) values
    (1,'VAT',1),
    (2,'SIMPLIFIED',1),
    (3,'IN_ADVANCE',2),
    (4,'VAT',2),
    (5,'VAT',3),
    (6,'VAT',3),
    (7,'VAT',4),
    (8,'VAT',4);

insert into invoice_products(id,amount,invoice_id,product_id) values
    (1,4532,1,1),
    (2,3200,2,2),
    (3,39999,3,3),
    (4,3800,4,4),
    (5,3000,5,5),
    (6,1800,6,6),
    (7,2500,7,7),
    (8,3800,8,4);

