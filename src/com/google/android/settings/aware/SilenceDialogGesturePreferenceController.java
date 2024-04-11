package com.google.android.settings.aware;

import android.content.Context;
import android.provider.Settings;
import com.android.settings.R;

public class SilenceDialogGesturePreferenceController extends AwareGesturePreferenceController {

    public SilenceDialogGesturePreferenceController(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    public CharSequence getGestureSummary() {
        return mContext.getText(isSilenceGestureEnabled() ? R.string.gesture_silence_on_summary : R.string.gesture_setting_off);
    }

    private boolean isSilenceGestureEnabled() {
        return mHelper.isEnabled() && Settings.Secure.getInt(mContext.getContentResolver(), "silence_gesture", 1) == 1;
    }
}
