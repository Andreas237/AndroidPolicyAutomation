// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcy

final class bcz extends Handler
{

	bcz(bcy bcy1, Looper looper)
	{
		a = bcy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field bcy a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void Handler(Looper)>
	//    6   10:return          
	}

	public final void handleMessage(Message message)
	{
		a.a(message);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field bcy a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #20  <Method void bcy.a(Message)>
	//    4    8:return          
	}

	private final bcy a;
}
