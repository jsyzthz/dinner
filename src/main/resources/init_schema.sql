CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_0 (id BIGINT AUTO_INCREMENT, user_id
		INT NOT NULL, status VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_1 (id BIGINT AUTO_INCREMENT, user_id
		INT NOT NULL, status VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_0 (id BIGINT AUTO_INCREMENT, user_id
		INT NOT NULL, status VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_1 (id BIGINT AUTO_INCREMENT, user_id
		INT NOT NULL, status VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_item_0
		(id BIGINT
		AUTO_INCREMENT, order_id BIGINT, user_id INT NOT
		NULL, status
		VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));
CREATE TABLE IF NOT EXISTS demo_ds_1.t_order_item_1
		(id BIGINT
		AUTO_INCREMENT, order_id BIGINT, user_id INT NOT
		NULL, status
		VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_item_0
		(id BIGINT
		AUTO_INCREMENT, order_id BIGINT, user_id INT NOT
		NULL, status
		VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));
CREATE TABLE IF NOT EXISTS demo_ds_0.t_order_item_1
		(id BIGINT
		AUTO_INCREMENT, order_id BIGINT, user_id INT NOT
		NULL, status
		VARCHAR(50),create_date DATETIME,update_date DATETIME, PRIMARY KEY (id));

DELETE FROM demo_ds_0.t_order_0;
DELETE FROM demo_ds_0.t_order_1;
DELETE FROM demo_ds_1.t_order_0;
DELETE FROM demo_ds_1.t_order_1;

DELETE FROM demo_ds_0.t_order_item_0;
DELETE FROM demo_ds_0.t_order_item_1;
DELETE FROM demo_ds_1.t_order_item_0;
DELETE FROM demo_ds_1.t_order_item_1;