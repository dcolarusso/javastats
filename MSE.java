public class MSE {


//generic import code. 
import path 
double[] data = import dataPath; 
import Math


//Full array operations.

//check if array is null.
public static double lengthCheck(double[] data){
	if(data.length == 0) {
		return double.NaN }
	}

//add up all elements within the array
public static double sum(double[]){ 
	double sum = 0;
	lengthCheck(data) 
	for(int i = 0; i < data.length, i++){
			sum += data[i];}
	return sum;
}
//derives arithmetic mean/average
public static double mean(double[] data){ 
	lengthCheck(data);  
	double sum = data.sum(); 
	double mean = sum / data.length;
	return mean; 
}
//obtains the max value within the array. 
public static float maximum(float[] data){ 
	lengthCheck(data) 
	float max = Integer.min_value; 
	for(int i = 0, i < data.length, i++){
		if (data[i] >= max){
			max = data[i];}
		else max = max;} 
	return max; 
}
//obtains the min value within the array. 
public static float minimum(float[] data){ 
	lengthCheck(data); 
	float min = Integer.max_value;
	for(int i = 0, i < data.length; i++){
		if (data[i] <= min}{ 
			min = data[i]; 
		else min = min;}
	return min;}

//derives the sqaured means value for each element in the array.
public static double[] squaredMeans(double[] data){ 
	double mean = data.mean(); 	
	for(int i = 0, i < mean.length, i++){ 
		abs(i - mean) ** 2;}
`	return data 
}	 

//derives the final MSE for the entire array. 
public static double mseFunction(double[] data){
	lengthCheck(data); 
	double[] data = new data; 
	squareMeans(data);  
	aggregate(data);
	agg = ((1/data.length) * agg); 
	return agg;
	}
//derives the variance for a sample.
public static double varSamp(double[] data){
	lengthCheck(data); 
	double avg = mean(data); 
	double sum = 0.0; 
	for (int i = 0; i < data.length; i++){ 
		sum += ((data[i] - avg) ** 2);}
	double var = sum / (data.length - 1);
	return var;
	}
//derives the variance for a population.
public static double varPop(double[] data){
	lengthCheck(data);
	double sum = 0.0;
	double avg = mean(data);
	for(int i = 0; i < data.length; i++){
		sum += ((data[i] - avg)**2);}
	double var = sum / data.length; 
	return var;
	} 
//gives the standard deviation for a sample. 
public static double stdvs(double[] data){
	return Math.sqrt(varSamp);}
}
//gives the standard deviation for a population.
public static double stdvp(double[] data){
	return Math.sqrt(varPop);}


