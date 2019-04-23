package com.wheat7.vrplayer.activity;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.wheat7.vrplayer.R;
import com.wheat7.vrplayer.adapter.VRAdapter;
import com.wheat7.vrplayer.base.BaseActivity;
import com.wheat7.vrplayer.databinding.ActivityVrListBinding;
import com.wheat7.vrplayer.model.VRVideo;
import com.wheat7.vrplayer.utils.StringUtils;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wheat7 on 05/07/2017.
 */

public class VRListActivity extends BaseActivity<ActivityVrListBinding>{

    @Override
    public int getLayoutId() {
        return R.layout.activity_vr_list;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        Intent intent = new Intent(this, VRPlayerActivity.class);
        getBinding().play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("path", getBinding().inputUrl.getText().toString().trim());
                startActivity(intent);
            }
        });
    }


    @Override
    protected void setStatusBar() {
    }

}
