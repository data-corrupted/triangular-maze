import characters.Ansi;

public class Starter {
  public static void main(String[] args) {
    int size = 20;
    TriMaze triMaze = new TriMaze(size);
    Ansi.cls();
    triMaze.print();
  }
}
