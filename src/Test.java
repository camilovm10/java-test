import java.util.Locale;

public class Test {



    public String toUpper( String text ) {
        return text.toUpperCase().charAt(0) + text.substring(1);
    }


    public static void main(String[] args) {


        int k = 3;

        for(int i = 0; i < 3; i++) {

            for (int j = 1; j <= 1 + i; j++) {
                System.out.print(k);
                System.out.print(" ");
                k += 3;
            }
            System.out.println("");

        }





    }
}
