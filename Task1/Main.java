public class Main {

	public static void main(String[] args) {
		Team teamA = new Team("A");
		Team teamB = new Team("B");
		Team teamC = new Team("C");
		Team teamD = new Team("D");
		Team teamE = new Team("E");
		Team teamF = new Team("F");

		teamA.setRank(1);
		teamB.setRank(5);
		teamC.setRank(3);
		teamD.setRank(2);
		teamE.setRank(4);
		teamF.setRank(6);

		System.out.println(teamA);
		System.out.println(teamB);
		System.out.println(teamC);
		System.out.println(teamD);
		System.out.println(teamE);
		System.out.println(teamF);
	}
}