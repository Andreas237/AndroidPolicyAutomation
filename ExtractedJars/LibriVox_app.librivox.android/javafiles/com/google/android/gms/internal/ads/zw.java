// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zy, zx, zv

final class zw
	implements zy
{

	zw(zv zv)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void a(String s)
	{
		(new zx(this, s)).start();
	//    0    0:new             #16  <Class zx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #19  <Method void zx(zw, String)>
	//    5    9:invokevirtual   #22  <Method void zx.start()>
	//    6   12:return          
	}
}
