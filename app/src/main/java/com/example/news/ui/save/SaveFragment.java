package com.example.news.ui.save;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.news.databinding.FragmentSaveBinding;
import com.example.news.repository.NewsRepository;
import com.example.news.repository.NewsViewModelFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SaveFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class SaveFragment extends Fragment {
    private FragmentSaveBinding binding;
    private SaveViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =  FragmentSaveBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NewsRepository repository = new NewsRepository(getContext());
        viewModel = new ViewModelProvider(this, new NewsViewModelFactory(repository)).get(SaveViewModel.class);
        viewModel
                .getAllSavedArticles()
                .observe(
                        getViewLifecycleOwner(),
                        savedArticles -> {
                            if (savedArticles != null) {
                                Log.d("SaveFragment", savedArticles.toString());
                            }
                        });
    }
}