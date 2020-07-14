package job;

public class Hero {
	private String name;
	private int hp, mp;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
	}

	public Hero() {
		this("ひろし");
	}

	// オーバーライドしなければObjectクラスで定義されたtoStringが呼び出されるため意味のわからない文字列が返ってくる
	// そのためオーバーライドして自分が表示したい内容を定義する
	public String toString() {
		return "名前:"+ this.name +"/HP:"+ this.hp +"/MP:"+ this.mp;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 正しい判定が行われるようにequalsをオーバーライド
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if(o instanceof Hero) {
			Hero h = (Hero) o;
			if(this.name == h.name) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		// 適当な初期値を決める(0以外の数字であればなんでも良い)
		int result = 37;
		// 各フィールドの影響を加える
		// ここでの乗数は、奇数かつ素数である31がよく用いられる
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		// 結果を返す
		return result;
	}
}
