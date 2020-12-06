package internetbooking;

public class Hotel {
    private String hotelName;
    private int weekDayPrize;
    private int weekendPrize;
    private int totalPrize;

    public Hotel(int weekDayPrize, int weekendPrize) {
        this.weekDayPrize = weekDayPrize;
        this.weekendPrize = weekendPrize;
    }
    public Hotel(String hotelName, int weekDayPrize, int weekendPrize) {
        this.hotelName = hotelName;
        this.weekDayPrize = weekDayPrize;
        this.weekendPrize = weekendPrize;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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
    public void setTotalPrize(int [] days){
        int total = 0;
        total = days[0]*weekDayPrize + days[1]*weekendPrize;
        totalPrize = total;
    }
    public int getTotalPrize(){
        return totalPrize;
    }

    public String toString() {
        return "total Prize " + totalPrize +  ", WeekdayPrice " + weekDayPrize+ ", WeekendPrice " + weekendPrize;

    }

}
