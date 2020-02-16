package ua.lviv.iot.firstLab;

public class Pool {

	public String address;

	public int volume;

	public int maximumNumberOfConcurrentVisitors;

	private int area;

	private String color;

	private static int NumberOfTracks = 5;

	protected int NumberOfJumps;

	protected int depth;
	
	public Pool() {
	
	}

	public Pool(String address, int volume, int maximumNumberOfConcurrentVisitors, int area, String color,
			int numberOfJumps, int depth) {
		this.address = address;
		this.volume = volume;
		this.maximumNumberOfConcurrentVisitors = maximumNumberOfConcurrentVisitors;
		this.area = area;
		this.color = color;
		this.NumberOfJumps = numberOfJumps;
		this.depth = depth;
	}

	public Pool(String address, int volume, int maximumNumberOfConcurrentVisitors, int area) {
        this(address, volume, maximumNumberOfConcurrentVisitors, area, null, 0, 0);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMaximumNumberOfConcurrentVisitors() {
		return maximumNumberOfConcurrentVisitors;
	}

	public void setMaximumNumberOfConcurrentVisitors(int maximumNumberOfConcurrentVisitors) {
		this.maximumNumberOfConcurrentVisitors = maximumNumberOfConcurrentVisitors;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getNumberOfTracks() {
		return NumberOfTracks;
	}

	public static void setNumberOfTracks(int numberOfTracks) {
		NumberOfTracks = numberOfTracks;
	}

	public int getNumberOfJumps() {
		return NumberOfJumps;
	}

	public void setNumberOfJumps(int numberOfJumps) {
		NumberOfJumps = numberOfJumps;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String toString() {
		return "Pool [address=" + address + ", volume=" + volume + ", maximumNumberOfConcurrentVisitors="
				+ maximumNumberOfConcurrentVisitors + ", area=" + area + ", color=" + color + ", NumberOfJumps="
				+ NumberOfJumps + ", depth=" + depth + "]";
	}

	 public static void printStaticField() {
        System.out.println("Static method: " + Pool.NumberOfTracks);

    }
	 
	 public void printField() {
	        System.out.println("Non-static method: " + Pool.NumberOfTracks);

	    }

	 public void resetValues(String address, int volume, int maximumNumberOfConcurrentVisitors, int area, String color,
				int numberOfJumps, int depth) {
			this.address = address;
			this.volume = volume;
			this.maximumNumberOfConcurrentVisitors = maximumNumberOfConcurrentVisitors;
			this.area = area;
			this.color = color;
			this.NumberOfJumps = numberOfJumps;
			this.depth = depth;
		}
}
