package com.example.bilibibymysellf.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bilibibymysellf.bean.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFragment extends Fragment {
   public abstract int setIdResource();
    protected List<Animal> animals=new ArrayList<>();
    private  View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(setIdResource(),container,false);
        this.view=view;
        loadDate();
        initView();
        return view;
    }
    public abstract void loadDate();
    public View getView(){
        return view;
    }
    public abstract void initView();


}
