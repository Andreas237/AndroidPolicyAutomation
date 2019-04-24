// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaa;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzwb, zzafc, zzakb, 
//			zzafa

final class zzafd
	implements zzaoo
{

	zzafd(zzafc zzafc1)
	{
		zzcgm = zzafc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzafc zzcgm>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzwb)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class zzwb>
	//    2    4:astore_1        
		try
		{
			((zzwb) (obj)).zzb("AFMA_getAdapterLessMediationAd", zzcgm.zzcgk);
	//    3    5:aload_1         
	//    4    6:ldc1            #25  <String "AFMA_getAdapterLessMediationAd">
	//    5    8:aload_0         
	//    6    9:getfield        #13  <Field zzafc zzcgm>
	//    7   12:getfield        #31  <Field org.json.JSONObject zzafc.zzcgk>
	//    8   15:invokeinterface #35  <Method void zzwb.zzb(String, org.json.JSONObject)>
			return;
	//    9   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   21:astore_1        
		{
			zzakb.zzb("Error requesting an ad url", ((Throwable) (obj)));
	//   11   22:ldc1            #37  <String "Error requesting an ad url">
	//   12   24:aload_1         
	//   13   25:invokestatic    #42  <Method void zzakb.zzb(String, Throwable)>
		}
		zzafa.zzod().zzat(zzcgm.zzcgl);
	//   14   28:invokestatic    #48  <Method zzaa zzafa.zzod()>
	//   15   31:aload_0         
	//   16   32:getfield        #13  <Field zzafc zzcgm>
	//   17   35:getfield        #52  <Field String zzafc.zzcgl>
	//   18   38:invokevirtual   #58  <Method void zzaa.zzat(String)>
	//   19   41:return          
	}

	private final zzafc zzcgm;
}
