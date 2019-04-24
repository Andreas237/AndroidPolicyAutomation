// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzah

public static class zzah$zza
	implements com.google.android.gms.wearable.ataItemResult
{

	public DataItem getDataItem()
	{
		return zzbUo;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DataItem zzbUo>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Status zzair>
	//    2    4:areturn         
	}

	private final Status zzair;
	private final DataItem zzbUo;

	public zzah$zza(Status status, DataItem dataitem)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzair = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Status zzair>
		zzbUo = dataitem;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field DataItem zzbUo>
	//    8   14:return          
	}
}
