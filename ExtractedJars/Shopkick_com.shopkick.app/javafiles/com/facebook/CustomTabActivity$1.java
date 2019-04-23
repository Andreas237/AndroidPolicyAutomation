// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;

// Referenced classes of package com.facebook:
//			CustomTabActivity

class CustomTabActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CustomTabActivity this$0>
	//    2    4:invokevirtual   #24  <Method void CustomTabActivity.finish()>
	//    3    7:return          
	}

	final CustomTabActivity this$0;

	CustomTabActivity$1()
	{
		this$0 = CustomTabActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CustomTabActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
