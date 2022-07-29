CREATE DATABASE car_warehouse
GO
USE car_warehouse 
GO

CREATE TABLE users(
	id INT IDENTITY(1,1) PRIMARY KEY,
	username VARCHAR(30) NOT NULL,
	[password] VARCHAR(30) NOT NULL,
	user_role BIT NOT NULL
)

CREATE TABLE supplier(
	id INT IDENTITY(1, 1) PRIMARY KEY,
	supplier_code VARCHAR(10) NOT NULL,
	supplier_name NVARCHAR(150) NOT NULL,
	phone VARCHAR(11),
	[address] NVARCHAR(300),
)

CREATE TABLE product(
	id INT IDENTITY(1, 1) PRIMARY KEY,
	product_code VARCHAR(10) NOT NULL,
	product_name NVARCHAR(150) NOT NULL,
	supplier_id INT NOT NULL,
	quantity INT NOT NULL,
	origin_price BIGINT NOT NULL,
	sell_price BIGINT NOT NULL,
	[status] NVARCHAR(200),
	CONSTRAINT fk_supplier_id FOREIGN KEY (supplier_id) REFERENCES supplier(id)
)
GO

--Fake Data
INSERT INTO users VALUES 
	('admin', 'Test123', 0),
	('storekeeper', 'Test456', 1)

INSERT INTO supplier VALUES
	('NC01', N'Công ty Ô tô Toyota Việt Nam', '02113868100', N'6PJ7+CRF, Phường Hùng Vương, Phúc Yên, Vĩnh Phúc'),
	('NC02', N'Công ty trách nhiệm hữu hạn Sản xuất và Kinh doanh VinFast', '02253969999', N'Đình Vũ, Cát Hải, Hải Phòng, Việt Nam'),
	('NC03', N'Công ty TNHH Ford Việt Nam', '02462634600', N'23 P. Phan Chu Trinh, Phan Chu Trinh, Hoàn Kiếm, Hà Nội'),
	('NC04', N'CÔNG TY TNHH VIỆT NAM SUZUKI', '02513838707', N'	Đường số 2, KCN Long Bình, Phường Long Bình, Thành phố Biên Hoà, Tỉnh Đồng Nai, Việt Nam'),
	('NC05', N'Công ty CP Hyundai Thành Công', '02432669777', N'KCN Gián Khẩu, Xã Gia Trấn, Huyện Gia Viễn, Tỉnh Ninh Bình, Việt Nam'),
	('NC06', N'Công ty TNHH Phân Phối THACO AUTO', '02352226357', N'Thôn 4, Xã Tam Hiệp, Huyện Núi Thành, Tỉnh Quảng Nam, Việt Nam')

INSERT INTO product(product_code, product_name, supplier_id, quantity, origin_price, sell_price, [status]) VALUES
	('SP01', N'Vinfast Fadil tiêu chuẩn', 2, 3, 400000000, 425000000, ''),
	('SP02', N'Vinfast Lux A2.0 nâng cao', 2, 2, 1100000000, 1206000000, ''),
	('SP03', N'Huyndai Tucson 2.0AT 2022', 5, 4, 735000000, 825000000, '')

SELECT * FROM users
SELECT * FROM supplier
SELECT * FROM product