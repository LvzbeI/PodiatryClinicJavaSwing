/*
 Navicat Premium Data Transfer

 Source Server         : podiatryclinicdb
 Source Server Type    : PostgreSQL
 Source Server Version : 160003 (160003)
 Source Host           : 127.0.0.1:5432
 Source Catalog        : podiatrydatabase
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 160003 (160003)
 File Encoding         : 65001

 Date: 01/05/2025 12:12:13
*/



-- podiatrydatabase.sql

CREATE TABLE "public"."users" (
  "userid" SERIAL PRIMARY KEY,
  "name" varchar(30),
  "secondname" varchar(30),
  "sex" varchar(8),
  "borndate" varchar(10),
  "email" varchar(30),
  "phone" varchar(12),
  "observations" text,
  "consultationdate" varchar(10)
);

INSERT INTO "public"."users" VALUES (1, 'Tony', 'Glz', 'Male', '13/08/1999', 'tony@gmail.com', '7861245674', 'Good health', '24/04/2025');
INSERT INTO "public"."users" VALUES (3, 'Ana', 'Luisa', 'Female', '12/06/1997', 'ana@gmail.com', '355454565465', 'Pie de atleta', '23/04/2025');
INSERT INTO "public"."users" VALUES (4, 'Ana', 'Luna', 'Female', '07/12/1999', 'analu@gmail.com', '4766378768', 'There''s no problem with her', '23/04/2025');
INSERT INTO "public"."users" VALUES (5, 'Anthony', 'Garcia', 'Male', '03/08/1991', 'ssj02@gmail.com', '786123490', 'No problem', '23/04/2025');
INSERT INTO "public"."users" VALUES (6, 'Sandra', 'Zepeda', 'Female', '11/06/1998', 'san@gmail.com', '44315675', 'No problem', '23/04/2025');
INSERT INTO "public"."users" VALUES (7, 'Sandra', 'Gonzalez', 'Female', '01/03/1999', 'sandy@gmail.com', '445156754', 'No problem with her', '23/04/2025');
INSERT INTO "public"."users" VALUES (8, 'Alondra', 'Garcia', 'Female', '11/03/1997', 'alog23@gmail.com', '5567893', 'Nothing to do', '23/04/2025');
INSERT INTO "public"."users" VALUES (9, 'Andrea', 'Raya', 'Female', '26/04/1998', 'andrea12@gmail.com', '7861245671', 'No problems with her', '04/05/2025');
INSERT INTO "public"."users" VALUES (10, 'andres', 'vernaza', 'Male', '03/07/1998', 'andyv@gmail.com', '4435678246', 'Problems with his toes', '02/09/2025');

CREATE TABLE "public"."consultations" (
  "consultationid" SERIAL PRIMARY KEY,
  "patientid" int4 NOT NULL,
  "consultation" text,
  "consultationdate" varchar(15)
);

INSERT INTO "public"."consultations" VALUES (2, 6, 'There''s no problem with the patient', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (3, 7, 'No problem', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (4, 8, 'No problem', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (6, 6, 'the patient does not have problems', '28/04/2025');

ALTER TABLE "public"."consultations"
  ADD CONSTRAINT "consultations_patientid_fkey"
  FOREIGN KEY ("patientid") REFERENCES "public"."users" ("userid");

CREATE TABLE "public"."admins" (
  "adminid" SERIAL PRIMARY KEY,
  "adminname" varchar(30),
  "adminpassword" varchar(30)
);

INSERT INTO "public"."admins" VALUES (1, 'admin', '1234');

