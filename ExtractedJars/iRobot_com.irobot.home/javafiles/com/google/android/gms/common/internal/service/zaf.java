// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			zaa

final class zaf extends zaa
{

	public zaf(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zaa()>
		mResultHolder = resultholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
	//    5    9:return          
	}

	public final void zaj(int i)
	{
		mResultHolder.setResult(((Object) (new Status(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder mResultHolder>
	//    2    4:new             #21  <Class Status>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #23  <Method void Status(int)>
	//    6   12:invokeinterface #29  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
	//    7   17:return          
	}

	private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;
}
