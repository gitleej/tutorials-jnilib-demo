package com.ailee.tutorialsjnilibetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ailee.tutorialsjnilib.PersonInterface;

public class MainActivity extends AppCompatActivity {
    // Used to load the 'yishi' library on application startup.
    static {
        System.loadLibrary("tutorialsjni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test PersonInterface
        PersonInterface personInterface = new PersonInterface();
        personInterface.setName("Zhang San");
        personInterface.setAge(18);
        String name = personInterface.getName();
        int age = personInterface.getAge();
        // 输出姓名和年龄
        Log.e("MainActivity", "Name: " + name + "\tAge: " + age);
    }
}