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
	//	               1000 31
	//	               1001 34
	//	               1002 37
	//*   2   28:goto            40
		case 1000: 
			return "GEOFENCE_NOT_AVAILABLE";
	//    3   31:ldc1            #19  <String "GEOFENCE_NOT_AVAILABLE">
	//    4   33:areturn         

		case 1001: 
			return "GEOFENCE_TOO_MANY_GEOFENCES";
	//    5   34:ldc1            #20  <String "GEOFENCE_TOO_MANY_GEOFENCES">
	//    6   36:areturn         

		case 1002: 
			return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
	//    7   37:ldc1            #21  <String "GEOFENCE_TOO_MANY_PENDING_INTENTS">
	//    8   39:areturn         
		}
		return CommonStatusCodes.getStatusCodeString(i);
	//    9   40:iload_0         
	//   10   41:invokestatic    #23  <Method String CommonStatusCodes.getStatusCodeString(int)>
	//   11   44:areturn         
	}

	public static final int GEOFENCE_NOT_AVAILABLE = 1000;
	public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
	public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
}
