package com.example.taskmanager

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TodoListActivity : AppCompatActivity() {

    private lateinit var todoAdapter: ArrayAdapter<String>
    private val todoList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todolist)

        val data = intent.getStringExtra("input_data")
        val displayData: TextView = findViewById(R.id.display_data)
        displayData.text = data

        val todoInput: EditText = findViewById(R.id.todo_input)
        val addTodoButton: Button = findViewById(R.id.add_todo_button)
        val todoListView: ListView = findViewById(R.id.todo_list)

        todoAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, todoList)
        todoListView.adapter = todoAdapter

        addTodoButton.setOnClickListener {
            val todoItem = todoInput.text.toString()
            if (todoItem.isNotEmpty()) {
                todoList.add(todoItem)
                todoAdapter.notifyDataSetChanged()
                todoInput.text.clear()
            }
        }
    }
}