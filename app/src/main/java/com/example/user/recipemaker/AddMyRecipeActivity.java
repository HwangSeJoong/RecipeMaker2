package com.example.user.recipemaker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddMyRecipeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_my_recipe);

        ImageButton meatbtn = (ImageButton)findViewById(R.id.meat);
        ImageButton fishbtn= (ImageButton)findViewById(R.id.fish);
        ImageButton vegetablebtn = (ImageButton)findViewById(R.id.vegetable);

        View.OnClickListener check = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId())
                {
                    case R.id.meat:
                        //버튼1 눌렀을때
                        Toast.makeText(AddMyRecipeActivity.this, "Meat", Toast.LENGTH_SHORT).show();;
                        break;

                    case R.id.fish:
                        Toast.makeText(AddMyRecipeActivity.this,"fish", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.vegetable:
                        Toast.makeText(AddMyRecipeActivity.this,"vegetable",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        meatbtn.setOnClickListener(check);
        fishbtn.setOnClickListener(check);
        vegetablebtn.setOnClickListener(check);

    }


}
