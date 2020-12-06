import internetbooking.HotelReservationSystem;
import org.junit.Assert;
import org.junit.Test;


public class HotelResrvationSystemTest {
    @Test
    public void addedHotelInHotelReservationSystemShouldGiveLengthOfList() {
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
            hotelReservation.addHotelForRegular();
            int size = hotelReservation.size();
            Assert.assertEquals(size,3);

    }
    @Test
    public void addedHotelInHotelReservationSystemShouldGiveLeakWoodWeekPrize() {
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotelForRegular();
        int prize = HotelReservationSystem.hotelReservationList.get("LeakWood").getWeekDayPrize();
        Assert.assertEquals(prize,110);

    }
    @Test
    public void addedHotelInHotelReservationSystemShouldGiveLeakWoodWeekendPrize() {
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotelForRegular();
        int prize = HotelReservationSystem.hotelReservationList.get("LeakWood").getWeekendPrize();
        Assert.assertEquals(prize,90);

    }

}
