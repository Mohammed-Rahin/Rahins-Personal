package com.example.gm.ui.cricket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gm.R;

public class CricketFragment extends Fragment {

    private CricketViewModel cricketViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cricketViewModel =
                ViewModelProviders.of(this).get(CricketViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cricket, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        cricketViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
