// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.api.Response;

// Referenced classes of package com.google.android.gms.location:
//			LocationSettingsResult, LocationSettingsStates

public class LocationSettingsResponse extends Response
{

	public LocationSettingsResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Response()>
	//    2    4:return          
	}

	public LocationSettingsStates getLocationSettingsStates()
	{
		return ((LocationSettingsResult)getResult()).getLocationSettingsStates();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method com.google.android.gms.common.api.Result getResult()>
	//    2    4:checkcast       #18  <Class LocationSettingsResult>
	//    3    7:invokevirtual   #20  <Method LocationSettingsStates LocationSettingsResult.getLocationSettingsStates()>
	//    4   10:areturn         
	}
}
