package by.it.krasutski.project.java.dao.beans;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {
    private int ID;
    private String Role;

    public Role(int ID, String Role) {
        this.ID = ID;
        this.Role = Role;
    }

    public Role() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "ID=" + ID +
                ", Role='" + Role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        by.it.krasutski.project.java.dao.beans.Role Role1 = (by.it.krasutski.project.java.dao.beans.Role) o;
        return ID == Role1.ID &&
                Objects.equals(Role, Role1.Role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ID, Role);
    }
}
