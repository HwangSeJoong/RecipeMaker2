package com.example.user.recipemaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class getRecipeName extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_recipe_name);

        Button addbtn = (Button)findViewById(R.id.add);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId())
                {
                    case R.id.add:
                        //버튼1 눌렀을때
                        Toast.makeText(getRecipeName.this, "재료 선택화면 이동", Toast.LENGTH_SHORT).show();
                        //   startActivity(new Intent(MainActivity.this,AddMyRecipeActivity.class));
                        startActivity(new Intent(getRecipeName.this, AddMyRecipeActivity.class));
                        break;

                }
            }
        };

        addbtn.setOnClickListener(listener);


    }
}
