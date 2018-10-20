package de.mywork.plugin;


public class Status {
	
	private Gamestates gs = Gamestates.Lobby;


	public Gamestates getGamestate() {
	
	return gs;	
	}
	
	public void setGamestate(Gamestates state) {
		
	gs = state;	
	System.out.println("Gamestatus set to " + getGamestate());
	}

}
