package job;

import weapon.Sword;
// クローンによる複製をサポートしていることを外部に対して表明するためにCloneableインターフェースを実装する必要がある
// Cloneableインターフェースは「cloneを実装することによって複製に対応していることを表明する」ためだけに存在している
// そのためメソッドなども何も定義されていない、このような目的で利用する特殊なインターフェースをマーカーインターフェースと呼ぶ
public class Hero implements Cloneable{
	private String name;
	private int hp, mp;
	private Sword sword;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 50;
		this.sword = new Sword();
	}

	public Hero() {
		this("ひろし");
	}

	// オーバーライドしなければObjectクラスで定義されたtoStringが呼び出されるため意味のわからない文字列が返ってくる
	// そのためオーバーライドして自分が表示したい内容を定義する
	public String toString() {
		return "名前:"+ this.name +"/HP:"+ this.hp +"/MP:"+ this.mp +"武器:"+ this.sword.getName();
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

	// cloneメソッドを使うことによってインスタンスの複製が可能
	// Objectクラスで定義しているcloneメソッドは、protectedで宣言されているために外部から呼び出すことができない
	// なので、オーバーライドの際には、publicでオーバーライドして外部から呼び出せるようにする
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		// クローンしなければ、参照がコピーされるのみで全く同じものを代入してしまう
		result.sword = this.sword.clone();
		return result;
	}

	public Sword getSword() {
		return this.sword;
	}

	public void setSword(String name, int atk) {
		this.sword.setName(name);
		this.sword.setAtk(atk);
	}
}
