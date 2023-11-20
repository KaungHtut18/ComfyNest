

-- Insert sample data
INSERT INTO LANDLORD (email, firstName, lastName, telephone) VALUES
('landlord1@example.com', 'John', 'Doe', '123-456-7890'),
('landlord2@example.com', 'Jane', 'Smith', '987-654-3210');

INSERT INTO RATING (id,oneCount, twoCount, threeCount, fourCount, fiveCount, zeroCount) VALUES
(1,0, 0, 3, 0, 0, 0),
(2,0,2,3,4,0,0);

-- Insert sample data into DORMITORY table
INSERT INTO DORMITORY (
    id,rating_id, name, location, province, price, gender, fullyBooked, description, rules, Amenties,
    img1, img2, img3, img4, email, landlord_email
) VALUES
(1,1, '3K', 'Chiang Rai', 'Mueang Chiang Rai', 3000, 'Unisex', false, 'Here are some descriptions', 'Here are some rules', 'We provide these amenities',
 '3K1.jpg', '3K2.jpg', '3K4.jpg', '3K4.jpg', 'dormitoryA@example.com', 'landlord1@example.com'),
 (2,2, 'Regent Mansion', 'Chiang Rai', 'Mueang Chiang Rai', 3000, 'Unisex', false, 'Here are some descriptions', 'Here are some rules', 'We provide these amenities',
 '3K1.jpg', '3K2.jpg', '3K4.jpg', '3K4.jpg', 'dormitoryA@example.com', 'landlord1@example.com');


-- Insert sample data into RATING table
INSERT INTO Tenant (email, firstName, lastName, gender, phone, password)
VALUES
    ('admin@comfynest.com', 'admin', 'admin', 'Male', '+999999999', '$2a$10$FWzfSNCwpsgxDfvxXkEhMOmBuwimTkhgyjRVvcQXuKgzWlvlNrbYu'); -- Password is "password1"

INSERT INTO WishList(tenant_email, dormitory_id)
VALUES
    ('admin@comfynest.com',1);