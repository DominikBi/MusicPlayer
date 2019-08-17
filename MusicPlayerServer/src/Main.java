import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.runServer(1337);
    }

    private void runServer(int port) {
        try {
            ServerSocket server = new ServerSocket(port);
            while (true) {
                Socket client = server.accept();
                DataInputStream input = new DataInputStream(client.getInputStream());
                User user = new User();
                user.address = client.getLocalSocketAddress();
                user.name = input.readUTF();
                users.add(user);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
