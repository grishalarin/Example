package OpenDoor;

public class Main {
    public static void main(String[] args) {
        try (OpenDoor door = new OpenDoor()){
            door.swing();
        } catch (Exception e) {
            System.out.println("is there a draft" + e.getClass());

        }finally {
            System.out.println("Ok, i have to put on a sweater");
        }
    }
}
