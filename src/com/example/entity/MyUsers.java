package com.example.entity;

import android.net.Uri;
import android.provider.BaseColumns;

public class MyUsers {

    // BaseColumn�����Ѿ������� _id�ֶ�
   public static final class User implements BaseColumns {
        public static final Uri CONTENT_URI  = Uri.parse("content://com.example.MyContentProvider");
        // ��������
        public static final String  USER_NAME  = "USER_NAME";
    }
}
