class Clock {
    private int hours;
    private int minutes;

    Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void add(int minutes) {
        this.minutes += minutes;
    }

    @Override
    public String toString() {
        int hours = calculatedHours();
        int minutes = calculatedMinutes();
        return format(hours, minutes);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Clock) {
            Clock clock = (Clock) obj;
            return clock.toString().equals(toString());
        }
        return false;
    }

    private int calculatedHours() {
        int hoursFromMinutes = Math.floorDiv(minutes, 60);
        return Math.floorMod(hours + hoursFromMinutes, 24);
    }

    private int calculatedMinutes() {
        return Math.floorMod(minutes, 60);
    }

    private String format(int hours, int minutes) {
        return String.format("%02d:%02d", hours, minutes);
    }
}