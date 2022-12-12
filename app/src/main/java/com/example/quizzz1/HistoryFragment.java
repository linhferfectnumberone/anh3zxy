package com.example.quizzz1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz1.databinding.FragmentHistoryBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class HistoryFragment extends Fragment {
    FragmentHistoryBinding binding;
    static ArrayList<History> historyList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        binding.historyFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.historyFragment.setAdapter(new HistoryAdapter(getHistory()));
        return binding.getRoot();
    }

    private ArrayList<History> getHistory() {
        return historyList;
    }
    public static void addHistoryItem(History item) {
        historyList.add(item);
    }
}