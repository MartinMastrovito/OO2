
	package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List <Tweet> Tweets;
	private String nom;
	
	
	public Usuario( String nom) {
		super();
		Tweets = new ArrayList<Tweet>();
		this.nom = nom;
	}

	public void elimMen () {
		this.Tweets.clear();
	}

	public List<Tweet> getTweets() {
		return Tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		Tweets = tweets;
	}

	public String getNom() {
		return nom;
	
