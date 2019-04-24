// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class WearableStatusCodes extends CommonStatusCodes
{

	private WearableStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     4000 4005: default 40
	//	               4000 43
	//	               4001 46
	//	               4002 49
	//	               4003 52
	//	               4004 55
	//	               4005 58
	//*   2   40:goto            61
		case 4000: 
			return "TARGET_NODE_NOT_CONNECTED";
	//    3   43:ldc1            #31  <String "TARGET_NODE_NOT_CONNECTED">
	//    4   45:areturn         

		case 4001: 
			return "DUPLICATE_LISTENER";
	//    5   46:ldc1            #32  <String "DUPLICATE_LISTENER">
	//    6   48:areturn         

		case 4002: 
			return "UNKNOWN_LISTENER";
	//    7   49:ldc1            #33  <String "UNKNOWN_LISTENER">
	//    8   51:areturn         

		case 4003: 
			return "DATA_ITEM_TOO_LARGE";
	//    9   52:ldc1            #34  <String "DATA_ITEM_TOO_LARGE">
	//   10   54:areturn         

		case 4004: 
			return "INVALID_TARGET_NODE";
	//   11   55:ldc1            #35  <String "INVALID_TARGET_NODE">
	//   12   57:areturn         

		case 4005: 
			return "ASSET_UNAVAILABLE";
	//   13   58:ldc1            #36  <String "ASSET_UNAVAILABLE">
	//   14   60:areturn         
		}
		return CommonStatusCodes.getStatusCodeString(i);
	//   15   61:iload_0         
	//   16   62:invokestatic    #38  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//   17   65:areturn         
	}

	public static final int ASSET_UNAVAILABLE = 4005;
	public static final int DATA_ITEM_TOO_LARGE = 4003;
	public static final int DUPLICATE_CAPABILITY = 4006;
	public static final int DUPLICATE_LISTENER = 4001;
	public static final int INVALID_TARGET_NODE = 4004;
	public static final int TARGET_NODE_NOT_CONNECTED = 4000;
	public static final int UNKNOWN_CAPABILITY = 4007;
	public static final int UNKNOWN_LISTENER = 4002;
	public static final int WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED = 4008;
}
