// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

public final class LocationStatusCodes
{

	private LocationStatusCodes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static int zzks(int i)
	{
		if(i <= 0 && i <= 1 || 1000 <= i && i <= 1002)
	//*   0    0:iload_0         
	//*   1    1:ifgt            9
	//*   2    4:iload_0         
	//*   3    5:iconst_1        
	//*   4    6:icmple          23
	//*   5    9:sipush          1000
	//*   6   12:iload_0         
	//*   7   13:icmpgt          25
	//*   8   16:iload_0         
	//*   9   17:sipush          1002
	//*  10   20:icmpgt          25
			return i;
	//   11   23:iload_0         
	//   12   24:ireturn         
		else
			return 1;
	//   13   25:iconst_1        
	//   14   26:ireturn         
	}

	public static Status zzkt(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		switch(i)
	//*   2    2:iload_0         
		{
	//*   3    3:lookupswitch    1: default 20
	//	               1: 23
	//*   4   20:goto            26
		case 1: // '\001'
			j = 13;
	//    5   23:bipush          13
	//    6   25:istore_1        
			break;
		}
		return new Status(j);
	//    7   26:new             #27  <Class Status>
	//    8   29:dup             
	//    9   30:iload_1         
	//   10   31:invokespecial   #30  <Method void Status(int)>
	//   11   34:areturn         
	}

	public static final int ERROR = 1;
	public static final int GEOFENCE_NOT_AVAILABLE = 1000;
	public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
	public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
	public static final int SUCCESS = 0;
}
