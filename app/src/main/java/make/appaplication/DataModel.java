package make.appaplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class DataModel implements Serializable, Parcelable {

    private String imgUrl = "";
    private String question = "";
    private List<String> options = new ArrayList<>();

    public DataModel() {
    }

    DataModel(String imgUrl, String question, List<String> options) {
        this.imgUrl = imgUrl;
        this.question = question;
        this.options = options;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    protected DataModel(Parcel in) {
        imgUrl = in.readString();
        question = in.readString();
        if (in.readByte() == 0x01) {
            options = new ArrayList<String>();
            in.readList(options, String.class.getClassLoader());
        } else {
            options = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imgUrl);
        dest.writeString(question);
        if (options == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(options);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<DataModel> CREATOR =
            new Parcelable.Creator<DataModel>() {
                @Override
                public DataModel createFromParcel(Parcel in) {
                    return new DataModel(in);
                }

                @Override
                public DataModel[] newArray(int size) {
                    return new DataModel[size];
                }
            };
}