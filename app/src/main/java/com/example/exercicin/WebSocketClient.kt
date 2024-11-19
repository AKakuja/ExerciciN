package com.example.exercicin

import org.java_websocket.client.WebSocketClient
import org.java_websocket.handshake.ServerHandshake
import java.net.URI

class MyWebSocketClient(serverUri: URI) : WebSocketClient(serverUri) {
    override fun onOpen(handshakedata: ServerHandshake?) {
        // Handle connection open
    }

    override fun onMessage(message: String?) {
        // Handle incoming messages
    }

    override fun onClose(code: Int, reason: String?, remote: Boolean) {
        // Handle connection close
    }

    override fun onError(ex: Exception?) {
        // Handle connection errors
    }
}