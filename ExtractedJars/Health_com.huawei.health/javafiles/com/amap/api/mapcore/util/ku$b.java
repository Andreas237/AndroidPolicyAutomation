// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.HandlerThread;

// Referenced classes of package com.amap.api.mapcore.util:
//			ku

final class ku$b extends HandlerThread
{

	protected final void onLooperPrepared()
	{
		super.onLooperPrepared();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void HandlerThread.onLooperPrepared()>
	//    2    4:return          
	}

	final ku a;

	public ku$b(ku ku1, String s)
	{
		a = ku1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ku a>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void HandlerThread(String)>
	//    6   10:return          
	}
}
