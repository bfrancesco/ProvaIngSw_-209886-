package unical.it.ProvaIngSw_209886;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyListUtilTest {
	private MyListUtil util;
	
	/*
	 * Controllo che la dimensione dell'ArrayList ordinata sia la stessa della lista aspettata,
	 * se è uguale, allora controllo che tutti gli elementi siano nell'ordine corretto
	 * Caso 1: l'ordine è crescente 
	 */
	@Test
	public void ascSortWorks() {
		util = new MyListUtil();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10 , -1, -2, -3, 9, 9,8 ,8 ,7 ,7 , 5 ,6 ,4 ,3 ,2 ,1 ,0));
		ArrayList<Integer> expectedAsc = new ArrayList<Integer>(Arrays.asList(-3, -2, -1, 0 , 1,2 ,3 ,4 ,5 ,6 ,7 ,7 ,8,8 ,9 ,9 ,10));
		ArrayList<Integer> expectedDesc = new ArrayList<Integer>(Arrays.asList(10 ,9 ,9 ,8 ,8 ,7 ,7 ,6 ,5 ,4 ,3 ,2 ,1 ,0 ,-1 ,-2 ,-3));
		List<Integer> obtained = util.sort(list, 0);
		assertEquals(expectedAsc.size(), obtained.size());
		for(int i = 0 ; i<expectedAsc.size();++i) {
			assertEquals(expectedAsc.get(i), obtained.get(i));
		}
	}
	
	// Caso 2 : l'ordine è decrescente
	@Test
	public void descSortWorks(){
		util = new MyListUtil();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10 , -1, -2, -3, 9, 9,8 ,8 ,7 ,7 , 5 ,6 ,4 ,3 ,2 ,1 ,0));
		ArrayList<Integer> expectedDesc = new ArrayList<Integer>(Arrays.asList(10 ,9 ,9 ,8 ,8 ,7 ,7 ,6 ,5 ,4 ,3 ,2 ,1 ,0 ,-1 ,-2 ,-3));
		List<Integer> obtained = util.sort(list, 1);
		assertEquals(expectedDesc.size(), obtained.size());
		for(int i = 0 ; i<expectedDesc.size();++i) {
			assertEquals(expectedDesc.get(i), obtained.get(i));
		}
	}
}
