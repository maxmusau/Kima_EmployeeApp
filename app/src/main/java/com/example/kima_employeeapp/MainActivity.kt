package com.example.kima_employeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        find the button ids
        var post=findViewById<Button>(R.id.btnpost)
        //go to Post Employee
        post.setOnClickListener {
            Toast.makeText(applicationContext,"POST page",Toast.LENGTH_LONG).show()
            val intent =Intent(applicationContext,PostEmployee::class.java)
            startActivity(intent)
        }
        //GET Employee
        var get=findViewById<Button>(R.id.btnget)
        //go to Post Employee
        get.setOnClickListener {
            Toast.makeText(applicationContext,"GET page",Toast.LENGTH_LONG).show()
            val intent =Intent(applicationContext,GetEmployee::class.java)
            startActivity(intent)
        }
        var put=findViewById<Button>(R.id.btnupdate)
        //go to Post Employee
        put.setOnClickListener {
            Toast.makeText(applicationContext,"UPDATE page",Toast.LENGTH_LONG).show()
            val intent =Intent(applicationContext,UpdateEmployee::class.java)
            startActivity(intent)
        }
        var delete=findViewById<Button>(R.id.btndelete)
        //go to Post Employee
        delete.setOnClickListener {
            Toast.makeText(applicationContext,"DELETE page",Toast.LENGTH_LONG).show()
            val intent =Intent(applicationContext,DeleteEmployee::class.java)
            startActivity(intent)
        }

    }
}