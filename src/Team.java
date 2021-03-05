
public class Team implements TeamInterface{
	private String name;
	public Player[] players=new Player[30];
	public String[] team=new String[30];
	private int p=0;
	Main firstEleven=new Main(11);
	public Team(String name) {
		super();
		this.name = name;
	}
	public void addPlayer(Player player) {
		/*players[p]=player;
		team[p]=player.getName();
		p++;*/
		for(int i=0;i<team.length;i++) {
			if(team[i]==null) {
				team[i]=player.getName();
				players[i]=player;
				break;
			}			
		}
	}
	public void removePlayer(int shirtNumber) {
		for (int i = 0; i < players.length; i++) {
			if(players[i].getShirtNumber()==shirtNumber) {
				players[i]=null;
				break;
			}
		}
	}
	public void removePlayer(String name) {
		int index=0;
		for (int i = 0; i < team.length; i++) {
			if(team[i].equals(name)) {
				team[i]=null;
				players[i]=null;
                   index=i;
                   break;
			}
		}
		
		if(index!=team.length-1) {
			for (int i = index; i < team.length-1; i++) {
					team[i]=team[i+1];	
					players[i]=players[i+1];

				
			}
		}
		
		
	}
	public Player findPlayer(String name) {
		for (int i = 0; i < players.length; i++) {
			if(players[i].getName()==name) {
				return players[i];
			}	
		}
		return null;
		
	}
	
	public void addFE(Player p) {
		if (!firstEleven.isFull()) {
			firstEleven.enqueue(p);
		}
		
	}
	public String[] displayFE() {
		String[] fe=new String[11];
		int f=0;
		Main temp=new Main(11);
		while(!firstEleven.isEmpty()) {
			fe[f]=((Player) firstEleven.peek()).getName();
			f++;
			temp.enqueue(firstEleven.peek());
			firstEleven.dequeue();
		}
		for (int i = 0; i < f; i++) {
			firstEleven.enqueue(temp.peek());
			temp.dequeue();
		}
		return fe;
	}
}
