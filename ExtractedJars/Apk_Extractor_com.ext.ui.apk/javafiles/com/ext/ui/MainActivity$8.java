// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$8 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MainActivity a>
	//    2    4:invokevirtual   #21  <Method void MainActivity.d()>
	//    3    7:return          
	}

	final MainActivity a;

	MainActivity$8(MainActivity mainactivity)
	{
		a = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MainActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
