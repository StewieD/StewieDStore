package util;

import java.util.Random;

public class RandomNumber {
	public static String getRandomNumber() {
	Random random = new Random();
	String s1 = random.nextInt(10)+"";
	String s2 = random.nextInt(10)+"";
	String s3 = random.nextInt(10)+"";
	String s4 = random.nextInt(10)+"";
	String s5 = random.nextInt(10)+"";
	String s6 = random.nextInt(10)+"";
	return s1+s2+s3+s4+s5+s6;}
}
