-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2020 a las 23:54:19
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_administracion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitud`
--

CREATE TABLE `solicitud` (
  `cod_usuario` varchar(7) NOT NULL,
  `tipo_peticion` varchar(20) DEFAULT NULL,
  `asunto` varchar(60) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `fecha_limite` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `solicitud`
--

INSERT INTO `solicitud` (`cod_usuario`, `tipo_peticion`, `asunto`, `estado`, `fecha_creacion`, `fecha_limite`) VALUES
('001', 'Peticiòn', 'nuevo', 'En Ejecuciòn', '2020-07-02 19:34:17', '0200-07-02 00:00:00'),
('001', 'Queja', 'mantenimiento', 'En Ejecuciòn', '2020-07-02 19:35:08', '0200-07-03 00:00:00'),
('001', 'Queja', 'mal servicio', 'Nuevo', '2020-07-02 19:35:56', '0200-07-04 00:00:00'),
('001', 'Reclamo', 'corte', 'Cerrado', '2020-07-02 19:36:51', '0200-07-01 00:00:00'),
('001', 'Reclamo', 'corte de servicios', 'Cerrado', '2020-07-02 19:37:40', '0200-03-02 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `cod_usuario` varchar(7) NOT NULL,
  `pass` varchar(7) NOT NULL,
  `tipo_usuario` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cod_usuario`, `pass`, `tipo_usuario`) VALUES
('001', 'miguel', 'miguel'),
('002', 'dios', 'Usuario'),
('003', 'dios', 'Admin'),
('004', '004', 'Admin'),
('005', 'amor1', 'Admin'),
('006', '006', 'Admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD KEY `cod_usuario` (`cod_usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`cod_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD CONSTRAINT `solicitud_ibfk_1` FOREIGN KEY (`cod_usuario`) REFERENCES `usuarios` (`cod_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
