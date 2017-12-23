package make.appaplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


public class QuestionFragment extends Fragment {

    private static final String BUNDLE_EXTRAS_DATA = "data";

    private SimpleDraweeView sdvQuestionImage;
    private TextView tvQuestion;
    private RadioButton radioButton1, radioButton2, radioButton3;

    public static QuestionFragment newInstance(DataModel dataModel) {
        QuestionFragment questionFragment = new QuestionFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_EXTRAS_DATA, dataModel);

        questionFragment.setArguments(bundle);
        return questionFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_question, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sdvQuestionImage = view.findViewById(R.id.sdvQuestionImage);

        tvQuestion = view.findViewById(R.id.tvQuestion);

        radioButton1 = view.findViewById(R.id.radioButton1);
        radioButton2 = view.findViewById(R.id.radioButton2);
        radioButton3 = view.findViewById(R.id.radioButton3);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // get arguments
        DataModel dataModel = null != getArguments() ? (DataModel) getArguments()
                .getParcelable(BUNDLE_EXTRAS_DATA) : null;

        if (null != dataModel) {
            sdvQuestionImage.setImageURI(Uri.parse(dataModel.getImgUrl()));

            tvQuestion.setText(dataModel.getQuestion());

            List<String> optionsList = dataModel.getOptions();
            radioButton1.setText(optionsList.get(0));
            radioButton2.setText(optionsList.get(1));
            radioButton3.setText(optionsList.get(2));
        }
    }

}



