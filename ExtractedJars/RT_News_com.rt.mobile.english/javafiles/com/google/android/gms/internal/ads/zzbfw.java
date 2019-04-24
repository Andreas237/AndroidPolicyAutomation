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

public final class zzbfw
{

	public static String zzbn(Context context)
	{
		Object obj;
		Intent intent;
		ArrayList arraylist;
		if(zzedy != null)
	//*   0    0:getstatic       #10  <Field String zzedy>
	//*   1    3:ifnull          10
			return zzedy;
	//    2    6:getstatic       #10  <Field String zzedy>
	//    3    9:areturn         
		PackageManager packagemanager = context.getPackageManager();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #16  <Method PackageManager Context.getPackageManager()>
	//    6   14:astore_2        
		intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
	//    7   15:new             #18  <Class Intent>
	//    8   18:dup             
	//    9   19:ldc1            #20  <String "android.intent.action.VIEW">
	//   10   21:ldc1            #22  <String "http://www.example.com">
	//   11   23:invokestatic    #28  <Method Uri Uri.parse(String)>
	//   12   26:invokespecial   #32  <Method void Intent(String, Uri)>
	//   13   29:astore_3        
		obj = ((Object) (packagemanager.resolveActivity(intent, 0)));
	//   14   30:aload_2         
	//   15   31:aload_3         
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #38  <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   18   36:astore_1        
		if(obj != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          52
			obj = ((Object) (((ResolveInfo) (obj)).activityInfo.packageName));
	//   21   41:aload_1         
	//   22   42:getfield        #44  <Field ActivityInfo ResolveInfo.activityInfo>
	//   23   45:getfield        #49  <Field String ActivityInfo.packageName>
	//   24   48:astore_1        
		else
	//*  25   49:goto            54
			obj = null;
	//   26   52:aconst_null     
	//   27   53:astore_1        
		Object obj1 = ((Object) (packagemanager.queryIntentActivities(intent, 0)));
	//   28   54:aload_2         
	//   29   55:aload_3         
	//   30   56:iconst_0        
	//   31   57:invokevirtual   #53  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   32   60:astore          5
		arraylist = new ArrayList();
	//   33   62:new             #55  <Class ArrayList>
	//   34   65:dup             
	//   35   66:invokespecial   #58  <Method void ArrayList()>
	//   36   69:astore          4
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   37   71:aload           5
	//   38   73:invokeinterface #64  <Method Iterator List.iterator()>
	//   39   78:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   40   80:aload           5
	//   41   82:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   42   87:ifeq            162
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
	//   43   90:aload           5
	//   44   92:invokeinterface #74  <Method Object Iterator.next()>
	//   45   97:checkcast       #40  <Class ResolveInfo>
	//   46  100:astore          6
			Intent intent1 = new Intent();
	//   47  102:new             #18  <Class Intent>
	//   48  105:dup             
	//   49  106:invokespecial   #75  <Method void Intent()>
	//   50  109:astore          7
			intent1.setAction("android.support.customtabs.action.CustomTabsService");
	//   51  111:aload           7
	//   52  113:ldc1            #77  <String "android.support.customtabs.action.CustomTabsService">
	//   53  115:invokevirtual   #81  <Method Intent Intent.setAction(String)>
	//   54  118:pop             
			intent1.setPackage(resolveinfo.activityInfo.packageName);
	//   55  119:aload           7
	//   56  121:aload           6
	//   57  123:getfield        #44  <Field ActivityInfo ResolveInfo.activityInfo>
	//   58  126:getfield        #49  <Field String ActivityInfo.packageName>
	//   59  129:invokevirtual   #84  <Method Intent Intent.setPackage(String)>
	//   60  132:pop             
			if(packagemanager.resolveService(intent1, 0) != null)
	//*  61  133:aload_2         
	//*  62  134:aload           7
	//*  63  136:iconst_0        
	//*  64  137:invokevirtual   #87  <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//*  65  140:ifnull          80
				((List) (arraylist)).add(((Object) (resolveinfo.activityInfo.packageName)));
	//   66  143:aload           4
	//   67  145:aload           6
	//   68  147:getfield        #44  <Field ActivityInfo ResolveInfo.activityInfo>
	//   69  150:getfield        #49  <Field String ActivityInfo.packageName>
	//   70  153:invokeinterface #91  <Method boolean List.add(Object)>
	//   71  158:pop             
		} while(true);
	//   72  159:goto            80
		if(!((List) (arraylist)).isEmpty()) goto _L2; else goto _L1
	//   73  162:aload           4
	//   74  164:invokeinterface #94  <Method boolean List.isEmpty()>
	//   75  169:ifeq            179
_L1:
		zzedy = null;
	//   76  172:aconst_null     
	//   77  173:putstatic       #10  <Field String zzedy>
		  goto _L3
	//*  78  176:goto            314
_L2:
		if(((List) (arraylist)).size() != 1) goto _L5; else goto _L4
	//   79  179:aload           4
	//   80  181:invokeinterface #98  <Method int List.size()>
	//   81  186:iconst_1        
	//   82  187:icmpne          209
_L4:
		context = ((Context) ((String)((List) (arraylist)).get(0)));
	//   83  190:aload           4
	//   84  192:iconst_0        
	//   85  193:invokeinterface #102 <Method Object List.get(int)>
	//   86  198:checkcast       #104 <Class String>
	//   87  201:astore_0        
_L6:
		zzedy = ((String) (context));
	//   88  202:aload_0         
	//   89  203:putstatic       #10  <Field String zzedy>
		break; /* Loop/switch isn't completed */
	//   90  206:goto            314
_L5:
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && !zzd(context, intent) && ((List) (arraylist)).contains(obj))
	//*  91  209:aload_1         
	//*  92  210:invokestatic    #109 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  93  213:ifne            242
	//*  94  216:aload_0         
	//*  95  217:aload_3         
	//*  96  218:invokestatic    #113 <Method boolean zzd(Context, Intent)>
	//*  97  221:ifne            242
	//*  98  224:aload           4
	//*  99  226:aload_1         
	//* 100  227:invokeinterface #116 <Method boolean List.contains(Object)>
	//* 101  232:ifeq            242
		{
			zzedy = ((String) (obj));
	//  102  235:aload_1         
	//  103  236:putstatic       #10  <Field String zzedy>
			break; /* Loop/switch isn't completed */
	//  104  239:goto            314
		}
		if(((List) (arraylist)).contains("com.android.chrome"))
	//* 105  242:aload           4
	//* 106  244:ldc1            #118 <String "com.android.chrome">
	//* 107  246:invokeinterface #116 <Method boolean List.contains(Object)>
	//* 108  251:ifeq            260
		{
			context = "com.android.chrome";
	//  109  254:ldc1            #118 <String "com.android.chrome">
	//  110  256:astore_0        
			continue; /* Loop/switch isn't completed */
	//  111  257:goto            202
		}
		if(((List) (arraylist)).contains("com.chrome.beta"))
	//* 112  260:aload           4
	//* 113  262:ldc1            #120 <String "com.chrome.beta">
	//* 114  264:invokeinterface #116 <Method boolean List.contains(Object)>
	//* 115  269:ifeq            278
		{
			context = "com.chrome.beta";
	//  116  272:ldc1            #120 <String "com.chrome.beta">
	//  117  274:astore_0        
			continue; /* Loop/switch isn't completed */
	//  118  275:goto            202
		}
		if(((List) (arraylist)).contains("com.chrome.dev"))
	//* 119  278:aload           4
	//* 120  280:ldc1            #122 <String "com.chrome.dev">
	//* 121  282:invokeinterface #116 <Method boolean List.contains(Object)>
	//* 122  287:ifeq            296
		{
			context = "com.chrome.dev";
	//  123  290:ldc1            #122 <String "com.chrome.dev">
	//  124  292:astore_0        
			continue; /* Loop/switch isn't completed */
	//  125  293:goto            202
		}
		if(!((List) (arraylist)).contains("com.google.android.apps.chrome"))
			break; /* Loop/switch isn't completed */
	//  126  296:aload           4
	//  127  298:ldc1            #124 <String "com.google.android.apps.chrome">
	//  128  300:invokeinterface #116 <Method boolean List.contains(Object)>
	//  129  305:ifeq            314
		context = "com.google.android.apps.chrome";
	//  130  308:ldc1            #124 <String "com.google.android.apps.chrome">
	//  131  310:astore_0        
		if(true) goto _L6; else goto _L3
	//  132  311:goto            202
_L3:
		return zzedy;
	//  133  314:getstatic       #10  <Field String zzedy>
	//  134  317:areturn         
	}

	private static boolean zzd(Context context, Intent intent)
	{
		context = ((Context) (context.getPackageManager().queryIntentActivities(intent, 64)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:bipush          64
	//    4    7:invokevirtual   #53  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//    5   10:astore_0        
		if(context == null) goto _L2; else goto _L1
	//    6   11:aload_0         
	//    7   12:ifnull          86
_L1:
		if(((List) (context)).size() == 0)
	//*   8   15:aload_0         
	//*   9   16:invokeinterface #98  <Method int List.size()>
	//*  10   21:ifne            26
			return false;
	//   11   24:iconst_0        
	//   12   25:ireturn         
		context = ((Context) (((List) (context)).iterator()));
	//   13   26:aload_0         
	//   14   27:invokeinterface #64  <Method Iterator List.iterator()>
	//   15   32:astore_0        
_L6:
		if(!((Iterator) (context)).hasNext()) goto _L4; else goto _L3
	//   16   33:aload_0         
	//   17   34:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   18   39:ifeq            96
_L3:
		IntentFilter intentfilter;
		intent = ((Intent) ((ResolveInfo)((Iterator) (context)).next()));
	//   19   42:aload_0         
	//   20   43:invokeinterface #74  <Method Object Iterator.next()>
	//   21   48:checkcast       #40  <Class ResolveInfo>
	//   22   51:astore_1        
		intentfilter = ((ResolveInfo) (intent)).filter;
	//   23   52:aload_1         
	//   24   53:getfield        #131 <Field IntentFilter ResolveInfo.filter>
	//   25   56:astore_2        
		if(intentfilter == null) goto _L6; else goto _L5
	//   26   57:aload_2         
	//   27   58:ifnull          33
_L5:
		if(intentfilter.countDataAuthorities() == 0 || intentfilter.countDataPaths() == 0) goto _L6; else goto _L7
	//   28   61:aload_2         
	//   29   62:invokevirtual   #136 <Method int IntentFilter.countDataAuthorities()>
	//   30   65:ifeq            33
	//   31   68:aload_2         
	//   32   69:invokevirtual   #139 <Method int IntentFilter.countDataPaths()>
	//   33   72:ifeq            33
_L7:
		intent = ((Intent) (((ResolveInfo) (intent)).activityInfo));
	//   34   75:aload_1         
	//   35   76:getfield        #44  <Field ActivityInfo ResolveInfo.activityInfo>
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
	//   43   88:ldc1            #141 <String "CustomTabsHelper">
	//   44   90:ldc1            #143 <String "Runtime exception while getting specialized handlers">
	//   45   92:invokestatic    #149 <Method int Log.e(String, String)>
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

	private static String zzedy;
}
