package weapon;

public class Sword implements Cloneable {
	String name;
	int atk;

	public Sword() {
		this.name = "木の棒";
		this.atk = 5;
	}

	public Sword(String name, int atk) {
		this.name = name;
		this.atk = atk;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	// 参照がコピーされないようにSwordクラスでもcloneをオーバーライドする
	// このようなコピーを深いコピーという
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		result.atk = this.atk;
		return result;
	}
}
