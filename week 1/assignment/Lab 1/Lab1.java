public class Lab1 {
    public static void main(String[] args) {
		//ints for random number generators
		int i;
		int h;
		int j;
		int k;
		//creating strings for names, objects, places and things
        String[] names={"Jim ", "Craig ", "Phil Collins"};
		String[] objects={"a rock", "skateboard", "shopper"};
		String[] places={"the mall", "the skate park", "the gamestation"};
		String[] things={"skateboarding", "thinking heavily", "sleep walking"};
		//random number generators
		i=(int) (Math.random() * 3);
		h=(int) (Math.random() * 3);
		j=(int) (Math.random() * 3);
		k=(int) (Math.random() * 3);
		//output for the madlib
        System.out.println("So one day" + " " + names[i] + " " + "was" + " " + things[h] + " " +  "and he tripped over" + " " + objects[j] + " " + "while he was at" + " " + places[k]);
    }
}
