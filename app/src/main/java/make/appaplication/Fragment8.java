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
public class Fragment8 extends Fragment {


    public Fragment8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_8, container, false);


        RadioGroup rg1 = (RadioGroup) view.findViewById(R.id.radioGroup1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton2) {
                    Toast.makeText(getActivity(), "True", Toast.LENGTH_SHORT).show();
                    checked[2] = true;
                    answer[2] = true;
                } else {
                    checked[2] = true;
                    answer[2] = false;
                }
                isAnswered[2] = true;
            }
        });
        return view;
    }


}
