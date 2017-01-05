CREATE DATABASE  IF NOT EXISTS `guest_book` DEFAULT CHARACTER SET utf8 ;


DROP TABLE IF EXISTS `record`;

CREATE TABLE `guest_book`.`record` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `birthday` DATE NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

  INSERT INTO `guest_book`.`record` (`name`, `surname`, `birthday`, `phone_number`, `mail`, `country`, `city`) VALUES ('Danylo', 'Panteliienko', '1995-06-21', '0933114901', 'panteliienko.danylo@gmail.com', 'Ukraine', 'Chernihiv');
  INSERT INTO `guest_book`.`record` (`name`, `surname`, `birthday`, `phone_number`, `mail`, `country`, `city`) VALUES ('Jane', 'Ostapenko', '1997-01-20', '0931844859', 'janetta@gmail.com', 'Ukraine', 'Chernihiv');
  INSERT INTO `guest_book`.`record` (`name`, `surname`, `birthday`, `phone_number`, `mail`, `country`, `city`) VALUES ('Ivan', 'Havrilin', '1994-06-05', '0631865759', 'gavr1994@mail.ru', 'Ukraine', 'Kiev');