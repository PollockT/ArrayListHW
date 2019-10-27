/*Author: Theodore Pollock
 File name: Main.java
 Email: PollockT@TulsaPreTech.com // Pollock@nsuok.edu
 Date: 10/24/2019 *//*
-----------------------------------------------------------------------------------------------------
*//*
QUESTION 1
*//*
package com.tulsapretech.objectoriented;
import java.util.Random;
public class Main {
    private static final int ROLLERS = 5; // number of "rolls" for RND number = 5
    public static void main(String[] args) {
        rollIntegers();
        System.out.println("\n---------------\n");
        rollDoubles();
        System.out.println("\n---------------\n");
        rollDice();

    }
    public static void rollIntegers(){
        for(int i = 0; i < ROLLERS; i++){
            Random random = new Random() ;
            int integersDisplay = 1 + random.nextInt();
            System.out.println(integersDisplay);

        }
    }
    public static void rollDoubles(){
        for(int i = 0; i < ROLLERS; i++){
            Random random = new Random() ;
            double doublesDisplay = 1 + random.nextDouble();
            System.out.println(doublesDisplay);
        }
    }
    public static void rollDice(){
        final int DICE_SIDES = 6;
        for(int i = 0; i < ROLLERS; i++){
            Random random = new Random() ;
            int dice = 1 + random.nextInt(DICE_SIDES);
            System.out.println(dice);
        }
    }
}
*//*
----------------------------------------------------------------------------------------
*//*
QUESTION 2
package com.tulsapretech.objectoriented;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numberRange = new int[10];
        int[] rolls = new int[10000];
        final int MAX_GENERATE = 10000;
        Random random = new Random();
        for (int i = 0; i < MAX_GENERATE; i++){
            rolls[i] = random.nextInt(10);
        }
        for (int i = 0; i < MAX_GENERATE; i++){
            numberRange[rolls[i]] = numberRange[rolls[i]] + 1;
        }
        System.out.println("The 10,000 randomly generated integers are:> ");
        for (int i = 0; i < 10; i++){
            if (numberRange[i] == 1) {
                System.out.print(i + " occurs " + numberRange[i] + " time: \n");
            } else {
                System.out.print(i + " occurs " + numberRange[i] + " times: \n");
            }
        }
    }
}
*//*
------------------------------------------------------------------------------------
*//*
QUESTION 3
*//*
package com.tulsapretech.objectoriented;
public class Main {
    public static void main(String[] args) {
        int [] firstArray = {0,1,2,3,4,5};
        int [] secondArray = new int[6];
        for(int i = 0; i < firstArray.length; i++){
            System.out.println("firstArray element = " + firstArray[i]);
            secondArray[i] = firstArray[i];
            System.out.println("secondArray element = " + secondArray[i]);
        }
    }
}
*//*
---------------------------------------------------------------------------------
*//*
QUESTION 4
*//*
package com.tulsapretech.objectoriented;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int [] firstArray = {0,1,2,3,4,5};
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        for(int i = 0; i < firstArray.length; i++){
            System.out.println("firstArray element = " + firstArray[i]);
            secondArray.add(i);
            secondArray.set(i, firstArray[i]);
            System.out.println("secondArray element = " + secondArray.get(i));
        }
    }
*//*
-----------------------------------------------------------------------------------
*//*
QUESTION 5
}*//*
package com.tulsapretech.objectoriented;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] firstArray = {0, 1, 2, 3, 4, 5};
        ArrayList<Integer> secondArray = new ArrayList<>();
        int counter = 0;
        Integer Item;
        for (Item = 0; firstArray) {
            System.out.println("The first array's number is " + Item);
            secondArray.add(counter);
            secondArray.set(counter, Item);
            System.out.println("The second array's number is also " + secondArray.get(counter));
            counter++;
        }
    }
}
*//*
---------------------------------------------------------------------------------------
*//*
QUESTION 6
*//*
package com.tulsapretech.objectoriented;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        Random random = new Random();
        final int LOOP_NUMBER = 100;
        final int EVIL_NUMBER = 3;
        final int RANGE_OF_NUMBERS = 10;
        for(int i = 0 ; i < LOOP_NUMBER ; i++){
            firstArrayList.add(random.nextInt(RANGE_OF_NUMBERS));
        }
        System.out.println("The full Array List: "+ firstArrayList);
        int index = firstArrayList.indexOf(EVIL_NUMBER);
        if(index!=-1) {
            firstArrayList.remove(index);
            System.out.println("The position of the first evil 3 is "+ index);
        }
        else{
            System.out.println("No threes were rolled some how??");
        }
        System.out.println("The list after the removal of the first  evil 3: "+ firstArrayList);
    }
}
*/