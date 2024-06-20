public class MultidArray {
    public static void main(String[] args) {
        int rows=5;
        int col=4;
        int arr[][]=new int[rows][col];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
