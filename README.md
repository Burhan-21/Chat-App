# 🗨️ Java Chat Application

A simple **multi-client chat application** built using **Java Sockets**.  
It includes:
- `ChatServer` → Handles multiple clients and broadcasts messages
- `ChatClient` → Connects to the server and allows chatting

---

## 🚀 How to Run

### 1. Compile the programs
Open terminal inside the project folder and run:
```bash
javac ChatServer.java ChatClient.java

#### 2. Start the server
Run the server first: java ChatServer
It will start on port 1234.

### 3. Start clients
Open another terminal window (or tab) and run: java ChatClient
You can open multiple clients and chat between them.

## 💡 Example Usage

Start ChatServer
Open 2-3 ChatClient windows
Type messages in one client → it will appear in all clients

## ⚙️ Customization

Change port in ChatServer.java (default: 1234)
Change server address in ChatClient.java (default: localhost)

## 📚 Concepts Used

Sockets (ServerSocket, Socket) → For client-server communication
Multithreading → Each client handled in its own thread
Streams (BufferedReader, PrintWriter) → For reading/writing messages
Synchronization → Prevents race conditions when multiple clients send messages

## 📝 Notes

Ensure both ChatServer.java and ChatClient.java are in the same folder.
Run the server first before starting any clients.
If running on different machines, replace localhost in ChatClient.java with the server's IP address.
