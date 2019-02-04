 package com.example.radioactive.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.radioactive.mvp.Model.signInPresenterImpl;
import com.example.radioactive.mvp.Presenter.signInPresenter;
import com.example.radioactive.mvp.View.signInView;

 public class MainActivity extends AppCompatActivity implements signInView {

     private signInPresenter signInPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signInPresenter=new signInPresenterImpl(MainActivity.this);
        signInPresenter.signIn("aa","aa");
    }


     @Override
     public void validationError() {
         Toast.makeText(getApplicationContext(),"ValidationError",Toast.LENGTH_SHORT).show();

     }

     @Override
     public void isSuccess() {

         Toast.makeText(getApplicationContext()," Success",Toast.LENGTH_SHORT).show();
     }

     @Override
     public void signInError() {

         Toast.makeText(getApplicationContext(),"signInError",Toast.LENGTH_SHORT).show();
     }
 }
