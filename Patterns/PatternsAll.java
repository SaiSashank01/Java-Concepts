// rows - outter loops 
// col - inner loops
// 
//if(i ==j)
// if(i <=j)
// if(i>=j)
// if(i + j>= rows -1)
// if(i + j<= rows -1)

// if(i + j != rows-1)


// Number ki iethey 
            //    if(i >=j){.               Same Malli ekkade marchalli
            //         System.out.print(j+1+ " ");
            //     }

// Squre kii iethey 
// if(rows == 0 || rows == 5)

public class PatternsAll {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 0;i<rows;i++){
            for(int j = 0; j<rows; j++){
                if(i!=j){
                    System.out.print("* ");
                }
                else{
                 System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
