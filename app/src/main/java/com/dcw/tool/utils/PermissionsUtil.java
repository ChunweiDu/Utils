package com.dcw.tool.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * 权限工具
 */

public class PermissionsUtil {

    public static PermissionsUtil.Builder with(Activity activity) {
        return new Builder(activity);
    }

    public static class Builder {

        private Activity mActivity;
        private List<String> permissionList;

        private Builder(@NonNull Activity activity) {
            mActivity = activity;
            permissionList = new ArrayList<>();
        }

        /**
         * 动态添加权限
         *
         * @param permission 权限
         * @return 权限集合
         */
        public Builder addPermission(@NonNull String permission) {
            if (!permissionList.contains(permission)) {
                permissionList.add(permission);
            }
            return this;
        }

        public List<String> initPermission() {
            List<String> list = new ArrayList<>();
            for (String permission : permissionList) {
                if (ActivityCompat.checkSelfPermission(mActivity, permission) != PackageManager.PERMISSION_GRANTED) {
                    list.add(permission);
                }
            }
            if (list.size() > 0) {
                ActivityCompat.requestPermissions(mActivity, list.toArray(new String[list.size()]), 1);
            }
            return list;
        }
    }
}