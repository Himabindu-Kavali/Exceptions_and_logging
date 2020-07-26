package com.epam.exception_loggings;

public class HouseEstimation {
	public float fullyAutomatedHome(float total_area_of_house)
	{
		float amount;
		amount=2500*total_area_of_house;
		return amount;
	}
	//Method to calculate the estimated house construction cost for a non-automated house
	public float Home(float total_area_of_house,int cost_per_square_feet)
	{
		float amount;
		amount=cost_per_square_feet*total_area_of_house;
		return amount;
	}

}
