package com.example.kima_employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import org.json.JSONArray

class GetEmployee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_employee)
        //find ids
        val progressbar=findViewById<ProgressBar>(R.id.progressbar)
        val empdata=findViewById<TextView>(R.id.empdata)
        val helper=ApiHelper(applicationContext) //access the apihelper /loopj
        val api="https://sofwaredev.pythonanywhere.com/employees" //base api url
        //access get function
        helper.get(api,object :ApiHelper.CallBack{
            override fun onSuccess(result: String?) {
                val employeeJSONArray=JSONArray(result.toString()) //convert result(employees) into JSONArray
                //inside the JSONArray object we can access get method
//                loop through all the employees/records
                (0 until employeeJSONArray.length()).forEach{
                    //one employee
                    val employee=employeeJSONArray.getJSONObject(it)//it means a single index
                    empdata.append("ID : "+employee.get("id_number")+"\n")
                    empdata.append("Username  : "+employee.get("username")+"\n")
                    empdata.append("Others : "+employee.get("others")+"\n")
                    empdata.append("Salary : "+employee.get("salary")+"\n")
                    empdata.append("Department : "+employee.get("department")+"\n")
                    empdata.append("\n\n")
                } //end of the loop
                progressbar.visibility=View.GONE

            }
        })

    }
}