package com.example.quizzz1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizzz1.databinding.TopicBinding;
import com.example.quizzz1.databinding.TopicBinding;

import java.util.ArrayList;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    private ArrayList<Topic> topicList;

    public TopicAdapter(ArrayList<Topic> data) {
        this.topicList = data;
    }

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TopicBinding binding = TopicBinding.inflate(inflater, parent, false);
        return new TopicViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {
        Topic topic = topicList.get(position);
        if (topic == null)
            return;
        holder.binding.itemTextView.setText(topic.getItemName());
        holder.binding.itemImageView.setImageResource(topic.getResourceID());
        holder.binding.cardView.setOnClickListener(view -> {
            NavDirections action = TopicFragmentDirections.actionTopicListFragmentToLevelFragment(topic.getItemName());
            Navigation.findNavController(view).navigate(action);
        });
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public class TopicViewHolder extends RecyclerView.ViewHolder {
        TopicBinding binding;

        public TopicViewHolder(TopicBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
