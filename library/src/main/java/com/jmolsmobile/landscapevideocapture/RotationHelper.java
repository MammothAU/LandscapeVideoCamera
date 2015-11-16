package com.jmolsmobile.landscapevideocapture;

import android.view.Surface;

/**
 * Created by paul.robson on 16/11/2015.
 */
public final class RotationHelper {
    public static int DisplayRotationToDegrees(int displayRotation) {
        CLog.d(CLog.PREVIEW, "DisplayRotationToDegrees: Got displayRotation " + displayRotation);
        int rotation = -1;
        try {
            switch (displayRotation) {
                case Surface.ROTATION_0:
                    rotation = 90;
                    break;
                case Surface.ROTATION_90:
                    rotation = 0;
                    break;
                case Surface.ROTATION_180:
                    rotation = 270;
                    break;
                case Surface.ROTATION_270:
                    rotation = 180;
                    break;
                default:
                    rotation = 0;
                    break;
            }
        }
        finally {
            CLog.d(CLog.PREVIEW, "DisplayRotationToDegrees: Resulting rotation " + rotation);
        }
        return rotation;
    }
}
