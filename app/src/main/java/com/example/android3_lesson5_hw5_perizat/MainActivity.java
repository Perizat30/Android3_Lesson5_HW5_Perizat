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
        arrayList.add(new Basketball("№1 «Чикаго Буллз»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-10-5.jpg",
                "сезон 1995-96",
                "В этом году болельщики «Быков» особое внимание проявляли к Майклу Джордону, который вернулся из бейсбола. Ранее величайший баскетболист не смог никого удивить, но в сезоне 1995-96 звезда вновь зажглась. Хорошую работу на пути к чемпионству провели Деннис Родман, Тони Кукоч и команда в целом, в том числе главный тренер. Рекорд не побит до сих пор."));
        arrayList.add(new Basketball("№2 «Чикаго Буллз»» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-10-5.jpg",
                "сезон 1996-97",
                "Баскетбольный клуб изначально шел фаворитом этого сезона, и команда вновь стала самой лучшей в мире, хотя Майкл Джорднон не смог получить MVP, на пути баскетболисты (Быки) сметали всех на своем пути в регулярке и playoff."));
        arrayList.add(new Basketball("№3 «Лос-Анджелес Лэйкерс»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-8-7.jpg",
                "сезон 1971-72",
                "Спустя несколько лет и перейдя в другой клуб, Уилт Чемберлен смог завоевать свое 2е чемпионство, в этом ему помогли Джим Макмиллан, Джеррри Уэст и Гэйла Гудрич. В течение сезона многие ключевые игроки получали травмы и продолжали борьбу, хорошую работу провел тренер Билл Шерман, который смог выжать максимум с каждого баскетболиста. Уставлен уникальный рекорд в 33 победы вряд, который не побит и сегодня."));
        arrayList.add(new Basketball("№4 «Филадельфия Севенти Сиксерс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-7-6.jpg",
                "сезон 1966-67",
                "Большая заслуга в результатах главного тренера Алекса Ханнум, для которого этот сезон стал первым и самым лучшим за все существование клуба. Лидер команды Уилт Чемберлен довел не только до чемпионства, получив 1й свой заслуженный перстень, но и установил личный рекорд по проценту с игры (68%). Хороший сезон провели такие баскетболисты, как Хэл Грир и Чет Уокер."));
        arrayList.add(new Basketball("№5 «Бостон Селтикс» ",
                " https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-6-6.jpg",
                "1972-73",
                "Самая лучшая баскетбольная команда мира по завоеванным титулам НБА, но вот именно в этом сезоне стать чемпионами не получилось, тот самый случай, когда клуб не должен был проигрывать в playoff, но проиграл. Хорошие результаты показали сразу несколько баскетболистов: Дейв Коуэнс, Пол Сайлайс, Джон Чейни и Джон Хавличек (последних трех внесли в символическую сборную сезона). Том Хейнсон в сезоне 1972-73 заслуженно получил титул «Тренер года». Поход к чемпионству прервал БК «Нью-Йорк», который в итоге и завоевал титул."));
        arrayList.add(new Basketball("№6 «Даллас Маверикс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-5-6.jpg",
                "сезон 2006-07",
                "Несмотря на впечатляющие цифры по победам и поражением команда по итогам чемпионство не смогли завоевать. Регулярный сезон был проведен на высшем уровне, клуб сносил всех соперников без особых проблем. А вот далее случился полный провал, возможно, потому что Эвери Джонсон (тренер) дал слишком много отдыха главным игрокам. Самым результативным баскетболистом стал Дирк Новицки, который провел лучший сезон в своей карьере."));
        arrayList.add(new Basketball("№7 «Лос-Анджелес Лэйкерс» ",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-4-1-8.jpg",
                "сезон 1990-00","Сезон для клуба запомнился хорошей игрой Шакила О’Нил, который превосходно показывал себя как в нападении, так и защите. В команде был и знаменитый Кобе Брайант, но восход звезды на олимп произошел чуть позднее, отметились в завоевании титула такие баскетболисты, как Роберт Орри, Деррек Фишер, Рик Фокс. В принципе, вся команда была сыграна, что и привело к чемпионству."));
        arrayList.add(new Basketball("№8 «Чикаго Буллз»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-3-1-10.jpg",
                "сезон 1991-92",
                "Лучшая баскетбольная команда мира сезона 1990-91, завоевав свое первое чемпионство, в следующем сезоне успешно смогли защитить титул. Хорошую игру показал не только Майкл Джордан, став в шестой раз лучшим снайпером НБА, но Скотти Пиппен, набиравший в среднем по 21 очку за 1 матч. Единственный соперник, который доставил определенные проблемы в playoff, «Нью-Йорк», далее проходило все гладко до самого финала."));
        arrayList.add(new Basketball("№9 «Бостон Селтикс»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-2.jpg",
                "сезон 1985-86",
                "В те года команда показывала превосходные показатели, все объяснялось сплоченностью игроков – играли всегда на результат, и к слову практически всегда достигали поставленных целей. Большую работу провел баскетболист Ларри Берд, набиравший в среднем 25.7 очков, для игрока этот сезон стал лучшим в карьере. Хороший вклад внесли так же Билл Уолтон, Кевин Макхейл, Деннис Джонсон, Роберт Пэриш. Чемпионами1985-86 «Бостон Селтикс» стали заслуженно, обыграв БК «Хьюстон» без особых усилий."));
        arrayList.add(new Basketball("№10 «Голден Стэйт Уорриорз»",
                "https://www.kaper.pro/wp-content/uploads/2020/11/%D0%A0%D0%B8%D1%81%D1%83%D0%BD%D0%BE%D0%BA-1-1-31.jpg",
                "сезон 2014-15",
                "В сезоне клуб поставил сразу несколько уникальных результатов, так самая лучшая баскетбольная команда этого года смогла победить 16 вряд, а в домашних играх не проигрывали целых 19 раз. Особо отличился Стефен Карри, который смог установить рекорд по трехочковым очкам, запомнился и Клэй Томпсон, забросивший целых 37 очков за 1 четверть. Баскетболисты «Голден Стэйт Уорриорз» в сезоне 2014-15 взяли титул без особых проблем."));
    }

    @Override
    public void OnClick(Basketball basketball) {
        Intent intent=new Intent(MainActivity.this,DetailContainerActivity.class);
        intent.putExtra("basketball",basketball);
        startActivity(intent);
    }
}