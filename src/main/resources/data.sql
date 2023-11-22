

-- Insert sample data
INSERT INTO LANDLORD (email, firstName, lastName, telephone) VALUES
('landlord1@example.com', 'John', 'Doe', '123-456-7890'),
('landlord2@example.com', 'Jane', 'Smith', '987-654-3210');

INSERT INTO RATING (id,oneCount, twoCount, threeCount, fourCount, fiveCount, zeroCount) VALUES
(1,0, 0, 3, 0, 0, 0),
(2,0,2,3,4,0,0),
(3,0, 0, 0, 0, 5, 0),
(4,0,0,0,0,0,0),
(5,0,0,0,0,0,0),
(6,0,0,0,0,0,0),
(7,0,0,0,0,0,0),
(8,0,0,0,0,0,0);

-- Insert sample data into DORMITORY table
INSERT INTO DORMITORY (
    id,rating_id, name, city, province, price, gender, fullyBooked, description, rules, Amenties,
    img1, img2, img3, img4, email, landlord_email,lat,lng
) VALUES
(1,1, '3K', 'Chiang Rai', 'Mueang Chiang Rai', 3000, 'Unisex', false, 'Here are some descriptions', 'Here are some rules', 'We provide these amenities', '3K1.jpg', '3K2.jpg', '3K3.jpg', '3K4.jpg', 'dormitoryA@example.com', 'landlord1@example.com',19.90885594661509, 99.855986253231),

 (3,3, 'Regent Mansion', 'Chiang Rai', 'Mueang Chiang Rai', 4500, 'Unisex', false, 'Here are some descriptions', 'Here are some rules', 'We provide these amenities', 'RegentMansion1.jpg', 'RegentMansion2.jpg', 'RegentMansion3.jpg', 'RegentMansion4.jpg', 'dormitoryA@example.com', 'landlord1@example.com',20.04309266241252, 99.88063398206963),

 (2,2, 'Beyond', 'Chiang Rai', 'Mueang Chiang Rai',4500, 'Unisex', false, 'Here are some descriptions', 'Here are some rules', 'We provide these amenities', 'Beyond1.jpg', 'Beyond2.jpg', 'Beyond3.jpg', 'Beyond4.jpg', 'dormitoryA@example.com', 'landlord1@example.com',20.046637552020567, 99.88055756857642),

 (4,4, 'Casa', 'Bangkok', 'Bangkok', 4000, 'Unisex', false, 'Here are some descriptions about the Casa Dormiotory. This is a group project for the web development course, software specification and analysis and database system.', 'Here are some rules. Yayyy hahaha freedom bacon.', 'We provide these amenities. blah blah blah.', 'Casa1.jpg', 'Casa2.jpg', 'Casa3.jpg', 'Casa4.jpg', 'casa@gmail.com', 'landlord1@example.com', 13.731070368371455, 100.56310517468275),

 (5,5, 'Chatthanan', 'Salaya', 'Salaya', 2700, 'Unisex', false, 'Here are some descriptions about the Chatthanan Dormiotory. This is a group project for the web development course, software specification and analysis and database system.', 'Here are some rules. Yayyy hahaha freedom bacon.', 'We provide these amenities. blah blah blah.', 'Chatthanan1.jpg', 'Chatthanan2.jpg', 'Chatthanan3.jpg', 'Chatthanan4.jpg', 'chatthanan@gmail.com', 'landlord2@example.com', 13.791758703078125, 100.32844930538447),

 (6,6, 'Home and Hill', 'Chiang Mai', 'Chiang Mai', 4000, 'Unisex', false, 'Here are some descriptions about the Home and Hill Dormiotory. This is a group project for the web development course, software specification and analysis and database system.', 'Here are some rules. Yayyy hahaha freedom bacon.', 'We provide these amenities. blah blah blah.', 'HomeAndChill1.jpg', 'HomeAndChill2.jpg', 'HomeAndChill3.jpg', 'HomeandChill4.jpg', 'homeandhill@gmail.com', 'landlord1@example.com', 18.79177087959815, 98.9506369108173),

 (7,7, 'Phuket Apartment', 'Phuket', 'Phuket', 3000, 'Unisex', false, 'Here are some descriptions about the Phuket Dormiotory. This is a group project for the web development course, software specification and analysis and database system.', 'Here are some rules. Yayyy hahaha freedom bacon.', 'We provide these amenities. blah blah blah.', 'Natthicha1.jpg', 'Natthicha2.jpg', 'Natthicha3.jpg', 'Natthicha4.jpg', 'phuketapartment@gmail.com', 'landlord2@example.com',7.88776502753229, 98.3773034517855),

 (8,8, 'STK Resort', 'Chiang Rai', 'Mueang Chiang Rai', 3000, 'Unisex', false, 'Here are some descriptions about the STK Dormiotory. This is a group project for the web development course, software specification and analysis and database system.', 'Here are some rules. Yayyy hahaha freedom bacon.', 'We provide these amenities. blah blah blah.', 'STK1.jpg', 'STK2.jpg', 'STK3.jpg', 'STK4.jpg', 'stkdormitory@gmail.com', 'landlord1@example.com', 20.04467581829367, 99.87976215317447);


-- Insert sample data into RATING table
INSERT INTO Tenant (email, firstName, lastName, gender, phone, password)
VALUES
    ('admin@comfynest.com', 'admin', 'admin', 'Male', '+999999999', '$2a$10$E7mzNVJGhWXTQa4MctswUOfH4nItgL1gYOCYd0cGFJyQdVWFMW6he'); -- Password is "adminmfu"

INSERT INTO WishList(tenant_email, dormitory_id)
VALUES
    ('admin@comfynest.com',1);