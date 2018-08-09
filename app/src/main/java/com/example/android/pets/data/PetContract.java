package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    public static final class PetEntry implements BaseColumns{
        public static final String TABLE_NAME = "pets";
        public static final String _ID = "_id";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gendar";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDAR_UNKNOWN = 0;
        public static final int GENDAR_MALE = 1;
        public static final int GENDAR_FEMALE = 2;
    }
}
