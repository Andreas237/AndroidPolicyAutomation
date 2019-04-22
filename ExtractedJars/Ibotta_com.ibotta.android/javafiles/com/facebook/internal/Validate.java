// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.*;

// Referenced classes of package com.facebook.internal:
//			Utility

public final class Validate
{

	public Validate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void containsNoNulls(Collection collection, String s)
	{
		notNull(((Object) (collection)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #20  <Method void notNull(Object, String)>
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #26  <Method Iterator Collection.iterator()>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            73
			if(((Iterator) (collection)).next() == null)
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #36  <Method Object Iterator.next()>
	//*  11   27:ifnull          33
	//*  12   30:goto            12
			{
				collection = ((Collection) (new StringBuilder()));
	//   13   33:new             #38  <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #39  <Method void StringBuilder()>
	//   16   40:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   17   41:aload_0         
	//   18   42:ldc1            #41  <String "Container '">
	//   19   44:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:pop             
				((StringBuilder) (collection)).append(s);
	//   21   48:aload_0         
	//   22   49:aload_1         
	//   23   50:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
				((StringBuilder) (collection)).append("' cannot contain null values");
	//   25   54:aload_0         
	//   26   55:ldc1            #47  <String "' cannot contain null values">
	//   27   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
				throw new NullPointerException(((StringBuilder) (collection)).toString());
	//   29   61:new             #49  <Class NullPointerException>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   33   69:invokespecial   #56  <Method void NullPointerException(String)>
	//   34   72:athrow          
			}

	//   35   73:return          
	}

	public static String hasAppID()
	{
		String s = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #64  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_0        
		if(s != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("No App ID found, please set the App ID.");
	//    6   10:new             #66  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #68  <String "No App ID found, please set the App ID.">
	//    9   16:invokespecial   #69  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	public static String hasClientToken()
	{
		String s = FacebookSdk.getClientToken();
	//    0    0:invokestatic    #73  <Method String FacebookSdk.getClientToken()>
	//    1    3:astore_0        
		if(s != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("No Client Token found, please set the Client Token.");
	//    6   10:new             #66  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #75  <String "No Client Token found, please set the Client Token.">
	//    9   16:invokespecial   #69  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	public static void hasContentProvider(Context context)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "context">
	//    2    3:invokestatic    #20  <Method void notNull(Object, String)>
		String s = hasAppID();
	//    3    6:invokestatic    #81  <Method String hasAppID()>
	//    4    9:astore_1        
		context = ((Context) (context.getPackageManager()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #87  <Method PackageManager Context.getPackageManager()>
	//    7   14:astore_0        
		if(context != null)
	//*   8   15:aload_0         
	//*   9   16:ifnull          76
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #38  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #39  <Method void StringBuilder()>
	//   13   26:astore_2        
			stringbuilder.append("com.facebook.app.FacebookContentProvider");
	//   14   27:aload_2         
	//   15   28:ldc1            #89  <String "com.facebook.app.FacebookContentProvider">
	//   16   30:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(s);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			s = stringbuilder.toString();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   44:astore_1        
			if(((PackageManager) (context)).resolveContentProvider(s, 0) != null)
	//*  25   45:aload_0         
	//*  26   46:aload_1         
	//*  27   47:iconst_0        
	//*  28   48:invokevirtual   #95  <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//*  29   51:ifnull          55
				return;
	//   30   54:return          
			else
				throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] {
					s
				}));
	//   31   55:new             #66  <Class IllegalStateException>
	//   32   58:dup             
	//   33   59:ldc1            #97  <String "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.">
	//   34   61:iconst_1        
	//   35   62:anewarray       Object[]
	//   36   65:dup             
	//   37   66:iconst_0        
	//   38   67:aload_1         
	//   39   68:aastore         
	//   40   69:invokestatic    #103 <Method String String.format(String, Object[])>
	//   41   72:invokespecial   #69  <Method void IllegalStateException(String)>
	//   42   75:athrow          
		} else
		{
			return;
	//   43   76:return          
		}
	}

	public static boolean hasCustomTabRedirectActivity(Context context)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "context">
	//    2    3:invokestatic    #20  <Method void notNull(Object, String)>
		Object obj = ((Object) (context.getPackageManager()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #87  <Method PackageManager Context.getPackageManager()>
	//    5   10:astore_2        
		if(obj != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          102
		{
			Intent intent = new Intent();
	//    8   15:new             #107 <Class Intent>
	//    9   18:dup             
	//   10   19:invokespecial   #108 <Method void Intent()>
	//   11   22:astore_3        
			intent.setAction("android.intent.action.VIEW");
	//   12   23:aload_3         
	//   13   24:ldc1            #110 <String "android.intent.action.VIEW">
	//   14   26:invokevirtual   #114 <Method Intent Intent.setAction(String)>
	//   15   29:pop             
			intent.addCategory("android.intent.category.DEFAULT");
	//   16   30:aload_3         
	//   17   31:ldc1            #116 <String "android.intent.category.DEFAULT">
	//   18   33:invokevirtual   #119 <Method Intent Intent.addCategory(String)>
	//   19   36:pop             
			intent.addCategory("android.intent.category.BROWSABLE");
	//   20   37:aload_3         
	//   21   38:ldc1            #121 <String "android.intent.category.BROWSABLE">
	//   22   40:invokevirtual   #119 <Method Intent Intent.addCategory(String)>
	//   23   43:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #38  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #39  <Method void StringBuilder()>
	//   27   51:astore          4
			stringbuilder.append("fb");
	//   28   53:aload           4
	//   29   55:ldc1            #123 <String "fb">
	//   30   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			stringbuilder.append(FacebookSdk.getApplicationId());
	//   32   61:aload           4
	//   33   63:invokestatic    #64  <Method String FacebookSdk.getApplicationId()>
	//   34   66:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			stringbuilder.append("://authorize");
	//   36   70:aload           4
	//   37   72:ldc1            #125 <String "://authorize">
	//   38   74:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
			intent.setData(Uri.parse(stringbuilder.toString()));
	//   40   78:aload_3         
	//   41   79:aload           4
	//   42   81:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   43   84:invokestatic    #131 <Method Uri Uri.parse(String)>
	//   44   87:invokevirtual   #135 <Method Intent Intent.setData(Uri)>
	//   45   90:pop             
			obj = ((Object) (((PackageManager) (obj)).queryIntentActivities(intent, 64)));
	//   46   91:aload_2         
	//   47   92:aload_3         
	//   48   93:bipush          64
	//   49   95:invokevirtual   #139 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   50   98:astore_2        
		} else
	//*  51   99:goto            104
		{
			obj = null;
	//   52  102:aconst_null     
	//   53  103:astore_2        
		}
		boolean flag = false;
	//   54  104:iconst_0        
	//   55  105:istore_1        
		if(obj != null)
	//*  56  106:aload_2         
	//*  57  107:ifnull          174
		{
			obj = ((Object) (((List) (obj)).iterator()));
	//   58  110:aload_2         
	//   59  111:invokeinterface #142 <Method Iterator List.iterator()>
	//   60  116:astore_2        
			flag = false;
	//   61  117:iconst_0        
	//   62  118:istore_1        
			while(((Iterator) (obj)).hasNext()) 
	//*  63  119:aload_2         
	//*  64  120:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  65  125:ifeq            174
			{
				ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
	//   66  128:aload_2         
	//   67  129:invokeinterface #36  <Method Object Iterator.next()>
	//   68  134:checkcast       #144 <Class ResolveInfo>
	//   69  137:getfield        #148 <Field ActivityInfo ResolveInfo.activityInfo>
	//   70  140:astore_3        
				if(activityinfo.name.equals("com.facebook.CustomTabActivity") && activityinfo.packageName.equals(((Object) (context.getPackageName()))))
	//*  71  141:aload_3         
	//*  72  142:getfield        #153 <Field String ActivityInfo.name>
	//*  73  145:ldc1            #155 <String "com.facebook.CustomTabActivity">
	//*  74  147:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  75  150:ifeq            172
	//*  76  153:aload_3         
	//*  77  154:getfield        #162 <Field String ActivityInfo.packageName>
	//*  78  157:aload_0         
	//*  79  158:invokevirtual   #165 <Method String Context.getPackageName()>
	//*  80  161:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  81  164:ifeq            172
					flag = true;
	//   82  167:iconst_1        
	//   83  168:istore_1        
				else
	//*  84  169:goto            119
					return false;
	//   85  172:iconst_0        
	//   86  173:ireturn         
			}
		}
		return flag;
	//   87  174:iload_1         
	//   88  175:ireturn         
	}

	public static void hasFacebookActivity(Context context)
	{
		hasFacebookActivity(context, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #169 <Method void hasFacebookActivity(Context, boolean)>
	//    3    5:return          
	}

	public static void hasFacebookActivity(Context context, boolean flag)
	{
		PackageManager packagemanager;
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "context">
	//    2    3:invokestatic    #20  <Method void notNull(Object, String)>
		packagemanager = context.getPackageManager();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #87  <Method PackageManager Context.getPackageManager()>
	//    5   10:astore_2        
		if(packagemanager == null) goto _L2; else goto _L1
	//    6   11:aload_2         
	//    7   12:ifnull          36
_L1:
		context = ((Context) (new ComponentName(context, "com.facebook.FacebookActivity")));
	//    8   15:new             #173 <Class ComponentName>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:ldc1            #175 <String "com.facebook.FacebookActivity">
	//   12   22:invokespecial   #178 <Method void ComponentName(Context, String)>
	//   13   25:astore_0        
		context = ((Context) (packagemanager.getActivityInfo(((ComponentName) (context)), 1)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #182 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
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
	//*  23   39:ifnonnull       66
		{
			if(!flag)
	//*  24   42:iload_1         
	//*  25   43:ifne            56
			{
				Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   26   46:getstatic       #184 <Field String TAG>
	//   27   49:ldc1            #186 <String "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   28   51:invokestatic    #192 <Method int Log.w(String, String)>
	//   29   54:pop             
				return;
	//   30   55:return          
			} else
			{
				throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   31   56:new             #66  <Class IllegalStateException>
	//   32   59:dup             
	//   33   60:ldc1            #186 <String "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   34   62:invokespecial   #69  <Method void IllegalStateException(String)>
	//   35   65:athrow          
			}
		} else
		{
			return;
	//   36   66:return          
		}
		context;
	//   37   67:astore_0        
		if(true) goto _L2; else goto _L4
_L4:
	//*  38   68:goto            36
	}

	public static void hasInternetPermissions(Context context)
	{
		hasInternetPermissions(context, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #195 <Method void hasInternetPermissions(Context, boolean)>
	//    3    5:return          
	}

	public static void hasInternetPermissions(Context context, boolean flag)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "context">
	//    2    3:invokestatic    #20  <Method void notNull(Object, String)>
		if(context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
	//*   3    6:aload_0         
	//*   4    7:ldc1            #197 <String "android.permission.INTERNET">
	//*   5    9:invokevirtual   #201 <Method int Context.checkCallingOrSelfPermission(String)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          40
		{
			if(!flag)
	//*   8   16:iload_1         
	//*   9   17:ifne            30
			{
				Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   10   20:getstatic       #184 <Field String TAG>
	//   11   23:ldc1            #203 <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   12   25:invokestatic    #192 <Method int Log.w(String, String)>
	//   13   28:pop             
				return;
	//   14   29:return          
			} else
			{
				throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   15   30:new             #66  <Class IllegalStateException>
	//   16   33:dup             
	//   17   34:ldc1            #203 <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   18   36:invokespecial   #69  <Method void IllegalStateException(String)>
	//   19   39:athrow          
			}
		} else
		{
			return;
	//   20   40:return          
		}
	}

	public static void notEmpty(Collection collection, String s)
	{
		if(!collection.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #207 <Method boolean Collection.isEmpty()>
	//*   2    6:ifne            10
		{
			return;
	//    3    9:return          
		} else
		{
			collection = ((Collection) (new StringBuilder()));
	//    4   10:new             #38  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #39  <Method void StringBuilder()>
	//    7   17:astore_0        
			((StringBuilder) (collection)).append("Container '");
	//    8   18:aload_0         
	//    9   19:ldc1            #41  <String "Container '">
	//   10   21:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			((StringBuilder) (collection)).append(s);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (collection)).append("' cannot be empty");
	//   16   31:aload_0         
	//   17   32:ldc1            #209 <String "' cannot be empty">
	//   18   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (collection)).toString());
	//   20   38:new             #211 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
	}

	public static void notEmptyAndContainsNoNulls(Collection collection, String s)
	{
		containsNoNulls(collection, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #215 <Method void containsNoNulls(Collection, String)>
		notEmpty(collection, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #217 <Method void notEmpty(Collection, String)>
	//    6   10:return          
	}

	public static void notNull(Object obj, String s)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          5
		{
			return;
	//    2    4:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//    3    5:new             #38  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void StringBuilder()>
	//    6   12:astore_0        
			((StringBuilder) (obj)).append("Argument '");
	//    7   13:aload_0         
	//    8   14:ldc1            #219 <String "Argument '">
	//    9   16:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			((StringBuilder) (obj)).append(s);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			((StringBuilder) (obj)).append("' cannot be null");
	//   15   26:aload_0         
	//   16   27:ldc1            #221 <String "' cannot be null">
	//   17   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   33:new             #49  <Class NullPointerException>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   23   41:invokespecial   #56  <Method void NullPointerException(String)>
	//   24   44:athrow          
		}
	}

	public static void notNullOrEmpty(String s, String s1)
	{
		if(!Utility.isNullOrEmpty(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #229 <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			s = ((String) (new StringBuilder()));
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void StringBuilder()>
	//    7   15:astore_0        
			((StringBuilder) (s)).append("Argument '");
	//    8   16:aload_0         
	//    9   17:ldc1            #219 <String "Argument '">
	//   10   19:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			((StringBuilder) (s)).append(s1);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			((StringBuilder) (s)).append("' cannot be null or empty");
	//   16   29:aload_0         
	//   17   30:ldc1            #231 <String "' cannot be null or empty">
	//   18   32:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   20   36:new             #211 <Class IllegalArgumentException>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #212 <Method void IllegalArgumentException(String)>
	//   25   47:athrow          
		}
	}

	public static void sdkInitialized()
	{
		if(FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #235 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		else
			throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
	//    3    7:new             #237 <Class FacebookSdkNotInitializedException>
	//    4   10:dup             
	//    5   11:ldc1            #239 <String "The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.">
	//    6   13:invokespecial   #240 <Method void FacebookSdkNotInitializedException(String)>
	//    7   16:athrow          
	}

	private static final String TAG = "com.facebook.internal.Validate";

	static 
	{
	//    0    0:return          
	}
}
