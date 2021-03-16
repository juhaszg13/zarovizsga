package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class WorkDays {
    private String name;
    private int hours;
    private String date;

    public WorkDays(String name, int hours, String date) {
        this.name = name;
        this.hours = hours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public String getDate() {
        return date;
    }
}
