package refactoring;

public class TennisGame {

  public static String getScore(String player1Name, String player2Name, int score_p1, int m_score2) {
    String score = "";
    int tempScore = 0;
    if (score_p1 == m_score2) {
      score = readEqualScore(score_p1);
    } else if (score_p1 >= 4 || m_score2 >= 4) {
      int minusResult = score_p1 - m_score2;
      if (minusResult == 1) score = "Advantage player1";
      else if (minusResult == -1) score = "Advantage player2";
      else if (minusResult >= 2) score = "Win for player1";
      else score = "Win for player2";
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) tempScore = score_p1;
        else {
          score += "-";
          tempScore = m_score2;
        }
        switch (tempScore) {
          case 0:
            score += "Love";
            break;
          case 1:
            score += "Fifteen";
            break;
          case 2:
            score += "Thirty";
            break;
          case 3:
            score += "Forty";
            break;
        }
      }
    }
    return score;
  }

  public static String readEqualScore(int score) {

    switch (score) {
      case 0:
        return "Love-All";
      case 1:
        return "Fifteen-All";
      case 2:
        return "Thirty-All";
      case 3:
        return "Forty-All";
      default:
        return "Deuce";
    }
  }
}
