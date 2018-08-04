package com.example.naman.sqlintroexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Database database;
    EditText editname,editsurname,editmarks;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new Database(this);
        editname=(EditText)findViewById(R.id.editText);
        editsurname=(EditText)findViewById(R.id.editText2);
        editmarks=(EditText)findViewById(R.id.editText3);
    }
    public void AddData(){
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean isInserted=database.insertData(editname.getText().toString(),
                        editsurname.getText().toString(),
                        editmarks.getText().toString());
                        if (isInserted=true)
                            Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this,"Data Not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
