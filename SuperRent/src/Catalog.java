import java.io.*;
import java.util.*;

public class Catalog {

    private String name;
    private ArrayList<Title> titles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", titles=" + titles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(name, catalog.name) &&
                Objects.equals(titles, catalog.titles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, titles);
    }
}
