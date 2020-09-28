package com.example.todomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.todomobile.models.Customer;
import com.example.todomobile.models.Employee;
import com.example.todomobile.models.LoginDetails;
import com.example.todomobile.models.WorkOrder;

import org.json.JSONException;

public class MainActivity extends ToDoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public void onDownloadComplete(String results, String message) throws JSONException {

    }
}