// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcb

public static class zzcb$zza
	implements com.google.android.gms.wearable.etConnectedNodesResult
{

	public List getNodes()
	{
		return zzbUL;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzbUL>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status zzair>
	//    2    4:areturn         
	}

	private final Status zzair;
	private final List zzbUL;

	public zzcb$zza(Status status, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzair = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Status zzair>
		zzbUL = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field List zzbUL>
	//    8   14:return          
	}
}
