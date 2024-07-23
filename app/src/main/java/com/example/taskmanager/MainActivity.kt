package com.example.taskmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputData: EditText = findViewById(R.id.input_data)
        val buttonOpenCalculator: Button = findViewById(R.id.button_open_calculator)
        val buttonOpenTodoList: Button = findViewById(R.id.button_open_todolist)

        buttonOpenCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("input_data", inputData.text.toString())
            startActivity(intent)
        }

        buttonOpenTodoList.setOnClickListener {
            val intent = Intent(this, TodoListActivity::class.java)
            intent.putExtra("input_data", inputData.text.toString())
            startActivity(intent)
        }
    }
}
