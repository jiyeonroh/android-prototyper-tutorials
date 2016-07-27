package com.openknowl.tutorials;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // Server
        try {
            // 서버소켓 선언
            ServerSocket serverSocket = new ServerSocket(8000);
            while (true) {
                System.out.println("wait...");
                // 서버소켓으로부터 소켓 객체 가져오기
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress() + "가 접속되었습니다.");
                BufferedReader bufferedReader =
                        new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // 클라이언트로부터 메시지 입력받음
                String clientMessage = bufferedReader.readLine();
                // 입력받은 내용을 서버 콘솔에 출력
                System.out.println("클라이언트가 보내온 내용 : " + clientMessage);

                // 클라이언트에게 보내기 위한 준비
                BufferedWriter bufferedWriter =
                        new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write("Hello world ! ");
                //readLine()으로 읽으므로 한줄끝을 알림
                bufferedWriter.newLine();
                bufferedWriter.flush();
                socket.close();//접속 종료
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}