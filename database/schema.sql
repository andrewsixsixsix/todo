DROP TABLE IF EXISTS "users";

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

CREATE TABLE "users" (
  "id" bigserial PRIMARY KEY,
  "username" varchar(32) UNIQUE NOT NULL,
  "email" varchar(128) UNIQUE NOT NULL,
  "password" varchar(64) NOT NULL,
  "first_name" varchar(32),
  "last_name" varchar(32),
  "created_at" timestamp DEFAULT LOCALTIMESTAMP,
  "updated_at" timestamp
);

CREATE TABLE "task" (
  "id" bigserial PRIMARY KEY,
  "user_id" bigint NOT NULL,
  "title" varchar(32) NOT NULL,
  "status" task_status NOT NULL,
  "priority" task_priority NOT NULL,
  "description" varchar(128),
  "due_date" date,
  "created_at" timestamp DEFAULT LOCALTIMESTAMP,
  "updated_at" timestamp
);

CREATE INDEX ON "task" ("user_id");

ALTER TABLE "task" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id") ON DELETE CASCADE ON UPDATE CASCADE;
