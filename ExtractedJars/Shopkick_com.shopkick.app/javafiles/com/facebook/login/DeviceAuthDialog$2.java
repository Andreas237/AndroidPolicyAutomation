// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.view.View;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$2
	implements android.view.r
{

	public void onClick(View view)
	{
		onCancel();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
	//    2    4:invokevirtual   #26  <Method void DeviceAuthDialog.onCancel()>
	//    3    7:return          
	}

	final DeviceAuthDialog this$0;

	DeviceAuthDialog$2()
	{
		this$0 = DeviceAuthDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
