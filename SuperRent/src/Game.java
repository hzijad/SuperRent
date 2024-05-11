import java.util.Objects;

public class Game extends Title {

    private String producer;
    private int year;
    private int uniqueRentalFee;
    private double uniqueLateFee;

    //constructors

    public Game(int rentalCode, String name, String description, TitleType title, int uniqueStockNumber, String producer, int year, int uniqueRentalFee, int uniqueLateFee) {

        super(rentalCode, name, description, title, uniqueStockNumber);

        setProducer(producer);
        setYear(year);
        setUniqueRentalFee(uniqueRentalFee);
        setUniqueLateFee(uniqueLateFee);
    }

    public Game() {

        super();

        setProducer(null);
        setYear(0);
        setUniqueRentalFee(0);
        setUniqueLateFee(0);

    }

    public Game(Game other) {

        super(other);

        setProducer(other.producer);
        setYear(other.year);
        setUniqueRentalFee(other.uniqueRentalFee);
        setUniqueLateFee(other.uniqueLateFee);

    }

    //setters and getters

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        return "Game{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", uniqueRentalFee=" + uniqueRentalFee +
                ", uniqueLateFee=" + uniqueLateFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return year == game.year && uniqueRentalFee == game.uniqueRentalFee && Double.compare(game.uniqueLateFee, uniqueLateFee) == 0 && Objects.equals(producer, game.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, year, uniqueRentalFee, uniqueLateFee);
    }
}