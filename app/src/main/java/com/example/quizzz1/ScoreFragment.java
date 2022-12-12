package com.example.quizzz1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.quizzz1.databinding.FragmentScoreBinding;

public class ScoreFragment extends Fragment {
    FragmentScoreBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentScoreBinding.inflate(inflater, container, false);
        Integer score = ScoreFragmentArgs.fromBundle(getArguments()).getScore();
        Integer numberOfQuestion = ScoreFragmentArgs.fromBundle(getArguments()).getNumberOfQuestion();
        String topicName = ScoreFragmentArgs.fromBundle(getArguments()).getTopicName();
        String level = ScoreFragmentArgs.fromBundle(getArguments()).getLevel();
        binding.scoreNumber.setText(String.valueOf(score) + " / " + String.valueOf(numberOfQuestion));
        binding.finishCardView.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_scoreFragment_to_topicListFragment);
        });
        binding.shareCardView.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Bạn đã trả lời đúng " + String.valueOf(score) + " câu hỏi cấp độ " + level + " ở chủ đề " + topicName);
            startActivity(Intent.createChooser(intent, "Share"));
        });
        return binding.getRoot();
    }
}