// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.CastDevice;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbm, zzcm

final class zzbn
	implements com.google.android.gms.cast.Cast.MessageReceivedCallback
{

	zzbn(zzbm zzbm1)
	{
		zzti = zzbm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbm zzti>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onMessageReceived(CastDevice castdevice, String s, String s1)
	{
		((zzcm) (zzti.zzth)).zzn(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbm zzti>
	//    2    4:getfield        #24  <Field zzbl zzbm.zzth>
	//    3    7:aload_3         
	//    4    8:invokevirtual   #30  <Method void zzcm.zzn(String)>
	//    5   11:return          
	}

	private final zzbm zzti;
}
