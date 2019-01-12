
public class Bird extends Animal {

	public Bird(int age, String gender, int weightInLbs) {
		super(weightInLbs, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("flapping wings..... ");
	}

}
