// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.offlineservice;

import android.content.DialogInterface;

// Referenced classes of package com.amap.api.offlineservice:
//			AMapPermissionActivity

class AMapPermissionActivity$1
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		try
		{
			a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AMapPermissionActivity a>
	//    2    4:invokevirtual   #26  <Method void AMapPermissionActivity.finish()>
			return;
	//    3    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(DialogInterface dialoginterface)
	//*   4    8:astore_1        
		{
			((Throwable) (dialoginterface)).printStackTrace();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #29  <Method void Throwable.printStackTrace()>
		}
	//    7   13:return          
	}

	final AMapPermissionActivity a;

	AMapPermissionActivity$1(AMapPermissionActivity amappermissionactivity)
	{
		a = amappermissionactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AMapPermissionActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
