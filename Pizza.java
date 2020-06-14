package chain.cl.col.in.out;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	   private List<String> ingredients;

	    public Pizza(){
	        this.ingredients = new ArrayList<>();
	    }

	    public Pizza(String dough, String salt, String oil){
	        this();
	        if(dough.equals("thin") || dough.equals("thick")) {
	        	this.ingredients.add(dough);
	        }else {
	        	System.err.println("Ingredient error");
	        }
	        if (salt.equals("iodized") || salt.equals("halit")) {
                this.ingredients.add(salt);
            }else {
	            System.err.println("Ingredient error");
            }
            if (oil.equals("sunflower") || oil.equals("olive")) {
                this.ingredients.add(oil);
	        } else {
	            System.err.println("Ingredient error");
	            }
	    }       

	    public Boolean isComplete(){
	        // testing logic
	    	return this.ingredients.size() >= 4;
	    }

	    // CHAINING METHODS
	    public Pizza with(String ingredient){
	    	if(checkIfExists(ingredient)) {
	    		System.err.println("This ingredient has already aded!");
	    	}else {
	    		this.ingredients.add(ingredient);
	    	}
			return this;
	        // expansion logic
	    }

	    public Pizza without(String ingredient){
	        // reduction logic
	    	if (ingredients.indexOf(ingredient) >= 0 && ingredients.indexOf(ingredient) < 3) {
	            System.err.println("You cannot delete the basic ingredients");
	    	}else if (!checkIfExists(ingredient)) {
	            System.err.println("Unknown ingredient");
	    	}else {
	            ingredients.remove(ingredient);
	    	}
	        return this;
	    }
	        // output logic
		public String toString() {
			return "Pizza [ingredients=" + ingredients + "]";
		}  
	    
	    private boolean checkIfExists(String ingredient) {
	    	return this.ingredients.contains(ingredient); 
	    }
       
}
