package main.java.domain;

public class Ingredient {
	
	private String ingredientName;
        
        public Ingredient(String ingredientName){
            this.ingredientName = ingredientName;
        }
        
        
        public String getIngredientName(){
            return ingredientName;
                
        }
            
        public void setIngredientName(String ingredientName){
             this.ingredientName = ingredientName;
        }

}