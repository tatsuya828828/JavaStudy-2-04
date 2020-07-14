import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import job.Account;

public class Main {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		// sortメソッドを用いると要素を並び替えることができる
		// しかし何を基準にして並び替えるのかを定義しておかなければエラーが発生する
		// なので、クラスに自然順序付けを定義する
		// 自然順序付とは、一般的に想定される並べ順のこと
		Collections.sort(list);
	}
}
