DROP DATABASE IF EXISTS "graphql";
CREATE DATABASE graphql;
\c graphql;

DROP TABLE IF EXISTS "moeda";

CREATE TABLE moeda (
    id SERIAL PRIMARY KEY,
    nome varchar(255),
    valor NUMERIC (10, 2),
    data varchar(255)
);

INSERT INTO moeda (id, nome, valor, data)
VALUES
(1,'real','0.20','2023-12-01T19:20:30+03:00'),
(2,'real','0.21','2023-12-02T19:20:30+03:00'),
(3,'real','0.22','2023-12-03T19:20:30+03:00'),
(4,'real','0.20','2023-12-04T19:20:30+03:00'),
(5,'real','0.19','2023-12-05T19:20:30+03:00'),
(6,'real','0.22','2023-12-06T19:20:30+03:00'),
(7,'real','0.23','2023-12-07T19:20:30+03:00'),
(8,'real','0.25','2023-12-08T19:20:30+03:00'),
(9,'real','0.22','2023-12-09T19:20:30+03:00'),
(10,'real','0.21','2023-12-10T19:20:30+03:00'),
(11,'real','0.20','2023-12-11T19:20:30+03:00'),
(12,'real','0.25','2023-12-12T19:20:30+03:00'),
(13,'real','0.26','2023-12-13T19:20:30+03:00'),
(14,'real','0.27','2023-12-14T19:20:30+03:00'),
(15,'real','0.28','2023-12-15T19:20:30+03:00'),
(16,'real','0.30','2023-12-16T19:20:30+03:00'),
(17,'real','0.32','2023-12-17T19:20:30+03:00'),
(18,'real','0.28','2023-12-18T19:20:30+03:00'),
(19,'real','0.28','2023-12-19T19:20:30+03:00'),
(20,'real','0.27','2023-12-20T19:20:30+03:00'),
(21,'dollar','4.93','2023-12-01T19:20:30+03:00'),
(22,'dollar','4.94','2023-12-02T19:20:30+03:00'),
(23,'dollar','4.95','2023-12-03T19:20:30+03:00'),
(24,'dollar','5.00','2023-12-04T19:20:30+03:00'),
(25,'dollar','4.90','2023-12-05T19:20:30+03:00'),
(26,'dollar','4.92','2023-12-06T19:20:30+03:00'),
(27,'dollar','4.98','2023-12-07T19:20:30+03:00'),
(28,'dollar','4.99','2023-12-08T19:20:30+03:00'),
(29,'dollar','4.89','2023-12-09T19:20:30+03:00'),
(30,'dollar','4.88','2023-12-10T19:20:30+03:00'),
(31,'dollar','4.96','2023-12-11T19:20:30+03:00'),
(32,'dollar','4.95','2023-12-12T19:20:30+03:00'),
(33,'dollar','4.95','2023-12-13T19:20:30+03:00'),
(34,'dollar','4.94','2023-12-14T19:20:30+03:00'),
(35,'dollar','4.97','2023-12-15T19:20:30+03:00'),
(36,'dollar','4.99','2023-12-16T19:20:30+03:00'),
(37,'dollar','5.01','2023-12-17T19:20:30+03:00'),
(38,'dollar','5.05','2023-12-18T19:20:30+03:00'),
(39,'dollar','4.99','2023-12-19T19:20:30+03:00'),
(40,'dollar','4.98','2023-12-20T19:20:30+03:00'),
(41,'euro','5.30','2023-12-01T19:20:30+03:00'),
(42,'cad','3.63','2023-12-01T19:20:30+03:00'),
(43,'libra','6.19','2023-12-01T19:20:30+03:00');