package com.example.quizzz1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizzz1.databinding.HistoryBinding;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {
    private ArrayList<History> historyList;

    public HistoryAdapter(ArrayList<History> historyList) {
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        HistoryBinding binding = HistoryBinding.inflate(inflater, parent, false);
        return new HistoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        History history = historyList.get(position);
        if (history == null)
            return;
        holder.binding.topicTextView.setText(history.topicName);
        holder.binding.scoreTextView.setText(history.score);
        holder.binding.levelTextView.setText(history.level);
        holder.binding.dateTextView.setText(history.date);
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {
        HistoryBinding binding;

        public HistoryViewHolder(HistoryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}