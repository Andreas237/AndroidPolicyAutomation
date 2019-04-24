// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.facebook.*;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//			Utility

public final class Validate
{

	public Validate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static void containsNoNullOrEmpty(Collection collection, String s)
	{
		notNull(((Object) (collection)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method void notNull(Object, String)>
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            122
		{
			String s1 = (String)((Iterator) (collection)).next();
	//    9   21:aload_0         
	//   10   22:invokeinterface #48  <Method Object Iterator.next()>
	//   11   27:checkcast       #50  <Class String>
	//   12   30:astore_2        
			if(s1 == null)
	//*  13   31:aload_2         
	//*  14   32:ifnonnull       75
			{
				collection = ((Collection) (new StringBuilder()));
	//   15   35:new             #52  <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #53  <Method void StringBuilder()>
	//   18   42:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   19   43:aload_0         
	//   20   44:ldc1            #55  <String "Container '">
	//   21   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
				((StringBuilder) (collection)).append(s);
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
				((StringBuilder) (collection)).append("' cannot contain null values");
	//   27   56:aload_0         
	//   28   57:ldc1            #61  <String "' cannot contain null values">
	//   29   59:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
				throw new NullPointerException(((StringBuilder) (collection)).toString());
	//   31   63:new             #63  <Class NullPointerException>
	//   32   66:dup             
	//   33   67:aload_0         
	//   34   68:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   35   71:invokespecial   #70  <Method void NullPointerException(String)>
	//   36   74:athrow          
			}
			if(s1.length() == 0)
	//*  37   75:aload_2         
	//*  38   76:invokevirtual   #74  <Method int String.length()>
	//*  39   79:ifne            12
			{
				collection = ((Collection) (new StringBuilder()));
	//   40   82:new             #52  <Class StringBuilder>
	//   41   85:dup             
	//   42   86:invokespecial   #53  <Method void StringBuilder()>
	//   43   89:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   44   90:aload_0         
	//   45   91:ldc1            #55  <String "Container '">
	//   46   93:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
				((StringBuilder) (collection)).append(s);
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
				((StringBuilder) (collection)).append("' cannot contain empty values");
	//   52  103:aload_0         
	//   53  104:ldc1            #76  <String "' cannot contain empty values">
	//   54  106:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
				throw new IllegalArgumentException(((StringBuilder) (collection)).toString());
	//   56  110:new             #78  <Class IllegalArgumentException>
	//   57  113:dup             
	//   58  114:aload_0         
	//   59  115:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   60  118:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   61  121:athrow          
			}
		}

	//   62  122:return          
	}

	public static void containsNoNulls(Collection collection, String s)
	{
		notNull(((Object) (collection)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method void notNull(Object, String)>
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            70
			if(((Iterator) (collection)).next() == null)
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #48  <Method Object Iterator.next()>
	//*  11   27:ifnonnull       12
			{
				collection = ((Collection) (new StringBuilder()));
	//   12   30:new             #52  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #53  <Method void StringBuilder()>
	//   15   37:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   16   38:aload_0         
	//   17   39:ldc1            #55  <String "Container '">
	//   18   41:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
				((StringBuilder) (collection)).append(s);
	//   20   45:aload_0         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
				((StringBuilder) (collection)).append("' cannot contain null values");
	//   24   51:aload_0         
	//   25   52:ldc1            #61  <String "' cannot contain null values">
	//   26   54:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
				throw new NullPointerException(((StringBuilder) (collection)).toString());
	//   28   58:new             #63  <Class NullPointerException>
	//   29   61:dup             
	//   30   62:aload_0         
	//   31   63:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   32   66:invokespecial   #70  <Method void NullPointerException(String)>
	//   33   69:athrow          
			}

	//   34   70:return          
	}

	public static String hasAppID()
	{
		String s = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #89  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_0        
		if(s == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       18
			throw new IllegalStateException("No App ID found, please set the App ID.");
	//    4    8:new             #91  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #93  <String "No App ID found, please set the App ID.">
	//    7   14:invokespecial   #94  <Method void IllegalStateException(String)>
	//    8   17:athrow          
		else
			return s;
	//    9   18:aload_0         
	//   10   19:areturn         
	}

	public static void hasContentProvider(Context context)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "context">
	//    2    3:invokestatic    #32  <Method void notNull(Object, String)>
		String s = hasAppID();
	//    3    6:invokestatic    #100 <Method String hasAppID()>
	//    4    9:astore_1        
		context = ((Context) (context.getPackageManager()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #106 <Method PackageManager Context.getPackageManager()>
	//    7   14:astore_0        
		if(context != null)
	//*   8   15:aload_0         
	//*   9   16:ifnull          75
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #52  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #53  <Method void StringBuilder()>
	//   13   26:astore_2        
			stringbuilder.append("com.facebook.app.FacebookContentProvider");
	//   14   27:aload_2         
	//   15   28:ldc1            #8   <String "com.facebook.app.FacebookContentProvider">
	//   16   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(s);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			s = stringbuilder.toString();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   24   44:astore_1        
			if(((PackageManager) (context)).resolveContentProvider(s, 0) == null)
	//*  25   45:aload_0         
	//*  26   46:aload_1         
	//*  27   47:iconst_0        
	//*  28   48:invokevirtual   #112 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//*  29   51:ifnonnull       75
				throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] {
					s
				}));
	//   30   54:new             #91  <Class IllegalStateException>
	//   31   57:dup             
	//   32   58:ldc1            #11  <String "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.">
	//   33   60:iconst_1        
	//   34   61:anewarray       Object[]
	//   35   64:dup             
	//   36   65:iconst_0        
	//   37   66:aload_1         
	//   38   67:aastore         
	//   39   68:invokestatic    #116 <Method String String.format(String, Object[])>
	//   40   71:invokespecial   #94  <Method void IllegalStateException(String)>
	//   41   74:athrow          
		}
	//   42   75:return          
	}

	public static void hasFacebookActivity(Context context)
	{
		hasFacebookActivity(context, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #120 <Method void hasFacebookActivity(Context, boolean)>
	//    3    5:return          
	}

	public static void hasFacebookActivity(Context context, boolean flag)
	{
		PackageManager packagemanager;
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "context">
	//    2    3:invokestatic    #32  <Method void notNull(Object, String)>
		packagemanager = context.getPackageManager();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #106 <Method PackageManager Context.getPackageManager()>
	//    5   10:astore_2        
		if(packagemanager == null) goto _L2; else goto _L1
	//    6   11:aload_2         
	//    7   12:ifnull          36
_L1:
		context = ((Context) (new ComponentName(context, com/facebook/FacebookActivity)));
	//    8   15:new             #124 <Class ComponentName>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:ldc1            #126 <Class FacebookActivity>
	//   12   22:invokespecial   #129 <Method void ComponentName(Context, Class)>
	//   13   25:astore_0        
		context = ((Context) (packagemanager.getActivityInfo(((ComponentName) (context)), 1)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #133 <Method android.content.pm.ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//   18   32:astore_0        
		  goto _L3
	//*  19   33:goto            38
_L2:
		context = null;
	//   20   36:aconst_null     
	//   21   37:astore_0        
_L3:
		if(context == null)
	//*  22   38:aload_0         
	//*  23   39:ifnonnull       65
		{
			if(flag)
	//*  24   42:iload_1         
	//*  25   43:ifeq            56
				throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   26   46:new             #91  <Class IllegalStateException>
	//   27   49:dup             
	//   28   50:ldc1            #14  <String "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   29   52:invokespecial   #94  <Method void IllegalStateException(String)>
	//   30   55:athrow          
			Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   31   56:getstatic       #135 <Field String TAG>
	//   32   59:ldc1            #14  <String "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   33   61:invokestatic    #141 <Method int Log.w(String, String)>
	//   34   64:pop             
		}
		return;
	//   35   65:return          
		context;
	//   36   66:astore_0        
		if(true) goto _L2; else goto _L4
_L4:
	//*  37   67:goto            36
	}

	public static void hasInternetPermissions(Context context)
	{
		hasInternetPermissions(context, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #144 <Method void hasInternetPermissions(Context, boolean)>
	//    3    5:return          
	}

	public static void hasInternetPermissions(Context context, boolean flag)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "context">
	//    2    3:invokestatic    #32  <Method void notNull(Object, String)>
		if(context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
	//*   3    6:aload_0         
	//*   4    7:ldc1            #146 <String "android.permission.INTERNET">
	//*   5    9:invokevirtual   #150 <Method int Context.checkCallingOrSelfPermission(String)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          39
		{
			if(flag)
	//*   8   16:iload_1         
	//*   9   17:ifeq            30
				throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   10   20:new             #91  <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc1            #17  <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   13   26:invokespecial   #94  <Method void IllegalStateException(String)>
	//   14   29:athrow          
			Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   15   30:getstatic       #135 <Field String TAG>
	//   16   33:ldc1            #17  <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   17   35:invokestatic    #141 <Method int Log.w(String, String)>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	public static void notEmpty(Collection collection, String s)
	{
		if(collection.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #154 <Method boolean Collection.isEmpty()>
	//*   2    6:ifeq            49
		{
			collection = ((Collection) (new StringBuilder()));
	//    3    9:new             #52  <Class StringBuilder>
	//    4   12:dup             
	//    5   13:invokespecial   #53  <Method void StringBuilder()>
	//    6   16:astore_0        
			((StringBuilder) (collection)).append("Container '");
	//    7   17:aload_0         
	//    8   18:ldc1            #55  <String "Container '">
	//    9   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
			((StringBuilder) (collection)).append(s);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (collection)).append("' cannot be empty");
	//   15   30:aload_0         
	//   16   31:ldc1            #156 <String "' cannot be empty">
	//   17   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new IllegalArgumentException(((StringBuilder) (collection)).toString());
	//   19   37:new             #78  <Class IllegalArgumentException>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		} else
		{
			return;
	//   25   49:return          
		}
	}

	public static void notEmptyAndContainsNoNulls(Collection collection, String s)
	{
		containsNoNulls(collection, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #159 <Method void containsNoNulls(Collection, String)>
		notEmpty(collection, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #161 <Method void notEmpty(Collection, String)>
	//    6   10:return          
	}

	public static void notNull(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       44
		{
			obj = ((Object) (new StringBuilder()));
	//    2    4:new             #52  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #53  <Method void StringBuilder()>
	//    5   11:astore_0        
			((StringBuilder) (obj)).append("Argument '");
	//    6   12:aload_0         
	//    7   13:ldc1            #163 <String "Argument '">
	//    8   15:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			((StringBuilder) (obj)).append(s);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			((StringBuilder) (obj)).append("' cannot be null");
	//   14   25:aload_0         
	//   15   26:ldc1            #165 <String "' cannot be null">
	//   16   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   18   32:new             #63  <Class NullPointerException>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   22   40:invokespecial   #70  <Method void NullPointerException(String)>
	//   23   43:athrow          
		} else
		{
			return;
	//   24   44:return          
		}
	}

	public static void notNullOrEmpty(String s, String s1)
	{
		if(Utility.isNullOrEmpty(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #173 <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifeq            47
		{
			s = ((String) (new StringBuilder()));
	//    3    7:new             #52  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #53  <Method void StringBuilder()>
	//    6   14:astore_0        
			((StringBuilder) (s)).append("Argument '");
	//    7   15:aload_0         
	//    8   16:ldc1            #163 <String "Argument '">
	//    9   18:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (s)).append(s1);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (s)).append("' cannot be null or empty");
	//   15   28:aload_0         
	//   16   29:ldc1            #175 <String "' cannot be null or empty">
	//   17   31:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   19   35:new             #78  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			return;
	//   25   47:return          
		}
	}

	public static transient void oneOf(Object obj, String s, Object aobj[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int j = aobj.length; i < j; i++)
	//*   2    2:aload_2         
	//*   3    3:arraylength     
	//*   4    4:istore          4
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          44
		{
			Object obj1 = aobj[i];
	//    8   12:aload_2         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          5
			if(obj1 != null)
	//*  12   17:aload           5
	//*  13   19:ifnull          32
			{
				if(obj1.equals(obj))
	//*  14   22:aload           5
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #181 <Method boolean Object.equals(Object)>
	//*  17   28:ifeq            37
					return;
	//   18   31:return          
				continue;
			}
			if(obj == null)
	//*  19   32:aload_0         
	//*  20   33:ifnonnull       37
				return;
	//   21   36:return          
		}

	//   22   37:iload_3         
	//   23   38:iconst_1        
	//   24   39:iadd            
	//   25   40:istore_3        
	//*  26   41:goto            6
		obj = ((Object) (new StringBuilder()));
	//   27   44:new             #52  <Class StringBuilder>
	//   28   47:dup             
	//   29   48:invokespecial   #53  <Method void StringBuilder()>
	//   30   51:astore_0        
		((StringBuilder) (obj)).append("Argument '");
	//   31   52:aload_0         
	//   32   53:ldc1            #163 <String "Argument '">
	//   33   55:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   34   58:pop             
		((StringBuilder) (obj)).append(s);
	//   35   59:aload_0         
	//   36   60:aload_1         
	//   37   61:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   38   64:pop             
		((StringBuilder) (obj)).append("' was not one of the allowed values");
	//   39   65:aload_0         
	//   40   66:ldc1            #183 <String "' was not one of the allowed values">
	//   41   68:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   42   71:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   43   72:new             #78  <Class IllegalArgumentException>
	//   44   75:dup             
	//   45   76:aload_0         
	//   46   77:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   47   80:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   48   83:athrow          
	}

	public static void runningOnUiThread()
	{
		if(!((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   0    0:invokestatic    #190 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #193 <Method Looper Looper.myLooper()>
	//*   2    6:invokevirtual   #181 <Method boolean Object.equals(Object)>
	//*   3    9:ifne            22
			throw new FacebookException("This method should be called from the UI thread");
	//    4   12:new             #195 <Class FacebookException>
	//    5   15:dup             
	//    6   16:ldc1            #197 <String "This method should be called from the UI thread">
	//    7   18:invokespecial   #198 <Method void FacebookException(String)>
	//    8   21:athrow          
		else
			return;
	//    9   22:return          
	}

	public static void sdkInitialized()
	{
		if(!FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #202 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifne            16
			throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
	//    2    6:new             #204 <Class FacebookSdkNotInitializedException>
	//    3    9:dup             
	//    4   10:ldc1            #206 <String "The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.">
	//    5   12:invokespecial   #207 <Method void FacebookSdkNotInitializedException(String)>
	//    6   15:athrow          
		else
			return;
	//    7   16:return          
	}

	private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
	private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
	private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
	private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
	private static final String TAG = "com.facebook.internal.Validate";

	static 
	{
	//    0    0:return          
	}
}
