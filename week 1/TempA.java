

public class TempA {
	public static void main (String[] args) {
		//f represents tempature in ferenheit
		//c represents tempature in celsius
		int f;
		int c;
		int i;
		//Array for values
		int[] temps={10,37,180,120,100};
		

		//For normal temp conversion
		f=212;
		//convert to celcius
		c=((f-32)*5)/9;
		//display first result
		System.out.println(f + " fahrenheit is " + c + " celsius "); 
		
		
		//random number for F
		f= (int)(Math.random() * 212);
		//Random i number from Array selection
		i=(int) (Math.random()*temps.length);
		//Input for Random Array Number
		f=temps[i];
		//convert to celcius
		c=((f-32)*5)/9;
			//display second result
		System.out.println(f + " fahrenheit is " + c + " celsius "); 
		
	}
}
