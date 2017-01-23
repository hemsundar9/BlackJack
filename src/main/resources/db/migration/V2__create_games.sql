CREATE TABLE `games` (
  `id` INT NOT NULL,
  `status` ENUM('WON', 'LOSS', 'PENDING') NULL,
  `version` INT NOT NULL,
  `cards_player` VARCHAR(45) NULL,
  `cards_dealer` VARCHAR(45) NULL,
  `player` INT NULL,
  `bet` INT NULL,
  `creation_time` TIMESTAMP NULL DEFAULT NOW(),
  `modified` TIMESTAMP NULL DEFAULT NOW(),
  PRIMARY KEY (`id`),
  INDEX `id_idx` (`player` ASC),
  CONSTRAINT `id`
    FOREIGN KEY (`player`)
    REFERENCES `blackjack_dev`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
