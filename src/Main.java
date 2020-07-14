import job.Hero;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		Hero h2 = h1.clone();
		System.out.println("勇者1:"+ h1.toString());
		System.out.println("勇者2:"+ h2.toString());
		h1.setSword("勇者の剣", 100);
		System.out.println("勇者1に勇者の剣を装備しました");
		System.out.println("勇者1:"+ h1.toString());
		System.out.println("勇者2:"+ h2.toString());
	}
}
