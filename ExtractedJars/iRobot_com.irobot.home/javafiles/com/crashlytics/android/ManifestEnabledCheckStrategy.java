// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

class ManifestEnabledCheckStrategy
	implements CrashlyticsInitProvider.EnabledCheckStrategy
{

	ManifestEnabledCheckStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean isCrashlyticsEnabled(Context context)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		try
		{
			String s = context.getPackageName();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #21  <Method String Context.getPackageName()>
	//    4    6:astore_3        
			context = ((Context) (context.getPackageManager().getApplicationInfo(s, 128).metaData));
	//    5    7:aload_1         
	//    6    8:invokevirtual   #25  <Method PackageManager Context.getPackageManager()>
	//    7   11:aload_3         
	//    8   12:sipush          128
	//    9   15:invokevirtual   #31  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   10   18:getfield        #37  <Field Bundle ApplicationInfo.metaData>
	//   11   21:astore_1        
		}
	//*  12   22:aload_1         
	//*  13   23:ifnull          42
	//*  14   26:aload_1         
	//*  15   27:ldc1            #39  <String "firebase_crashlytics_collection_enabled">
	//*  16   29:iconst_1        
	//*  17   30:invokevirtual   #45  <Method boolean Bundle.getBoolean(String, boolean)>
	//*  18   33:istore_2        
	//*  19   34:iload_2         
	//*  20   35:ifeq            40
	//*  21   38:iconst_1        
	//*  22   39:ireturn         
	//*  23   40:iconst_0        
	//*  24   41:istore_2        
	//*  25   42:iload_2         
	//*  26   43:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   44:astore_1        
		{
			return true;
	//   28   45:iconst_1        
	//   29   46:ireturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_42;
		flag = ((Bundle) (context)).getBoolean("firebase_crashlytics_collection_enabled", true);
		if(flag)
			return true;
		flag = false;
		return flag;
	}
}
