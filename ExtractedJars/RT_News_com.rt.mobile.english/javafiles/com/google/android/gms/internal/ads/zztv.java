// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zztw

final class zztv
	implements Runnable
{

	private zztv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final void run()
	{
		zzbv.zzex().zzld();
	//    0    0:invokestatic    #24  <Method zztw zzbv.zzex()>
	//    1    3:invokevirtual   #29  <Method void zztw.zzld()>
	//    2    6:return          
	}

	static final Runnable zzboj = new zztv();

	static 
	{
	//    0    0:new             #2   <Class zztv>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zztv()>
	//    3    7:putstatic       #15  <Field Runnable zzboj>
	//*   4   10:return          
	}
}
