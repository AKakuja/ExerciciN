package com.example.exercicin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScriptAdapter(private val scripts: List<String>) : RecyclerView.Adapter<ScriptAdapter.ScriptViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScriptViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_script, parent, false)
        return ScriptViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScriptViewHolder, position: Int) {
        val script = scripts[position]
        holder.scriptName.text = script
        holder.startButton.setOnClickListener {
            // Handle start script
        }
        holder.stopButton.setOnClickListener {
            // Handle stop script
        }
    }

    override fun getItemCount(): Int = scripts.size

    class ScriptViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val scriptName: TextView = itemView.findViewById(R.id.scriptName)
        val startButton: Button = itemView.findViewById(R.id.startButton)
        val stopButton: Button = itemView.findViewById(R.id.stopButton)
    }
}