import java.util.Date;
import java.util.Objects;

public class DailyLog {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DailyLog{" +
                "date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyLog dailyLog = (DailyLog) o;
        return Objects.equals(date, dailyLog.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}