package com.rajendra.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.descOne);

        Bundle bundle = getIntent().getExtras();
        int name = bundle.getInt("imageOne");
        String name2 = bundle.getString("desc");
        imageView.setImageResource(name);
        textView.setText(name2);



    }
}