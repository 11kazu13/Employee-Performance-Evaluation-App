package exercise09.test;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise09.Employee;

public class EvaluatedEmployeeTest {

    @Test
    // 正常にrankが変更できるかをテスト
    public void testUpdateRank() {
        Employee emp = new Employee("佐藤", "B");
        emp.setRank("A");
        assertEquals("A", emp.getRank());
    }

    @Test(expected = IllegalArgumentException.class)
    // 無効なランクを設定したときに例外が出るかをテスト
    public void testInvalidRank() {
        Employee emp = new Employee("田中", "B");
        emp.setRank("Z"); // 無効なランク
    }

    @Test
    // 名前の変更が反映されるかをテスト
    public void testNameUpdate() {
        Employee emp = new Employee("鈴木", "C");
        emp.setName("山本");
        assertEquals("山本", emp.getName());
    }
}
