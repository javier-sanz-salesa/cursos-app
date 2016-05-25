package org.jsanz.cursosapp.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Course model object.
 */
public class Course {
    private int id;
    private String name;
    private boolean active;
    private int duration;
    private String level;
    private CourseSpeaker speaker;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Course course = (Course) o;

        return new EqualsBuilder().append(id, course.id).append(active, course.active).append(duration, course.duration).append(name, course.name)
                .append(level, course.level).append(speaker, course.speaker).isEquals();
    }

    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseSpeaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(CourseSpeaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).append(active).append(duration).append(level).append(speaker).toHashCode();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("id", id).append("name", name).append("active", active)
                .append("duration", duration).append("level", level).append("speaker", speaker).toString();
    }
}