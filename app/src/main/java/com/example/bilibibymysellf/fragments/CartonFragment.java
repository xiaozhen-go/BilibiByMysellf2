package com.example.bilibibymysellf.fragments;

import android.support.v7.widget.RecyclerView;

import com.example.bilibibymysellf.R;
import com.example.bilibibymysellf.base.BaseFragment;

public class CartonFragment extends BaseFragment {
    private RecyclerView recyclerView;

    @Override
    public int setIdResource() {
        return R.layout.carton_fragment;
    }

    @Override
    public void loadDate() {

    }

    @Override
    public void initView() {
        recyclerView=getView().findViewById(R.id.carton_recycler_view);

    }

}
