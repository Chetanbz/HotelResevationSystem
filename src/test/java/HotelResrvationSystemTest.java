import internetbooking.HotelReservationSystem;
import org.junit.Assert;
import org.junit.Test;

public class HotelResrvationSystemTest {
    @Test
    public void addedHotelInHotelReservationSystem_() {
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
            hotelReservation.addHotelForRegular();
            int size = hotelReservation.size();
            Assert.assertEquals(size,3);
            
    }
}
