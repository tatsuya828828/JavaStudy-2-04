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
}
