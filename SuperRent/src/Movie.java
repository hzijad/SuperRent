import java.util.Objects;

public class Movie extends Title {

    private String director;
    private String cast;
    private int duration;
    private int year;
    private int uniqueRentalFee;
    private double uniqueLateFee;

    //constructors

    public Movie(int rentalCode, String name, String description, TitleType title, int uniqueStockNumber, String director, String cast, int duration, int year, int rentalFee, int lateRentalFee) {

        super(rentalCode, name, description, title, uniqueStockNumber, rentalFee, lateRentalFee);

        setDirector(director);
        setCast(cast);
        setDuration(duration);
        setYear(year);


    }

    public Movie() {

        super();

        setDirector(null);
        setCast(null);
        setDuration(0);
        setYear(0);


    }

    public Movie(Movie other) {

        super(other);

        setDirector(other.director);
        setCast(other.cast);
        setDuration(other.duration);
        setYear(other.year);


    }



    //setters and getters
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

    /*

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

     */
}