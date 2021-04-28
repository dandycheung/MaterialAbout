package com.vansuita.materialabout.util;

import android.content.Context;
import android.content.res.Resources;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;


/**
 * Created by jrvansuita on 10/02/17.
 */

public final class ColorUtil {

    public static int get(@NonNull Context context,@ColorRes int res) {
        try {
            return ContextCompat.getColor(context, res);
        } catch (Resources.NotFoundException e) {
            return res;
        }
    }
}
