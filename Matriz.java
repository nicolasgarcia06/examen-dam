public class Matriz {
public static void main(String[] args) {
    int [][]A={
        {2,3,6},
        {5,1,8},
        {1,7,6}
    };
    int [][]B={
        {6,8,1},
        {3,2,8},
        {9,2,1}
    };
    PintarMatriz(A);
   int[][]C= MatrizMayor(A, B);
   System.out.println(C);
}
public static void PintarMatriz(int[][]A){
    for(int i=0;i<A.length;i++){
for(int j=0;j<A[i].length;j++){
    System.out.print(A[i][j]+ " ");
}
System.out.println();
    }
    
}
public static int[][] MatrizMayor(int[][]A,int[][]B){
int[][]C=new int[A.length][A[0].length];
for(int i=0;i<A.length;i++){
for(int j=0;j<A[0].length;j++){
    C[i][j]=Math.max (A[i][j],B[i][j]);
}
}
return C;
}
}
