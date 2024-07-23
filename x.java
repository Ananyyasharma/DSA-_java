

 

public class x {

    public static void setZeros(int matrix[][]) {

        // Write your code here..

        int [] r = new int[matrix.length];

        int [] c = new int[matrix[0].length];

        int i,j;

        for(i=0;i<matrix.length;i++){

          for(j=0;j<matrix[0].length;j++){

            if(matrix[i][j]==0){

              r[i]=1;

              c[j]=1;

            }

          }

          

        } 

        int I,J;

        for(I=0;I<matrix.length;I++){

          for(J=0;J<matrix[0].length;J++){

            if(r[I]==1||c[J]==1){

              matrix[I][J]=0;

            }

          }

          

        } 

     }

 

}