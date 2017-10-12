package main;

import java.util.Comparator;

public class CompareArticleParMarque implements Comparator<Article> {

	@Override
	public int compare(Article a1, Article a2) {
		return a1.getMarque().getNom().compareToIgnoreCase(a2.getMarque().getNom());
	}
	
	

}
