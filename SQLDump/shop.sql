-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.24 - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных shop
CREATE DATABASE IF NOT EXISTS `shop` /*!40100 DEFAULT CHARACTER SET cp1251 COLLATE cp1251_bin */;
USE `shop`;


-- Дамп структуры для таблица shop.categories
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) NOT NULL,
  `name` char(50) COLLATE cp1251_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=cp1251 COLLATE=cp1251_bin;

-- Дамп данных таблицы shop.categories: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` (`id`, `name`) VALUES
	(1, 'Аудио-видео'),
	(2, 'Телефония'),
	(3, 'Компьютеры'),
	(4, 'Игровые Консоли');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;


-- Дамп структуры для таблица shop.goods
CREATE TABLE IF NOT EXISTS `goods` (
  `id` int(11) NOT NULL,
  `name` char(50) COLLATE cp1251_bin NOT NULL,
  `category` int(11) NOT NULL,
  `manufacturer` int(11) NOT NULL,
  `count` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `description` char(50) COLLATE cp1251_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=cp1251 COLLATE=cp1251_bin;

-- Дамп данных таблицы shop.goods: ~6 rows (приблизительно)
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
INSERT INTO `goods` (`id`, `name`, `category`, `manufacturer`, `count`, `price`, `description`) VALUES
	(1, 'Телик v1', 1, 1, 3, 20000, 'Просто телик'),
	(2, 'Телефончик', 2, 2, 4, 15000, 'Так себе телефончик'),
	(3, 'Ноут', 3, 7, 3, 10000, 'просто ноут'),
	(4, 'Супер телефон', 1, 1, 5, 50000, 'Просто бомба'),
	(5, 'Крутой телик', 1, 1, 2, 70000, 'Улётный 3Д телевизор'),
	(6, 'Тест', 1, 1, 0, 6364, '64354'),
	(7, 'gsdgksh', 1, 1, 4, 44, 'jvchxkdzfjhv'),
	(8, 'gsgdf', 1, 1, 4, 4324, '42342wergtsfgd'),
	(9, 'fgd', 1, 1, 538, 345, 'gdfsgdf');
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;


-- Дамп структуры для таблица shop.manufacturers
CREATE TABLE IF NOT EXISTS `manufacturers` (
  `id` int(11) NOT NULL,
  `name` char(50) COLLATE cp1251_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=cp1251 COLLATE=cp1251_bin;

-- Дамп данных таблицы shop.manufacturers: ~7 rows (приблизительно)
/*!40000 ALTER TABLE `manufacturers` DISABLE KEYS */;
INSERT INTO `manufacturers` (`id`, `name`) VALUES
	(1, 'LG'),
	(2, 'SAMSUNG'),
	(3, 'SONY'),
	(4, 'Panasonic'),
	(5, 'Apple'),
	(6, 'Nokia'),
	(7, 'Asus'),
	(8, 'DELL');
/*!40000 ALTER TABLE `manufacturers` ENABLE KEYS */;


-- Дамп структуры для таблица shop.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL,
  `name` char(50) COLLATE cp1251_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=cp1251 COLLATE=cp1251_bin;

-- Дамп данных таблицы shop.roles: ~2 rows (приблизительно)
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `name`) VALUES
	(1, 'admin'),
	(2, 'user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;


-- Дамп структуры для таблица shop.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL,
  `firstname` char(50) COLLATE cp1251_bin NOT NULL,
  `lastname` char(50) COLLATE cp1251_bin NOT NULL,
  `mail` char(50) COLLATE cp1251_bin NOT NULL,
  `password` char(50) COLLATE cp1251_bin NOT NULL,
  `role` int(11) NOT NULL,
  `bunned` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=cp1251 COLLATE=cp1251_bin;

-- Дамп данных таблицы shop.users: ~5 rows (приблизительно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `firstname`, `lastname`, `mail`, `password`, `role`, `bunned`) VALUES
	(1, 'Admin', 'Administrator', 'admin', 'admin', 1, 0),
	(2, 'Uzver', 'Юзверь', 'uzver@gmail.com', '1234', 2, 0),
	(3, '1', '1', '1', '1', 2, 1),
	(4, '2', '2', '2', '2', 2, 0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
