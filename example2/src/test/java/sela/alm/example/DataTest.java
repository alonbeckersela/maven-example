package sela.alm.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testGetText() {
		Data d = new Data();
		String s = d.getText();
		assertEquals("Hello example2", s);
	}

}
