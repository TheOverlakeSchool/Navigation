package org.overlake.mat803.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import org.overlake.mat803.navigation.databinding.FragmentLanderBinding;

public class LanderFragment extends Fragment implements View.OnClickListener {

    private NavController mNavController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLanderBinding binding = FragmentLanderBinding.inflate(inflater);
        mNavController = NavHostFragment.findNavController(this);
        View.OnClickListener listener = Navigation.createNavigateOnClickListener(R.id.action_landerFragment_to_yesFragment);
        binding.buttonYes.setOnClickListener(v -> {
            mNavController.navigate(R.id.action_landerFragment_to_yesFragment);
        });

        binding.buttonYes.setOnClickListener(listener);

        binding.buttonYes.setOnClickListener(this);


        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        mNavController.navigate(R.id.action_landerFragment_to_yesFragment);
    }
}
