package com.example.kima_employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.json.JSONObject

class UpdateEmployee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_employee)
        //find the ids
        //web application, android projects, data science
        val id_number=findViewById<EditText>(R.id.id_number)
        val salary=findViewById<EditText>(R.id.salary)
        val update=findViewById<Button>(R.id.update)
        update.setOnClickListener {
            val body=JSONObject()
            //put the id and salary to the body
            body.put("id_number",id_number.text.toString())
            body.put("salary",salary.text.toString())
            val helper=ApiHelper(applicationContext)
            val api="https://sofwaredev.pythonanywhere.com/employees"
            helper.put(api,body)
        }//end of onclick
    }
}