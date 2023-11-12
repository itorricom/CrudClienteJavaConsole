# CrudClienteJavaConsole

-- Volcando estructura de base de datos para dbtienda
CREATE DATABASE IF NOT EXISTS `dbtienda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbtienda`;

-- Volcando estructura para tabla dbtienda.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `email` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `telefono` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT '0',
  `Columna 5` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

-- Volcando datos para la tabla dbtienda.cliente: ~1 rows (aproximadamente)
INSERT IGNORE INTO `cliente` (`id`, `nombre`, `email`, `telefono`, `Columna 5`) VALUES
	(1, 'Jose', 'joserocha@gmail.com', '4552233', NULL);
