package com.caren.androidbasicsproject3

import android.content.Intent
import android.graphics.drawable.Icon
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        fun getTasks(): List<String> {
            val templateTasks = mutableListOf<String>()
            templateTasks.add("Pay Rent")
            templateTasks.add("Get haircut")
            templateTasks.add("Buy mom birthday present")
            templateTasks.add("Water plants")
            return templateTasks
        }
    }

    val tasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        tasks.addAll(getTasks()).toString()
        val adapter = TaskItemAdapter(tasks)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        findViewById<View>(R.id.addTaskButton).setOnClickListener {
            val taskEntryEditTextField = findViewById<EditText>(R.id.taskEntry)

            // Get the new task entered
            val newTask = taskEntryEditTextField.text.toString()
            // Clear the EditText field
            taskEntryEditTextField.text.clear()
            tasks.add(newTask)
            adapter.notifyItemChanged(tasks.size - 1)



                }


            // clickPencil.setOnClickListener {
            //  startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            //  intent.putExtra("task", taskEntryEditTextField.text.toString())
        }
    }







