CREATE TABLE formation.product(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  ref VARCHAR(10) UNIQUE NOT NULL,
  nom VARCHAR(64) NOT NULL DEFAULT "",
  price VARCHAR(10) NOT NULL DEFAULT "",
  quantity INT(10) DEFAULT NULL,
  created DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;
INSERT
INTO
  formation.product (ref, nom, price, quantity)
VALUES('AT980', 'Smatphone GT', "4500", 8);
INSERT
INTO
  formation.product (ref, nom, price, quantity)
VALUES('HP675', 'Ordinateur HP', "80", 82);
INSERT
INTO
  formation.product (ref, nom, price, quantity)
VALUES('AERT', 'Test', "2450", 22);
INSERT
INTO
  formation.product (ref, nom, price, quantity)
VALUES(
  'ABC01',
  'Truc bidule mais cher',
  "15260",
  75
);