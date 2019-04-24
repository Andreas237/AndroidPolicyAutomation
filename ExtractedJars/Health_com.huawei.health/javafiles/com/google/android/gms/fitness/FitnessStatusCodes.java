// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.CommonStatusCodes;

public class FitnessStatusCodes extends CommonStatusCodes
{

	public FitnessStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static final int AGGREGATION_NOT_SUPPORTED = 5012;
	public static final int API_EXCEPTION = 5011;
	public static final int APP_MISMATCH = 5004;
	public static final int APP_NOT_FIT_ENABLED = 5010;
	public static final int CONFLICTING_DATA_TYPE = 5001;
	public static final int DATASET_TIMESTAMP_INCONSISTENT_WITH_UPDATE_TIME_RANGE = 5019;
	public static final int DATA_SOURCE_NOT_FOUND = 5018;
	public static final int DATA_TYPE_NOT_ALLOWED_FOR_API = 5023;
	public static final int DATA_TYPE_NOT_FOUND = 5003;
	public static final int DISABLED_BLUETOOTH = 5014;
	public static final int EQUIVALENT_SESSION_ENDED = 5009;
	public static final int INCONSISTENT_DATA_TYPE = 5002;
	public static final int INCONSISTENT_PACKAGE_NAME = 5015;
	public static final int INVALID_DATA_POINT = 5021;
	public static final int INVALID_SESSION_TIMESTAMPS = 5020;
	public static final int INVALID_TIMESTAMP = 5022;
	public static final int MISSING_BLE_PERMISSION = 5006;
	public static final int NEEDS_OAUTH_PERMISSIONS = 5000;
	public static final int REQUIRES_APP_WHITELISTING = 5024;
	public static final int SUCCESS_ALREADY_SUBSCRIBED = -5001;
	public static final int SUCCESS_LISTENER_NOT_REGISTERED_FOR_FITNESS_DATA_UPDATES = -5003;
	public static final int SUCCESS_NO_CLAIMED_DEVICE = -5002;
	public static final int SUCCESS_NO_DATA_SOURCES = -5000;
	public static final int TRANSIENT_ERROR = 5008;
	public static final int UNKNOWN_AUTH_ERROR = 5005;
	public static final int UNSUPPORTED_ACCOUNT = 5013;
	public static final int UNSUPPORTED_PLATFORM = 5007;
}
