package JavaProgrammes;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayMethods {
    @Test
    public void test() {
        long a[]=new long[3];
        int[] b=new int[]{1,2,3};
        System.out.println(Arrays.stream(b).max());
        System.out.println(Arrays.binarySearch(b,3));
    }
}
