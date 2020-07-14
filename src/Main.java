import java.util.ArrayList;
import java.util.List;

import job.Hero;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero("たかし");
		String h = hero.toString();
		System.out.println(h);

		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero("ミナト");
		list.add(h1);
		System.out.println("要素数:"+ list.size());
		h1 = new Hero();
		h1.setName("ミナト");
		// removeメソッドは、引数と同じものを削除するようにJVMに依頼するメソッド
		// 同じものを探すためにequalsで等価判定を行うがequalsをオーバーライドしていないと
		// 正しい判定が行われないことがある
		list.remove(h1);
		// equalsをオーバーライドしていないため同じ情報の勇者が同じと見なされず削除されずに残っている
		System.out.println("要素数:"+ list.size());
	}
}
