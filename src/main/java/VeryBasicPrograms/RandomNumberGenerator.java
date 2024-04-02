package VeryBasicPrograms;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1;
        // this will generate numbers till 6 i.e. 0 to 5
        // hence, +1 is added to get numbers from 1 to 6

        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x +"\n"+ y + "\n"+ z);

    }
}
