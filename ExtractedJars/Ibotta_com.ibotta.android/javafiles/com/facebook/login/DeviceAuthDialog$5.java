// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$5
	implements android.content.lickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (DeviceAuthDialog.access$800(DeviceAuthDialog.this, false)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #27  <Method android.view.View DeviceAuthDialog.access$800(DeviceAuthDialog, boolean)>
	//    4    8:astore_1        
		DeviceAuthDialog.access$900(DeviceAuthDialog.this).setContentView(((android.view.View) (dialoginterface)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field DeviceAuthDialog this$0>
	//    7   13:invokestatic    #31  <Method Dialog DeviceAuthDialog.access$900(DeviceAuthDialog)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #37  <Method void Dialog.setContentView(android.view.View)>
		dialoginterface = ((DialogInterface) (DeviceAuthDialog.this));
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field DeviceAuthDialog this$0>
	//   12   24:astore_1        
		((DeviceAuthDialog) (dialoginterface)).startLogin(DeviceAuthDialog.access$1000(((DeviceAuthDialog) (dialoginterface))));
	//   13   25:aload_1         
	//   14   26:aload_1         
	//   15   27:invokestatic    #41  <Method LoginClient$Request DeviceAuthDialog.access$1000(DeviceAuthDialog)>
	//   16   30:invokevirtual   #45  <Method void DeviceAuthDialog.startLogin(LoginClient$Request)>
	//   17   33:return          
	}

	final DeviceAuthDialog this$0;

	DeviceAuthDialog$5()
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
