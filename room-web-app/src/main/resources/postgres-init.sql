CREATE TABLE ROOM
(
    ROOM_ID     BIGSERIAL PRIMARY KEY,
    NAME        VARCHAR(16) NOT NULL,
    ROOM_NUMBER CHAR(2)     NOT NULL UNIQUE,
    BED_INFO    CHAR(2)     NOT NULL
);

CREATE TABLE EMPLOYEE
(
    EMPLOYEE_ID CHAR(36) PRIMARY KEY,
    FIRST_NAME  VARCHAR(64),
    LAST_NAME   VARCHAR(64),
    POSITION    VARCHAR(64)
);

INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P1', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P2', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P3', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P4', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P5', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Piccadilly', 'P6', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Cambridge', 'C1', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Cambridge', 'C2', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Cambridge', 'C3', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W1', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W2', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W3', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W4', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W5', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W6', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Westminster', 'W7', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Oxford', 'O1', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Oxford', 'O2', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Oxford', 'O3', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Oxford', 'O4', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Oxford', 'O5', '1Q');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Victoria', 'V1', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Victoria', 'V2', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Victoria', 'V3', '2D');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Manchester', 'M1', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Manchester', 'M2', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Manchester', 'M3', '1K');
INSERT INTO ROOM (NAME, ROOM_NUMBER, BED_INFO)
VALUES ('Manchester', 'M4', '1K');

INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('9f717667-505a-4074-ba43-ceae2c0e9f4b', 'Adams', 'Roy', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('3cb69467-dcaa-4d53-84d9-c0d7ba439645', 'Adams', 'Martin', 'SECURITY');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('a36df0b3-da59-47e3-b110-37a5a222d46b', 'Alvarez', 'Roger', 'FRONT_DESK');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('0e235279-ba2d-40f8-8cfa-c346be49eb47', 'Alvarez', 'Anne', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('461f5182-9ab1-4e27-a1fb-0c2669bfbb55', 'Alvarez', 'Ann', 'CONCIERGE');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('eeefd5a8-d4b8-49b0-af0d-a7e9eb170db6', 'Anderson', 'Betty', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('5ee0a977-6856-455e-becb-0a4de6d08958', 'Anderson', 'Laura', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('784234d6-5b90-4471-a51e-eb00940a5608', 'Armstrong', 'Christopher', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('241c9d7b-f6e9-46e7-807a-e82f33d7ab35', 'Bell', 'David', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('f01ec3b4-7e44-49d1-8601-929d88524286', 'Berry', 'Paula', 'SECURITY');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('cb2f2846-d432-4f81-b6cb-06c03c9aaf03', 'Bishop', 'Dennis', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('fff66b51-fd6b-40ac-9422-79079595a05f', 'Bishop', 'Carolyn', 'CONCIERGE');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('bb5f87cd-58e5-4f7b-9f82-e9984cbc4e85', 'Black', 'Harold', 'FRONT_DESK');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('c063038f-5854-4b45-8e76-322ddc7794aa', 'Bowman', 'Jerry', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('d5371ef2-6fe5-45bf-a1f3-07d79d408d03', 'Bradley', 'Keith', 'FRONT_DESK');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('2d43db23-1994-40a3-9b82-17cd57bfa8d6', 'Brooks', 'Samuel', 'HOUSEKEEPING');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('c0dd0ccc-5f69-477a-87ea-19b7d7ecbe6c', 'Bryant', 'Donald', 'FRONT_DESK');
INSERT INTO EMPLOYEE (EMPLOYEE_ID, LAST_NAME, FIRST_NAME, POSITION)
VALUES ('de8e222e-dcb1-42e3-bcaf-b0aff93527c3', 'Burke', 'Tammy', 'SECURITY');