
public interface TeamInterface {
	String name=null;
	Player[] players=new Player[30];
	String[] team=new String[30];
	int p=0;
	Main firstEleven=new Main(11);
	public void addPlayer(Player player);
	public void removePlayer(int shirtNumber);
	public void removePlayer(String name);
	public Player findPlayer(String name);
	public void addFE(Player p);
	public String[] displayFE();
}
