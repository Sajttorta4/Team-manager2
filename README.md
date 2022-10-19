# Team-Manager
Team-Manager Spring Boot project

-----------------------------

docker run --name team-manager -d -p 2022:5432 -e POSTGRES_PASSWORD=team-manager postgres

-----------------------------

CREATE DATABASE teammanager;

-----------------------------

CREATE TABLE clubs
(
    club_id     SERIAL   PRIMARY KEY,
    club_name  	         varchar(50)  	NOT NULL,
    club_num_members     int2         	NOT NULL
);

CREATE TABLE members
(
    member_id   SERIAL	  PRIMARY KEY,
    member_name 		  varchar(50) NOT NULL,
    member_gender         boolean     NOT NULL,
    member_club			  int4        NOT NULL REFERENCES clubs (club_id)
);

CREATE TABLE gadgets
(
    gadget_id    SERIAL    PRIMARY KEY,
    gadget_name            varchar(50)    NOT NULL,
    gadget_member          int4    		NOT NULL REFERENCES members (member_id)
);

INSERT INTO clubs
VALUES (1, 'foci', 5), (2, 'kosárlabda', 5), (3, 'tenisz', 5), (4, 'kézilabda', 5), (1, 'golf', 5);

INSERT INTO members
VALUES (1, 'Kovács Péter', 0, 1), (2, 'Horváth Gábor', 0, 2), (3, 'Kiss Izabella', 1, 3), (4, 'Szép Kinga', 1, 4), (5, 'Nagy Péter', 0, 5);

INSERT INTO gadgets
VALUES (1, 'focilabda', 1), (2, 'kosárlabda', 2), (3, 'teniszütő', 3), (4, 'kézilabda', 4), (5, 'golfütő', 5);
