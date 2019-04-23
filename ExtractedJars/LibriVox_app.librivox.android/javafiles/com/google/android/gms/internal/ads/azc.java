// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;
import android.content.pm.*;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.*;

public final class azc
{

	public static String a(Context context)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #9   <Field String a>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          10
			return ((String) (obj));
	//    4    8:aload_1         
	//    5    9:areturn         
		PackageManager packagemanager = context.getPackageManager();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #15  <Method PackageManager Context.getPackageManager()>
	//    8   14:astore_2        
		Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
	//    9   15:new             #17  <Class Intent>
	//   10   18:dup             
	//   11   19:ldc1            #19  <String "android.intent.action.VIEW">
	//   12   21:ldc1            #21  <String "http://www.example.com">
	//   13   23:invokestatic    #27  <Method Uri Uri.parse(String)>
	//   14   26:invokespecial   #31  <Method void Intent(String, Uri)>
	//   15   29:astore_3        
		obj = ((Object) (packagemanager.resolveActivity(intent, 0)));
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #37  <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   20   36:astore_1        
		if(obj != null)
	//*  21   37:aload_1         
	//*  22   38:ifnull          52
			obj = ((Object) (((ResolveInfo) (obj)).activityInfo.packageName));
	//   23   41:aload_1         
	//   24   42:getfield        #43  <Field ActivityInfo ResolveInfo.activityInfo>
	//   25   45:getfield        #48  <Field String ActivityInfo.packageName>
	//   26   48:astore_1        
		else
	//*  27   49:goto            54
			obj = null;
	//   28   52:aconst_null     
	//   29   53:astore_1        
		Object obj1 = ((Object) (packagemanager.queryIntentActivities(intent, 0)));
	//   30   54:aload_2         
	//   31   55:aload_3         
	//   32   56:iconst_0        
	//   33   57:invokevirtual   #52  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   34   60:astore          5
		ArrayList arraylist = new ArrayList();
	//   35   62:new             #54  <Class ArrayList>
	//   36   65:dup             
	//   37   66:invokespecial   #57  <Method void ArrayList()>
	//   38   69:astore          4
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   39   71:aload           5
	//   40   73:invokeinterface #63  <Method Iterator List.iterator()>
	//   41   78:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   42   80:aload           5
	//   43   82:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   44   87:ifeq            162
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
	//   45   90:aload           5
	//   46   92:invokeinterface #73  <Method Object Iterator.next()>
	//   47   97:checkcast       #39  <Class ResolveInfo>
	//   48  100:astore          6
			Intent intent1 = new Intent();
	//   49  102:new             #17  <Class Intent>
	//   50  105:dup             
	//   51  106:invokespecial   #74  <Method void Intent()>
	//   52  109:astore          7
			intent1.setAction("android.support.customtabs.action.CustomTabsService");
	//   53  111:aload           7
	//   54  113:ldc1            #76  <String "android.support.customtabs.action.CustomTabsService">
	//   55  115:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//   56  118:pop             
			intent1.setPackage(resolveinfo.activityInfo.packageName);
	//   57  119:aload           7
	//   58  121:aload           6
	//   59  123:getfield        #43  <Field ActivityInfo ResolveInfo.activityInfo>
	//   60  126:getfield        #48  <Field String ActivityInfo.packageName>
	//   61  129:invokevirtual   #83  <Method Intent Intent.setPackage(String)>
	//   62  132:pop             
			if(packagemanager.resolveService(intent1, 0) != null)
	//*  63  133:aload_2         
	//*  64  134:aload           7
	//*  65  136:iconst_0        
	//*  66  137:invokevirtual   #86  <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//*  67  140:ifnull          80
				((List) (arraylist)).add(((Object) (resolveinfo.activityInfo.packageName)));
	//   68  143:aload           4
	//   69  145:aload           6
	//   70  147:getfield        #43  <Field ActivityInfo ResolveInfo.activityInfo>
	//   71  150:getfield        #48  <Field String ActivityInfo.packageName>
	//   72  153:invokeinterface #90  <Method boolean List.add(Object)>
	//   73  158:pop             
		} while(true);
	//   74  159:goto            80
		if(((List) (arraylist)).isEmpty())
	//*  75  162:aload           4
	//*  76  164:invokeinterface #93  <Method boolean List.isEmpty()>
	//*  77  169:ifeq            179
			a = null;
	//   78  172:aconst_null     
	//   79  173:putstatic       #9   <Field String a>
		else
	//*  80  176:goto            317
		if(((List) (arraylist)).size() == 1)
	//*  81  179:aload           4
	//*  82  181:invokeinterface #97  <Method int List.size()>
	//*  83  186:iconst_1        
	//*  84  187:icmpne          207
			a = (String)((List) (arraylist)).get(0);
	//   85  190:aload           4
	//   86  192:iconst_0        
	//   87  193:invokeinterface #101 <Method Object List.get(int)>
	//   88  198:checkcast       #103 <Class String>
	//   89  201:putstatic       #9   <Field String a>
		else
	//*  90  204:goto            317
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && !a(context, intent) && ((List) (arraylist)).contains(obj))
	//*  91  207:aload_1         
	//*  92  208:invokestatic    #108 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  93  211:ifne            240
	//*  94  214:aload_0         
	//*  95  215:aload_3         
	//*  96  216:invokestatic    #111 <Method boolean a(Context, Intent)>
	//*  97  219:ifne            240
	//*  98  222:aload           4
	//*  99  224:aload_1         
	//* 100  225:invokeinterface #114 <Method boolean List.contains(Object)>
	//* 101  230:ifeq            240
			a = ((String) (obj));
	//  102  233:aload_1         
	//  103  234:putstatic       #9   <Field String a>
		else
	//* 104  237:goto            317
		if(((List) (arraylist)).contains("com.android.chrome"))
	//* 105  240:aload           4
	//* 106  242:ldc1            #116 <String "com.android.chrome">
	//* 107  244:invokeinterface #114 <Method boolean List.contains(Object)>
	//* 108  249:ifeq            260
			a = "com.android.chrome";
	//  109  252:ldc1            #116 <String "com.android.chrome">
	//  110  254:putstatic       #9   <Field String a>
		else
	//* 111  257:goto            317
		if(((List) (arraylist)).contains("com.chrome.beta"))
	//* 112  260:aload           4
	//* 113  262:ldc1            #118 <String "com.chrome.beta">
	//* 114  264:invokeinterface #114 <Method boolean List.contains(Object)>
	//* 115  269:ifeq            280
			a = "com.chrome.beta";
	//  116  272:ldc1            #118 <String "com.chrome.beta">
	//  117  274:putstatic       #9   <Field String a>
		else
	//* 118  277:goto            317
		if(((List) (arraylist)).contains("com.chrome.dev"))
	//* 119  280:aload           4
	//* 120  282:ldc1            #120 <String "com.chrome.dev">
	//* 121  284:invokeinterface #114 <Method boolean List.contains(Object)>
	//* 122  289:ifeq            300
			a = "com.chrome.dev";
	//  123  292:ldc1            #120 <String "com.chrome.dev">
	//  124  294:putstatic       #9   <Field String a>
		else
	//* 125  297:goto            317
		if(((List) (arraylist)).contains("com.google.android.apps.chrome"))
	//* 126  300:aload           4
	//* 127  302:ldc1            #122 <String "com.google.android.apps.chrome">
	//* 128  304:invokeinterface #114 <Method boolean List.contains(Object)>
	//* 129  309:ifeq            317
			a = "com.google.android.apps.chrome";
	//  130  312:ldc1            #122 <String "com.google.android.apps.chrome">
	//  131  314:putstatic       #9   <Field String a>
		return a;
	//  132  317:getstatic       #9   <Field String a>
	//  133  320:areturn         
	}

	private static boolean a(Context context, Intent intent)
	{
		context = ((Context) (context.getPackageManager().queryIntentActivities(intent, 64)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:bipush          64
	//    4    7:invokevirtual   #52  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//    5   10:astore_0        
		if(context == null) goto _L2; else goto _L1
	//    6   11:aload_0         
	//    7   12:ifnull          86
_L1:
		if(((List) (context)).size() == 0)
	//*   8   15:aload_0         
	//*   9   16:invokeinterface #97  <Method int List.size()>
	//*  10   21:ifne            26
			return false;
	//   11   24:iconst_0        
	//   12   25:ireturn         
		context = ((Context) (((List) (context)).iterator()));
	//   13   26:aload_0         
	//   14   27:invokeinterface #63  <Method Iterator List.iterator()>
	//   15   32:astore_0        
_L6:
		if(!((Iterator) (context)).hasNext()) goto _L4; else goto _L3
	//   16   33:aload_0         
	//   17   34:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//   18   39:ifeq            96
_L3:
		IntentFilter intentfilter;
		intent = ((Intent) ((ResolveInfo)((Iterator) (context)).next()));
	//   19   42:aload_0         
	//   20   43:invokeinterface #73  <Method Object Iterator.next()>
	//   21   48:checkcast       #39  <Class ResolveInfo>
	//   22   51:astore_1        
		intentfilter = ((ResolveInfo) (intent)).filter;
	//   23   52:aload_1         
	//   24   53:getfield        #129 <Field IntentFilter ResolveInfo.filter>
	//   25   56:astore_2        
		if(intentfilter == null) goto _L6; else goto _L5
	//   26   57:aload_2         
	//   27   58:ifnull          33
_L5:
		if(intentfilter.countDataAuthorities() == 0 || intentfilter.countDataPaths() == 0) goto _L6; else goto _L7
	//   28   61:aload_2         
	//   29   62:invokevirtual   #134 <Method int IntentFilter.countDataAuthorities()>
	//   30   65:ifeq            33
	//   31   68:aload_2         
	//   32   69:invokevirtual   #137 <Method int IntentFilter.countDataPaths()>
	//   33   72:ifeq            33
_L7:
		intent = ((Intent) (((ResolveInfo) (intent)).activityInfo));
	//   34   75:aload_1         
	//   35   76:getfield        #43  <Field ActivityInfo ResolveInfo.activityInfo>
	//   36   79:astore_1        
		if(intent == null) goto _L6; else goto _L8
	//   37   80:aload_1         
	//   38   81:ifnull          33
_L8:
		return true;
	//   39   84:iconst_1        
	//   40   85:ireturn         
_L2:
		return false;
	//   41   86:iconst_0        
	//   42   87:ireturn         
_L10:
		Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
	//   43   88:ldc1            #139 <String "CustomTabsHelper">
	//   44   90:ldc1            #141 <String "Runtime exception while getting specialized handlers">
	//   45   92:invokestatic    #147 <Method int Log.e(String, String)>
	//   46   95:pop             
_L4:
		return false;
	//   47   96:iconst_0        
	//   48   97:ireturn         
		context;
	//   49   98:astore_0        
		if(true) goto _L10; else goto _L9
_L9:
	//*  50   99:goto            88
	}

	private static String a;
}
