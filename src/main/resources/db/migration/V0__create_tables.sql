CREATE TABLE persons
(
identifier UUID NOT NULL,
name TEXT NOT NULL,
age INT,
address TEXT,
created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
PRIMARY KEY (identifier)
)
