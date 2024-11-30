DROP TABLE IF EXISTS "'user'";

DROP TABLE IF EXISTS "task";

DROP TYPE IF EXISTS "task_status";

DROP TYPE IF EXISTS "task_priority";

CREATE TYPE "task_status" AS ENUM (
  'T',
  'P',
  'C',
  'I'
);

CREATE TYPE "task_priority" AS ENUM (
  'H',
  'L',
  'M'
);

CREATE TABLE "'user'" (
  "id" bigint PRIMARY KEY,
  "username" varchar(32) UNIQUE NOT NULL,
  "email" varchar(128) UNIQUE NOT NULL,
  "password" varchar(64) NOT NULL,
  "created_at" timestamp NOT NULL,
  "updated_at" timestamp NOT NULL,
  "first_name" varchar(32),
  "last_name" varchar(32)
);

CREATE TABLE "task" (
  "id" bigint PRIMARY KEY,
  "user_id" bigint NOT NULL,
  "title" varchar(32) NOT NULL,
  "status" task_status NOT NULL,
  "priority" task_priority NOT NULL,
  "created_at" timestamp NOT NULL,
  "updated_at" timestamp NOT NULL,
  "description" varchar(128),
  "due_date" date
);

CREATE INDEX ON "task" ("user_id");

ALTER TABLE "task" ADD FOREIGN KEY ("user_id") REFERENCES "'user'" ("id") ON DELETE CASCADE ON UPDATE CASCADE;
