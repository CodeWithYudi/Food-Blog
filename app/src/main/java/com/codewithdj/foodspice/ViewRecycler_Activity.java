package com.codewithdj.foodspice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codewithdj.foodspice.Adapter.RecipeAdapter;
import com.codewithdj.foodspice.Classes.RecyclerItemClickListener;
import com.codewithdj.foodspice.Models.RecipeModel;

import java.util.ArrayList;

public class ViewRecycler_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recycler_);

        recyclerView = findViewById(R.id.recyclerview);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.samosa , "Chatpata Samosa"));
        list.add(new RecipeModel(R.drawable.sandwich , "Cheese Sandwich"));
        list.add(new RecipeModel(R.drawable.tacossss , "Mexican Tacos"));
        list.add(new RecipeModel(R.drawable.cake , "Pastries"));
        list.add(new RecipeModel(R.drawable.bread , "Garlic Bread"));
        list.add(new RecipeModel(R.drawable.nacho , "Nachos"));
        list.add(new RecipeModel(R.drawable.roll , "Paneer Frankie Roll"));
        list.add(new RecipeModel(R.drawable.momo , "Spicy Momos"));

        RecipeAdapter adapter = new RecipeAdapter(list , this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(this , 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case  0:
                        Intent intent = new Intent(ViewRecycler_Activity.this , ScrollingActivity.class);
                        startActivity(intent);

                        break;

                    case  1:
                        Intent intent1 = new Intent(ViewRecycler_Activity.this , ScrollingActivity2.class);
                        startActivity(intent1);

                        break;

                    case  2:
                        Intent intent2 = new Intent(ViewRecycler_Activity.this , ScrollingActivity3.class);
                        startActivity(intent2);

                        break;

                    case  3:
                        Intent intent3 = new Intent(ViewRecycler_Activity.this , ScrollingActivity4.class);
                        startActivity(intent3);

                        break;

                    case  4:
                        Intent intent4 = new Intent(ViewRecycler_Activity.this , ScrollingActivity5.class);
                        startActivity(intent4);

                        break;

                    case  5:
                        Intent intent5 = new Intent(ViewRecycler_Activity.this , ScrollingActivity6.class);
                        startActivity(intent5);

                        break;

                    case  6:
                        Intent intent6 = new Intent(ViewRecycler_Activity.this , ScrollingActivity7.class);
                        startActivity(intent6);

                        break;

                    case  7:
                        Intent intent7 = new Intent(ViewRecycler_Activity.this , ScrollingActivity8.class);
                        startActivity(intent7);

                        break;

                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}