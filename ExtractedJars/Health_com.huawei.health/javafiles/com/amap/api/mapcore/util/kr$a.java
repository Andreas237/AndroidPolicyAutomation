// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.HandlerThread;

// Referenced classes of package com.amap.api.mapcore.util:
//			kr, ku

static final class kr$a extends HandlerThread
{

	protected final void onLooperPrepared()
	{
		try
		{
			a.h = new ku(a.a, a.d);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field kr a>
	//    2    4:new             #22  <Class ku>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field kr a>
	//    6   12:getfield        #25  <Field android.content.Context kr.a>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field kr a>
	//    9   19:getfield        #29  <Field android.os.Handler kr.d>
	//   10   22:invokespecial   #32  <Method void ku(android.content.Context, android.os.Handler)>
	//   11   25:putfield        #36  <Field ku kr.h>
			super.onLooperPrepared();
	//   12   28:aload_0         
	//   13   29:invokespecial   #38  <Method void HandlerThread.onLooperPrepared()>
			return;
	//   14   32:return          
		}
		catch(Throwable throwable)
	//*  15   33:astore_1        
		{
			return;
	//   16   34:return          
		}
	}

	kr a;

	public kr$a(String s, kr kr1)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void HandlerThread(String)>
		a = kr1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field kr a>
	//    6   10:return          
	}
}
