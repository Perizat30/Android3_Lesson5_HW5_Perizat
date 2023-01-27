package com.example.android3_lesson5_hw5_perizat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android3_lesson5_hw5_perizat.databinding.ActivityDetailContainerBinding;

public class DetailContainerActivity extends AppCompatActivity {
    ActivityDetailContainerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Basketball basketball=(Basketball) getIntent().getSerializableExtra("basketball");

        DetailFragment detailFragment=new DetailFragment();
        Bundle bundle=new Bundle();

        bundle.putString("name","Basketball");
        bundle.putSerializable("basketball",basketball);
        detailFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.container_view,detailFragment ).commit();
    }
}