package com.example.user.recipemaker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        Button btn2= (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);

        final Intent intent = new Intent(this, AddMyRecipeActivity.class);

      View.OnClickListener listener = new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switch(v.getId())
              {
                  case R.id.button:
                      //버튼1 눌렀을때
                      Toast.makeText(MainActivity.this, "버튼 1 눌렀습니다", Toast.LENGTH_SHORT).show();
                      startActivity(intent);
                      break;

                  case R.id.button2:
                      Toast.makeText(MainActivity.this,"버튼 2 눌렸ㅅ", Toast.LENGTH_SHORT).show();
                      break;

                  case R.id.button3:
                      Toast.makeText(MainActivity.this,"asdf",Toast.LENGTH_SHORT).show();
                      break;
              }
          }
      };

        btn.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);

    }
}
