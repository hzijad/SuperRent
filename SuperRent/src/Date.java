//sa stopericom, noob version
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Date {
    private LocalDate currentDate;
    private Timer timer;

    public Date() {
        currentDate = LocalDate.now();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                currentDate = currentDate.plusDays(1);
            }
        }, 0, 1000);
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public long checkIfOverdue(LocalDate rentalDate, LocalDate returnDate) {
        long daysBetween = ChronoUnit.DAYS.between(rentalDate, returnDate);
        return daysBetween;
    }

    public void stopTimer() {
        timer.cancel();
    }
}

/* actually bolja implementacija
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private static final long DAILY_FEE = 10; // Set your daily fee

    public Rental(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public long calculateFee() {
        if (returnDate == null) {
            throw new IllegalStateException("Return date is not set yet.");
        }

        long daysBetween = ChronoUnit.DAYS.between(rentalDate, returnDate);
        return daysBetween * DAILY_FEE;
    }
}

 */