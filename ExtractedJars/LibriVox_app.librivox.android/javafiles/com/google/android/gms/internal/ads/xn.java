// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xg, xj

final class xn extends BroadcastReceiver
{

	private xn(xg xg1)
	{
		a = xg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field xg a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	xn(xg xg1, xj xj)
	{
		this(xg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void xn(xg)>
	//    3    5:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		if("android.intent.action.USER_PRESENT".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #21  <String "android.intent.action.USER_PRESENT">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #27  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            22
		{
			xg.a(a, true);
	//    5   12:aload_0         
	//    6   13:getfield        #10  <Field xg a>
	//    7   16:iconst_1        
	//    8   17:invokestatic    #38  <Method boolean xg.a(xg, boolean)>
	//    9   20:pop             
			return;
	//   10   21:return          
		}
		if("android.intent.action.SCREEN_OFF".equals(((Object) (intent.getAction()))))
	//*  11   22:ldc1            #40  <String "android.intent.action.SCREEN_OFF">
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #27  <Method String Intent.getAction()>
	//*  14   28:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            43
			xg.a(a, false);
	//   16   34:aload_0         
	//   17   35:getfield        #10  <Field xg a>
	//   18   38:iconst_0        
	//   19   39:invokestatic    #38  <Method boolean xg.a(xg, boolean)>
	//   20   42:pop             
	//   21   43:return          
	}

	private final xg a;
}
