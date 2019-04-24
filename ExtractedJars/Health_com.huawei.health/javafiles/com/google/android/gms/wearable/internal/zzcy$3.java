// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcy, zzcc

final class zzcy$3
	implements com.google.android.gms.internal.zc
{

	public void zza(com.google.android.gms.wearable..NodeListener nodelistener)
	{
		nodelistener.onPeerConnected(((com.google.android.gms.wearable.Node) (zzbTq)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field zzcc zzbTq>
	//    3    5:invokeinterface #30  <Method void com.google.android.gms.wearable.NodeApi$NodeListener.onPeerConnected(com.google.android.gms.wearable.Node)>
	//    4   10:return          
	}

	public void zzs(Object obj)
	{
		zza((com.google.android.gms.wearable..NodeListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class com.google.android.gms.wearable.NodeApi$NodeListener>
	//    3    5:invokevirtual   #34  <Method void zza(com.google.android.gms.wearable.NodeApi$NodeListener)>
	//    4    8:return          
	}

	public void zzwc()
	{
	//    0    0:return          
	}

	final zzcc zzbTq;

	zzcy$3(zzcc zzcc)
	{
		zzbTq = zzcc;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzcc zzbTq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
