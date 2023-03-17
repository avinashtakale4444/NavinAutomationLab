package JavaProgrammes;


import cucumber.api.java.sl.In;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamApi {
    @Test
    public void evenNumber() {
        List<Integer> list= Arrays.asList(10,34,95,15,45);
        list.stream().filter(x-> x%2==0).forEach(x->System.out.println(x));
    }

    @Test
    public void maxNumber() {
        List<Integer> list= Arrays.asList(10,34,95,15,45);

       list.stream().max(Integer::compare).get();


    }
}
