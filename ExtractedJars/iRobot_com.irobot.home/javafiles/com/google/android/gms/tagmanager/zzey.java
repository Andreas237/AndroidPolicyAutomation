// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzex

final class zzey
	implements Runnable
{

	zzey(zzex zzex1)
	{
		zzbez = zzex1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzex zzbez>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzbez.zzpr();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzex zzbez>
	//    2    4:invokevirtual   #22  <Method void zzex.zzpr()>
	//    3    7:return          
	}

	private final zzex zzbez;
}