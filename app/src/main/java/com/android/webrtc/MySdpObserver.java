package com.android.webrtc;

import android.util.Log;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/**
 * 会话描述协议SDP
 * <p>
 * Created by taxiao on 2019/8/17
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/taxiao213
 * 微信公众号:他晓
 */
public class MySdpObserver implements SdpObserver {

    private String TAG = "MySdpObserver";

    @Override
    public void onCreateSuccess(SessionDescription sessionDescription) {

    }

    @Override
    public void onSetSuccess() {
        Log.e(TAG, "onSetSuccess ==  ");
    }

    @Override
    public void onCreateFailure(String s) {
        Log.e(TAG, "onCreateFailure ==  " + s);
    }

    @Override
    public void onSetFailure(String s) {
        Log.e(TAG, "onSetFailure ==  " + s);
    }
}
