package make.appaplication;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static make.appaplication.MainActivity.answer;
import static make.appaplication.MainActivity.checked;
import static make.appaplication.MainActivity.isAnswered;



public class Fragment4 extends Fragment {


    public Fragment4() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_4, container, false);


        /*String text = getString(R.string.text_page_1);

        SpannableString ss = new SpannableString(text);
        Drawable dIcon = ContextCompat.getDrawable(getActivity(),R.drawable.nature);
        int rightMargin = dIcon.getIntrinsicWidth() + 10;
        ss.setSpan(new MyLeadingMarginSpan2(3, rightMargin), 0, ss.length(), 0);
        final TextView messageView = (TextView) view.findViewById(R.id.textView3);
        messageView.setText(ss);*/



        RadioGroup rg1  = (RadioGroup) view.findViewById(R.id.radioGroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    Toast.makeText(getActivity(), "True", Toast.LENGTH_SHORT).show();
                    checked[0] = true;
                    answer[0] = true;
                } else {
                    checked[0] = true;
                    answer[0] = false;
                }
                    isAnswered[0] = true;
            }
        });
        return view;

    }

}
