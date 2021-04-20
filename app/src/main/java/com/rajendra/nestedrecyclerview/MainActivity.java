package com.rajendra.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.rajendra.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.rajendra.nestedrecyclerview.model.AllCategory;
import com.rajendra.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we will add some dummy data to our model class

        // here we will add data to category item model class

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

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Hollywood","SEE MORE", categoryItemList));
        allCategoryList.add(new AllCategory("Best of Oscars", "SEE MORE" , categoryItemList2));
        allCategoryList.add(new AllCategory("Movies Dubbed in Hindi", "SEE MORE" , categoryItemList3));
        allCategoryList.add(new AllCategory("Category 4th", "SEE MORE" ,categoryItemList4));
        allCategoryList.add(new AllCategory("Category 5th", "SEE MORE"  ,categoryItemList5));

        setMainCategoryRecycler(allCategoryList);

    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }

    // Hi today we are gonna make a nested recyclerview
    // one is horizontal and 2nd is vertical and we will place then together.
    // before getting started make sure to subscribe and hit the bell icon to get update when i post video.
    // so 1st we will setup verticle recyclerview.
    // so now we will setup a horizontal recyclerview. which having category elements
    // now lets goto the all category Model
    // similarly u can add many types
    // so this tutorial has been completed if u have any question and doubt plz comment
    // see you in the next tutorial
}
