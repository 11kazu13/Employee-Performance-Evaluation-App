package exercise09;

// 人を表す基本クラス
public class Person {
	private String name;

	// 引数なしコンストラクタ
	public Person() {
		this.name = "未設定";
	}

	// 引数ありコンストラクタ
	public Person(String name) {
		this.name = name;
	}

	// 名前を表示するメソッド
	public void showInfo() {
		System.out.printf("社員名: %s\n", this.name);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
