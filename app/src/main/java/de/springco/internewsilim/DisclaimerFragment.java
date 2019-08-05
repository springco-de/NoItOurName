package de.springco.internewsilim;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
        */
public class DisclaimerFragment extends Fragment {

    TextView textViewSpringCode;
    public static final String SPRING_CODE = "Не от нашего имени ©2019 Приложение было разработано при поддержке SpringCode";

    public DisclaimerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_disclaimer, container, false);

        textViewSpringCode = view.findViewById(R.id.text_view_spring_code);

        textViewSpringCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://springco.de"));
                startActivity(intent);
            }
        });

/*        textView4.setText(SPRING_CODE);
        if (textView4 != null){
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }*/
        return view;
    }
}
