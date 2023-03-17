package JavaProgrammes;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int len=a.size()-1;
        for(int i=0;i<d;i++){

            int temp=a.get(len);

            for(int j=len;j>0;j--){
                a.set(j,a.get(j-1));
            }
            a.set(0, temp);
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        List<Integer> list=Arrays.asList(1 ,2, 3, 4 ,5);
        List<Integer> result=rotLeft(list,4);
        for(Integer i :result){
            System.out.print(i);
        }
    }
}

