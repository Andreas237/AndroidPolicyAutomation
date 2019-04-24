// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.content.*;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			List3DActivity

class List3DActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field List3DActivity a>
	//    2    4:invokevirtual   #21  <Method void List3DActivity.finish()>
	//    3    7:return          
	}

	final List3DActivity a;

	List3DActivity$1(List3DActivity list3dactivity)
	{
		a = list3dactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field List3DActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
