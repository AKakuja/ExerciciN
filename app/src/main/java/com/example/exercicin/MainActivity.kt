package com.example.exercicin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.net.URI

class MainActivity : AppCompatActivity() {

    private lateinit var webSocketClient: MyWebSocketClient
    private lateinit var scriptAdapter: ScriptAdapter
    private val scripts = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        scriptAdapter = ScriptAdapter(scripts)
        recyclerView.adapter = scriptAdapter

        val serverUri = URI("ws://your-server-ip:8080")
        webSocketClient = MyWebSocketClient(serverUri)
        webSocketClient.connect()
    }

    override fun onDestroy() {
        super.onDestroy()
        webSocketClient.close()
    }
}