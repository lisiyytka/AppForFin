package com.example.mysecondproject

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_add.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_money.*
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import org.w3c.dom.Comment
import java.sql.Date
//aaaa
class MoneyActivity :AppCompatActivity() {
    private val TAG = "MoneyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money)
        Log.d(TAG, "onCreate")
//        var intent = intent
//        val sumTv = intent.getStringExtra("sum")
//
        val sumCentre = findViewById<TextView>(R.id.sum_centre)

        //suka
        val arrayAdapter = ArrayAdapter.createFromResource(this, R.array.periods,R.layout.spinner_item_period)
        period.adapter = arrayAdapter

        add_income.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            val text = "Доход"
            intent.putExtra("text", text)
            startActivity(intent)
        }

        add_expenses.setOnClickListener {
            val intent = Intent(this, CategoryActivity::class.java)
            startActivity(intent)
        }

        app_settings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}