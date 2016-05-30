-- Main table containing courses data
CREATE TABLE courses (
    id INT IDENTITY PRIMARY KEY,
    name VARCHAR(512),
    active BOOLEAN,
    duration INTEGER,
    course_level VARCHAR(128),
    course_speaker_id INT
);

-- Course speakers table
CREATE TABLE course_speakers (
    id INT IDENTITY PRIMARY KEY,
    name VARCHAR(512)
);
