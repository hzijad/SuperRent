import java.util.Objects;

public class Title {

    private int rentalCode;
    private String name;
    private String description;
    private TitleType title;
    private int uniqueStockNumber;
    private int rentalFee;
    private int lateRentalFee;

    //constructors

    public Title(int rentalCode, String name, String description, TitleType title, int uniqueStockNumber, int rentalFee, int lateRentalFee){

        setRentalCode(rentalCode);
        setName(name);
        setDescription(description);
        setTitle(title);
        setUniqueStockNumber(uniqueStockNumber);
        setRentalFee(rentalFee);
        setLateRentalFee(lateRentalFee);

    }

    public Title(){

        setRentalCode(0);
        setName(null);
        setDescription(null);
        setTitle(null);
        setUniqueStockNumber(0);
        setRentalFee(0);
        setLateRentalFee(0);

    }

    public Title(Title other) {

        this.rentalCode = other.rentalCode;
        this.name = other.name;
        this.description = other.description;
        this.title = other.title;
        this.uniqueStockNumber = other.uniqueStockNumber;
        this.rentalFee = other.rentalFee;
        this.lateRentalFee = other.lateRentalFee;

    }


    //setters and getters

    public int getRentalCode() {
        return rentalCode;
    }

    public void setRentalCode(int rentalCode) {
        this.rentalCode = rentalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TitleType getTitle() {
        return title;
    }

    public void setTitle(TitleType title) {
        this.title = title;
    }

    public int getUniqueStockNumber() {
        return uniqueStockNumber;
    }

    public void setUniqueStockNumber(int uniqueStockNumber) {
        this.uniqueStockNumber = uniqueStockNumber;
    }

    public int getRentalFee() { return rentalFee; }

    public void setRentalFee(int rentalFee) { this.rentalFee = rentalFee; }

    public int getLateRentalFeeRentalFee() { return lateRentalFee; }

    public void setLateRentalFee(int lateRentalFee) { this.lateRentalFee = lateRentalFee; }


    @Override
    public String toString() {
        return "Title{" +
                "rentalCode=" + rentalCode +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", title=" + title +
                ", uniqueStockNumber=" + uniqueStockNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title1 = (Title) o;
        return rentalCode == title1.rentalCode && uniqueStockNumber == title1.uniqueStockNumber && Objects.equals(name, title1.name) && Objects.equals(description, title1.description) && title == title1.title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalCode, name, description, title, uniqueStockNumber);
    }
}