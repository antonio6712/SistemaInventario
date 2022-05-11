create database sistemainventario;

CREATE TABLE `resgistro` (
  `idResgistro` int NOT NULL AUTO_INCREMENT,
  `Departamento` varchar(45) NOT NULL,
  `Equipo` varchar(45) NOT NULL,
  `Marca` varchar(45) NOT NULL,
  `Serie` varchar(100) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `FechaEquipo` date NOT NULL,
  PRIMARY KEY (`idResgistro`)
);

CREATE TABLE `resguardo` (
  `idResguardo` int NOT NULL AUTO_INCREMENT,
  `Resguardante` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL,
  `NumeroEmpleado` varchar(100) NOT NULL,
  `Serie` varchar(100) NOT NULL,
  `Puesto` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  `LugarFecha` varchar(100) NOT NULL,
  `TipoMovimiento` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  PRIMARY KEY (`idResguardo`)
);
		/*Actualizacion 05-04-2022*/
ALTER TABLE `sistemainventario`.`resgistro` 
ADD COLUMN `Color` VARCHAR(45) NOT NULL AFTER `FechaEquipo`,
ADD COLUMN `Estatus` VARCHAR(45) NOT NULL AFTER `Color`;


ALTER TABLE `sistemainventario`.`resguardo` 
ADD COLUMN `TipoAdquisicion` VARCHAR(45) NOT NULL AFTER `Fecha`;

		/*Actualizacion 18-04-2022*/
CREATE TABLE `sistemainventario`.`regis_reguar` (
  `idRegis_Reguar` INT NOT NULL AUTO_INCREMENT,
  `idResgistro` INT NULL,
  `idResguardo` INT NULL,
  `Observacion` VARCHAR(100) NULL,
  PRIMARY KEY (`idRegis_Reguar`),
  INDEX `RegistroRela_idx` (`idResgistro` ASC) VISIBLE,
  INDEX `ResguardoRela_idx` (`idResguardo` ASC) VISIBLE,
  CONSTRAINT `RegistroRela`
    FOREIGN KEY (`idResgistro`)
    REFERENCES `sistemainventario`.`resgistro` (`idResgistro`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ResguardoRela`
    FOREIGN KEY (`idResguardo`)
    REFERENCES `sistemainventario`.`resguardo` (`idResguardo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
    ALTER TABLE `sistemainventario`.`resgistro` 
ADD COLUMN `IdInventario` VARCHAR(100) NULL AFTER `Estatus`;

ALTER TABLE `sistemainventario`.`resguardo` 
DROP COLUMN `Serie`;

