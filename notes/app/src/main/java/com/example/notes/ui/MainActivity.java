package com.example.notes.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notes.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            // запускаем фрагмент через новый инстанс, передавая туда параметры
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, NoteFragment.newInstance(), "FRAGMENT_TAG")
                    .commit();
        }
    }
}