DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id int unsigned AUTO_INCREMENT,
  product_name VARCHAR(100) NOT NULL,
  price float NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO product (product_name, price) VALUES ("パソコン", "20");
INSERT INTO product (product_name, price) VALUES ("冷蔵庫", "10");
