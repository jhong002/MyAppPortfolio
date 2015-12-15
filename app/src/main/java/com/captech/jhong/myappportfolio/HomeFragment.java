package com.captech.jhong.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by jhong on 12/15/15.
 */
public class HomeFragment extends Fragment implements OnClickListener{
    private Button mSpotifyButton, mScoresButton, mLibraryButton, mBuildButton, mXYZButton, mCapstoneButton;

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();

        Bundle args = new Bundle();
        homeFragment.setArguments(args);

        return homeFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        mSpotifyButton = (Button) rootView.findViewById(R.id.spotify_streamer);
        mScoresButton = (Button) rootView.findViewById(R.id.scores_app);
        mLibraryButton = (Button) rootView.findViewById(R.id.library_app);
        mBuildButton = (Button) rootView.findViewById(R.id.build_it_bigger);
        mXYZButton = (Button) rootView.findViewById(R.id.xyz_reader);
        mCapstoneButton = (Button) rootView.findViewById(R.id.capstone);

        setListeners();

        return rootView;
    }

    private void setListeners(){
        mSpotifyButton.setOnClickListener(this);
        mScoresButton.setOnClickListener(this);
        mLibraryButton.setOnClickListener(this);
        mBuildButton.setOnClickListener(this);
        mXYZButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.spotify_streamer:
                fireToast(mSpotifyButton.getText().toString());
                break;
            case R.id.scores_app:
                fireToast(mScoresButton.getText().toString());
                break;
            case R.id.library_app :
                fireToast(mLibraryButton.getText().toString());
                break;
            case R.id.build_it_bigger:
                fireToast(mBuildButton.getText().toString());
                break;
            case R.id.xyz_reader:
                fireToast(mXYZButton.getText().toString());
                break;
            case R.id.capstone:
                fireToast(mCapstoneButton.getText().toString());
                break;
            default:
                break;
        }
    }
    private void fireToast(String toastString){
        Context context = getContext();
        if (context != null) {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, toastString, duration);
            toast.show();
        }
    }
}
