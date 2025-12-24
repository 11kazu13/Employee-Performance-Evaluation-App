package exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluationApp {
	public static void main(String[] args) {
		System.out.println("=== 社員評価アプリ ===\n");

		// 社員リストを作成
		ArrayList<Employee> emps = new ArrayList<Employee>();

		Employee emp_1 = new Employee("井納", "S");
		Employee emp_2 = new Employee("田中", "A");

		emps.add(emp_1);
		emps.add(emp_2);

		// 社員一覧の表示
		System.out.println("--- 登録済み社員一覧 ---\n");
		for (Employee emp : emps) {
			emp.showInfo();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("評価ランクを変更したい社員名を入力してください: ");
		String targetName = sc.nextLine();
		System.out.println("新しいランク（S/A/B/C/D）を入力してください: ");
		String newRank = sc.nextLine();
		if (!newRank.equals("S") && !newRank.equals("A") && !newRank.equals("B") && !newRank.equals("C")
				&& !newRank.equals("D")) {
			throw new IllegalArgumentException("入力ランクが不正です");
		}

		boolean isFound = false;
		Employee replaceTargget = null;

		for (Employee emp : emps) {
			if (targetName.equals(emp.getName())) {
				isFound = true;
				replaceTargget = emp;
				break;
			}
		}

		if (isFound == true) {
			replaceTargget.setRank(newRank);
		} else {
			throw new IllegalArgumentException("該当社員が不在です");
		}

		System.out.println("--- 更新後情報 ---\n");

		for (Employee emp : emps) {
			emp.showInfo();
		}

	}
}
