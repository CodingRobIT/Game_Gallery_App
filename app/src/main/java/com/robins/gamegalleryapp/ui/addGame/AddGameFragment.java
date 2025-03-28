package com.robins.gamegalleryapp.ui.addGame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.robins.gamegalleryapp.databinding.FragmentAddGameBinding;

public class AddGameFragment extends Fragment {

    private FragmentAddGameBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddGameViewModel addGameViewModel =
                new ViewModelProvider(this).get(AddGameViewModel.class);

        binding = FragmentAddGameBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAddGame;
        addGameViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}