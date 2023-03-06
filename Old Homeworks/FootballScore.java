import java.util.Scanner;

public class FootballScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your goals count");
            int yourGoals = s.nextInt();
            System.out.println("Enter your opponents goals count");
            int opponentGoals = s.nextInt();
            if (yourGoals - opponentGoals > 0){
                count += 3;
            System.out.println(yourGoals + ":" + opponentGoals);
            System.out.println(" +3");}
            else if (yourGoals - opponentGoals == 0) {
                count += 1;
                System.out.println(yourGoals + ":" + opponentGoals);
                System.out.println(" +1");
            }
            else if (yourGoals - opponentGoals < 0){
                System.out.println(yourGoals + ":" + opponentGoals);
                System.out.println("+0");
            }
        }System.out.println("Your Team's points for 10 games are " + count);
    }
}
