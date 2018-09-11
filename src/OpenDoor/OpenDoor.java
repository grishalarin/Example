package OpenDoor;

public class OpenDoor implements AutoCloseable {

    public OpenDoor(){
        System.out.println("The door is open");
    }

    public void swing() throws Exception {
        System.out.println("The door is closing");
        throw new SwingException("Some problems");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Door is closed");
    }
}
