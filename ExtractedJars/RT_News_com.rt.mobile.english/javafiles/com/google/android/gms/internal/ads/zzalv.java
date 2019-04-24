// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzakb, zzajm, zzalz, 
//			zzano, zzalt, zzanz

final class zzalv
	implements zzanj
{

	zzalv(zzalt zzalt, zzalz zzalz1)
	{
		zzcti = zzalz1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field zzalz zzcti>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final zzanz zzc(Object obj)
		throws Exception
	{
		obj = ((Object) ((Throwable)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class Throwable>
	//    2    4:astore_1        
		zzakb.zzb("Error occurred while dispatching http response in getter.", ((Throwable) (obj)));
	//    3    5:ldc1            #25  <String "Error occurred while dispatching http response in getter.">
	//    4    7:aload_1         
	//    5    8:invokestatic    #31  <Method void zzakb.zzb(String, Throwable)>
		zzbv.zzeo().zza(((Throwable) (obj)), "HttpGetter.deliverResponse.1");
	//    6   11:invokestatic    #37  <Method zzajm zzbv.zzeo()>
	//    7   14:aload_1         
	//    8   15:ldc1            #39  <String "HttpGetter.deliverResponse.1">
	//    9   17:invokevirtual   #45  <Method void zzajm.zza(Throwable, String)>
		return ((zzanz) (zzano.zzi(zzcti.zzny())));
	//   10   20:aload_0         
	//   11   21:getfield        #13  <Field zzalz zzcti>
	//   12   24:invokeinterface #51  <Method Object zzalz.zzny()>
	//   13   29:invokestatic    #57  <Method zzany zzano.zzi(Object)>
	//   14   32:areturn         
	}

	private final zzalz zzcti;
}
