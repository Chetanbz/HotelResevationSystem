package internetbooking;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    static Map<String,Hotel> hotelReservationList = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Reservation System");
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotelForRegular();


    }
    public void addHotelForRegular(){
        Hotel leakWood = new Hotel(110,90);
        Hotel bridgeWood = new Hotel(160,60);
        Hotel ridgekWood = new Hotel(220,150);
        hotelReservationList.put("LeakWood",leakWood );
        hotelReservationList.put("BridgeWood",bridgeWood );
        hotelReservationList.put("RidgeWood",ridgekWood );
    }
    public int  size(){
        return hotelReservationList.size();
    }
    public void printEntry() {
        for(Map.Entry<String, Hotel> entry : hotelReservationList.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
