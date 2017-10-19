/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

import java.util.Comparator;

public class CompareArticleParPrix implements Comparator<Article> {

	@Override
	public int compare(Article a1, Article a2) {
		return  Double.compare(a1.getPrixJourLocation(),a2.getPrixJourLocation());
	}
	
}
