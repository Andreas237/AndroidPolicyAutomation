// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;
import android.support.v7.bv;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		intent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method String Intent.getAction()>
	//    2    4:pop             
		MainActivity.a(a).e();
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field MainActivity a>
	//    5    9:invokestatic    #27  <Method bv MainActivity.a(MainActivity)>
	//    6   12:invokevirtual   #32  <Method void bv.e()>
	//    7   15:return          
	}

	final MainActivity a;

	MainActivity$1(MainActivity mainactivity)
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
