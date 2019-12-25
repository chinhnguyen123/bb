package com.example.mvplogindemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.mvplogindemo.databinding.FragmentBinding;

public class Fragment_New extends Fragment {
    FragmentBinding binding;


    public static Fragment_New newInstance() {

        Bundle args = new Bundle();

        Fragment_New fragment = new Fragment_New();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment,container,false);
       // binding.  goi cac thu ra
        return binding.getRoot();
    }
}
