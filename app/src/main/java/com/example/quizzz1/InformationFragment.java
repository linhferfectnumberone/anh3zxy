package com.example.quizzz1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizzz1.databinding.FragmentInformationBinding;

public class InformationFragment extends Fragment {
    FragmentInformationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentInformationBinding.inflate(inflater, container, false);
        String information = "<h5>Nhóm phát triển</h5>" +
                "        <ul>" +
                "            <li> Nguyễn Thị Trang</li>" +
                "            <li> Lại Mạnh Cường</li> " +
                "        </ul>" +
                "    <h5>Thông tin liên hệ:</h5>" +
                "    <ul>" +
                "        <li> 20021588@vnu.edu.vn</li>" +
                "         <li> 20021498@vnu.edu.vn</li>" +
                "    </ul>";
        binding.informationTextView.setText(android.text.Html.fromHtml(information));
        return binding.getRoot();
    }
}