package com.example.sc.datastorage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sc.datastorage.entities.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntenalStorageActivity extends AppCompatActivity {
    private static final  String FILE_NAME


    @BindView(R.id.username) EditText username;
    @BindView(R.id.address) EditText address;
    @BindView(R.id.gender) EditText gender;
    @BindView(R.id.email) EditText email;
    @BindView(R.id.display) TextView display;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intenal_storage);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.btn_saveToInernalStorage)
    public void onClickTOInternalStorage(View view) {
        User user = new User();
        user.setUsername(username.getText().toString());
        user.setEamil(email.getText().toString());
        user.setGender(gender.getText().toString());
        user.setAddress(address.getText().toString());

        saveToStorage(user);

        Toast.makeText(this,"save click",Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_getuser)
    public void getUserFromInternalStorage(){
        display.setText(readUser());

    }

    public void saveToStorage(User user){

        try{

        OutputStream ous = openFileOutput("store_user.doc", Context.MODE_PRIVATE);
        String data="name :"+user.getUsername()+
                "gener :"+user.getGender()+
                "email :"+user.getEamil()+
                "address :"+user.getAddress();
        ous.write(data.getBytes());

    }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
        e.printStackTrace();
        }
}
public String readUser(){
        InputStream ins=null;
        String data="";
        try{
            ins= openFileInput(FILE_NAME);
            int i=0;
            while ((i = ins.read() != -1)) {

                data =data +(char)i;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();{
                e.printStackTrace();
            }
        }

    }
}
