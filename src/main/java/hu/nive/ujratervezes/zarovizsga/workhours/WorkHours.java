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
        readFromFile(path);
        WorkDays min = workDays.get(0);
        min = minDay(min);
        return min.getName() + ": " + min.getDate();
    }

    private WorkDays minDay(WorkDays min) {
        for (WorkDays wd : workDays) {
            if (wd.getHours() < min.getHours()) {
                min = wd;
            }
        }
        return min;
    }

    private void readFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tmp = line.split(",");
                workDays.add(new WorkDays(tmp[0], Integer.parseInt(tmp[1]), tmp[2]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file", ioe);
        }
    }
}
