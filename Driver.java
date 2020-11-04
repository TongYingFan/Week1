//Author : Tong Ying Fan
public class Driver{

	public static void main(String [] arg){

		Fish nemo = new Fish();

		nemo.Swim();
		//nemo.color = "red";
		nemo.SetColor("red");
		nemo.Swim();

        Shark  fiery = new Shark();
        fiery.Eat();
        fiery.Swim();
		fiery.SetSharpTeeth(150);
		fiery.Eat();
        
        //***superclass cannot call subclass method***//
		//nemo.Eat();  

		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color= "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();

	}


}