package make.appaplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reniek on 2017-09-28.
 */


public class QuestionMainActivity extends AppCompatActivity {

    private static final int NUMBER_OF_QUESTIONS = 3;
    static boolean[] answer = new boolean[NUMBER_OF_QUESTIONS];
    static boolean[] checked = new boolean[NUMBER_OF_QUESTIONS];
    static boolean[] isAnswered = new boolean[NUMBER_OF_QUESTIONS];

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.fragment_container);

        // create your data list
        List<DataModel> dataList = new ArrayList<>();
        List<String> optionsList = new ArrayList<>();
        optionsList.add("Option A");
        optionsList.add("Option B");
        optionsList.add("Option C");
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 1", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 2", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 3", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 4", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 5", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 6", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 7", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 8", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 9", optionsList));
        dataList.add(new DataModel("https://encrypted-tbn0.gstatic.com/images?" +
                "q=tbn:ANd9GcRNsWOKbVXhASu9U_m2SVEW4w7YSbWpbDKqmYEYcvZVTaHMg8u1",
                "Question 10", optionsList));

        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),
                dataList));
    }

    public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {

        private List<DataModel> dataList;

        MyFragmentPagerAdapter(FragmentManager fm, List<DataModel> dataList) {
            super(fm);
            this.dataList = dataList;
        }

        @Override
        public Fragment getItem(int position) {
            return QuestionFragment.newInstance(dataList.get(position));
        }

        @Override
        public int getCount() {
            return dataList.size();
        }
    }
}




