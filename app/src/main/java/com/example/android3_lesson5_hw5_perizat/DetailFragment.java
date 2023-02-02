package com.example.android3_lesson5_hw5_perizat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android3_lesson5_hw5_perizat.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    FragmentDetailBinding binding;
    Basketball basketball;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentDetailBinding.inflate(getLayoutInflater());
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getFragment();
    }

    private void getFragment() {
        if(getArguments()!=null){
            System.out.println(getArguments().getString("name"));
            Basketball basketball=(Basketball)getArguments().getSerializable("basketball");
            binding.textViewTitleFragment.setText(basketball.getName());
            binding.textViewDescriptionFragment.setText(basketball.getDescription());
            Glide.with(this).load(basketball.getImage()).into(binding.imageViewIconFragment);
        }
    }
}