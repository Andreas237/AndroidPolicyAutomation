// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.app.Dialog;

// Referenced classes of package com.facebook.share.internal:
//			DeviceShareDialogFragment

class DeviceShareDialogFragment$3
	implements Runnable
{

	public void run()
	{
		DeviceShareDialogFragment.access$000(DeviceShareDialogFragment.this).dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeviceShareDialogFragment this$0>
	//    2    4:invokestatic    #26  <Method Dialog DeviceShareDialogFragment.access$000(DeviceShareDialogFragment)>
	//    3    7:invokevirtual   #31  <Method void Dialog.dismiss()>
	//    4   10:return          
	}

	final DeviceShareDialogFragment this$0;

	DeviceShareDialogFragment$3()
	{
		this$0 = DeviceShareDialogFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeviceShareDialogFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
