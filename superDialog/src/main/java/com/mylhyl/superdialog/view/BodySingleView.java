package com.mylhyl.superdialog.view;

import android.content.Context;

import com.mylhyl.superdialog.callback.ProviderContent;

/**
 * Created by hupei on 2016/3/8 19:30.
 */
class BodySingleView extends SuperTextView {

    public BodySingleView(Context context, Controller.Params params) {
        super(context);
        initData(params);
    }

    private void initData(Controller.Params params) {
        setBackgroundColor(params.mBackgroundColor);
        ProviderContent providerContent = params.mProviderContent;
        if (providerContent == null) return;
        setText((String) providerContent.getItems());
        setTextSize(providerContent.getTextSize());
        setTextColor(providerContent.getTextColor());
        int[] padding = providerContent.getPadding();
        setAutoPadding(padding[0], padding[1], padding[2], padding[3]);
    }
}
