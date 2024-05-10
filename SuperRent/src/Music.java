import java.util.Objects;

public class Music extends Title {

    private String producer;
    private String singer;
    private int duration;
    private int tracks;
    private int uniqueRentalFee;
    private double uniqueLateFee;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
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
        return "Music{" +
                "producer='" + producer + '\'' +
                ", singer='" + singer + '\'' +
                ", duration=" + duration +
                ", tracks=" + tracks +
                ", uniqueRentalFee=" + uniqueRentalFee +
                ", uniqueLateFee=" + uniqueLateFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return duration == music.duration && tracks == music.tracks && uniqueRentalFee == music.uniqueRentalFee && Double.compare(music.uniqueLateFee, uniqueLateFee) == 0 && Objects.equals(producer, music.producer) && Objects.equals(singer, music.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, singer, duration, tracks, uniqueRentalFee, uniqueLateFee);
    }
}