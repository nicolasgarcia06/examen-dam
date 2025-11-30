public class Matrizz {
public static void main(String[] args) {
    int[][]A={
{8,6,3},
{2,3,4},
{9,6,5}
    };
    int[][]B={
{1,6,7},
{2,8,0},
{6,2,1}
    };
    int[][] total=MayorMatriz(A,B);
    System.out.println(total);
    PintarMatriz(A);
}
public static int[][] MayorMatriz(int[][]A,int[][]B){
    int[][]C= new int [A.length][A[0].length];
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A[0].length;j++){
C[i][j]=Math.max (A[i][j],B[i][j]);
        }
    }
    return C;
}
public static void PintarMatriz(int[][]A){
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A[0].length;j++){
            System.out.print(A[i][j]+" ");
}
System.out.println();
}
}
}