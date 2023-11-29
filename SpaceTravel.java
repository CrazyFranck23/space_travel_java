import java.util.Scanner;

public class SpaceTravel {
	public static final double ROCKET_SPEED_IN_KM_PER_S = 4.0;
	
	public static void main (String[] args) {
		System.out.println("Welcome to the SpaceTravel\n");
		
		do {
			System.out.println("What do you want to do ? [h fot help]");
			Scanner scan = new Scanner(System.in);
			String choice = scan.next();
			
			if (choice.equals("q")) {
				System.out.println("Bye bye !");
				break;
			}
			
			else if (choice.equals("l")) {
				
				Planet[] valuesArray = Planet.values();
				for (int i = 0 ; i < valuesArray.length ; i++) {								
					System.out.println(valuesArray[i]);
				}
			}
			
			else if (choice.equals("h")) {
				System.out.println("l: list the planet");
				System.out.println("h: print this help screen");
				System.out.println("q: quit the program\n");
			}
			
			else {
				System.out.println("Unknomw command ! Type h for help.\n");
			}
		} while (true);
		
		// Ici on test nos nouvelles methodes pour calculer la distance en UA et en KM, le temps de voyages
		/*
		Planet departurePlanet = Planet.MERCURY;
		System.out.println("Mercury to Neptune: "+departurePlanet.distanceInUATo(Planet.NEPTUNE)+" UA");
		System.out.println("Earth to Mars: "+Planet.EARTH.distanceInUATo(Planet.MARS)+" UA");
		
		System.out.println("Mercury to Neptune: "+departurePlanet.distanceInKMTo(Planet.NEPTUNE)+" KM");
		System.out.println("Earth to Mars: "+Planet.EARTH.distanceInKMTo(Planet.MARS)+" KM");
		
		/*
		System.out.println("Mercury to Neptune: "+ departurePlanet.travelTimeInSTo(Planet.NEPTUNE)+" S");
		System.out.println("Earth to Mars: "+Planet.EARTH.travelTimeInSTo(Planet.MARS)+" S"); *../
		

		System.out.println("Mercury to Neptune: "+ departurePlanet.travelTimeInSTo(Planet.NEPTUNE, ROCKET_SPEED_IN_KM_PER_S)+" S");
		System.out.println("Earth to Mars: "+Planet.EARTH.travelTimeInSTo(Planet.MARS, ROCKET_SPEED_IN_KM_PER_S)+" S");
		*/
		
	}
}
