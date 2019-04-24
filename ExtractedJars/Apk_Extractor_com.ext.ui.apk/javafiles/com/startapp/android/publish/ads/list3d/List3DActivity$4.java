// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.content.Intent;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			List3DActivity

class List3DActivity$4
	implements Runnable
{

	public void run()
	{
		Intent intent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
	//    0    0:new             #24  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "android.intent.action.CLOSE_SYSTEM_DIALOGS">
	//    3    6:invokespecial   #29  <Method void Intent(String)>
	//    4    9:astore_1        
		a.sendBroadcast(intent);
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field List3DActivity a>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #33  <Method void List3DActivity.sendBroadcast(Intent)>
	//    9   18:return          
	}

	final List3DActivity a;

	List3DActivity$4(List3DActivity list3dactivity)
	{
		a = list3dactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field List3DActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
