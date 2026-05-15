package application.socket;

import java.io.PrintWriter;
import java.net.Socket;

public class ERPClient {

    private boolean _packetTelemetryFlag = false;

    public void sendData(String data) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Topology handshake acknowledged");

            PrintWriter writer =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );

            writer.println(data);

            socket.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}