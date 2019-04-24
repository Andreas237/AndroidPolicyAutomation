// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapi

final class zzapk
	implements Runnable
{

	zzapk(zzapi zzapi1)
	{
		zzcyd = zzapi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzapi zzcyd>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzapi.zza(zzcyd, "surfaceCreated", new String[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzapi zzcyd>
	//    2    4:ldc1            #19  <String "surfaceCreated">
	//    3    6:iconst_0        
	//    4    7:anewarray       String[]
	//    5   10:invokestatic    #27  <Method void zzapi.zza(zzapi, String, String[])>
	//    6   13:return          
	}

	private final zzapi zzcyd;
}
