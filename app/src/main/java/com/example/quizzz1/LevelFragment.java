package com.example.quizzz1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz1.databinding.FragmentLevelBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class LevelFragment extends Fragment {
    private FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLevelBinding.inflate(inflater, container, false);
        String topicName = LevelFragmentArgs.fromBundle(getArguments()).getTopicName();
        binding.easyCardView.setOnClickListener(view -> {
            String level = "Dễ";
            NavDirections action = LevelFragmentDirections.actionLevelFragmentToQuestionFragment(topicName, level);
            Navigation.findNavController(view).navigate(action);
        });
        binding.mediumCardView.setOnClickListener(view -> {
            String level = "Trung bình";
            NavDirections action = LevelFragmentDirections.actionLevelFragmentToQuestionFragment(topicName, level);
            Navigation.findNavController(view).navigate(action);
        });
        binding.hardCardView.setOnClickListener(view -> {
            String level = "Khó";
            NavDirections action = LevelFragmentDirections.actionLevelFragmentToQuestionFragment(topicName, level);
            Navigation.findNavController(view).navigate(action);
        });
        return binding.getRoot();
    }
}