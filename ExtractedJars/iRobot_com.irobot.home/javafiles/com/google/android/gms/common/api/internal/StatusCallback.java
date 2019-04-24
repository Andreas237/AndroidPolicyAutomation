// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

public class StatusCallback extends IStatusCallback.Stub
{

	public StatusCallback(BaseImplementation.ResultHolder resultholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void IStatusCallback$Stub()>
		mResultHolder = resultholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field BaseImplementation$ResultHolder mResultHolder>
	//    5    9:return          
	}

	public void onResult(Status status)
	{
		mResultHolder.setResult(((Object) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BaseImplementation$ResultHolder mResultHolder>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method void BaseImplementation$ResultHolder.setResult(Object)>
	//    4   10:return          
	}

	private final BaseImplementation.ResultHolder mResultHolder;
}
