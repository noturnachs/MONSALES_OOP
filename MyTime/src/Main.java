public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(12,59,59,false);
//        Time time2 = new Time(1);
//        Time time3 = new Time();

        System.out.println(time1);

        time1.advanceTime(30);
        time1.display12Hour();
        time1.display24Hour();

        time1.tickByHour();
        time1.display12Hour();
        time1.display24Hour();

        time1.tickByMinute();
        time1.display12Hour();
        time1.display24Hour();

        time1.tickBySecond();
        time1.display12Hour();
        time1.display24Hour();


    }
}