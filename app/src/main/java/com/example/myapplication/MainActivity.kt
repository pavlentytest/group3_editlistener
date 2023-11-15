package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener (
            object: TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                  //  TODO("Not yet implemented")
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                 //   TODO("Not yet implemented")
                }

                override fun afterTextChanged(p0: Editable?) {
                    if((p0?.length ?: 0) > 0) {
                        binding.textView.text = (p0.toString().toDouble() * 100).toString()
                    } else {
                        binding.textView.text = ""
                    }
                }

            }
        )

    }
}