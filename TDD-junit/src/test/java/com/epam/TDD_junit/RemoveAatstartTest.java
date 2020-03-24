package com.epam.TDD_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAatstartTest {
	/* 1 2 chars : AB->B
	 * 2 5 chars : BABCA->BABCA
	 * 3 n char  : ABCDEF->BCDEF
	 * 4 1 Char  : A->""
	 * 5 empty char : ""->""
	 * 6 6 char  : IBCDE->IBCDE
	 * 7 small char  : acd->acd
	 * 8 same char : AAAAA->AAAAA
	 * 9 2 char same : AA->""
	 * 10 singleA   : A->""
	 * 11 2 char  : BA->B
	 */
	RemoveAatstart removeAatstart;
	
	@BeforeEach
	void setUp() {
		removeAatstart = new RemoveAatstart();
	}
	@Test
	void test2chars() {
		assertEquals( "B", removeAatstart.removeAatFirst2Index("AB"));
	}
	@Test
	void test5chars() {
		assertEquals("BBCA", removeAatstart.removeAatFirst2Index("BABCA"));
	}
	@Test
	void testnchars() {
		assertEquals("BCDEF", removeAatstart.removeAatFirst2Index("ABCDEF"));
	}
	@Test
	void test1chars() {
		assertEquals("", removeAatstart.removeAatFirst2Index("A"));
	}
	@Test
	void testemptychars() {
		assertEquals("", removeAatstart.removeAatFirst2Index(""));
	}
	@Test
	void test6chars() {
		assertEquals("IBCDE", removeAatstart.removeAatFirst2Index("IBCDE"));
	}
	@Test
	void testsmallchars() {
		assertEquals("acd", removeAatstart.removeAatFirst2Index("acd"));
	}
	@Test
	void testsamechars() {
		assertEquals("AAA", removeAatstart.removeAatFirst2Index("AAAAA"));
	}
	@Test
	void testsame2chars() {
		assertEquals("", removeAatstart.removeAatFirst2Index("AA"));
	}
	@Test
	void testsingleAchars() {
		assertEquals("", removeAatstart.removeAatFirst2Index("A"));
	}
	@Test
	void testBAchars() {
		assertEquals("B", removeAatstart.removeAatFirst2Index("BA"));
	}

	
	

}