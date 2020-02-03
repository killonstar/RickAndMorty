package com.lonstar.rickandmorty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lonstar.rickandmorty.pojo.CharacterRAM;
import com.lonstar.rickandmorty.pojo.Location;
import com.lonstar.rickandmorty.pojo.Origin;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class MainActivity extends BaseApp implements Contract.IView{

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
    @BindView(R.id.btn_next)
    Button mButtonNext;
    @BindView(R.id.btn_prev)
    Button mButtonPrev;

    @Inject
    NetworkService mService;
    PresenterImpl mPresenter;

    public MainActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getNetworkComponent().inject(this);
        ButterKnife.bind(this);

        mPresenter = new PresenterImpl(this, mService);

        mButtonNext.setOnClickListener(v -> {
            mPresenter.onClick();
        });

    }

    @Override
    public void onShowCharacter(String name, String status, String species,
                                String type, String gender, Origin origin,
                                Location location, String image) {
        mTextViewName.setText(name);
        mTextViewStatus.setText(status);
        mTextViewSpecies.setText(species);
        mTextViewGender.setText(gender);
        mTextViewOrigin.setText(origin.getName());
        mTextViewLastLocation.setText(location.getName());
    }
}
