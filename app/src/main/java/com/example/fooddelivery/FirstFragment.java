package com.example.fooddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fooddelivery.FoodRecommendationFragment;
import com.example.fooddelivery.R;
import com.google.android.material.tabs.TabLayout;

public class FirstFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        viewPager = view.findViewById(R.id.viewPager);
        tabLayout = view.findViewById(R.id.tabLayout);

        setupViewPager();

        return view;
    }

    private void setupViewPager() {
        FoodPagerAdapter adapter = new FoodPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new FoodRecommendationFragment(), "Recommendation 1");
        adapter.addFragment(new FoodRecommendationFragment(), "Recommendation 2");
        adapter.addFragment(new FoodRecommendationFragment(), "Recommendation 3");
        // Add more fragments as needed

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private static class FoodPagerAdapter extends FragmentPagerAdapter {

        private final java.util.List<Fragment> fragmentList = new java.util.ArrayList<>();
        private final java.util.List<String> fragmentTitleList = new java.util.ArrayList<>();

        public FoodPagerAdapter(FragmentManager manager) {
            super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);
        }
    }
}