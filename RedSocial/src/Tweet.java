package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Tweet {
	private Tweet Origen;
	private boolean esReTweet;
	private String Text;
	private Usuario owner;
	
	public Tweet (Usuario owner, String text) {
		if (text.length() > 0 || text.length() < 281) {
			this.Text=text;
			this.owner=owner;
		}
		else {
			throw new IllegalArgumentException(" cantidad de caracteres incorrectos");
		}
	}
	
	
