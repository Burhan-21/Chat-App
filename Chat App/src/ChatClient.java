import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * ChatClient - A simple chat client
 *
 * - Connects to ChatServer (default: localhost, port 1234)
 * - Sends user input messages to the server
 * - Receives broadcast messages from the server
 */
public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost"; // Change if server is on another machine
    private static final int SERVER_PORT = 1234;

    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Connected to chat server");

            // Input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Thread to read messages from server
            new Thread(() -> {
                String message;
                try {
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed");
                }
            }).start();

            // Main thread reads user input and sends to server
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String msg = scanner.nextLine();
                out.println(msg);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
