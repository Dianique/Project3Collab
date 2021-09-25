package com.caren.androidbasicsproject3

import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TaskItemAdapter(private val tasks: List<String>) : RecyclerView.Adapter<TaskItemAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val summaryTextView = itemView.findViewById<TextView>(R.id.taskName)
        val clickPencil = itemView.findViewById<Button>(R.id.pencil)


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val taskItemView = inflater.inflate(R.layout.item_task, parent, false)
            return RecyclerView.ViewHolder(taskItemView)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val task = tasks.get(position)
            holder.summaryTextView.text = task

            holder.clickPencil.setOnClickListener {
                val context = holder.itemView.context
                val intent = Intent(context, MainActivity::class.java)

                intent.putExtra("task", holder.clickPencil.text.toString())
                intent.putExtra(MainActivity.TASK,holder.clickPencil.text.toString())

                context.startActivity(intent)



           // holder.clickPencil.text = task
            //clickPencil.setOnClickListener {
              //  val context = holder.view.context
            Toast.makeText(this, "hello test", Toast.LENGTH_SHORT).show()
            }
            override fun getItemCount(): Int {
                return tasks.size
            }

        }
    }
}