/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

import java.util.Comparator;

public class CompareArticleParModele implements Comparator<Article> {

	@Override
	public int compare(Article a1, Article a2) {
		return a1.getModele().getNom().compareToIgnoreCase(a2.getModele().getNom());
	}
	
	

}
