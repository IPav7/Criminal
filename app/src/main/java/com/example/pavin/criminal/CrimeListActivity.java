package com.example.pavin.criminal;

import android.support.v4.app.Fragment;

/**
 * Created by pavin on 06.02.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
