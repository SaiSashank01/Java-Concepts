
// We Use the Pyramid in the taking of the k also
// int rows = 5;
// for (int i = 0; i < rows; i++) {
//     for (int j = 0; j < rows - i - 1; j++) {
//         System.out.print(" ");
//     }
//     for (int k = 0; k < 2 * i + 1; k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }


// Alternatively we can use the sum and diff also to get the same output
// if(sum >= rows - 1 && diff <= 4 && sum %2 ==0){ 



class patternsPyramid {
    public static void main(String[] args) {
        // int rows = 5;
        int rows = 5;
        int cols = 2 * rows - 1;
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println();
        }
    }

    