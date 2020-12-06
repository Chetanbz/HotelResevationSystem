package internetbooking;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

public class HotelReservationSystem {
    public static List<Hotel> hotelReservationList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reservation System");
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotelForRegular();
        //hotelReservation.printEntry();
        int [] days = inputDate();
        hotelReservation.calculateTotalPrize( days);
        List<Hotel> myList = null;
        //System.out.println(hotelReservationList);
        myList = hotelReservationList.stream().sorted(Comparator.comparing(Hotel::getTotalPrize))
                .collect(Collectors.toList());
        //System.out.println(myList);
        System.out.println("What you want \n Press 1. Find cheapest best rated hotel \n Press 2 Find Best rated hotel");
        switch (sc.nextInt()){
            case(1):{
                hotelReservation.cheapHotel(myList);
                break;
            }
            case(2):{
                Hotel hotel = hotelReservationList.stream().sorted(Comparator.comparing(Hotel::getRating))
                        .collect(Collectors.toList()).get(2);
                System.out.println(hotel.getHotelName() + " & " + hotel.getTotalPrize());
                break;
            }
        }

    }
    public  void calculateTotalPrize(int [] days){
        for(Hotel entry:hotelReservationList){
            entry.setTotalPrize(days);
        }
    }
    public void cheapHotel(List<Hotel> myList){
        String str ="";
        int rating = myList.get(0).getRating();
        int min = myList.get(0).getTotalPrize();
        for (Hotel i :myList) {
            if (min == i.getTotalPrize()) {
                if(rating <=i.getRating()){
                    str = i.getHotelName() + ", Rating of " + i.getRating();
                }
            }
        }
        System.out.println(str + ", with total rate of " + min );
    }


    public void addHotelForRegular(){
        Hotel leakWood = new Hotel("LeakWood",110,50,3);
        Hotel bridgeWood = new Hotel("BridgeWood",110,50,4);
        Hotel ridgeWood = new Hotel("RidgeWood",220,60,5);
        hotelReservationList.add(leakWood);
        hotelReservationList.add(bridgeWood);
        hotelReservationList.add(ridgeWood);
    }

    public int  size(){
        return hotelReservationList.size();
    }

    public void printEntry() {
        for(Hotel entry:hotelReservationList){
            System.out.println(entry);
        }
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static int[] inputDate(){
        System.out.println("Provide dates ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inputdateArray = input.split(",");
        int weekdays =0;
        int weekends = 0;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate date1 = LocalDate.parse(inputdateArray[0], formatter);
            LocalDate date2 = LocalDate.parse(inputdateArray[1], formatter).plusDays(1);

            int period = (int)ChronoUnit.DAYS.between(date1, date2)  ;
            Date date_1 = new SimpleDateFormat("dd/MM/yyyy").parse(inputdateArray[0]);
            //System.out.println("Period " + period);
            Calendar tCalendar = Calendar.getInstance();
            tCalendar.setTime(date_1);
            int startDay = tCalendar.get(tCalendar.DAY_OF_WEEK);
            //System.out.println("Day is" + startDay);
            weekends = 2*(period/7);
            weekdays = 5*(period/7);
            //System.out.println(weekends+ " " + weekdays);
            for (int i =0; i<period%7; i++){
                int temp = (startDay+i)%7;
                if(temp ==0 | temp ==1){
                    weekends += 1;
                }
                else{
                    weekdays +=1;
                }
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //System.out.println((weekdays+ " "+ weekends));
        int[] arr = {weekdays,weekends};
        return arr;
    }
}
