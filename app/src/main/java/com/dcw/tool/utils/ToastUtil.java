package com.dcw.tool.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dcw.tool.R;

/**
 * Toast工具
 */

public class ToastUtil {

    @SuppressLint("StaticFieldLeak")
    private static Context sContext = MyUtils.getContext();

    @ColorInt
    private static final int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");

    @ColorInt
    private static final int ERROR_COLOR = Color.parseColor("#FF0000");

    @ColorInt
    private static final int INFO_COLOR = Color.parseColor("#3F51B5");

    @ColorInt
    private static final int SUCCESS_COLOR = Color.parseColor("#388E3C");

    @ColorInt
    private static final int WARNING_COLOR = Color.parseColor("#FFFABC40");

    private static final String TOAST_TYPEFACE = "sans-serif-condensed";

    private static Toast currentToast;
    private static long mExitTime;

    /************************************无需传递上下文*********************************************/

    public static void normal(@NonNull String message) {
        normal(sContext, message, Toast.LENGTH_SHORT, null, false).show();
    }

    /**
     * 常规Toast
     *
     * @param message msg
     */

    public static void normal(@NonNull String message, Drawable icon) {
        normal(sContext, message, Toast.LENGTH_SHORT, icon, true).show();
    }

    public static void normal(@NonNull String message, int duration) {
        normal(sContext, message, duration, null, false).show();
    }

    public static void normal(@NonNull String message, int duration, Drawable icon) {
        normal(sContext, message, duration, icon, true).show();
    }

    /**
     * 警告Toast
     *
     * @param message msg
     */
    public static void warning(@NonNull String message) {
        warning(sContext, message, Toast.LENGTH_SHORT, true).show();
    }

    public static void warning(@NonNull String message, int duration) {
        warning(sContext, message, duration, true).show();
    }

    public static Toast warning(@NonNull String message, int duration, boolean withIcon) {
        return custom(sContext, message, getDrawable(sContext, R.drawable.ic_error_outline_white_48dp), DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true);
    }

    /**
     * 信息Toast
     *
     * @param message msg
     */
    public static void info(@NonNull String message) {
        info(sContext, message, Toast.LENGTH_SHORT, true).show();
    }

    public static void info(@NonNull String message, int duration) {
        info(sContext, message, duration, true).show();
    }

    public static Toast info(@NonNull String message, int duration, boolean withIcon) {
        return custom(sContext, message, getDrawable(sContext, R.drawable.ic_info_outline_white_48dp), DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true);
    }

    /**
     * 正确的Toast
     *
     * @param message msg
     */
    public static void success(@NonNull String message) {
        success(sContext, message, Toast.LENGTH_SHORT, true).show();
    }

    public static void success(@NonNull String message, int duration) {
        success(sContext, message, duration, true).show();
    }

    public static Toast success(@NonNull String message, int duration, boolean withIcon) {
        return custom(sContext, message, getDrawable(sContext, R.drawable.ic_check_white_48dp), DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true);
    }

    /**
     * 错误的Toast
     *
     * @param message msg
     */
    public static void error(@NonNull String message) {
        error(sContext, message, Toast.LENGTH_SHORT, true).show();
    }

    public static void error(@NonNull String message, int duration) {
        error(sContext, message, duration, true).show();
    }

    public static Toast error(@NonNull String message, int duration, boolean withIcon) {
        return custom(sContext, message, getDrawable(sContext, R.drawable.ic_clear_white_48dp), DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true);
    }


    /*********************************需要传递当前的上下文*****************************************/

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull String message) {
        return normal(context, message, Toast.LENGTH_SHORT, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull String message, Drawable icon) {
        return normal(context, message, Toast.LENGTH_SHORT, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull String message, int duration) {
        return normal(context, message, duration, null, false);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return normal(context, message, duration, icon, true);
    }

    @CheckResult
    public static Toast normal(@NonNull Context context, @NonNull String message, int duration, Drawable icon, boolean withIcon) {
        return custom(context, message, icon, DEFAULT_TEXT_COLOR, duration, withIcon);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull String message) {
        return warning(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast warning(@NonNull Context context, @NonNull String message, int duration) {
        return warning(context, message, duration, true);
    }

    @CheckResult
    private static Toast warning(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_error_outline_white_48dp), DEFAULT_TEXT_COLOR, WARNING_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull String message) {
        return info(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull String message, int duration) {
        return info(context, message, duration, true);
    }

    @CheckResult
    public static Toast info(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_info_outline_white_48dp), DEFAULT_TEXT_COLOR, INFO_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull String message) {
        return success(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast success(@NonNull Context context, @NonNull String message, int duration) {
        return success(context, message, duration, true);
    }

    @CheckResult
    private static Toast success(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_check_white_48dp), DEFAULT_TEXT_COLOR, SUCCESS_COLOR, duration, withIcon, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull String message) {
        return error(context, message, Toast.LENGTH_SHORT, true);
    }

    @CheckResult
    public static Toast error(@NonNull Context context, @NonNull String message, int duration) {
        return error(context, message, duration, true);
    }

    @CheckResult
    private static Toast error(@NonNull Context context, @NonNull String message, int duration, boolean withIcon) {
        return custom(context, message, getDrawable(context, R.drawable.ic_clear_white_48dp), DEFAULT_TEXT_COLOR, ERROR_COLOR, duration, withIcon, true);
    }

    /***********************************内需方法***********************************************/
    @CheckResult
    private static Toast custom(@NonNull Context context, @NonNull String message, Drawable icon, @ColorInt int textColor, int duration, boolean withIcon) {
        return custom(context, message, icon, textColor, -1, duration, withIcon, false);
    }


    @CheckResult
    private static Toast custom(@NonNull Context context, @NonNull String message, Drawable icon, @ColorInt int textColor, @ColorInt int tintColor, int duration, boolean withIcon, boolean shouldTint) {
        if (currentToast == null) {
            currentToast = new Toast(context);
        }
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout, null);
        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = toastLayout.findViewById(R.id.toast_text);
        Drawable drawableFrame;
        if (shouldTint) {
            drawableFrame = tint9PatchDrawableFrame(context, tintColor);
        } else {
            drawableFrame = getDrawable(context, R.drawable.toast_frame);
        }
        setBackground(toastLayout, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            setBackground(toastIcon, icon);
        } else
            toastIcon.setVisibility(View.GONE);

        toastTextView.setTextColor(textColor);
        toastTextView.setText(message);
        toastTextView.setTypeface(Typeface.create(TOAST_TYPEFACE, Typeface.NORMAL));

        currentToast.setView(toastLayout);
        currentToast.setDuration(duration);
        return currentToast;
    }

    private static Drawable tint9PatchDrawableFrame(@NonNull Context context, @ColorInt int tintColor) {
        final NinePatchDrawable toastDrawable = (NinePatchDrawable) getDrawable(context, R.drawable.toast_frame);
        toastDrawable.setColorFilter(new PorterDuffColorFilter(tintColor, PorterDuff.Mode.SRC_IN));
        return toastDrawable;
    }

    @SuppressLint("ObsoleteSdkInt")
    private static void setBackground(@NonNull View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private static Drawable getDrawable(@NonNull Context context, @DrawableRes int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return context.getDrawable(id);
        } else {
            return context.getResources().getDrawable(id);
        }
    }

    /**
     * 双击退出
     *
     * @return true
     */
    public static boolean doubleClickExit() {
        if ((System.currentTimeMillis() - mExitTime) > 2000) {
            ToastUtil.normal("再按一次退出");
            mExitTime = System.currentTimeMillis();
            return false;
        }
        return true;
    }
}
