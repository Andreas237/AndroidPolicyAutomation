// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aak, zw

final class zx extends Thread
{

	zx(zw zw, String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field String a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void Thread()>
	//    5    9:return          
	}

	public final void run()
	{
		(new aak()).a(a);
	//    0    0:new             #17  <Class aak>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void aak()>
	//    3    7:aload_0         
	//    4    8:getfield        #10  <Field String a>
	//    5   11:invokevirtual   #21  <Method void aak.a(String)>
	//    6   14:return          
	}

	private final String a;
}
