package application.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ERPServer {

    private boolean _packetTelemetryFlag = false;

    public void startServer() {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server Started");

            while (true) {

                Socket socket = serverSocket.accept();

                System.out.println("Topology handshake acknowledged");

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()
                                )
                        );

                String data = reader.readLine();

                System.out.println("Received Data: " + data);

                socket.close();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}