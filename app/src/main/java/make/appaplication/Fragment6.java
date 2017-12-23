package make.appaplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import static make.appaplication.MainActivity.answer;
import static make.appaplication.MainActivity.checked;
import static make.appaplication.MainActivity.isAnswered;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment6 extends Fragment {


    public Fragment6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_6, container, false);


        RadioGroup rg1  = (RadioGroup) view.findViewById(R.id.radioGroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2) {
                    Toast.makeText(getActivity(), "True", Toast.LENGTH_SHORT).show();
                    checked[1] = true;
                    answer[1] = true;
                } else {
                    checked[1] = true;
                    answer[1] = false;
                }
                isAnswered [1] = true;
            }
        });
        return view;
    }

}
