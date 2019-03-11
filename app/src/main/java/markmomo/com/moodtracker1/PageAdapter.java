package markmomo.com.moodtracker1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by markm On 11/03/2019.
 */
public class PageAdapter extends FragmentPagerAdapter {

    //Array of colors that will be passed to SmileyFragment
    private int[] colors;
    private int mMaintIconsColor;

    //Personalized Constructor
    public PageAdapter(FragmentManager mgr, int[] colors) {
        super(mgr);
        this.colors = colors;
    }
    // Getter
    public int getMainIconsColor() {
        return mMaintIconsColor;
    }

    @Override
    public int getCount() {
        return(5); // 3 - Number of page to show
    }

    @Override
    public Fragment getItem(int position) {
        //get color for MainActivity Icons
        mMaintIconsColor = position;
        //age Content to return
        return(SmileyFragment.newInstance(position, this.colors[position]));
    }
}