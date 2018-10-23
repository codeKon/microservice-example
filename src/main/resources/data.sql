INSERT INTO `cloud1`.`Author`
(`id`,
`firstName`,
`lastName`)
VALUES
(1,
 'Dirk',
'Hardy');

INSERT INTO `cloud1`.`Book`
(`id`,
`ISBN`,
`name`,
`publishingCompany`,
`year`)
VALUES
(1,
'978-3-8085-8560-3',
'Java für IT-Berufe',
'Europa-Lehrmittel',
'2015');
INSERT INTO `cloud1`.`Book_author`
(`Book_id`,
`author_id`,
`author_ORDER`)
VALUES
(1,
1,
1);


INSERT INTO `cloud1`.`Author`
(`id`,
`firstName`,
`lastName`)
VALUES
(2,
 'Eric',
'Schneider');

INSERT INTO `cloud1`.`Book`
(`id`,
`ISBN`,
`name`,
`publishingCompany`,
`year`)
VALUES
(2,
'978-3-458-17651-0 ',
'Zurück nach Java ',
'Inselm-Verlag',
'2015');
INSERT INTO `cloud1`.`Book_author`
(`Book_id`,
`author_id`,
`author_ORDER`)
VALUES
(2,
2,
1);

INSERT INTO `cloud1`.`Author`
(`id`,
`firstName`,
`lastName`)
VALUES
(3,
 'Alexander',
'Salvanos');