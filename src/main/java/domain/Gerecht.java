package main.java.domain;

public class Gerecht {
	
	private String nameDish;
	private String sortDish;
	private String descriptionDish;
	private double price;
	private boolean dishReady;
	
	
	public Gerecht(String nameDish, String sortDish, String descriptionDish, double price, boolean dishReady){
		this.nameDish = nameDish;
		this.sortDish = sortDish;
		this.descriptionDish = descriptionDish;
		this.price = price;
		this.dishReady = dishReady;
	}
	
	public String getNameDish(){
		return nameDish;
	}
	
	public void setNameDish(String namedish){
		this.nameDish = namedish;
	}
	
	public String getSortDish(){
		return sortDish;
	}
	
	public void setSortDish(String sortDish){
		this.sortDish = sortDish;
	}
	
	public String getDescriptionDish(){
		return descriptionDish;
	}
	
	public void setDescriptionDish(String descriptionDish){
		this.descriptionDish = descriptionDish;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public boolean getDishReady(){
		return dishReady;
	}
	
	public void setDishReady(boolean dishReady){
		this.dishReady = dishReady;
	}

}
