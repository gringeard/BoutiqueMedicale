/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

import java.util.Comparator;

public class CompareArticleParRef implements Comparator<Article> {

	@Override
	public int compare(Article a1, Article a2) {
		return a1.getReference().compareToIgnoreCase(a2.getReference());
	}
	
	

}
