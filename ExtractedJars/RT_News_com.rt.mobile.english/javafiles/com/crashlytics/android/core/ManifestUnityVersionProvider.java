// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.core:
//			UnityVersionProvider

class ManifestUnityVersionProvider
	implements UnityVersionProvider
{

	public ManifestUnityVersionProvider(Context context1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context context>
		packageName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String packageName>
	//    8   14:return          
	}

	public String getUnityVersion()
	{
		Object obj = ((Object) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context context>
	//    2    4:invokevirtual   #33  <Method PackageManager Context.getPackageManager()>
	//    3    7:astore_2        
		String s = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getApplicationInfo(packageName, 128).metaData));
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field String packageName>
	//    9   15:sipush          128
	//   10   18:invokevirtual   #39  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   11   21:getfield        #45  <Field Bundle ApplicationInfo.metaData>
	//   12   24:astore_2        
		}
	//*  13   25:aload_2         
	//*  14   26:ifnull          36
	//*  15   29:aload_2         
	//*  16   30:ldc1            #10  <String "io.fabric.unity.crashlytics.version">
	//*  17   32:invokevirtual   #51  <Method String Bundle.getString(String)>
	//*  18   35:astore_1        
	//*  19   36:aload_1         
	//*  20   37:areturn         
		catch(Exception exception)
	//*  21   38:astore_1        
		{
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_36;
		s = ((Bundle) (obj)).getString("io.fabric.unity.crashlytics.version");
		return s;
	}

	static final String FABRIC_UNITY_CRASHLYTICS_VERSION_KEY = "io.fabric.unity.crashlytics.version";
	private final Context context;
	private final String packageName;
}
