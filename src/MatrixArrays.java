public class MatrixArrays {


    public static void main(String[] args) {

        // Matrix 3x3 finding lower number

        int[][] a = {{500, -6000, 15}, {-51, 1, 50}, {-15000, -50, -1500}};
        int b = a[0][0];
        int column = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

//                System.out.println(a[i][j]);
                if (b > a[i][j]) {
                    b = a[i][j];
                    column = j;
                }
            }
        }

        int maxNumber = a[0][column];

        for (int i = 0; i < 3; i++) {

            for (int j = column; j == column; j++) {

//                System.out.println(a[i][j]);
                if (maxNumber < a[i][j]) {
                    maxNumber = a[i][j];
                }
            }
        }

        System.out.println(b);
        System.out.println(column);
        System.out.println(maxNumber);



        // Finding lower number in a simple array


//        int[] array = {-1500, 9, -5000, -5, 45, -48, -6000};
//        int b = array[0];
//
//        for( int i = 0; i < array.length - 1; i++ ) {
//
//
//            if (b > array[i + 1]) {
//                b = array[i + 1];
//            }
//
//        }
//        System.out.println(b);
    }
}
