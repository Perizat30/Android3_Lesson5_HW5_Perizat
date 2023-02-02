package com.example.android3_lesson5_hw5_perizat;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.android3_lesson5_hw5_perizat.databinding.ActivityDetailContainerBinding;
import java.io.Serializable;
import java.util.ArrayList;

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

        bundle.putSerializable("basketball", basketball);
        detailFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.container_view,detailFragment ).commit();
    }



}