package com.example.quizzz1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz1.databinding.FragmentTopicBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class TopicFragment extends Fragment {
    private FragmentTopicBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTopicBinding.inflate(inflater, container, false);
        binding.topicRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.topicRecyclerView.setAdapter(new TopicAdapter(getListTopic()));
        return binding.getRoot();
    }

    private ArrayList<Topic> getListTopic() {
        ArrayList<Topic> listTopic = new ArrayList<>(
                Arrays.asList(
                        new Topic("Địa lý", R.drawable.icon_dl),
                        new Topic("Lịch sử", R.drawable.icon_history),
                        new Topic("Khoa học", R.drawable.image_science),
                        new Topic("Nghệ thuật", R.drawable.art),
                        new Topic("Toán học",R.drawable.icon_math),
                        new Topic("Văn học",R.drawable.icon_lit)

                )
        );
        return listTopic;
    }
}