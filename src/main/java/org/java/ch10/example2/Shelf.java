package org.java.ch10.example2;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;

	public Shelf(){
		shelf = new ArrayList<>();
	}

	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount(){
		return shelf.size();
	}
}
