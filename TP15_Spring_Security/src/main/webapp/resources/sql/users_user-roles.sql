-- Structure de la table `users`
CREATE TABLE IF NOT EXISTS `users` (
`ID_USER` int(11) NOT NULL AUTO_INCREMENT,
`USERNAME` varchar(15) NOT NULL,
`PASSWORD` varchar(100) NOT NULL,
`ENABLED` tinyint(1) NOT NULL,
PRIMARY KEY (`ID_USER`),
UNIQUE KEY `LOGIN` (`username`)
) AUTO_INCREMENT=4 ;

-- Contenu de la table `users`
INSERT INTO `users` (`ID_USER`, `username`, `PASSWORD`, `ENABLED`) VALUES
(1, 'philippe', '$2a$12$eW.3q1KgNRpoyfF3anHcrOWKd5nKfmgdWpJR.BGe5vSDrySZxgu.q', 1),
(2, 'farhad', '$2a$12$9q5WUYs6nP31aW7IECtEp.ZVl.CCd/QLfb0dSCzgRa/E4o1bHrCyy', 1),
(3, 'michel', '$2a$12$VF1CO0UZs0FVtsfl68i13ecmUR.ngnrvERgfpg4KYMMn0erTkm3P.', 1);

-- Structure de la table `roles`
CREATE TABLE IF NOT EXISTS `ROLES` (
`ID_ROLE` int(11) NOT NULL AUTO_INCREMENT,
`ID_USER` int(11) NOT NULL,
`ROLE_NAME` varchar(20) NOT NULL,
PRIMARY KEY (`ID_ROLE`),
KEY `ID_USER` (`ID_USER`)
)  AUTO_INCREMENT=5 ;

-- Contenu de la table `roles`
INSERT INTO `roles` (`ID_ROLE`, `ID_USER`, `ROLE_NAME`) VALUES
(1, 1, 'ROLE_ADMIN'),
(2, 1, 'ROLE_CONSULTATION'),
(3, 2, 'ROLE_ADMIN'),
(4, 3, 'ROLE_USER');

-- Contraintes pour la table `roles`
ALTER TABLE `ROLES`
ADD CONSTRAINT `roles_fk_1` FOREIGN KEY (`ID_USER`) REFERENCES `users` (`ID_USER`);
