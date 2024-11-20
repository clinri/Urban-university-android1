package ru.borisov.firstapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var convertResult: TextView
    lateinit var countResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.input_text_ED)
        convertResult = findViewById(R.id.convert_result_TV)
        countResult = findViewById(R.id.count_symbols_result_TV)
    }

    fun onConvertButtonClick(view: View) {
        val text = editText.text.toString()
        convertResult.text = text.reversed()
        countResult.text = text.count { it != ' ' }.toString()
    }
}