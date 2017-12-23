package make.appaplication;
        import android.support.v4.app.Fragment;                                              //Line 2
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;
        import android.support.v4.app.FragmentStatePagerAdapter;

        import java.util.List;



public class PagerAdapter extends FragmentStatePagerAdapter {                             //Line 3


    List<Fragment> fragmentList;                                                    //Line 4

    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {          //Line 5
        super(fm);                                                                  //Line 6
        this.fragmentList = fragmentList;                                           //Line 7
    }

    @Override
    public Fragment getItem(int position) {                                         //Line 8
        return fragmentList.get(position);                                          //Line 9
    }

    @Override
    public int getCount() {                                                         //Line 10
        return fragmentList.size();                                                 //Line 11
    }
}
