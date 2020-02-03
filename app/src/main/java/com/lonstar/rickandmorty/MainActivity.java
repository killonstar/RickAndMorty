package com.lonstar.rickandmorty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Contract.IView{

    @BindView(R.id.iv_face_character)
    ImageView mImageViewFaceCharacter;
    @BindView(R.id.tv_name)
    TextView mTextViewName;
    @BindView(R.id.tv_status)
    TextView mTextViewStatus;
    @BindView(R.id.tv_species)
    TextView mTextViewSpecies;
    @BindView(R.id.tv_gender)
    TextView mTextViewGender;
    @BindView(R.id.tv_origin)
    TextView mTextViewOrigin;
    @BindView(R.id.tv_last_location)
    TextView mTextViewLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
