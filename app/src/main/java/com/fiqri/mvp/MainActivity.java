package com.fiqri.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.fiqri.mvp.model.User;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements UserView {

    @BindView(R.id.usrName)
    EditText usrName;
    @BindView(R.id.usrGmail)
    EditText usrGmail;
    @BindView(R.id.btnSubmit)
    Button btnSubmit;
    @BindView(R.id.listView)
    ListView listView;

    UserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new UserPresenter(this);
    }

    @OnClick(R.id.btnSubmit)
    public void onViewClicked() {
        presenter.input(usrName, usrGmail);
    }

    @Override
    public void DataInsert(ArrayList<User> data) {
        Toast.makeText(this, String.valueOf(data.size()), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Error(String error) {
        Toast.makeText(this, error , Toast.LENGTH_SHORT).show();

    }
}
