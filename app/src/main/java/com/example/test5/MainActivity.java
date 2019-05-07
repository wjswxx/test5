package com.example.test5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_go;
    private EditText et_url;
    private String urlHead="http://";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myview_layout);
        initView();
    }



    private void initView() {
        btn_go= (Button) findViewById(R.id.btn_go);
        et_url= (EditText) findViewById(R.id.et_url);
        btn_go.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_go:
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlHead+et_url.getText().toString()));
                Intent choose=Intent.createChooser(intent,"选择一个浏览器");
                startActivity(choose);
                break;
        }
    }
}
