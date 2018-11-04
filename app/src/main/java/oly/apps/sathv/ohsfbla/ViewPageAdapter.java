package oly.apps.sathv.ohsfbla;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sathv on 6/25/2018.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentListtitles = new ArrayList<>();


    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListtitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
         return fragmentListtitles.get(position);
    }

    public void addfragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentListtitles.add(title);
    }
}
