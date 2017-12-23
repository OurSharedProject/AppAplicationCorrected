
package make.appaplication;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private static final int NUMBER_OF_QUESTIONS = 3;
    static boolean[] answer = new boolean[NUMBER_OF_QUESTIONS];
    static boolean[] checked = new boolean[NUMBER_OF_QUESTIONS];
    static boolean[] isAnswered = new boolean[NUMBER_OF_QUESTIONS];
   /*private float scaleFactor =1f;
    private Scaler s;
    private ScaleListener listener;*/


    private static Button buttonCheckAnswer;

    private ViewPager viewPager;
    private List<Fragment> fragmentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCheckAnswer = (Button) findViewById(R.id.button_check_answers);

       /* listener = new ScaleListener();
        s = new Scaler(getApplicationContext(), listener); */

        viewPager = (ViewPager) findViewById(R.id.fragment_container);



        fragmentList = new ArrayList<>();
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());
        fragmentList.add(new Fragment4());
        fragmentList.add(new Fragment5());
        fragmentList.add(new Fragment6());
        fragmentList.add(new Fragment7());
        fragmentList.add(new Fragment8());
        fragmentList.add(new Fragment9());
        fragmentList.add(new Fragment10());
        fragmentList.add(new Fragment11());
        fragmentList.add(new Fragment12());
        fragmentList.add(new Fragment13());
        fragmentList.add(new Fragment14());
        fragmentList.add(new Fragment15());
        fragmentList.add(new Fragment16());
        fragmentList.add(new Fragment17());
        fragmentList.add(new Fragment18());
        fragmentList.add(new Fragment19());
        fragmentList.add(new Fragment20());
        fragmentList.add(new Fragment21());
        fragmentList.add(new Fragment22());
        fragmentList.add(new Fragment23());
        fragmentList.add(new Fragment24());
        fragmentList.add(new Fragment25());
        fragmentList.add(new Fragment26());
        fragmentList.add(new Fragment27());
        fragmentList.add(new Fragment28());
        fragmentList.add(new Fragment29());
        fragmentList.add(new Fragment30());
        fragmentList.add(new Fragment31());
        fragmentList.add(new Fragment32());
        fragmentList.add(new Fragment33());
        fragmentList.add(new Fragment34());
        fragmentList.add(new Fragment35());
        fragmentList.add(new Fragment36());
        fragmentList.add(new Fragment37());
        fragmentList.add(new Fragment38());
        fragmentList.add(new Fragment39());
        fragmentList.add(new Fragment40());
        fragmentList.add(new Fragment41());
        fragmentList.add(new Fragment42());


        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        final Intent intent = new Intent(MainActivity.this, AnswerActivity.class);




        buttonCheckAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                boolean isAllAnswered = allAnswersChecked();
                Toast.makeText(getApplicationContext(), "isAllAnswered value is: " + isAllAnswered, Toast.LENGTH_SHORT).show();

                if (isAllAnswered) {
                    boolean isGoodAnswer = checkAnswers();
                    Toast.makeText(getApplicationContext(), "isGoodAnswer value is: " + isGoodAnswer, Toast.LENGTH_SHORT).show();

                    if (isGoodAnswer)
                        intent.putExtra("KEY_ANSWER", "Good Answer");
                    else
                        intent.putExtra("KEY_ANSWER", "Wrong Answer");
                } else
                    intent.putExtra("KEY_ANSWER", "You haven't checked all answers");


                startActivity(intent);
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == (NUMBER_OF_QUESTIONS + 38))
                    checkSelected();
                else if (buttonCheckAnswer.getVisibility() == View.VISIBLE)
                    buttonCheckAnswer.setVisibility(View.GONE);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


    public static void checkSelected() {
        for (boolean radioChecked : checked) {
            if (radioChecked) {
                buttonCheckAnswer.setVisibility(View.VISIBLE);
                break;
            }
        }
    }


    private boolean checkAnswers() {
        for (boolean radioAnswer : answer) {
            if (!radioAnswer) {
                return false;
            }
        }
        return true;
    }

    private boolean allAnswersChecked() {
        for (boolean radioAnswer : isAnswered) {
            if (!radioAnswer) {
                return false;
            }
        }
        return true;
    }

/*
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int pointers = event.getPointerCount();

        if (pointers == 2) {

            s.onTouchEvent(event);
        }
        return false;
    }
    class Scaler extends ScaleGestureDetector {
        public Scaler(Context context, OnScaleGestureListener listener) {
            super(context, listener);
        }

        @Override
        public float getScaleFactor() {
            return super.getScaleFactor();
        }
    }




    class ScaleListener implements ScaleGestureDetector.OnScaleGestureListener {

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor *= detector.getScaleFactor();

            if (scaleFactor > 2) scaleFactor = 2;
            else if (scaleFactor < 1.0f) scaleFactor = 1.0f;
            scaleFactor = (scaleFactor * 100) / 100;
            viewPager.setScaleX(scaleFactor);
            viewPager.setScaleY(scaleFactor);
            viewPager.setPivotX(detector.getFocusX());
            viewPager.setPivotY(detector.getFocusY());
            return true;
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector detector) {
        }
    }
        */

}
