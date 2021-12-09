package util;

public class Robot {

  public void speak(String text) {
    System.out.println("Domo Arigato, " + text);
  }

  public void jump(int height) {
    System.out.println("I'm jumping: " + height);
  }

  public void move(String direction, double distance){
    System.out.println("Moving " + distance + " metres in direction " + direction);
  }
}
