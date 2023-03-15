package homework;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1=new MyDate(30,03,2022);
        MyDate myDate2=new MyDate(30,03,2022);
        System.out.println(myDate1==myDate2);
        System.out.println(myDate1.equals(myDate2));
        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());

    }
    /*false
      true
      60736
      60736
    */
}
