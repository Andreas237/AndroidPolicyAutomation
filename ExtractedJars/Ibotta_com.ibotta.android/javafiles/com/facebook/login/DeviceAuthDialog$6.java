// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$6
	implements android.content.lickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		DeviceAuthDialog.access$1100(DeviceAuthDialog.this, val$userId, val$permissions, val$accessToken);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DeviceAuthDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String val$userId>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field String val$accessToken>
	//    8   16:invokestatic    #37  <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String)>
	//    9   19:return          
	}

	final DeviceAuthDialog this$0;
	final String val$accessToken;
	final com.facebook.internal.Pair val$permissions;
	final String val$userId;

	DeviceAuthDialog$6()
	{
		this$0 = final_deviceauthdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DeviceAuthDialog this$0>
		val$userId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$userId>
		val$permissions = pair;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
		val$accessToken = String.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field String val$accessToken>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
