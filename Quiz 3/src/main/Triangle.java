package main;

import java.util.Arrays;
import java.lang.Math.*;

public class Triangle extends GeometricObject {
	
	double side1 = 1.0;
	double side2= 1.0;
	double side3= 1.0;
	
	//No arg constructor
	public Triangle(){}
	
	//Three arg constructor
	public Triangle(double side_1, double side_2, double side_3){
		this.side1 = side_1;
		this.side2 = side_2;
		this.side3 = side_3;
	}
	
	//Getters for all attributes
	public double get_side1(){
		return this.side1;
	}
	
	public double get_side2(){
		return this.side2;
	}
	
	public double get_side3(){
		return this.side3;
	}
	public double getPerimeter(){
		double perimeter;
		perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}
	
	
	public double getArea(){
		//Creating array to sort the sides
		double[] side_list = new double[3];
		double height;
		double base;
		
		side_list[0]= this.side1;
		side_list[1]= this.side2;
		side_list[2]= this.side3;
		
		Arrays.sort(side_list);
		
		base = side_list[2];
		
		double temp= base/2;
		
		if(temp > side_list[1]){
			height = Math.sqrt(Math.pow(temp, 2)-Math.pow(side_list[1],2));
		}
		
		else{
			height = Math.sqrt(Math.pow(side_list[1], 2)-Math.pow(temp,2));
		}
		
		double area = temp * height;
		double answer = Math.round(area*100);
		answer = answer/100;
		return answer;
		
	}
	public String ToString(){
		String x;
		x = this.toString();
		return x;
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle(3,4,5);
		double[] side_list = new double[3];
		side_list[1]= tri.get_side1();
		
		//System.out.print(side_list[1]/2);
		System.out.println(tri.getArea());
		System.out.println(tri.getPerimeter());
		System.out.println(tri.ToString());
		}
	}


