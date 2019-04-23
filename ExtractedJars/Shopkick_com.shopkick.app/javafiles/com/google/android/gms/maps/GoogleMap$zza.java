// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzd;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

private static final class GoogleMap$zza extends zzd
{

	public final void onCancel()
	{
		zzai.onCancel();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzai>
	//    2    4:invokeinterface #22  <Method void GoogleMap$CancelableCallback.onCancel()>
	//    3    9:return          
	}

	public final void onFinish()
	{
		zzai.onFinish();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzai>
	//    2    4:invokeinterface #25  <Method void GoogleMap$CancelableCallback.onFinish()>
	//    3    9:return          
	}

	private final elableCallback zzai;

	GoogleMap$zza(elableCallback elablecallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzd()>
		zzai = elablecallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field GoogleMap$CancelableCallback zzai>
	//    5    9:return          
	}
}
