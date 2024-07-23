package com.example.taskmanager

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val data = intent.getStringExtra("input_data")
        val displayData: TextView = findViewById(R.id.display_data)
        displayData.text = data

        val number1: EditText = findViewById(R.id.number1)
        val number2: EditText = findViewById(R.id.number2)
        val result: TextView = findViewById(R.id.result)

        val buttonAdd: Button = findViewById(R.id.button_add)
        val buttonSubtract: Button = findViewById(R.id.button_subtract)
        val buttonMultiply: Button = findViewById(R.id.button_multiply)
        val buttonDivide: Button = findViewById(R.id.button_divide)

        buttonAdd.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 + num2}"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSubtract.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 - num2}"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonMultiply.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 * num2}"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonDivide.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    result.text = "Result: ${num1 / num2}"
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

