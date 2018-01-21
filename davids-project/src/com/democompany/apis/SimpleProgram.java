package com.democompany.apis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class SimpleProgram {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo!");
		Chemicals actg = new Chemicals();
		Chemicals g = new Chemicals("g");
		Chemicals a = new Chemicals("a");
		Chemicals t = new Chemicals("t");
		Chemicals c = new Chemicals("c");
		
		TreeSet<Chemicals> collect = new TreeSet<Chemicals>();
		collect.add(actg);
		collect.add(g);
		collect.add(c);
		collect.add(t);
		collect.add(a);
		
		for (Chemicals x : collect){
			System.out.println(x.getName());
		}
		
		
		
	}

}

// create chemical objects, actg (DNA)
// put them in a collection, and sort
