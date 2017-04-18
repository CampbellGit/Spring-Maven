-- Base de données: `formation`

-- Structure de la table `employe`
CREATE TABLE `employe` (
  `ID` int(10) unsigned NOT NULL auto_increment,
  `login` varchar(25) NOT NULL default '',
  `password` varchar(10) NOT NULL default '',
  `nom` varchar(30) NOT NULL default '',
  `prenom` varchar(30) NOT NULL default '',
  `email` varchar(30) default NULL,
  `role` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`ID`)
) AUTO_INCREMENT=3 ;

-- Contenu de la table `employe`
INSERT INTO `employe` VALUES (2, 'CDE', 'm2i', 'DEVOT', 'Corinne', 'corinne.devot@m2i.com', 'developper');
INSERT INTO `employe` VALUES (3, 'NIN', 'm2i', 'ING', 'Nathalie', 'nathalie.ing@m2i.com', 'productOwner');
INSERT INTO `employe` VALUES (1, 'PMA', 'm2i', 'HASSINI', 'Mourad', 'mourad.hassini@m2i.com', 'scumMaster');         