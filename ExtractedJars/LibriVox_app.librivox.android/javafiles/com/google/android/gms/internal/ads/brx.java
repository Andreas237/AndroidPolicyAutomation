// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abo, brw

final class brx extends abo
{

	brx(brw brw1)
	{
		a = brw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field brw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void abo()>
	//    5    9:return          
	}

	public final boolean cancel(boolean flag)
	{
		brw.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field brw a>
	//    2    4:invokestatic    #20  <Method void brw.a(brw)>
		return super.cancel(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #22  <Method boolean abo.cancel(boolean)>
	//    6   12:ireturn         
	}

	private final brw a;
}
