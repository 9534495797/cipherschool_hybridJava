public class ArrayStudy {
     static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) {
    int size=5;
    int arr[]=new int[size];
    print(arr);
    for(int i=0;i<size;i++){
        arr[i]=i+1;
    }
    print(arr);

    int copyarr[]=new int[2*size];
    for(int i=0;i<size;i++){
        copyarr[i]=arr[i];
    }
    copyarr[5]=5;
    copyarr[6]=6;
    print(copyarr);
   } 
}
