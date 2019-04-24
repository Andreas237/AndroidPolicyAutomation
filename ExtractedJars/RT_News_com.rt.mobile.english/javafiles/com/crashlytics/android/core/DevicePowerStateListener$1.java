// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.*;

// Referenced classes of package com.crashlytics.android.core:
//			DevicePowerStateListener

class DevicePowerStateListener$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		DevicePowerStateListener.access$002(DevicePowerStateListener.this, true);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field DevicePowerStateListener this$0>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #24  <Method boolean DevicePowerStateListener.access$002(DevicePowerStateListener, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	final DevicePowerStateListener this$0;

	DevicePowerStateListener$1()
	{
		this$0 = DevicePowerStateListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DevicePowerStateListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
