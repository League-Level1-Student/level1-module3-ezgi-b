package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack backpack = new Backpack();
		Pencil orange = new Pencil();
		Ruler wood = new Ruler();
		Textbook history = new Textbook();
		backpack.putInBackpack(orange);
		backpack.putInBackpack(wood);
		backpack.putInBackpack(history);
		backpack.goToSchool();
		orange.write("blah blah blah");
		wood.measure();
	}
}
