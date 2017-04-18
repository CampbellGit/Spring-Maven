package com.m2i.formation.service;

public class Temperature {
Double celsius;
Double fahrenheit;

public Double getCelsius() {
	return celsius;
}

public void setCelsius(Double celsius) {
	this.celsius = celsius;
}

public Double getFahrenheit() {
	return (celsius * 1.8) +32 ;
}

public void setFahrenheit(Double fahrenheit) {
	this.fahrenheit = fahrenheit;
}


}
