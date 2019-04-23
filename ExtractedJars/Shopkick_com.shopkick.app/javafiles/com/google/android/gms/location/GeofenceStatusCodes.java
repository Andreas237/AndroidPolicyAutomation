// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GeofenceStatusCodes extends CommonStatusCodes
{

	private GeofenceStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void CommonStatusCodes()>
	//    2    4:return          
	}

	public static String getStatusCodeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1000 1002: default 28
	//	               1000 39
	//	               1001 36
	//	               1002 33
		default:
			return CommonStatusCodes.getStatusCodeString(i);
	//    2   28:iload_0         
	//    3   29:invokestatic    #20  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//    4   32:areturn         

		case 1002: 
			return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
	//    5   33:ldc1            #21  <String "GEOFENCE_TOO_MANY_PENDING_INTENTS">
	//    6   35:areturn         

		case 1001: 
			return "GEOFENCE_TOO_MANY_GEOFENCES";
	//    7   36:ldc1            #22  <String "GEOFENCE_TOO_MANY_GEOFENCES">
	//    8   38:areturn         

		case 1000: 
			return "GEOFENCE_NOT_AVAILABLE";
	//    9   39:ldc1            #23  <String "GEOFENCE_NOT_AVAILABLE">
	//   10   41:areturn         
		}
	}

	public static final int GEOFENCE_NOT_AVAILABLE = 1000;
	public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
	public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
}
