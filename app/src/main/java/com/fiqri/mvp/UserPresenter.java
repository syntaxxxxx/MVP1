package com.fiqri.mvp;

import android.widget.EditText;

import com.fiqri.mvp.model.User;

import java.util.ArrayList;

/**
 * Created by fiqri on 22/01/18.
 */

//3
public class UserPresenter {

    UserView model;
    ArrayList<User> data;

    // Constructor
    public UserPresenter(UserView model) {
        this.model = model;
    }

    public void input (EditText name, EditText email){

        //TODO get inputan dari user
        String input1 = name.getText().toString();
        String input2 = email.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()){
            model.Error("Tidak boleh kosong");
        }
        else {

            ArrayList<User> data = new ArrayList<>();

            User user = new User();
            user.setNama(input1);
            user.setEmail(input2);

            data.add(user);

            // Pindahin ke interface
            model.DataInsert(data);
        }
    }
}
