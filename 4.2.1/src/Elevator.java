import java.util.PriorityQueue;
import java.util.Queue;

/** @author Stanislav Rakitov in 2021 */
public class Elevator {
  private final Queue<Integer> queue;
  private int totalSeconds;
  private int previousFloor;

  public Elevator() {
    this.queue = new PriorityQueue<>();
    this.totalSeconds = 0;
    this.previousFloor = -1;
  }

  public void addFloor(Integer floorNumber) {
    try {
      queue.add(floorNumber);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printRoute() {
    while (!queue.isEmpty()) {
      Integer floor = queue.poll();
      if (previousFloor != -1) {
        int waitMoveInSeconds = 5;
        int waitDoorsInSeconds = 10;
        totalSeconds += Math.abs(floor - previousFloor) * waitMoveInSeconds;
        totalSeconds += waitDoorsInSeconds;
      } else {
        previousFloor = floor;
      }
      System.out.print("этаж " + floor + (queue.peek() != null ? " -> " : " - этаж 0"));
    }
    System.out.println();
    System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
  }
}
