import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrli {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> listarr = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            listarr.add(i);
            System.out.println(listarr);

            //removing
            listarr.remove(3);
            System.out.println(listarr);
            //
            for (int j =0; j<= listarr.size(); j++)
                System.out.println(listarr.get(j) + " ");



                }
                
            }


        }




