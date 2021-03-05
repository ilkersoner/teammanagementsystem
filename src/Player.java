
public class Player implements PlayerStatistics{
	private String name, position, nationality;
	private int age, shirtNumber,height,weight;
	
	
	public Player(String name, String position, String nationality, int age, int shirtNumber, int height, int weight) {
		super();
		this.name = name;
		this.position = position;
		this.nationality = nationality;
		this.age = age;
		this.shirtNumber = shirtNumber;
		this.height = height;
		this.weight = weight;
	}
	
	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getShirtNumber() {
		return shirtNumber;
	}
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
