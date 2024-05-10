import java.util.Objects;

public class Movie {

    private String director;
    private String cast;
    private int duration;
    private int year;
    private int uniqueRentalFee;
    private double uniqueLateFee;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUniqueRentalFee() {
        return uniqueRentalFee;
    }

    public void setUniqueRentalFee(int uniqueRentalFee) {
        this.uniqueRentalFee = uniqueRentalFee;
    }

    public double getUniqueLateFee() {
        return uniqueLateFee;
    }

    public void setUniqueLateFee(double uniqueLateFee) {
        this.uniqueLateFee = uniqueLateFee;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", cast='" + cast + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", uniqueRentalFee=" + uniqueRentalFee +
                ", uniqueLateFee=" + uniqueLateFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return duration == movie.duration && year == movie.year && uniqueRentalFee == movie.uniqueRentalFee && Double.compare(movie.uniqueLateFee, uniqueLateFee) == 0 && Objects.equals(director, movie.director) && Objects.equals(cast, movie.cast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(director, cast, duration, year, uniqueRentalFee, uniqueLateFee);
    }
}