import java.util.*;

public class WordMatch{
  private String secret;
  public WordMatch(String word){
    secret = word;
  }
  public int scoreGuess(String guess){
    String temp = secret;
    int count=0;
    while(temp.indexOf(guess)!=-1){
      count++;
      temp = temp.substring(temp.indexOf(guess) +guess.length());
    }
    return guess.length()*guess.length()*count;
  }
  public String findBetterGuess(String guess1,String guess2){
    if(scoreGuess(guess1)>scoreGuess(guess2)){
      return guess1;
    }
    else if (scoreGuess(guess1)<scoreGuess(guess2)){
      return guess2;
    }
    else if (guess1.compareTo(guess2)>=0) return guess1;
    else return guess2;
  }
}
