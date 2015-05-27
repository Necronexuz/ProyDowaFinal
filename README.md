# ProyDowaFina

SET UP:
1.- Hacer el set up del server de la aplicacion para poder usarlo con un simple RUN
link de ayuda: https://federicoponte.wordpress.com/2013/08/02/setting-up-tomcat-7-with-intellij-idea/

2.- Crear la base de datos
3.- Crear el data source

TO RUN:
1.- mvn clena install
2.- RUN

MySql
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8

CREATE TABLE `roles` (
  `id_role` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`id_role`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8

CREATE TABLE `user_roles` (
  `id_user` int(11) NOT NULL,
  `id_role` int(11) NOT NULL,
  KEY `user` (`id_user`),
  KEY `role` (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `topics` (
  `id_topic` int(11) NOT NULL AUTO_INCREMENT,
  `topic` varchar(60) NOT NULL,
  PRIMARY KEY (`id_topic`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

CREATE TABLE `histories` (
  `id_story` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `id_topic` int(11) NOT NULL,
  `title` varchar(90) NOT NULL,
  `story` text NOT NULL,
  `up` int(11) NOT NULL,
  `down` int(11) NOT NULL,
  PRIMARY KEY (`id_story`),
  KEY `id_user` (`id_user`),
  KEY `id_topic` (`id_topic`),
  CONSTRAINT `histories_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `histories_ibfk_2` FOREIGN KEY (`id_topic`) REFERENCES `topics` (`id_topic`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

