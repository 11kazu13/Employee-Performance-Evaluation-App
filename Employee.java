package exercise09;

// 社員を表すクラス（Personを継承）
public class Employee extends Person {
	private String rank;

	public Employee(String name, String rank) {
		super(name);
		this.rank = rank;
	}

	// 名前と評価ランクを表示する（オーバーライド）
	@Override
	public void showInfo() {
		System.out.printf("社員名: %s, 評価ランク: %s\n", getName(), this.rank);
	}

	// getterとsetter
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}
