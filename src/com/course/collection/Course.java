package com.course.collection;

/**
 * Created by Charles.Qiu on 2017/4/4.
 */
public class Course {

    private String id;
    private String name;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Instantiates a new Course.
     *
     * @param id   the id
     * @param name the name
     */
    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Instantiates a new Course.
     */
    public Course() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (!getId().equals(course.getId())) return false;
        return getName().equals(course.getName());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
