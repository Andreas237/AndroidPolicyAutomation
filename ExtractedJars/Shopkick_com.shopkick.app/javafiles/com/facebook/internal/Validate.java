// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.*;
import java.util.*;

// Referenced classes of package com.facebook.internal:
//			Utility

public final class Validate
{

	public Validate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static void checkCustomTabRedirectActivity(Context context)
	{
		checkCustomTabRedirectActivity(context, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #34  <Method void checkCustomTabRedirectActivity(Context, boolean)>
	//    3    5:return          
	}

	public static void checkCustomTabRedirectActivity(Context context, boolean flag)
	{
		if(!hasCustomTabRedirectActivity(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #38  <Method boolean hasCustomTabRedirectActivity(Context)>
	//*   2    4:ifne            31
		{
			if(!flag)
	//*   3    7:iload_1         
	//*   4    8:ifne            21
			{
				Log.w(TAG, "FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//    5   11:getstatic       #40  <Field String TAG>
	//    6   14:ldc1            #14  <String "FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//    7   16:invokestatic    #46  <Method int Log.w(String, String)>
	//    8   19:pop             
				return;
	//    9   20:return          
			} else
			{
				throw new IllegalStateException("FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   10   21:new             #48  <Class IllegalStateException>
	//   11   24:dup             
	//   12   25:ldc1            #14  <String "FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   13   27:invokespecial   #51  <Method void IllegalStateException(String)>
	//   14   30:athrow          
			}
		} else
		{
			return;
	//   15   31:return          
		}
	}

	public static void containsNoNullOrEmpty(Collection collection, String s)
	{
		notNull(((Object) (collection)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #57  <Method void notNull(Object, String)>
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #63  <Method Iterator Collection.iterator()>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            125
		{
			String s1 = (String)((Iterator) (collection)).next();
	//    9   21:aload_0         
	//   10   22:invokeinterface #73  <Method Object Iterator.next()>
	//   11   27:checkcast       #75  <Class String>
	//   12   30:astore_2        
			if(s1 != null)
	//*  13   31:aload_2         
	//*  14   32:ifnull          85
			{
				if(s1.length() == 0)
	//*  15   35:aload_2         
	//*  16   36:invokevirtual   #79  <Method int String.length()>
	//*  17   39:ifeq            45
	//*  18   42:goto            12
				{
					collection = ((Collection) (new StringBuilder()));
	//   19   45:new             #81  <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #82  <Method void StringBuilder()>
	//   22   52:astore_0        
					((StringBuilder) (collection)).append("Container '");
	//   23   53:aload_0         
	//   24   54:ldc1            #84  <String "Container '">
	//   25   56:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   26   59:pop             
					((StringBuilder) (collection)).append(s);
	//   27   60:aload_0         
	//   28   61:aload_1         
	//   29   62:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
					((StringBuilder) (collection)).append("' cannot contain empty values");
	//   31   66:aload_0         
	//   32   67:ldc1            #90  <String "' cannot contain empty values">
	//   33   69:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
					throw new IllegalArgumentException(((StringBuilder) (collection)).toString());
	//   35   73:new             #92  <Class IllegalArgumentException>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   39   81:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   40   84:athrow          
				}
			} else
			{
				collection = ((Collection) (new StringBuilder()));
	//   41   85:new             #81  <Class StringBuilder>
	//   42   88:dup             
	//   43   89:invokespecial   #82  <Method void StringBuilder()>
	//   44   92:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   45   93:aload_0         
	//   46   94:ldc1            #84  <String "Container '">
	//   47   96:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   48   99:pop             
				((StringBuilder) (collection)).append(s);
	//   49  100:aload_0         
	//   50  101:aload_1         
	//   51  102:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   52  105:pop             
				((StringBuilder) (collection)).append("' cannot contain null values");
	//   53  106:aload_0         
	//   54  107:ldc1            #99  <String "' cannot contain null values">
	//   55  109:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
				throw new NullPointerException(((StringBuilder) (collection)).toString());
	//   57  113:new             #101 <Class NullPointerException>
	//   58  116:dup             
	//   59  117:aload_0         
	//   60  118:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   61  121:invokespecial   #102 <Method void NullPointerException(String)>
	//   62  124:athrow          
			}
		}

	//   63  125:return          
	}

	public static void containsNoNulls(Collection collection, String s)
	{
		notNull(((Object) (collection)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #57  <Method void notNull(Object, String)>
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #63  <Method Iterator Collection.iterator()>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            73
			if(((Iterator) (collection)).next() == null)
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #73  <Method Object Iterator.next()>
	//*  11   27:ifnull          33
	//*  12   30:goto            12
			{
				collection = ((Collection) (new StringBuilder()));
	//   13   33:new             #81  <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #82  <Method void StringBuilder()>
	//   16   40:astore_0        
				((StringBuilder) (collection)).append("Container '");
	//   17   41:aload_0         
	//   18   42:ldc1            #84  <String "Container '">
	//   19   44:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:pop             
				((StringBuilder) (collection)).append(s);
	//   21   48:aload_0         
	//   22   49:aload_1         
	//   23   50:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
				((StringBuilder) (collection)).append("' cannot contain null values");
	//   25   54:aload_0         
	//   26   55:ldc1            #99  <String "' cannot contain null values">
	//   27   57:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
				throw new NullPointerException(((StringBuilder) (collection)).toString());
	//   29   61:new             #101 <Class NullPointerException>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   33   69:invokespecial   #102 <Method void NullPointerException(String)>
	//   34   72:athrow          
			}

	//   35   73:return          
	}

	public static String hasAppID()
	{
		String s = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #112 <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_0        
		if(s != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("No App ID found, please set the App ID.");
	//    6   10:new             #48  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #114 <String "No App ID found, please set the App ID.">
	//    9   16:invokespecial   #51  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	public static boolean hasBluetoothPermission(Context context)
	{
		return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
	//    0    0:aload_0         
	//    1    1:ldc1            #117 <String "android.permission.BLUETOOTH">
	//    2    3:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    3    6:ifeq            20
	//    4    9:aload_0         
	//    5   10:ldc1            #123 <String "android.permission.BLUETOOTH_ADMIN">
	//    6   12:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public static boolean hasChangeWifiStatePermission(Context context)
	{
		return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
	//    0    0:aload_0         
	//    1    1:ldc1            #126 <String "android.permission.CHANGE_WIFI_STATE">
	//    2    3:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    3    6:ireturn         
	}

	public static String hasClientToken()
	{
		String s = FacebookSdk.getClientToken();
	//    0    0:invokestatic    #130 <Method String FacebookSdk.getClientToken()>
	//    1    3:astore_0        
		if(s != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return s;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			throw new IllegalStateException("No Client Token found, please set the Client Token.");
	//    6   10:new             #48  <Class IllegalStateException>
	//    7   13:dup             
	//    8   14:ldc1            #132 <String "No Client Token found, please set the Client Token.">
	//    9   16:invokespecial   #51  <Method void IllegalStateException(String)>
	//   10   19:athrow          
	}

	public static void hasContentProvider(Context context)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #135 <String "context">
	//    2    3:invokestatic    #57  <Method void notNull(Object, String)>
		String s = hasAppID();
	//    3    6:invokestatic    #137 <Method String hasAppID()>
	//    4    9:astore_1        
		context = ((Context) (context.getPackageManager()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #143 <Method PackageManager Context.getPackageManager()>
	//    7   14:astore_0        
		if(context != null)
	//*   8   15:aload_0         
	//*   9   16:ifnull          76
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #81  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #82  <Method void StringBuilder()>
	//   13   26:astore_2        
			stringbuilder.append("com.facebook.app.FacebookContentProvider");
	//   14   27:aload_2         
	//   15   28:ldc1            #8   <String "com.facebook.app.FacebookContentProvider">
	//   16   30:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(s);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			s = stringbuilder.toString();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   24   44:astore_1        
			if(((PackageManager) (context)).resolveContentProvider(s, 0) != null)
	//*  25   45:aload_0         
	//*  26   46:aload_1         
	//*  27   47:iconst_0        
	//*  28   48:invokevirtual   #149 <Method android.content.pm.ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//*  29   51:ifnull          55
				return;
	//   30   54:return          
			else
				throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] {
					s
				}));
	//   31   55:new             #48  <Class IllegalStateException>
	//   32   58:dup             
	//   33   59:ldc1            #11  <String "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.">
	//   34   61:iconst_1        
	//   35   62:anewarray       Object[]
	//   36   65:dup             
	//   37   66:iconst_0        
	//   38   67:aload_1         
	//   39   68:aastore         
	//   40   69:invokestatic    #153 <Method String String.format(String, Object[])>
	//   41   72:invokespecial   #51  <Method void IllegalStateException(String)>
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
	//    1    1:ldc1            #135 <String "context">
	//    2    3:invokestatic    #57  <Method void notNull(Object, String)>
		Object obj = ((Object) (context.getPackageManager()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #143 <Method PackageManager Context.getPackageManager()>
	//    5   10:astore_2        
		if(obj != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          102
		{
			Intent intent = new Intent();
	//    8   15:new             #155 <Class Intent>
	//    9   18:dup             
	//   10   19:invokespecial   #156 <Method void Intent()>
	//   11   22:astore_3        
			intent.setAction("android.intent.action.VIEW");
	//   12   23:aload_3         
	//   13   24:ldc1            #158 <String "android.intent.action.VIEW">
	//   14   26:invokevirtual   #162 <Method Intent Intent.setAction(String)>
	//   15   29:pop             
			intent.addCategory("android.intent.category.DEFAULT");
	//   16   30:aload_3         
	//   17   31:ldc1            #164 <String "android.intent.category.DEFAULT">
	//   18   33:invokevirtual   #167 <Method Intent Intent.addCategory(String)>
	//   19   36:pop             
			intent.addCategory("android.intent.category.BROWSABLE");
	//   20   37:aload_3         
	//   21   38:ldc1            #169 <String "android.intent.category.BROWSABLE">
	//   22   40:invokevirtual   #167 <Method Intent Intent.addCategory(String)>
	//   23   43:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #81  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #82  <Method void StringBuilder()>
	//   27   51:astore          4
			stringbuilder.append("fb");
	//   28   53:aload           4
	//   29   55:ldc1            #171 <String "fb">
	//   30   57:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			stringbuilder.append(FacebookSdk.getApplicationId());
	//   32   61:aload           4
	//   33   63:invokestatic    #112 <Method String FacebookSdk.getApplicationId()>
	//   34   66:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			stringbuilder.append("://authorize");
	//   36   70:aload           4
	//   37   72:ldc1            #173 <String "://authorize">
	//   38   74:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
			intent.setData(Uri.parse(stringbuilder.toString()));
	//   40   78:aload_3         
	//   41   79:aload           4
	//   42   81:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   43   84:invokestatic    #179 <Method Uri Uri.parse(String)>
	//   44   87:invokevirtual   #183 <Method Intent Intent.setData(Uri)>
	//   45   90:pop             
			obj = ((Object) (((PackageManager) (obj)).queryIntentActivities(intent, 64)));
	//   46   91:aload_2         
	//   47   92:aload_3         
	//   48   93:bipush          64
	//   49   95:invokevirtual   #187 <Method List PackageManager.queryIntentActivities(Intent, int)>
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
	//   59  111:invokeinterface #190 <Method Iterator List.iterator()>
	//   60  116:astore_2        
			flag = false;
	//   61  117:iconst_0        
	//   62  118:istore_1        
			while(((Iterator) (obj)).hasNext()) 
	//*  63  119:aload_2         
	//*  64  120:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*  65  125:ifeq            174
			{
				ActivityInfo activityinfo = ((ResolveInfo)((Iterator) (obj)).next()).activityInfo;
	//   66  128:aload_2         
	//   67  129:invokeinterface #73  <Method Object Iterator.next()>
	//   68  134:checkcast       #192 <Class ResolveInfo>
	//   69  137:getfield        #196 <Field ActivityInfo ResolveInfo.activityInfo>
	//   70  140:astore_3        
				if(activityinfo.name.equals("com.facebook.CustomTabActivity") && activityinfo.packageName.equals(((Object) (context.getPackageName()))))
	//*  71  141:aload_3         
	//*  72  142:getfield        #201 <Field String ActivityInfo.name>
	//*  73  145:ldc1            #203 <String "com.facebook.CustomTabActivity">
	//*  74  147:invokevirtual   #207 <Method boolean String.equals(Object)>
	//*  75  150:ifeq            172
	//*  76  153:aload_3         
	//*  77  154:getfield        #210 <Field String ActivityInfo.packageName>
	//*  78  157:aload_0         
	//*  79  158:invokevirtual   #213 <Method String Context.getPackageName()>
	//*  80  161:invokevirtual   #207 <Method boolean String.equals(Object)>
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
	//    2    2:invokestatic    #216 <Method void hasFacebookActivity(Context, boolean)>
	//    3    5:return          
	}

	public static void hasFacebookActivity(Context context, boolean flag)
	{
		PackageManager packagemanager;
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #135 <String "context">
	//    2    3:invokestatic    #57  <Method void notNull(Object, String)>
		packagemanager = context.getPackageManager();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #143 <Method PackageManager Context.getPackageManager()>
	//    5   10:astore_2        
		if(packagemanager == null) goto _L2; else goto _L1
	//    6   11:aload_2         
	//    7   12:ifnull          36
_L1:
		context = ((Context) (new ComponentName(context, "com.facebook.FacebookActivity")));
	//    8   15:new             #220 <Class ComponentName>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:ldc1            #222 <String "com.facebook.FacebookActivity">
	//   12   22:invokespecial   #225 <Method void ComponentName(Context, String)>
	//   13   25:astore_0        
		context = ((Context) (packagemanager.getActivityInfo(((ComponentName) (context)), 1)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #229 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
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
				Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   26   46:getstatic       #40  <Field String TAG>
	//   27   49:ldc1            #17  <String "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   28   51:invokestatic    #46  <Method int Log.w(String, String)>
	//   29   54:pop             
				return;
	//   30   55:return          
			} else
			{
				throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	//   31   56:new             #48  <Class IllegalStateException>
	//   32   59:dup             
	//   33   60:ldc1            #17  <String "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.">
	//   34   62:invokespecial   #51  <Method void IllegalStateException(String)>
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
	//    2    2:invokestatic    #232 <Method void hasInternetPermissions(Context, boolean)>
	//    3    5:return          
	}

	public static void hasInternetPermissions(Context context, boolean flag)
	{
		notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #135 <String "context">
	//    2    3:invokestatic    #57  <Method void notNull(Object, String)>
		if(context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
	//*   3    6:aload_0         
	//*   4    7:ldc1            #234 <String "android.permission.INTERNET">
	//*   5    9:invokevirtual   #238 <Method int Context.checkCallingOrSelfPermission(String)>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          40
		{
			if(!flag)
	//*   8   16:iload_1         
	//*   9   17:ifne            30
			{
				Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   10   20:getstatic       #40  <Field String TAG>
	//   11   23:ldc1            #20  <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   12   25:invokestatic    #46  <Method int Log.w(String, String)>
	//   13   28:pop             
				return;
	//   14   29:return          
			} else
			{
				throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	//   15   30:new             #48  <Class IllegalStateException>
	//   16   33:dup             
	//   17   34:ldc1            #20  <String "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.">
	//   18   36:invokespecial   #51  <Method void IllegalStateException(String)>
	//   19   39:athrow          
			}
		} else
		{
			return;
	//   20   40:return          
		}
	}

	public static boolean hasLocationPermission(Context context)
	{
		return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
	//    0    0:aload_0         
	//    1    1:ldc1            #241 <String "android.permission.ACCESS_COARSE_LOCATION">
	//    2    3:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    3    6:ifne            23
	//    4    9:aload_0         
	//    5   10:ldc1            #243 <String "android.permission.ACCESS_FINE_LOCATION">
	//    6   12:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	public static boolean hasPermission(Context context, String s)
	{
		return context.checkCallingOrSelfPermission(s) == 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #238 <Method int Context.checkCallingOrSelfPermission(String)>
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static boolean hasWiFiPermission(Context context)
	{
		return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
	//    0    0:aload_0         
	//    1    1:ldc1            #246 <String "android.permission.ACCESS_WIFI_STATE">
	//    2    3:invokestatic    #121 <Method boolean hasPermission(Context, String)>
	//    3    6:ireturn         
	}

	public static void notEmpty(Collection collection, String s)
	{
		if(!collection.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #250 <Method boolean Collection.isEmpty()>
	//*   2    6:ifne            10
		{
			return;
	//    3    9:return          
		} else
		{
			collection = ((Collection) (new StringBuilder()));
	//    4   10:new             #81  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #82  <Method void StringBuilder()>
	//    7   17:astore_0        
			((StringBuilder) (collection)).append("Container '");
	//    8   18:aload_0         
	//    9   19:ldc1            #84  <String "Container '">
	//   10   21:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			((StringBuilder) (collection)).append(s);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (collection)).append("' cannot be empty");
	//   16   31:aload_0         
	//   17   32:ldc1            #252 <String "' cannot be empty">
	//   18   34:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (collection)).toString());
	//   20   38:new             #92  <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
	}

	public static void notEmptyAndContainsNoNulls(Collection collection, String s)
	{
		containsNoNulls(collection, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #255 <Method void containsNoNulls(Collection, String)>
		notEmpty(collection, s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #257 <Method void notEmpty(Collection, String)>
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
	//    3    5:new             #81  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void StringBuilder()>
	//    6   12:astore_0        
			((StringBuilder) (obj)).append("Argument '");
	//    7   13:aload_0         
	//    8   14:ldc2            #259 <String "Argument '">
	//    9   17:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			((StringBuilder) (obj)).append(s);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			((StringBuilder) (obj)).append("' cannot be null");
	//   15   27:aload_0         
	//   16   28:ldc2            #261 <String "' cannot be null">
	//   17   31:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   35:new             #101 <Class NullPointerException>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #102 <Method void NullPointerException(String)>
	//   24   46:athrow          
		}
	}

	public static void notNullOrEmpty(String s, String s1)
	{
		if(!Utility.isNullOrEmpty(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #269 <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			s = ((String) (new StringBuilder()));
	//    4    8:new             #81  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #82  <Method void StringBuilder()>
	//    7   15:astore_0        
			((StringBuilder) (s)).append("Argument '");
	//    8   16:aload_0         
	//    9   17:ldc2            #259 <String "Argument '">
	//   10   20:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			((StringBuilder) (s)).append(s1);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			((StringBuilder) (s)).append("' cannot be null or empty");
	//   16   30:aload_0         
	//   17   31:ldc2            #271 <String "' cannot be null or empty">
	//   18   34:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   20   38:new             #92  <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
	}

	public static transient void oneOf(Object obj, String s, Object aobj[])
	{
		int j = aobj.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
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
	//*  16   25:invokevirtual   #274 <Method boolean Object.equals(Object)>
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
	//   27   44:new             #81  <Class StringBuilder>
	//   28   47:dup             
	//   29   48:invokespecial   #82  <Method void StringBuilder()>
	//   30   51:astore_0        
		((StringBuilder) (obj)).append("Argument '");
	//   31   52:aload_0         
	//   32   53:ldc2            #259 <String "Argument '">
	//   33   56:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   34   59:pop             
		((StringBuilder) (obj)).append(s);
	//   35   60:aload_0         
	//   36   61:aload_1         
	//   37   62:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   38   65:pop             
		((StringBuilder) (obj)).append("' was not one of the allowed values");
	//   39   66:aload_0         
	//   40   67:ldc2            #276 <String "' was not one of the allowed values">
	//   41   70:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   42   73:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   43   74:new             #92  <Class IllegalArgumentException>
	//   44   77:dup             
	//   45   78:aload_0         
	//   46   79:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   47   82:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   48   85:athrow          
	}

	public static void runningOnUiThread()
	{
		if(((Object) (Looper.getMainLooper())).equals(((Object) (Looper.myLooper()))))
	//*   0    0:invokestatic    #283 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #286 <Method Looper Looper.myLooper()>
	//*   2    6:invokevirtual   #274 <Method boolean Object.equals(Object)>
	//*   3    9:ifeq            13
			return;
	//    4   12:return          
		else
			throw new FacebookException("This method should be called from the UI thread");
	//    5   13:new             #288 <Class FacebookException>
	//    6   16:dup             
	//    7   17:ldc2            #290 <String "This method should be called from the UI thread">
	//    8   20:invokespecial   #291 <Method void FacebookException(String)>
	//    9   23:athrow          
	}

	public static void sdkInitialized()
	{
		if(FacebookSdk.isInitialized())
	//*   0    0:invokestatic    #295 <Method boolean FacebookSdk.isInitialized()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		else
			throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
	//    3    7:new             #297 <Class FacebookSdkNotInitializedException>
	//    4   10:dup             
	//    5   11:ldc2            #299 <String "The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.">
	//    6   14:invokespecial   #300 <Method void FacebookSdkNotInitializedException(String)>
	//    7   17:athrow          
	}

	private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
	private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
	private static final String CUSTOM_TAB_REDIRECT_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is declared incorrectly in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
	private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
	private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
	private static final String TAG = "com.facebook.internal.Validate";

	static 
	{
	//    0    0:return          
	}
}
