// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.p;

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

	public static AppData create(Context context, p p1, String s, String s1)
	{
		String s2 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method String Context.getPackageName()>
	//    2    4:astore          4
		p1 = ((p) (p1.i()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #42  <Method String p.i()>
	//    5   10:astore_1        
		context = ((Context) (context.getPackageManager().getPackageInfo(s2, 0)));
	//    6   11:aload_0         
	//    7   12:invokevirtual   #46  <Method PackageManager Context.getPackageManager()>
	//    8   15:aload           4
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #52  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   11   21:astore_0        
		String s3 = Integer.toString(((PackageInfo) (context)).versionCode);
	//   12   22:aload_0         
	//   13   23:getfield        #57  <Field int PackageInfo.versionCode>
	//   14   26:invokestatic    #63  <Method String Integer.toString(int)>
	//   15   29:astore          5
		if(((PackageInfo) (context)).versionName == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #64  <Field String PackageInfo.versionName>
	//*  18   35:ifnonnull       44
			context = "0.0";
	//   19   38:ldc1            #66  <String "0.0">
	//   20   40:astore_0        
		else
	//*  21   41:goto            52
			context = ((Context) (((PackageInfo) (context)).versionName));
	//   22   44:aload_0         
	//   23   45:getfield        #64  <Field String PackageInfo.versionName>
	//   24   48:astore_0        
	//*  25   49:goto            41
		return new AppData(s, s1, ((String) (p1)), s2, s3, ((String) (context)));
	//   26   52:new             #2   <Class AppData>
	//   27   55:dup             
	//   28   56:aload_2         
	//   29   57:aload_3         
	//   30   58:aload_1         
	//   31   59:aload           4
	//   32   61:aload           5
	//   33   63:aload_0         
	//   34   64:invokespecial   #68  <Method void AppData(String, String, String, String, String, String)>
	//   35   67:areturn         
	}

	public final String apiKey;
	public final String buildId;
	public final String installerPackageName;
	public final String packageName;
	public final String versionCode;
	public final String versionName;
}
