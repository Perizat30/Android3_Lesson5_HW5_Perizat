package com.example.android3_lesson5_hw5_perizat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.android3_lesson5_hw5_perizat.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{
    ActivityMainBinding binding;
    BasketballAdapter adapter;
    ArrayList <Basketball> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fillList();
        adapter=new BasketballAdapter(arrayList,this);
        binding.recyclerviewBasketball.setAdapter(adapter);
    }

    private void fillList() {
        arrayList=new ArrayList();
        arrayList.add(new Basketball("№1 «Чикаго Буллз» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-10-5.jpg",
                "сезон 1995-96"));
        arrayList.add(new Basketball("№2 «Чикаго Буллз»» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-10-5.jpg",
                "сезон 1996-97"));
        arrayList.add(new Basketball("№3 «Лос-Анджелес Лэйкерс»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-8-7.jpg",
                "сезон 1971-72"));
        arrayList.add(new Basketball("№4 «Филадельфия Севенти Сиксерс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-7-6.jpg",
                "сезон 1966-67"));
        arrayList.add(new Basketball("№5 «Бостон Селтикс» ",
                " https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-6-6.jpg",
                "1972-73"));
        arrayList.add(new Basketball("№6 «Даллас Маверикс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-5-6.jpg",
                "сезон 2006-07"));
        arrayList.add(new Basketball("№7 «Лос-Анджелес Лэйкерс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-4-1-8.jpg",
                "сезон 1990-00"));
        arrayList.add(new Basketball("№8 «Чикаго Буллз»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-3-1-10.jpg",
                "сезон 1991-92"));
        arrayList.add(new Basketball("№9 «Бостон Селтикс»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-2.jpg",
                "сезон 1985-86"));
        arrayList.add(new Basketball("№10 «Голден Стэйт Уорриорз»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-1-1-31.jpg",
                "сезон 2014-15"));
    }


    @Override
    public void OnClick(Basketball basketball) {
        Intent intent=new Intent(MainActivity.this,DetailContainerActivity.class);
        intent.putExtra("basketball",basketball);
        startActivity(intent);
    }
}