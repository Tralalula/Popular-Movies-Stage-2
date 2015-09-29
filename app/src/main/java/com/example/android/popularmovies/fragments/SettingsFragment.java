/*
 * Copyright (C) 2015 Tobias
 */

package com.example.android.popularmovies.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.android.popularmovies.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
    }
}