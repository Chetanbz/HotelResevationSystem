package internetbooking;

public class Hotel {
    private int weekDayPrize;
    private int weekendPrize;

    public Hotel(int weekDayPrize, int weekendPrize) {
        this.weekDayPrize = weekDayPrize;
        this.weekendPrize = weekendPrize;
    }

    public int getWeekDayPrize() {
        return weekDayPrize;
    }

    public void setWeekDayPrize(int weekDayPrize) {
        this.weekDayPrize = weekDayPrize;
    }

    public int getWeekendPrize() {
        return weekendPrize;
    }

    public void setWeekendPrize(int weekendPrize) {
        this.weekendPrize = weekendPrize;
    }
    public String toString() {
        return ", WeekdayPrice " + weekDayPrize+ ", WeekendPrice " + weekendPrize;

    }

}
