// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.bumptech.glide.signature:
//			ObjectKey

public final class ApplicationVersionSignature
{

	private ApplicationVersionSignature()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Key obtain(Context context)
	{
		String s = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method String Context.getPackageName()>
	//    2    4:astore_3        
		Key key = (Key)PACKAGE_NAME_TO_KEY.get(((Object) (s)));
	//    3    5:getstatic       #16  <Field ConcurrentHashMap PACKAGE_NAME_TO_KEY>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #30  <Method Object ConcurrentHashMap.get(Object)>
	//    6   12:checkcast       #32  <Class Key>
	//    7   15:astore_2        
		Object obj = ((Object) (key));
	//    8   16:aload_2         
	//    9   17:astore_1        
		if(key == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       47
		{
			context = ((Context) (obtainVersionSignature(context)));
	//   12   22:aload_0         
	//   13   23:invokestatic    #35  <Method Key obtainVersionSignature(Context)>
	//   14   26:astore_0        
			Key key1 = (Key)PACKAGE_NAME_TO_KEY.putIfAbsent(((Object) (s)), ((Object) (context)));
	//   15   27:getstatic       #16  <Field ConcurrentHashMap PACKAGE_NAME_TO_KEY>
	//   16   30:aload_3         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #39  <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   19   35:checkcast       #32  <Class Key>
	//   20   38:astore_2        
			obj = ((Object) (key1));
	//   21   39:aload_2         
	//   22   40:astore_1        
			if(key1 == null)
	//*  23   41:aload_2         
	//*  24   42:ifnonnull       47
				obj = ((Object) (context));
	//   25   45:aload_0         
	//   26   46:astore_1        
		}
		return ((Key) (obj));
	//   27   47:aload_1         
	//   28   48:areturn         
	}

	private static Key obtainVersionSignature(Context context)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #45  <Method PackageManager Context.getPackageManager()>
	//    4    6:aload_0         
	//    5    7:invokevirtual   #26  <Method String Context.getPackageName()>
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #51  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:astore_0        
		}
	//*   9   15:goto            25
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			((android.content.pm.PackageManager.NameNotFoundException) (context)).printStackTrace();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #54  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			context = ((Context) (obj));
	//   13   23:aload_1         
	//   14   24:astore_0        
		}
		if(context != null)
	//*  15   25:aload_0         
	//*  16   26:ifnull          40
			context = ((Context) (String.valueOf(((PackageInfo) (context)).versionCode)));
	//   17   29:aload_0         
	//   18   30:getfield        #60  <Field int PackageInfo.versionCode>
	//   19   33:invokestatic    #66  <Method String String.valueOf(int)>
	//   20   36:astore_0        
		else
	//*  21   37:goto            47
			context = ((Context) (UUID.randomUUID().toString()));
	//   22   40:invokestatic    #72  <Method UUID UUID.randomUUID()>
	//   23   43:invokevirtual   #75  <Method String UUID.toString()>
	//   24   46:astore_0        
		return ((Key) (new ObjectKey(((Object) (context)))));
	//   25   47:new             #77  <Class ObjectKey>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #80  <Method void ObjectKey(Object)>
	//   29   55:areturn         
	}

	static void reset()
	{
		PACKAGE_NAME_TO_KEY.clear();
	//    0    0:getstatic       #16  <Field ConcurrentHashMap PACKAGE_NAME_TO_KEY>
	//    1    3:invokevirtual   #84  <Method void ConcurrentHashMap.clear()>
	//    2    6:return          
	}

	private static final ConcurrentHashMap PACKAGE_NAME_TO_KEY = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #11  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #16  <Field ConcurrentHashMap PACKAGE_NAME_TO_KEY>
	//*   4   10:return          
	}
}
