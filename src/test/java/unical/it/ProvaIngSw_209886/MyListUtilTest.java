package unical.it.ProvaIngSw_209886;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
	
	@Test(expected = NullPointerException.class)
	public void sortAscNullListException() {
		util = new MyListUtil();
		util.sort(null , 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void sortDescNullListException() {
		util = new MyListUtil();
		util.sort(null , 1);
	}
	
	/*
	 * Stampo prima di ogni test la data e l'ora in cui inizia
	 * Se volessi stampare l'inizio di tutti i test da fare dovrei inserire BeforeClass e il metodo farlo static
	 */
	@Before
	public void stampaOraInizio() {
		System.out.println("Inizio :" + new DateTime().toString());
	}
	
	//Stampo dopo ogni test la data e l'ora in cui è terminato
	//Se volessi stampare la fine di tutti i test fatti dovrei inserire AfterClass e il metodo farlo static
	@After
	public void stampaOraFine() {
		System.out.println("Fine :" + new DateTime().toString());
	}
	
	
}
