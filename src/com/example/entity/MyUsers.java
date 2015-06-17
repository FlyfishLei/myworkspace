package com.example.entity;

import android.net.Uri;
import android.provider.BaseColumns;

public class MyUsers {

    // BaseColumn类中已经包含了 _id字段
   public static final class User implements BaseColumns {
        public static final Uri CONTENT_URI  = Uri.parse("content://com.example.MyContentProvider");
        // 表数据列
        public static final String  USER_NAME  = "USER_NAME";
    }
}
