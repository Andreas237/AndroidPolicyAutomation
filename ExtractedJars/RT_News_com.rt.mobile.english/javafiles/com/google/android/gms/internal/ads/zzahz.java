// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahx, zzajh

final class zzahz
	implements Runnable
{

	zzahz(zzahx zzahx1, zzajh zzajh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcmh = zzahx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzahx zzcmh>
		zzxk = zzajh;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field zzajh zzxk>
	//    8   14:return          
	}

	public final void run()
	{
		zzcmh.zzl(zzxk);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzahx zzcmh>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field zzajh zzxk>
	//    4    8:invokevirtual   #27  <Method void zzahx.zzl(zzajh)>
	//    5   11:return          
	}

	private final zzahx zzcmh;
	private final zzajh zzxk;
}
