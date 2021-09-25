package com.caren.androidbasicsproject3
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
private lateinit var editButton: Button
private lateinit var taskChanger: EditText

    override fun onCreate(savedInstanceState: Bundle?) { //Taking the variables created and referenced them by name in our XML files.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editButton = findViewById(R.id.save_button)
        taskChanger = findViewById(R.id.change_task)

      val editTasks= intent?.getStringExtra("task")
       //    taskChanger = "task :" + editTasks.text.toString()
        }
    }


