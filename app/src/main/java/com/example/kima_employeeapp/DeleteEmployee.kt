package com.example.kima_employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.json.JSONObject

class DeleteEmployee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_employee)
        val id_number=findViewById<EditText>(R.id.id_number)
//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
        val delete=findViewById<Button>(R.id.delete)
        delete.setOnClickListener {
            val body= JSONObject()
            //put the id and salary to the body
            body.put("id_number",id_number.text.toString())
            val helper=ApiHelper(applicationContext)
            val api="https://sofwaredev.pythonanywhere.com/employees"
            helper.delete(api,body)
        }//end of onclick
    }
}