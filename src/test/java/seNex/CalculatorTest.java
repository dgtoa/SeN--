package seNex;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal= new Calculator();
		//arrange(fixture) �׽�Ʈ ȯ�� ����
		cal.add(10, 20);
		//act
		assertEquals(30, cal.getResult());
		//assert
		//fail("Not yet implemented");
	}

}
