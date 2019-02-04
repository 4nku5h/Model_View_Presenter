package com.example.radioactive.mvp.Model;


import android.text.TextUtils;

import com.example.radioactive.mvp.Presenter.signInPresenter;
import com.example.radioactive.mvp.View.signInView;


public class signInPresenterImpl implements signInPresenter {


    private signInView signInView;

    public signInPresenterImpl(signInView signInView){
       this.signInView=signInView;
    }

    @Override
    public void signIn(String username, String password) {

        if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){

        }else if (username.equals("aa")&&password.equals("aa")){
            signInView.isSuccess();
        }
        else signInView.signInError();
    }
}
