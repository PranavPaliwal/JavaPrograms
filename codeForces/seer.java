import java.util.*;

public class ser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine(); // Consume newline character
        HashMap<String, Integer> scores = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = scan.nextLine();
            scores.put(team, scores.getOrDefault(team, 0) + 1);
        }

        String winningTeam = "";
        int maxScore = 0;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winningTeam = entry.getKey();
            }
        }
        
        System.out.println(winningTeam);
    }
}
