import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import job.Hero;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero("たかし");
		String h = hero.toString();
		System.out.println(h);

		List<Hero> list = new ArrayList<>();
		Hero h1 = new Hero("ミナト");
		list.add(h1);
		System.out.println("ArrayListの要素数:"+ list.size());
		h1 = new Hero();
		h1.setName("ミナト");
		// removeメソッドは、引数と同じものを削除するようにJVMに依頼するメソッド
		// 同じものを探すためにequalsで等価判定を行うがequalsをオーバーライドしていないと
		// 正しい判定が行われないことがある
		list.remove(h1);
		// equalsをオーバーライドしているため同じ情報の勇者が削除されている
		System.out.println("ArrayListの要素数:"+ list.size());

		Set<Hero> set = new HashSet<>();
		Hero h2 = new Hero("たかし");
		set.add(h2);
		System.out.println("HashSetの要素数:"+ set.size());
		h2 = new Hero();
		h2.setName("たかし");
		set.remove(h2);
		// Hash系のコレクションクラスでは、ハッシュ値を利用して等価判定を行う
		// ハッシュ値とは、インスタンスの内容を数値として要約したもの
		// ハッシュ値の条件
		// 等価インスタンスからは、必ず同じハッシュ値が得られること
		// 異なるインスタンスからは、なるべく異なるハッシュ値が得られること
		// つまりハッシュ値が等しい==本当に同じとは限らない
		// Hash系のコレクションクラスで等価判定を行う際には、hashCodeをオーバーライドする必要がある
		System.out.println("HashSetの要素数:"+ set.size());
	}
}
