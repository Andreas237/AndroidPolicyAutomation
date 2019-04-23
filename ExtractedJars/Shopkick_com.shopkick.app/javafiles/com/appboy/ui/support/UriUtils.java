// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.support;

import android.content.*;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;
import java.util.*;

public class UriUtils
{

	public UriUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Intent getMainActivityIntent(Context context, Bundle bundle)
	{
		context = ((Context) (context.getPackageManager().getLaunchIntentForPackage(context.getPackageName())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #32  <Method String Context.getPackageName()>
	//    4    8:invokevirtual   #38  <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//    5   11:astore_0        
		((Intent) (context)).setFlags(0x34000000);
	//    6   12:aload_0         
	//    7   13:ldc1            #39  <Int 0x34000000>
	//    8   15:invokevirtual   #45  <Method Intent Intent.setFlags(int)>
	//    9   18:pop             
		if(bundle != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          29
			((Intent) (context)).putExtras(bundle);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #49  <Method Intent Intent.putExtras(Bundle)>
	//   15   28:pop             
		return ((Intent) (context));
	//   16   29:aload_0         
	//   17   30:areturn         
	}

	public static Map getQueryParameters(Uri uri)
	{
		if(uri.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method boolean Uri.isOpaque()>
	//*   2    4:ifeq            20
		{
			AppboyLogger.d(TAG, "URI is not hierarchical. There are no query parameters to parse.");
	//    3    7:getstatic       #16  <Field String TAG>
	//    4   10:ldc1            #59  <String "URI is not hierarchical. There are no query parameters to parse.">
	//    5   12:invokestatic    #63  <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return Collections.emptyMap();
	//    7   16:invokestatic    #69  <Method Map Collections.emptyMap()>
	//    8   19:areturn         
		}
		uri = ((Uri) (uri.getEncodedQuery()));
	//    9   20:aload_0         
	//   10   21:invokevirtual   #72  <Method String Uri.getEncodedQuery()>
	//   11   24:astore_0        
		if(uri == null)
	//*  12   25:aload_0         
	//*  13   26:ifnonnull       33
			return Collections.emptyMap();
	//   14   29:invokestatic    #69  <Method Map Collections.emptyMap()>
	//   15   32:areturn         
		HashMap hashmap = new HashMap();
	//   16   33:new             #74  <Class HashMap>
	//   17   36:dup             
	//   18   37:invokespecial   #75  <Method void HashMap()>
	//   19   40:astore          5
		int j = 0;
	//   20   42:iconst_0        
	//   21   43:istore_2        
		do
		{
			int i;
			int k;
label0:
			{
				k = ((String) (uri)).indexOf('&', j);
	//   22   44:aload_0         
	//   23   45:bipush          38
	//   24   47:iload_2         
	//   25   48:invokevirtual   #81  <Method int String.indexOf(int, int)>
	//   26   51:istore_3        
				i = k;
	//   27   52:iload_3         
	//   28   53:istore_1        
				if(k == -1)
	//*  29   54:iload_3         
	//*  30   55:iconst_m1       
	//*  31   56:icmpne          64
					i = ((String) (uri)).length();
	//   32   59:aload_0         
	//   33   60:invokevirtual   #85  <Method int String.length()>
	//   34   63:istore_1        
				int l = ((String) (uri)).indexOf('=', j);
	//   35   64:aload_0         
	//   36   65:bipush          61
	//   37   67:iload_2         
	//   38   68:invokevirtual   #81  <Method int String.indexOf(int, int)>
	//   39   71:istore          4
				if(l <= i)
	//*  40   73:iload           4
	//*  41   75:iload_1         
	//*  42   76:icmpgt          88
				{
					k = l;
	//   43   79:iload           4
	//   44   81:istore_3        
					if(l != -1)
						break label0;
	//   45   82:iload           4
	//   46   84:iconst_m1       
	//   47   85:icmpne          90
				}
				k = i;
	//   48   88:iload_1         
	//   49   89:istore_3        
			}
			if(i > j)
	//*  50   90:iload_1         
	//*  51   91:iload_2         
	//*  52   92:icmple          131
			{
				String s = ((String) (uri)).substring(j, k);
	//   53   95:aload_0         
	//   54   96:iload_2         
	//   55   97:iload_3         
	//   56   98:invokevirtual   #89  <Method String String.substring(int, int)>
	//   57  101:astore          6
				String s1 = ((String) (uri)).substring(k + 1, i);
	//   58  103:aload_0         
	//   59  104:iload_3         
	//   60  105:iconst_1        
	//   61  106:iadd            
	//   62  107:iload_1         
	//   63  108:invokevirtual   #89  <Method String String.substring(int, int)>
	//   64  111:astore          7
				((Map) (hashmap)).put(((Object) (Uri.decode(s))), ((Object) (Uri.decode(s1))));
	//   65  113:aload           5
	//   66  115:aload           6
	//   67  117:invokestatic    #93  <Method String Uri.decode(String)>
	//   68  120:aload           7
	//   69  122:invokestatic    #93  <Method String Uri.decode(String)>
	//   70  125:invokeinterface #99  <Method Object Map.put(Object, Object)>
	//   71  130:pop             
			}
			i++;
	//   72  131:iload_1         
	//   73  132:iconst_1        
	//   74  133:iadd            
	//   75  134:istore_1        
			j = i;
	//   76  135:iload_1         
	//   77  136:istore_2        
			if(i >= ((String) (uri)).length())
	//*  78  137:iload_1         
	//*  79  138:aload_0         
	//*  80  139:invokevirtual   #85  <Method int String.length()>
	//*  81  142:icmplt          44
				return Collections.unmodifiableMap(((Map) (hashmap)));
	//   82  145:aload           5
	//   83  147:invokestatic    #103 <Method Map Collections.unmodifiableMap(Map)>
	//   84  150:areturn         
		} while(true);
	}

	public static boolean isActivityRegisteredInManifest(Context context, String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		try
		{
			context = ((Context) (context.getPackageManager().getActivityInfo(new ComponentName(context, s), 0)));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    4    6:new             #111 <Class ComponentName>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #114 <Method void ComponentName(Context, String)>
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #118 <Method android.content.pm.ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//   11   19:astore_0        
		}
	//*  12   20:aload_0         
	//*  13   21:ifnull          26
	//*  14   24:iconst_1        
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   28:astore_0        
		{
			String s1 = TAG;
	//   19   29:getstatic       #16  <Field String TAG>
	//   20   32:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   21   33:new             #120 <Class StringBuilder>
	//   22   36:dup             
	//   23   37:invokespecial   #121 <Method void StringBuilder()>
	//   24   40:astore          4
			stringbuilder.append("Could not find activity info for class with name: ");
	//   25   42:aload           4
	//   26   44:ldc1            #123 <String "Could not find activity info for class with name: ">
	//   27   46:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   28   49:pop             
			stringbuilder.append(s);
	//   29   50:aload           4
	//   30   52:aload_1         
	//   31   53:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (context)));
	//   33   57:aload_3         
	//   34   58:aload           4
	//   35   60:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   36   63:aload_0         
	//   37   64:invokestatic    #134 <Method int AppboyLogger.w(String, String, Throwable)>
	//   38   67:pop             
			return false;
	//   39   68:iconst_0        
	//   40   69:ireturn         
		}
		if(context != null)
			flag = true;
		return flag;
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/support/UriUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class UriUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
