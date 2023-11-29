public enum Planet {
	MERCURY(0.387, "Mercure"),
	VENUS(0.722, "Venus"),
	EARTH(1.0, "Terre"),
	MARS(1.52, "Mars"),
	JUPITER(5.2, "JUpiter"),
	SATURN(9.58, "Saturne"),
	URANUS(19.2, "Uranus"),
	NEPTUNE(30.1, "Neptune");
	
	public static final double UA_IN_KM = 149597871.0;
	public static final double LIGHT_SPEED_IN_KM_PER_S = 299792.458;
	
	private double meanDistanceFromSun;
	public double getDistanceFromTheSunInAstronomicalUnit() {
		return meanDistanceFromSun;
	}
	
	private String planetNameFrench;
	public String getCommonName() {
		return planetNameFrench;
	}
	
	private Planet(double meanDistanceFromSun, String planetNameFrench) {
		this.meanDistanceFromSun = meanDistanceFromSun;
		this.planetNameFrench = planetNameFrench;
	}
	
	@Override
	public String toString() {
		return planetNameFrench+" ("+meanDistanceFromSun+" UA)";
	}
	
	public double distanceInUATo(Planet otherPlanet) {
    		return (Math.abs(this.meanDistanceFromSun - otherPlanet.meanDistanceFromSun));
    	}
    	
    	public double distanceInKMTo(Planet otherPlanet) {
    		return distanceInUATo(otherPlanet) * UA_IN_KM;
    	}
    	/*
	public double travelTimeInSTo(Planet otherPlanet) {
	    double travelTime = distanceInKMTo(otherPlanet) / LIGHT_SPEED_IN_KM_PER_S;
	    return travelTime;
	} */

	public double travelTimeInSTo(Planet otherPlanet, double speedInKmPerS) {
	    double travelTime = distanceInKMTo(otherPlanet) / speedInKmPerS;
	    return travelTime;
	}
    	
    	
}
