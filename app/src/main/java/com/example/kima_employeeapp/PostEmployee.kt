package com.example.kima_employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.json.JSONObject

class PostEmployee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_employee)
        var id_number=findViewById<EditText>(R.id.id_number)
        var username=findViewById<EditText>(R.id.username)
        var others=findViewById<EditText>(R.id.others)
        var salary=findViewById<EditText>(R.id.salary)
        var department=findViewById<EditText>(R.id.department)
        var save=findViewById<Button>(R.id.save)
        save.setOnClickListener {
            val body=JSONObject()
            body.put("id_number",id_number.text.toString())
            body.put("username",username.text.toString())
            body.put("others",others.text.toString())
            body.put("salary",salary.text.toString())
            body.put("department",department.text.toString())
            val api="https://sofwaredev.pythonanywhere.com/employees"
            //access the api helper
            val helper=ApiHelper(applicationContext)
            //Trigget the post function in the APiHelper class
            helper.post(api,body)
            //androidmanifests internet permission
        }

    }
}