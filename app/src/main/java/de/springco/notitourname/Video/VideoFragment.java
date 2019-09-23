package de.springco.notitourname.Video;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import de.springco.notitourname.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment implements View.OnClickListener {

    LinearLayout cardVideo1;
    LinearLayout cardVideo2;
    LinearLayout cardVideo3;
    LinearLayout cardVideo4;
    LinearLayout cardVideo5;
    LinearLayout cardVideo6;
    LinearLayout cardVideo7;
    LinearLayout cardVideo8;
    LinearLayout cardVideo9;
    LinearLayout cardVideo10;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_video, container, false);

        cardVideo1 = (LinearLayout) view.findViewById(R.id.cardVideo1);
        cardVideo1.setOnClickListener(this);
        cardVideo2 = (LinearLayout) view.findViewById(R.id.cardVideo2);
        cardVideo2.setOnClickListener(this);
        cardVideo3 = (LinearLayout) view.findViewById(R.id.cardVideo3);
        cardVideo3.setOnClickListener(this);
        cardVideo4 = (LinearLayout) view.findViewById(R.id.cardVideo4);
        cardVideo4.setOnClickListener(this);
        cardVideo5 = (LinearLayout) view.findViewById(R.id.cardVideo5);
        cardVideo5.setOnClickListener(this);
        cardVideo6 = (LinearLayout) view.findViewById(R.id.cardVideo6);
        cardVideo6.setOnClickListener(this);
        cardVideo7 = (LinearLayout) view.findViewById(R.id.cardVideo7);
        cardVideo7.setOnClickListener(this);
        /*cardVideo8 = (LinearLayout) view.findViewById(R.id.cardVideo8);
        cardVideo8.setOnClickListener(this);
        cardVideo9 = (LinearLayout) view.findViewById(R.id.cardVideo9);
        cardVideo9.setOnClickListener(this);
        cardVideo10 = (LinearLayout) view.findViewById(R.id.cardVideo10);
        cardVideo10.setOnClickListener(this);*/

        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.cardVideo1:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 0);
                intent.putExtra("tag", "##Сирия #джихад #Кыргызстан");
                intent.putExtra("title", "Не от нашего имени");
                intent.putExtra("content", "\"Не от нашего имени\" – уникальный региональный ТВ-проект в Центральной Азии, где молодые люди обсуждают проблемы экстремизма. Первый выпуск (из десяти) посвящен южному региону Кыргызстана\n");
                intent.putExtra("url","https://www.facebook.com/groups/2224604507551227/permalink/2602255089786165/");
                startActivity(intent);

                break;
            case R.id.cardVideo2:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 1);
                intent.putExtra("tag", "#Бишкек #молодежь #ИГИЛ");
                intent.putExtra("title", "Не от нашего имени");
                intent.putExtra("content", "Второй выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/615215705542701/"); //Надо поменять
                startActivity(intent);

                break;
            case R.id.cardVideo3:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 2);
                intent.putExtra("tag", "#Кыргызстан #Сирия #терроризм");
                intent.putExtra("title", "Не от нашего имени\n");
                intent.putExtra("content", "Третий выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/1690856301023551/"); //Надо поменять
                startActivity(intent);

                break;
            case R.id.cardVideo4:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 3);
                intent.putExtra("tag", "#Казахстан #Жэзказган #Сирия");
                intent.putExtra("title", "Не от нашего имени\n");
                intent.putExtra("content", "Четвертый выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/2264628780237631/");
                startActivity(intent);

                break;
            case R.id.cardVideo5:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 4);
                intent.putExtra("tag", "#джихад #Казахстан #Сирия");
                intent.putExtra("title", "Не от нашего имени\n");
                intent.putExtra("content", "Пятый выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/1924219907670458/");
                startActivity(intent);

                break;
            case R.id.cardVideo6:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 5);
                intent.putExtra("tag", "#Алматы #Жезказган #Сирия");
                intent.putExtra("title", "Не от нашего имени\n");
                intent.putExtra("content", "Шестой выпуск (из 10) проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/244937702856688/");
                startActivity(intent);
                break;

            case R.id.cardVideo7:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 6);
                intent.putExtra("tag", "");
                intent.putExtra("title", "Не от нашего имени\n");
                intent.putExtra("content","Седьмой выпуск (из 10) проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/475636862948791/");
                startActivity(intent);
                break;

            /*case R.id.cardVideo8:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 7);
                intent.putExtra("tag", "");
                intent.putExtra("title", "Чужая война в Сирии | Не от нашего времени\n");
                intent.putExtra("content", "\"Он мечтал стать архитектором, но уехал в Сирию и стал шахидом\"\n" +
                        "\n" +
                        "Восьмой выпуск (из 10) проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма. Выпуск посвящен Таджикистану, откуда за последние годы около 1300 человек уехали в Сирию и Ирак на так называемый джихад\n");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/1969937456638782/");
                startActivity(intent);
                break;

            case R.id.cardVideo9:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 8);
                intent.putExtra("tag", "");
                intent.putExtra("title", "Таджикистан: вовлечение в \"джихад\" | НЕ ОТ НАШЕГО ИМЕНИ\n");
                intent.putExtra("content", "\"Да, я совершил вероломный поступок, но сделал это ради блага брата\". Шохмурод сдал властям Таджикистана своего младшего брата, который хотел уехать на \"джихад\" в Сирию.\n" +
                        "\n" +
                        "Девятый выпуск (из 10) проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма. Выпуск посвящен Таджикистану, откуда за последние годы около 1300 человек уехали в Сирию и Ирак на так называемый джихад\n");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/1246467928824585/");
                startActivity(intent);
                break;

            case R.id.cardVideo10:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 9);
                intent.putExtra("tag", "#война #Азия #Сирия");
                intent.putExtra("title", "Война в Сирии и насильственный экстремизм | НЕ ОТ НАШЕГО ИМЕНИ\n");
                intent.putExtra("content", "\"Прошу Аллаха, людей, кто знает туда дорогу... Верните мою дочь и внуков из Сирии\"\n" +
                        "\n" +
                        "Заключительный выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма\n");
                intent.putExtra("url","https://www.facebook.com/azattyk/videos/704641786558257/");
                startActivity(intent);
                break;*/
        }
    }
}
