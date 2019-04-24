// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanl, zzaii, zzanz

final class zzaim
	implements zzanl
{

	zzaim(zzaii zzaii1, zzanz zzanz)
	{
		zzcnb = zzanz;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field zzanz zzcnb>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zzb(Throwable throwable)
	{
		zzaii.zzpl().remove(((Object) (zzcnb)));
	//    0    0:invokestatic    #25  <Method List zzaii.zzpl()>
	//    1    3:aload_0         
	//    2    4:getfield        #13  <Field zzanz zzcnb>
	//    3    7:invokeinterface #31  <Method boolean List.remove(Object)>
	//    4   12:pop             
	//    5   13:return          
	}

	public final void zzh(Object obj)
	{
		zzaii.zzpl().remove(((Object) (zzcnb)));
	//    0    0:invokestatic    #25  <Method List zzaii.zzpl()>
	//    1    3:aload_0         
	//    2    4:getfield        #13  <Field zzanz zzcnb>
	//    3    7:invokeinterface #31  <Method boolean List.remove(Object)>
	//    4   12:pop             
	//    5   13:return          
	}

	private final zzanz zzcnb;
}
