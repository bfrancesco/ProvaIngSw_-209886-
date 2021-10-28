package unical.it.ProvaIngSw_209886;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListUtil {
	public List<Integer> sort(List<Integer> list , int order ) throws NullPointerException{
		if(list == null) {
			throw new NullPointerException("il parametro list è null");
		}
		if(order == 0) 
			Collections.sort(list);
		else 
			Collections.sort(list , new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
		return list;
	}
}
