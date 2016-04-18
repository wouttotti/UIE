package com.kneak.wout.kneak;

/**
 * Created by robvangastel on 11/04/16.
 */
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Rob on 27/10/15.
 */
public class HomeFragment extends Fragment {

    private ListView lv;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);

        //lv = (ListView) rootView.findViewById(R.id.list);
//        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
//        toolbar.setTitle("Overview");

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //lv.setAdapter(mAdapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getActivity().getMenuInflater().inflate(R.menu.menu_main, menu);
//
//        MenuItem searchItem = menu.findItem(R.id.menu_item);
//        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = null;
//
//        if (searchItem != null) {
//            searchView = (SearchView) searchItem.getActionView();
//        }
//        if (searchView != null) {
//            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
//        }
//        return super.onCreateOptionsMenu(menu);
//
//    }

    private static String[] dataObjects = new String[]{"Text #1", "Text #2", "Text #3", "Text #1", "Text #2", "Text #3"};

    private BaseAdapter mAdapter = new BaseAdapter() {

        @Override
        public int getCount() {
            return dataObjects.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View retval = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview, null);
//            ImageView img = (ImageView) retval.findViewById(R.id.image);
//            //title.setText(dataObjects[position]);
//
//            BitmapDrawable d = (BitmapDrawable) img.getDrawable();
//            Bitmap b = d.getBitmap();
//            int nh = (int) ( b.getHeight() * (512.0 / b.getWidth()) );
//            Bitmap scaled = Bitmap.createScaledBitmap(b, 512, nh, true);
//            img.setImageBitmap(scaled);
//
            return convertView;
        }

    };
}
