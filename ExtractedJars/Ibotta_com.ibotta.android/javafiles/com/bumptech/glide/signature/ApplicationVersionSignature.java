// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.bumptech.glide.signature:
//			ObjectKey

public final class ApplicationVersionSignature
{

	private static PackageInfo getPackageInfo(Context context)
	{
		PackageInfo packageinfo;
		try
		{
			packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #33  <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #38  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:astore_1        
		}
	//*   7   13:aload_1         
	//*   8   14:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*   9   15:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   16:new             #40  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #41  <Method void StringBuilder()>
	//   13   23:astore_2        
			stringbuilder.append("Cannot resolve info for");
	//   14   24:aload_2         
	//   15   25:ldc1            #43  <String "Cannot resolve info for">
	//   16   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(context.getPackageName());
	//   18   31:aload_2         
	//   19   32:aload_0         
	//   20   33:invokevirtual   #33  <Method String Context.getPackageName()>
	//   21   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
			Log.e("AppVersionSignature", stringbuilder.toString(), ((Throwable) (namenotfoundexception)));
	//   23   40:ldc1            #49  <String "AppVersionSignature">
	//   24   42:aload_2         
	//   25   43:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   26   46:aload_1         
	//   27   47:invokestatic    #58  <Method int Log.e(String, String, Throwable)>
	//   28   50:pop             
			return null;
	//   29   51:aconst_null     
	//   30   52:areturn         
		}
		return packageinfo;
	}

	private static String getVersionCode(PackageInfo packageinfo)
	{
		if(packageinfo != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return String.valueOf(packageinfo.versionCode);
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field int PackageInfo.versionCode>
	//    4    8:invokestatic    #74  <Method String String.valueOf(int)>
	//    5   11:areturn         
		else
			return UUID.randomUUID().toString();
	//    6   12:invokestatic    #80  <Method UUID UUID.randomUUID()>
	//    7   15:invokevirtual   #81  <Method String UUID.toString()>
	//    8   18:areturn         
	}

	public static Key obtain(Context context)
	{
		String s = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method String Context.getPackageName()>
	//    2    4:astore_3        
		Key key1 = (Key)PACKAGE_NAME_TO_KEY.get(((Object) (s)));
	//    3    5:getstatic       #16  <Field ConcurrentMap PACKAGE_NAME_TO_KEY>
	//    4    8:aload_3         
	//    5    9:invokeinterface #89  <Method Object ConcurrentMap.get(Object)>
	//    6   14:checkcast       #91  <Class Key>
	//    7   17:astore_2        
		Key key = key1;
	//    8   18:aload_2         
	//    9   19:astore_1        
		if(key1 == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       49
		{
			context = ((Context) (obtainVersionSignature(context)));
	//   12   24:aload_0         
	//   13   25:invokestatic    #94  <Method Key obtainVersionSignature(Context)>
	//   14   28:astore_0        
			key = (Key)PACKAGE_NAME_TO_KEY.putIfAbsent(((Object) (s)), ((Object) (context)));
	//   15   29:getstatic       #16  <Field ConcurrentMap PACKAGE_NAME_TO_KEY>
	//   16   32:aload_3         
	//   17   33:aload_0         
	//   18   34:invokeinterface #98  <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   19   39:checkcast       #91  <Class Key>
	//   20   42:astore_1        
			if(key == null)
	//*  21   43:aload_1         
	//*  22   44:ifnonnull       49
				return ((Key) (context));
	//   23   47:aload_0         
	//   24   48:areturn         
		}
		return key;
	//   25   49:aload_1         
	//   26   50:areturn         
	}

	private static Key obtainVersionSignature(Context context)
	{
		return ((Key) (new ObjectKey(((Object) (getVersionCode(getPackageInfo(context)))))));
	//    0    0:new             #100 <Class ObjectKey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #102 <Method PackageInfo getPackageInfo(Context)>
	//    4    8:invokestatic    #104 <Method String getVersionCode(PackageInfo)>
	//    5   11:invokespecial   #107 <Method void ObjectKey(Object)>
	//    6   14:areturn         
	}

	private static final ConcurrentMap PACKAGE_NAME_TO_KEY = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #11  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #16  <Field ConcurrentMap PACKAGE_NAME_TO_KEY>
	//*   4   10:return          
	}
}
