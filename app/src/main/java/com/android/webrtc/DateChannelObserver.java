package com.android.webrtc;

import android.util.Log;

import org.webrtc.DataChannel;

/**
 * Created by taxiao on 2019/8/17
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/taxiao213
 * 微信公众号:他晓
 */
public class DateChannelObserver implements DataChannel.Observer {

    private String TAG = "DateChannelObserver";

    @Override
    public void onBufferedAmountChange(long l) {
        Log.d(TAG, "onBufferedAmountChange : " + l);
    }

    @Override
    public void onStateChange() {

    }

    @Override
    public void onMessage(DataChannel.Buffer buffer) {
        Log.d(TAG, "onMessage DataChannel : " + buffer.toString());
    }
}
