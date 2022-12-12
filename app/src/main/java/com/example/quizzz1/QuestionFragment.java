package com.example.quizzz1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz1.databinding.FragmentQuestionBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class QuestionFragment extends Fragment {
    FragmentQuestionBinding binding;
    private ArrayList<Question> questionList;
    private int questionIndex;
    private int score;
    private final static String QUESTION_INDEX_KEY = "QUESTION_INDEX";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQuestionBinding.inflate(inflater, container, false);
        if(savedInstanceState != null)
            questionIndex = savedInstanceState.getInt(QUESTION_INDEX_KEY);
        else
            questionIndex = 0;
        getQuestionList();
        onClickAnswer();
        return binding.getRoot();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(QUESTION_INDEX_KEY, questionIndex);
    }

    private void getQuestionList() {
        questionList = new ArrayList<>();
        String topicName = QuestionFragmentArgs.fromBundle(getArguments()).getTopicName();
        String level = QuestionFragmentArgs.fromBundle(getArguments()).getLevel();
        questionList = QuestionList.getQuestionList(topicName, level);
        setQuestionList();
    }

    private void setQuestionList() {
        binding.questionTextView.setText(questionList.get(questionIndex).getQuestion());
        binding.progressBar.setProgress(0);
        binding.progressBar.setMax(questionList.size());
        score = 0;
    }

    private void onClickAnswer() {
        binding.trueCardView.setOnClickListener(view -> {
            checkAnswer(true);
        });
        binding.falseCardView.setOnClickListener(view -> {
            checkAnswer(false);
        });
    }

    private void checkAnswer(Boolean userAnswer) {
        if (questionList.get(questionIndex).getQuestionAnswer() == userAnswer) {
            score++;
        }
        updateQuestionText();
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date());
        return date;
    }

    private void updateQuestionText() {
        if(questionIndex < questionList.size() - 1) {
            questionIndex++;
            binding.progressBar.setProgress(questionIndex);
        }
        else {
            //Go to Score Fragment
            int trueAnswer = score;
            int numberOfQuestion = questionList.size();
            String numberOfCorrect = String.valueOf(score) + "/" + String.valueOf(questionList.size());
            String topicName = QuestionFragmentArgs.fromBundle(getArguments()).getTopicName();
            String level = QuestionFragmentArgs.fromBundle(getArguments()).getLevel();
            String date = getDate();
            History item = new History(numberOfCorrect, topicName, level, date);
            HistoryFragment.addHistoryItem(item);
            NavDirections action = QuestionFragmentDirections.actionQuestionFragmentToScoreFragment(trueAnswer, numberOfQuestion, topicName, level);
            Navigation.findNavController(binding.questionLinearLayout).navigate(action);
        }
        binding.questionTextView.setText(questionList.get(questionIndex).getQuestion());
    }
}