package com.itorizon.collection;

import java.util.Comparator;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class SortKeyUsingComparator implements Comparator<Integer> {
	/*
	 *
	 * This class has overridden compare method for Customized sorting order of
	 * TreeMap keys
	 * 
	 */

	/**
	 * 
	 * compare method is overridden method for sorting keys in decending order
	 * 
	 */

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}
