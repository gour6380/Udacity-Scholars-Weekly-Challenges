package com.slack.weeklychallengeone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.slack.weeklychallengeone.Utils.Model;
import com.slack.weeklychallengeone.Utils.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> mArrayList;
    private MyAdapter mAdapter;
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        loadData();

    }

    private void initViews(){
        mRecyclerView = findViewById(R.id.recyler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void loadData(){

        mArrayList = new ArrayList<>();

        mArrayList.add(new Model("Constraint Layout","ConstraintLayout allows you to create large and complex layouts with a flat view hierarchy (no nested view groups). It's similar to RelativeLayout in that all views are laid out according to relationships between sibling views and the parent layout, but it's more flexible than RelativeLayout and easier to use with Android Studio's Layout Editor.","https://developer.android.com/training/constraint-layout/index.html"));
        mArrayList.add(new Model("Linear Layout","LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally. You can specify the layout direction with the android:orientation attribute.","https://developer.android.com/guide/topics/ui/layout/linear.html"));
        mArrayList.add(new Model("Relative Layout","RelativeLayout is a view group that displays child views in relative positions. The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) or in positions relative to the parent RelativeLayout area (such as aligned to the bottom, left or center).","https://developer.android.com/guide/topics/ui/layout/relative.html"));
        mArrayList.add(new Model("Card View","Apps often need to display data in similarly styled containers. These containers are often used in lists to hold each item's information. The system provides the CardView API as an easy way for you show information inside cards that have a consistent look across the platform. These cards have a default elevation above their containing view group, so the system draws shadows below them. Cards provide an easy way to contain a group of views while providing a consistent style for the container","https://developer.android.com/guide/topics/ui/layout/cardview.html"));
        mArrayList.add(new Model("Scroll Views","A view group that allows the view hierarchy placed within it to be scrolled. Scroll view may have only one direct child placed within it. To add multiple views within the scroll view, make the direct child you add a view group, for example LinearLayout, and place additional views within that LinearLayout.\n" +
                "Scroll view supports vertical scrolling only. For horizontal scrolling, use HorizontalScrollView instead.","https://developer.android.com/reference/android/widget/ScrollView.html"));
        mArrayList.add(new Model("Grid View","GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. The grid items are automatically inserted to the layout using a ListAdapter.","https://developer.android.com/guide/topics/ui/layout/gridview.html"));

        mAdapter = new MyAdapter(mArrayList,MainActivity.this);
        mRecyclerView.setAdapter(mAdapter);

    }

}
