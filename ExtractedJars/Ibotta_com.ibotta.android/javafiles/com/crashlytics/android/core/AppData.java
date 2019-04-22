// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.IdManager;

class AppData
{

	AppData(String s, String s1, String s2, String s3, String s4, String s5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		apiKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String apiKey>
		buildId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String buildId>
		installerPackageName = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String installerPackageName>
		packageName = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field String packageName>
		versionCode = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #26  <Field String versionCode>
		versionName = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #28  <Field String versionName>
	//   20   37:return          
	}

	public static AppData create(Context context, IdManager idmanager, String s, String s1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		String s2 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method String Context.getPackageName()>
	//    2    4:astore          4
		idmanager = ((IdManager) (idmanager.getInstallerPackageName()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #44  <Method String IdManager.getInstallerPackageName()>
	//    5   10:astore_1        
		context = ((Context) (context.getPackageManager().getPackageInfo(s2, 0)));
	//    6   11:aload_0         
	//    7   12:invokevirtual   #48  <Method PackageManager Context.getPackageManager()>
	//    8   15:aload           4
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #54  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   11   21:astore_0        
		String s3 = Integer.toString(((PackageInfo) (context)).versionCode);
	//   12   22:aload_0         
	//   13   23:getfield        #59  <Field int PackageInfo.versionCode>
	//   14   26:invokestatic    #65  <Method String Integer.toString(int)>
	//   15   29:astore          5
		if(((PackageInfo) (context)).versionName == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #66  <Field String PackageInfo.versionName>
	//*  18   35:ifnonnull       44
			context = "0.0";
	//   19   38:ldc1            #68  <String "0.0">
	//   20   40:astore_0        
		else
	//*  21   41:goto            49
			context = ((Context) (((PackageInfo) (context)).versionName));
	//   22   44:aload_0         
	//   23   45:getfield        #66  <Field String PackageInfo.versionName>
	//   24   48:astore_0        
		return new AppData(s, s1, ((String) (idmanager)), s2, s3, ((String) (context)));
	//   25   49:new             #2   <Class AppData>
	//   26   52:dup             
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:aload_1         
	//   30   56:aload           4
	//   31   58:aload           5
	//   32   60:aload_0         
	//   33   61:invokespecial   #70  <Method void AppData(String, String, String, String, String, String)>
	//   34   64:areturn         
	}

	public final String apiKey;
	public final String buildId;
	public final String installerPackageName;
	public final String packageName;
	public final String versionCode;
	public final String versionName;
}
