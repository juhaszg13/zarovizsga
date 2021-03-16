package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class WorkHours {
    private List<WorkDays> workDays = new ArrayList<>();

    public String minWork(String s) {
        Path path = Path.of(s);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tmp = line.split(",");
                workDays.add(new WorkDays(tmp[0], Integer.parseInt(tmp[1]), tmp[2]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
        String name = workDays.get(0).getName();
        int hours = workDays.get(0).getHours();
        String date = workDays.get(0).getDate();
        for (int i = 1; i < workDays.size(); i++) {
            if (workDays.get(i).getHours() < hours) {
                hours = workDays.get(i).getHours();
                name = workDays.get(i).getName();
                date = workDays.get(i).getDate();

            }
        }
    return name+": "+date;
    }
}
