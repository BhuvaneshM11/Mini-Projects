package new_package;
import java.util.Random;
public class Dice{
		public  int compute(String roll) {
		Random rd =new Random();
		int z;
		int a;
		z=rd.nextInt(1,7);
		return z;
	}
}
