// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.DialogInterface;
import java.util.Date;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$6
	implements android.content.lickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		DeviceAuthDialog.access$900(DeviceAuthDialog.this, val$userId, val$permissions, val$accessToken, val$expirationTime, val$dataAccessExpirationTime);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DeviceAuthDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field String val$userId>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field String val$accessToken>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field Date val$expirationTime>
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field Date val$dataAccessExpirationTime>
	//   12   24:invokestatic    #44  <Method void DeviceAuthDialog.access$900(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
	//   13   27:return          
	}

	final DeviceAuthDialog this$0;
	final String val$accessToken;
	final Date val$dataAccessExpirationTime;
	final Date val$expirationTime;
	final com.facebook.internal.Pair val$permissions;
	final String val$userId;

	DeviceAuthDialog$6()
	{
		this$0 = final_deviceauthdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field DeviceAuthDialog this$0>
		val$userId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field String val$userId>
		val$permissions = pair;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
		val$accessToken = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field String val$accessToken>
		val$expirationTime = date;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field Date val$expirationTime>
		val$dataAccessExpirationTime = Date.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #35  <Field Date val$dataAccessExpirationTime>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #38  <Method void Object()>
	//   20   37:return          
	}
}
