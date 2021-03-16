package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

public class DogTypes {
    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        return Arrays.asList("kutya1", "kutya2");
    }
}
