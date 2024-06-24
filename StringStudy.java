public class StringStudy {
    public static void main(String[] args) {
        String name="ankit";
        String name2="satya";
        String name3=new String("amit");
        String name4=new String("vinod");
        System.out.println(name==name2);
        System.out.println(name3==name4);
        //concatenation
        System.out.println(name+name2);
        String st4=name2.concat(name4);
        System.out.println(st4);

        //check equality of valules
        System.out.println(name.equals(name2));
    }
}
