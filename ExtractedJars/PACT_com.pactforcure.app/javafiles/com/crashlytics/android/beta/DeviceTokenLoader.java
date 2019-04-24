// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.ValueLoader;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DeviceTokenLoader
	implements ValueLoader
{

	public DeviceTokenLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	String determineDeviceToken(ZipInputStream zipinputstream)
		throws IOException
	{
		zipinputstream = ((ZipInputStream) (zipinputstream.getNextEntry()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method ZipEntry ZipInputStream.getNextEntry()>
	//    2    4:astore_1        
		if(zipinputstream != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          39
		{
			zipinputstream = ((ZipInputStream) (((ZipEntry) (zipinputstream)).getName()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #35  <Method String ZipEntry.getName()>
	//    7   13:astore_1        
			if(((String) (zipinputstream)).startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token="))
	//*   8   14:aload_1         
	//*   9   15:ldc1            #14  <String "assets/com.crashlytics.android.beta/dirfactor-device-token=">
	//*  10   17:invokevirtual   #41  <Method boolean String.startsWith(String)>
	//*  11   20:ifeq            39
				return ((String) (zipinputstream)).substring("assets/com.crashlytics.android.beta/dirfactor-device-token=".length(), ((String) (zipinputstream)).length() - 1);
	//   12   23:aload_1         
	//   13   24:ldc1            #14  <String "assets/com.crashlytics.android.beta/dirfactor-device-token=">
	//   14   26:invokevirtual   #45  <Method int String.length()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #45  <Method int String.length()>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:invokevirtual   #49  <Method String String.substring(int, int)>
	//   20   38:areturn         
		}
		return "";
	//   21   39:ldc1            #51  <String "">
	//   22   41:areturn         
	}

	ZipInputStream getZipInputStreamOfApkFrom(Context context, String s)
		throws android.content.pm.PackageManager.NameNotFoundException, FileNotFoundException
	{
		return new ZipInputStream(((java.io.InputStream) (new FileInputStream(context.getPackageManager().getApplicationInfo(s, 0).sourceDir))));
	//    0    0:new             #25  <Class ZipInputStream>
	//    1    3:dup             
	//    2    4:new             #60  <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #66  <Method PackageManager Context.getPackageManager()>
	//    6   12:aload_2         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #72  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   17:getfield        #77  <Field String ApplicationInfo.sourceDir>
	//   10   20:invokespecial   #80  <Method void FileInputStream(String)>
	//   11   23:invokespecial   #83  <Method void ZipInputStream(java.io.InputStream)>
	//   12   26:areturn         
	}

	public volatile Object load(Context context)
		throws Exception
	{
		return ((Object) (load(context)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method String load(Context)>
	//    3    5:areturn         
	}

	public String load(Context context)
		throws Exception
	{
		long l;
		Object obj;
		Object obj1;
		Context context1;
		Context context2;
		String s;
		l = System.nanoTime();
	//    0    0:invokestatic    #96  <Method long System.nanoTime()>
	//    1    3:lstore          4
		s = "";
	//    2    5:ldc1            #51  <String "">
	//    3    7:astore          10
		context1 = null;
	//    4    9:aconst_null     
	//    5   10:astore          8
		context2 = null;
	//    6   12:aconst_null     
	//    7   13:astore          9
		obj = null;
	//    8   15:aconst_null     
	//    9   16:astore          6
		obj1 = null;
	//   10   18:aconst_null     
	//   11   19:astore          7
		context = ((Context) (getZipInputStreamOfApkFrom(context, "io.crash.air")));
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:ldc1            #11  <String "io.crash.air">
	//   15   25:invokevirtual   #98  <Method ZipInputStream getZipInputStreamOfApkFrom(Context, String)>
	//   16   28:astore_1        
		obj1 = ((Object) (context));
	//   17   29:aload_1         
	//   18   30:astore          7
		context1 = context;
	//   19   32:aload_1         
	//   20   33:astore          8
		context2 = context;
	//   21   35:aload_1         
	//   22   36:astore          9
		obj = ((Object) (context));
	//   23   38:aload_1         
	//   24   39:astore          6
		String s1 = determineDeviceToken(((ZipInputStream) (context)));
	//   25   41:aload_0         
	//   26   42:aload_1         
	//   27   43:invokevirtual   #100 <Method String determineDeviceToken(ZipInputStream)>
	//   28   46:astore          11
		obj1 = ((Object) (s1));
	//   29   48:aload           11
	//   30   50:astore          7
		obj = obj1;
	//   31   52:aload           7
	//   32   54:astore          6
		if(context != null)
	//*  33   56:aload_1         
	//*  34   57:ifnull          68
		{
			double d;
			try
			{
				((ZipInputStream) (context)).close();
	//   35   60:aload_1         
	//   36   61:invokevirtual   #103 <Method void ZipInputStream.close()>
			}
	//*  37   64:aload           7
	//*  38   66:astore          6
	//*  39   68:invokestatic    #96  <Method long System.nanoTime()>
	//*  40   71:lload           4
	//*  41   73:lsub            
	//*  42   74:l2d             
	//*  43   75:ldc2w           #104 <Double 1000000D>
	//*  44   78:ddiv            
	//*  45   79:dstore_2        
	//*  46   80:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//*  47   83:ldc1            #113 <String "Beta">
	//*  48   85:new             #115 <Class StringBuilder>
	//*  49   88:dup             
	//*  50   89:invokespecial   #116 <Method void StringBuilder()>
	//*  51   92:ldc1            #118 <String "Beta device token load took ">
	//*  52   94:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  53   97:dload_2         
	//*  54   98:invokevirtual   #125 <Method StringBuilder StringBuilder.append(double)>
	//*  55  101:ldc1            #127 <String "ms">
	//*  56  103:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  57  106:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  58  109:invokeinterface #136 <Method void Logger.d(String, String)>
	//*  59  114:aload           6
	//*  60  116:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  61  117:astore_1        
			{
				Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//   62  118:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   63  121:ldc1            #113 <String "Beta">
	//   64  123:ldc1            #138 <String "Failed to close the APK file">
	//   65  125:aload_1         
	//   66  126:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
				obj = obj1;
	//   67  131:aload           7
	//   68  133:astore          6
				continue; /* Loop/switch isn't completed */
	//   69  135:goto            68
			}
			obj = obj1;
		}
_L2:
		d = (double)(System.nanoTime() - l) / 1000000D;
		Fabric.getLogger().d("Beta", (new StringBuilder()).append("Beta device token load took ").append(d).append("ms").toString());
		return ((String) (obj));
		context;
	//   70  138:astore_1        
		obj = obj1;
	//   71  139:aload           7
	//   72  141:astore          6
		Fabric.getLogger().d("Beta", "Beta by Crashlytics app is not installed");
	//   73  143:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   74  146:ldc1            #113 <String "Beta">
	//   75  148:ldc1            #144 <String "Beta by Crashlytics app is not installed">
	//   76  150:invokeinterface #136 <Method void Logger.d(String, String)>
		obj = ((Object) (s));
	//   77  155:aload           10
	//   78  157:astore          6
		if(obj1 == null)
			continue; /* Loop/switch isn't completed */
	//   79  159:aload           7
	//   80  161:ifnull          68
		try
		{
			((ZipInputStream) (obj1)).close();
	//   81  164:aload           7
	//   82  166:invokevirtual   #103 <Method void ZipInputStream.close()>
		}
	//*  83  169:aload           10
	//*  84  171:astore          6
	//*  85  173:goto            68
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  86  176:astore_1        
		{
			Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//   87  177:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   88  180:ldc1            #113 <String "Beta">
	//   89  182:ldc1            #138 <String "Failed to close the APK file">
	//   90  184:aload_1         
	//   91  185:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
			obj = ((Object) (s));
	//   92  190:aload           10
	//   93  192:astore          6
			continue; /* Loop/switch isn't completed */
	//   94  194:goto            68
		}
		obj = ((Object) (s));
		continue; /* Loop/switch isn't completed */
		context;
	//   95  197:astore_1        
		obj = ((Object) (context1));
	//   96  198:aload           8
	//   97  200:astore          6
		Fabric.getLogger().e("Beta", "Failed to find the APK file", ((Throwable) (context)));
	//   98  202:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   99  205:ldc1            #113 <String "Beta">
	//  100  207:ldc1            #146 <String "Failed to find the APK file">
	//  101  209:aload_1         
	//  102  210:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//  103  215:aload           10
	//  104  217:astore          6
		if(context1 == null)
			continue; /* Loop/switch isn't completed */
	//  105  219:aload           8
	//  106  221:ifnull          68
		try
		{
			((ZipInputStream) (context1)).close();
	//  107  224:aload           8
	//  108  226:invokevirtual   #103 <Method void ZipInputStream.close()>
		}
	//* 109  229:aload           10
	//* 110  231:astore          6
	//* 111  233:goto            68
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  236:astore_1        
		{
			Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//  113  237:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//  114  240:ldc1            #113 <String "Beta">
	//  115  242:ldc1            #138 <String "Failed to close the APK file">
	//  116  244:aload_1         
	//  117  245:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
			obj = ((Object) (s));
	//  118  250:aload           10
	//  119  252:astore          6
			continue; /* Loop/switch isn't completed */
	//  120  254:goto            68
		}
		obj = ((Object) (s));
		continue; /* Loop/switch isn't completed */
		context;
	//  121  257:astore_1        
		obj = ((Object) (context2));
	//  122  258:aload           9
	//  123  260:astore          6
		Fabric.getLogger().e("Beta", "Failed to read the APK file", ((Throwable) (context)));
	//  124  262:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//  125  265:ldc1            #113 <String "Beta">
	//  126  267:ldc1            #148 <String "Failed to read the APK file">
	//  127  269:aload_1         
	//  128  270:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//  129  275:aload           10
	//  130  277:astore          6
		if(context2 == null)
			continue; /* Loop/switch isn't completed */
	//  131  279:aload           9
	//  132  281:ifnull          68
		((ZipInputStream) (context2)).close();
	//  133  284:aload           9
	//  134  286:invokevirtual   #103 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//  135  289:aload           10
	//  136  291:astore          6
		continue; /* Loop/switch isn't completed */
	//  137  293:goto            68
		context;
	//  138  296:astore_1        
		Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//  139  297:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//  140  300:ldc1            #113 <String "Beta">
	//  141  302:ldc1            #138 <String "Failed to close the APK file">
	//  142  304:aload_1         
	//  143  305:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//  144  310:aload           10
	//  145  312:astore          6
		if(true) goto _L2; else goto _L1
	//  146  314:goto            68
_L1:
		context;
	//  147  317:astore_1        
		if(obj != null)
	//* 148  318:aload           6
	//* 149  320:ifnull          328
			try
			{
				((ZipInputStream) (obj)).close();
	//  150  323:aload           6
	//  151  325:invokevirtual   #103 <Method void ZipInputStream.close()>
			}
	//* 152  328:aload_1         
	//* 153  329:athrow          
			catch(IOException ioexception)
	//* 154  330:astore          6
			{
				Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (ioexception)));
	//  155  332:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//  156  335:ldc1            #113 <String "Beta">
	//  157  337:ldc1            #138 <String "Failed to close the APK file">
	//  158  339:aload           6
	//  159  341:invokeinterface #142 <Method void Logger.e(String, String, Throwable)>
			}
		throw context;
	//* 160  346:goto            328
	}

	private static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
	private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";
}
