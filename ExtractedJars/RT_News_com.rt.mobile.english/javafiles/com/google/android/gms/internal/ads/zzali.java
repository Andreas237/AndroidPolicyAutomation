// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzald

final class zzali
	implements Runnable
{

	zzali(zzald zzald1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcsh = zzald1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzald zzcsh>
	//    5    9:return          
	}

	public final void run()
	{
		zzcsh.zzru();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzald zzcsh>
	//    2    4:invokevirtual   #22  <Method void zzald.zzru()>
	//    3    7:return          
	}

	private final zzald zzcsh;
}
