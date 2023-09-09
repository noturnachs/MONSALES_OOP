public class Time {
    private int hour;
    private int minute;
    private int second;
    private boolean meridian;

    public Time() {
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
        this.meridian = true;
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
        this.meridian = true;
    }

    public Time(int hour, int minute, int second, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {
        this.second += seconds;
        if (this.second > 59) {
            this.minute += this.second / 60;
            this.second %= 60;
            if (this.minute > 59) {
                this.hour += this.minute / 60;
                this.minute %= 60;
            }
        }

        System.out.printf("\n\nAdvanced Time: %d seconds\n", seconds);
    }

    public void tickByHour() {
        this.hour += 1;
        if (this.hour == 13) {
            this.hour = 1;
        }
        System.out.println("\n\nTick by 1 Hour.");
    }

    public void tickByMinute() {
        this.minute += 1;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour += 1;
            if (this.hour == 13) {
                this.hour = 1;
            }
        }
        System.out.println("\n\nTick by 1 Minute.");
    }

    public void tickBySecond() {
        this.second += 1;
        if (this.second == 60) {
            this.second = 0;
            this.minute += 1;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour += 1;
                if (this.hour == 13) {
                    this.hour = 1;
                }
            }
        }
        System.out.println("\n\nTick by 1 Second.");
    }

    public void display12Hour() {
        System.out.println("\n12-HOUR TIME:");
        String period = meridian ? "AM" : "PM";
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        System.out.printf("%02d:%02d:%02d %s", displayHour, this.minute, this.second, period);
    }

    public void display24Hour() {
        System.out.println("\n24-HOUR TIME:");
        System.out.printf("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    @Override
    public String toString() {
        return String.format("\nCURRENT TIME: %02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}