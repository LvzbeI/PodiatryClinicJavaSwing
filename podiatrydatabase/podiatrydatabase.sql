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

DROP DATABASE IF EXISTS podiatrydatabase;
-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "public"."users";


CREATE TABLE "public"."users" (
  "userid" int4 NOT NULL DEFAULT nextval('users_userid_seq1'::regclass),
  "name" varchar(30) COLLATE "pg_catalog"."default",
  "secondname" varchar(30) COLLATE "pg_catalog"."default",
  "sex" varchar(8) COLLATE "pg_catalog"."default",
  "borndate" varchar(10) COLLATE "pg_catalog"."default",
  "email" varchar(30) COLLATE "pg_catalog"."default",
  "phone" varchar(12) COLLATE "pg_catalog"."default",
  "observations" text COLLATE "pg_catalog"."default",
  "consultationdate" varchar(10) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO "public"."users" VALUES (1, 'Tony', 'Glz', 'Male', '13/08/1999', 'tony@gmail.com', '7861245674', 'Good health', '4/23/2025');
INSERT INTO "public"."users" VALUES (3, 'Ana', 'Luisa', 'Female', '12/6/1997', 'ana@gmail.com', '355454565465', 'Pie de atleta', '23/04/2025');
INSERT INTO "public"."users" VALUES (4, 'Ana', 'Luna', 'Female', '12/7/1999', 'analu@gmail.com', '4766378768', 'There''s no problem with her', '23/04/2025');
INSERT INTO "public"."users" VALUES (5, 'Anthony', 'Garcia', 'Male', '3/8/1991', 'ssj02@gmail.com', '786123490', 'No problem', '23/04/2025');
INSERT INTO "public"."users" VALUES (6, 'Sandra', 'Zepeda', 'Female', '11/6/1998', 'san@gmail.com', '44315675', 'No problem', '23/04/2025');
INSERT INTO "public"."users" VALUES (7, 'Sandra', 'Gonzalez', 'Female', '1/3/1999', 'sandy@gmail.com', '445156754', 'No problem with her', '23/04/2025');
INSERT INTO "public"."users" VALUES (8, 'Alondra', 'Garcia', 'Female', '11/3/1997', 'alog23@gmail.com', '5567893', 'Nothing to do', '23/04/2025');
INSERT INTO "public"."users" VALUES (9, 'Andrea', 'Raya', 'Female', '6/24/1998', 'andrea12@gmail.com', '7861245671', 'No problems with her', '04/30/2025');
INSERT INTO "public"."users" VALUES (10, 'andres', 'vernaza', 'Male', '3/24/1998', 'andyv@gmail.com', '4435678246', 'Problems with his toes', '04/30/2025');

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD CONSTRAINT "users_pkey" PRIMARY KEY ("userid");





DROP TABLE IF EXISTS "public"."consultations";
CREATE TABLE "public"."consultations" (
  "consultationid" int4 NOT NULL DEFAULT nextval('consultations_consultationid_seq'::regclass),
  "patientid" int4 NOT NULL,
  "consultation" text COLLATE "pg_catalog"."default",
  "consultationdate" varchar(15) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of consultations
-- ----------------------------
INSERT INTO "public"."consultations" VALUES (2, 6, 'There''s no problem with the patient', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (3, 7, 'No problem', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (4, 8, 'No problem', '24/04/2025');
INSERT INTO "public"."consultations" VALUES (6, 6, 'the patient does not have problems', '28/04/2025');

-- ----------------------------
-- Primary Key structure for table consultations
-- ----------------------------
ALTER TABLE "public"."consultations" ADD CONSTRAINT "consultations_pkey" PRIMARY KEY ("consultationid");

-- ----------------------------
-- Foreign Keys structure for table consultations
-- ----------------------------
ALTER TABLE "public"."consultations" ADD CONSTRAINT "consultations_patientid_fkey" FOREIGN KEY ("patientid") REFERENCES "public"."users" ("userid") ON DELETE NO ACTION ON UPDATE NO ACTION;





-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS "public"."admins";
CREATE TABLE "public"."admins" (
  "adminid" int4 NOT NULL DEFAULT nextval('admins_adminid_seq'::regclass),
  "adminname" varchar(30) COLLATE "pg_catalog"."default",
  "adminpassword" varchar(30) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO "public"."admins" VALUES (1, 'admin', '1234');

-- ----------------------------
-- Primary Key structure for table admins
-- ----------------------------
ALTER TABLE "public"."admins" ADD CONSTRAINT "admins_pkey" PRIMARY KEY ("adminid");
