package com.demo.fragmentdemo.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.fragmentdemo.R;


/**
 * Created by ${momoThree} on 2017/9/15.
 * Title:
 */

public class NewRightFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.new_right_fragment,container,false);
        return  view;
    }
}
