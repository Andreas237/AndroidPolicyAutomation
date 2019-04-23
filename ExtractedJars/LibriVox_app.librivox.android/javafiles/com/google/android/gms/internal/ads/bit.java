// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bip, biy

final class bit
	implements Runnable
{

	bit(bip bip1, IOException ioexception)
	{
		b = bip1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bip b>
		a = ioexception;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field IOException a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		bip.e(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bip b>
	//    2    4:invokestatic    #27  <Method biy bip.e(bip)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field IOException a>
	//    5   11:invokeinterface #32  <Method void biy.a(IOException)>
	//    6   16:return          
	}

	private final IOException a;
	private final bip b;
}
