package com.tenique.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare variables
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            val message = when (age) {
                36 -> "Princess Diana was a member of the British royal family. She was the first wife of Charles III and mother of Princes William and Harry. She died on 31 August 1997."
                76 -> "Albert Einstein was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time. He died on 18 April 1955."
                55 -> "Julius Caesar is most known for his military strategy, his dictatorship over Rome, and his many reforms for the Roman people. He died on 15 March 44 BC."
                41 -> "Kobe Bean Bryant was an American professional basketball player. He died on 26 January 2020."
                84 -> "Sir Isaac Newton FRS was an English polymath active as a mathematician, physicist, astronomer, alchemist, theologian, and author who was described in his time as a natural philosopher. He died on 31 March 1727."
                96 -> "Elizabeth II was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death on 8 September 2022."
                43 -> "Chadwick Boseman was an American actor known for his portrayals of Jackie Robinson in '42' and James Brown in 'Get on Up'. He died on 28 August 2020."
                20 -> "Jahseh Dwayne Ricardo Onfroy, known professionally as XXXTentacion, was an American rapper and singer-songwriter. He died on 18 June 2018."
                56 -> "Adolf Hitler was an Austrian-born German politician who was the dictator of Nazi Germany from 1933 until his suicide on 30 April 1945."
                27 -> "Amy Jade Winehouse was an English singer and songwriter. She died on 23 July 2011."
                else -> "No famous historic person died at the entered age."
            }

            resultTextView.text = message
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}

