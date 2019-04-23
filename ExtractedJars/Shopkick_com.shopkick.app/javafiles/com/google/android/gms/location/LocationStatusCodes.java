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

	public static int zzc(int i)
	{
		if(i >= 0 && i <= 1 || 1000 <= i && i <= 1002)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
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

	public static Status zzd(int i)
	{
		if(i == 1)
	//*   0    0:iload_0         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          8
	//*   3    5:goto            11
			i = 13;
	//    4    8:bipush          13
	//    5   10:istore_0        
		return new Status(i);
	//    6   11:new             #27  <Class Status>
	//    7   14:dup             
	//    8   15:iload_0         
	//    9   16:invokespecial   #30  <Method void Status(int)>
	//   10   19:areturn         
	}

	public static final int ERROR = 1;
	public static final int GEOFENCE_NOT_AVAILABLE = 1000;
	public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
	public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
	public static final int SUCCESS = 0;
}
