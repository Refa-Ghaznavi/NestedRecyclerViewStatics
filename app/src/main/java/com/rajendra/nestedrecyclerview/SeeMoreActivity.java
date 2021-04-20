package com.rajendra.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.rajendra.nestedrecyclerview.adapter.CategoryItemSeeMoreRecyclerAdapter;
import com.rajendra.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.rajendra.nestedrecyclerview.model.AllCategory;
import com.rajendra.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class SeeMoreActivity extends AppCompatActivity {


    RecyclerView mainCategoryRecycler;
    RecyclerView seeMoreRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    CategoryItemSeeMoreRecyclerAdapter categoryItemSeeMoreRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_more);


        // added in first category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood1,"TextViewTextViewTextView1"));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood2,"TextViewTextViewTextView2"));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood3,"TextViewTextViewTextView3"));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood4,"TextViewTextViewTextView4"));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood5,"TextViewTextViewTextView5"));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood6,"TextViewTextViewTextView6"));

        // added in second category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar1,"TextViewTextViewTextView11"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar2,"TextViewTextViewTextView12"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar3,"TextViewTextViewTextView13"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar4,"TextViewTextViewTextView14"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar5,"TextViewTextViewTextView15"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bestofoscar6,"TextViewTextViewTextView16"));

        // added in 3rd category
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi1,"TextViewTextViewTextView111"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi2,"TextViewTextViewTextView122"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi3,"TextViewTextViewTextView133"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi4,"TextViewTextViewTextView144"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi5,"TextViewTextViewTextView155"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.moviedubbedinhindi6,"TextViewTextViewTextView166"));

        // added in 4th category
        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood1,"TextViewTextViewTextView1111"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood2,"TextViewTextViewTextView1222"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood3,"TextViewTextViewTextView1333"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood4,"TextViewTextViewTextView1444"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood5,"TextViewTextViewTextView1555"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood6,"TextViewTextViewTextView1666"));


        // added in 5th category
        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar1,"TextViewTextViewTextView11111"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar2,"TextViewTextViewTextView12222"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar3,"TextViewTextViewTextView13333"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar4,"TextViewTextViewTextView14444"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar5,"TextViewTextViewTextView15555"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.bestofoscar6,"TextViewTextViewTextView16666"));


        seeMoreRecycler = findViewById(R.id.seeMoreRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        seeMoreRecycler.setLayoutManager(layoutManager);
        categoryItemSeeMoreRecyclerAdapter = new CategoryItemSeeMoreRecyclerAdapter(this, categoryItemList);
        mainCategoryRecycler.setAdapter(categoryItemSeeMoreRecyclerAdapter);

    }

}