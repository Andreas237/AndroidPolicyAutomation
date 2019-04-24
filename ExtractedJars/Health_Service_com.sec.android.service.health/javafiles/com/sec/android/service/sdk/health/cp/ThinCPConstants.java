// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.sdk.health.cp;

import android.net.Uri;

public class ThinCPConstants
{

	public ThinCPConstants()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
	//    2    4:return          
	}

	public static final String AUTHORITY = "com.sec.android.service.health.cp.TrustZoneSecurityProvider";
	public static final Uri AUTHORITY_URI = Uri.parse("content://com.sec.android.service.health.cp.TrustZoneSecurityProvider");
	public static final String HEALTH_SERVICE_DEFAULT_PREFS = "health_service_shared_prefs";
	public static final String KEY_CHECK_PLATFORM_DB_EXISTS = "check_platform_db_exists";
	public static final String KEY_CREATE_SECURE_PASSWORD = "create_secure_password";
	public static final String KEY_GET_AES_PASSWORD = "get_aes_password";
	public static final String KEY_GET_HEALTHSERVICE_DB_PASSWORD = "get_secure_password";
	public static final String KEY_GET_SECURE_PASSWORD = "get_secure_password";
	public static final String KEY_IS_SECURE_STORAGE_SUPPORTS = "secure_storage_support";
	public static final String KEY_RENAME_PLATFORM_DB_IF_EXISTS = "rename_platform_db_if_exists";
	public static final String MIGRATION_AUTHORITY = "com.sec.android.service.health.cp.MigrationCpProvider";
	public static final Uri MIGRATION_AUTHORITY_URI;
	public static final Uri MIGRATION_SHARED_PREFS_URI;
	public static final Uri MIGRATION_USER_PROFILE_PREFS_URI;
	public static final String SHAREDPREF_USER_PROFILE = "user_profile_prefs";
	public static final String VALUE_CHECK_PLATFORM_DB_EXISTS = "value_of_check_if_platform_db_exists";
	public static final String VALUE_GET_CREATE_PASSWORD = "value_of_password";
	public static final String VALUE_IS_SECURE_STORAGE_SUPPORTS = "boolean_secure_storage_support";
	public static final String VALUE_RENAME_PLATFORM_DB_IF_EXISTS = "value_of_rename_platform_db_if_exists";

	static 
	{
	//    0    0:ldc1            #57  <String "content://com.sec.android.service.health.cp.TrustZoneSecurityProvider">
	//    1    2:invokestatic    #63  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #65  <Field Uri AUTHORITY_URI>
		MIGRATION_AUTHORITY_URI = Uri.parse("content://com.sec.android.service.health.cp.MigrationCpProvider");
	//    3    8:ldc1            #67  <String "content://com.sec.android.service.health.cp.MigrationCpProvider">
	//    4   10:invokestatic    #63  <Method Uri Uri.parse(String)>
	//    5   13:putstatic       #69  <Field Uri MIGRATION_AUTHORITY_URI>
		MIGRATION_SHARED_PREFS_URI = Uri.withAppendedPath(MIGRATION_AUTHORITY_URI, "health_service_shared_prefs");
	//    6   16:getstatic       #69  <Field Uri MIGRATION_AUTHORITY_URI>
	//    7   19:ldc1            #13  <String "health_service_shared_prefs">
	//    8   21:invokestatic    #73  <Method Uri Uri.withAppendedPath(Uri, String)>
	//    9   24:putstatic       #75  <Field Uri MIGRATION_SHARED_PREFS_URI>
		MIGRATION_USER_PROFILE_PREFS_URI = Uri.withAppendedPath(MIGRATION_AUTHORITY_URI, "user_profile_prefs");
	//   10   27:getstatic       #69  <Field Uri MIGRATION_AUTHORITY_URI>
	//   11   30:ldc1            #41  <String "user_profile_prefs">
	//   12   32:invokestatic    #73  <Method Uri Uri.withAppendedPath(Uri, String)>
	//   13   35:putstatic       #77  <Field Uri MIGRATION_USER_PROFILE_PREFS_URI>
	//*  14   38:return          
	}
}
