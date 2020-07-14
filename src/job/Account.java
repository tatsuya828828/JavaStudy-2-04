package job;

// 自然順序付を宣言するためには、Comparableインターフェースを実装する
// このインターフェースを実装するとcompareToメソッドのオーバーライドが強制されることになり事前順序付を宣言することができる
// <>内は、このクラス自身を指定する
public class Account implements Comparable<Account> {
	int number;

	// compareToメソッドは、引数で渡されてきたインスタンスobjと自分自身とを比較し、その大小関係を判定する
	public int compareTo(Account obj) {
		// 自分自身の方がobjよりも小さい場合は負の数を返す
		if(this.number < obj.number) {
			return -1;
		}
		// 自分自身の方がobjよりも大きい場合は正の数を返す
		if(this.number > obj.number) {
			return 1;
		}
		// 自分自身とobjが等しい場合は0を返す
		return 0;
	}
}
