import java.util.Scanner;
public class StringStudy2 {
  public static void main(String[] args) {
    //take string from char array
    char [] arr={'A','N','K','I','T'};
    String stringfromchar=new String(arr);
    System.out.println(stringfromchar);

    //tahe string from char array partially
    char [] arr1={'A','N','K','I','T'};
    String partialstringfromchar=new String(arr1,1,3);
    System.out.println(partialstringfromchar);

    //changing the cases lower and upper
    String name="ankit";
    String fsme="STUDENT";
    System.out.println(name.toUpperCase());
    System.out.println(fsme.toLowerCase());

    //spliting string
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your full name");
    String fullname=sc.nextLine();
    String splitArr[]=fullname.split(" ");
    for(int i=0;i<splitArr.length;i++){
        System.out.println(splitArr[i]);
    }

    //find index;
    int index=name.indexOf('k');
    System.out.println(index);

    int index1=name.indexOf('s');
    System.out.println(index1);

    //substring
    String string=name.substring(1);
String string1=name.substring(1, 3);
System.out.println(string);
System.out.println(string1);



//
System.out.println(name.charAt(3));

//string to char array
char arr2[]=name.toCharArray();
for(int i=0;i<arr2.length;i++){
    System.out.println(arr2[i]);
}
  }  
}
