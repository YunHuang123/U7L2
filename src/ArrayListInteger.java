import java.util.ArrayList;

public class ArrayListInteger
{
    public static void main(String[] args)
    {
        /*Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);*/


        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(3);

        numList.add(0, 6);

        numList.add(7);

        numList.add(2, 8);

        numList.set(3, 9);

        numList.add(1, 2);

        numList.add(1, numList.size());


        numList.remove(4);

        numList.set(4, 0);


        System.out.println(numList);

    }
}
