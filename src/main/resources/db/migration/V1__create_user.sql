CREATE TABLE `users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `version` INT NOT NULL,
  `balance` bigint(7) DEFAULT NULL,
  `total_games` INT DEFAULT NULL,
  `games_won` INT DEFAULT NULL,
  `creation_time` TIMESTAMP NULL DEFAULT NOW(),
  `modified` TIMESTAMP NULL DEFAULT NOW(),
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
