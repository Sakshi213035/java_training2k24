import java.util.ArrayList;

public class EvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        int s=0;
        for(int n:list){
            if(n%2==0){
                s+=n;
            }
        }
        System.out.println("sum of all even numbers is "+s);
    }
}
