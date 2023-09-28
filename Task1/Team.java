import java.util.ArrayList;

public class Team {

	private ArrayList<String> playerNames;
	private String name;
	private int rank;

	public Team(String name) {
		this.playerNames = new ArrayList<String>();
		this.name = name;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String toString() {
		return String.format("Team: %s, Rank: %d", name, rank);
	}
}