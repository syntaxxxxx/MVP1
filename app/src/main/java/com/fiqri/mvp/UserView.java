package com.fiqri.mvp;

import com.fiqri.mvp.model.User;

import java.util.ArrayList;

/**
 * Created by fiqri on 22/01/18.
 */

// 4
// Mengantarkan data ke MainActivity
public interface UserView {

    void DataInsert(ArrayList <User> data);

    void Error (String error);
}
