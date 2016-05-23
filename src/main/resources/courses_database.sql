-- Main table containing courses data
CREATE TABLE courses (
    id INT PRIMARY KEY,
    name VARCHAR(512),
    active BOOLEAN,
    duration INTEGER,
    course_level VARCHAR(128),
    course_speaker_id INT
);

-- Course level table
CREATE TABLE course_levels (
    id INT PRIMARY KEY,
    name VARCHAR(128)
);

-- Course speakers table
CREATE TABLE course_speakers (
    id INT PRIMARY KEY,
    name VARCHAR(512),
    surname VARCHAR(512)
);
