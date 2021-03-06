// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

// Referenced classes of package com.google.android.gms.common.api:
//			ApiException, Status

public class ResolvableApiException extends ApiException
{

	public ResolvableApiException(Status status)
	{
		super(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void ApiException(Status)>
	//    3    5:return          
	}

	public PendingIntent getResolution()
	{
		return mStatus.getResolution();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Status mStatus>
	//    2    4:invokevirtual   #19  <Method PendingIntent Status.getResolution()>
	//    3    7:areturn         
	}

	public void startResolutionForResult(Activity activity, int i)
	{
		mStatus.startResolutionForResult(activity, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Status mStatus>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #23  <Method void Status.startResolutionForResult(Activity, int)>
	//    5    9:return          
	}
}
