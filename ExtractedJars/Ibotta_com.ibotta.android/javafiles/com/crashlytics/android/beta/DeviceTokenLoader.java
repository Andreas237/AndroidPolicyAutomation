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
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	String determineDeviceToken(ZipInputStream zipinputstream)
		throws IOException
	{
		zipinputstream = ((ZipInputStream) (zipinputstream.getNextEntry()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method ZipEntry ZipInputStream.getNextEntry()>
	//    2    4:astore_1        
		if(zipinputstream != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          36
		{
			zipinputstream = ((ZipInputStream) (((ZipEntry) (zipinputstream)).getName()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method String ZipEntry.getName()>
	//    7   13:astore_1        
			if(((String) (zipinputstream)).startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token="))
	//*   8   14:aload_1         
	//*   9   15:ldc1            #30  <String "assets/com.crashlytics.android.beta/dirfactor-device-token=">
	//*  10   17:invokevirtual   #36  <Method boolean String.startsWith(String)>
	//*  11   20:ifeq            36
				return ((String) (zipinputstream)).substring(59, ((String) (zipinputstream)).length() - 1);
	//   12   23:aload_1         
	//   13   24:bipush          59
	//   14   26:aload_1         
	//   15   27:invokevirtual   #40  <Method int String.length()>
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:invokevirtual   #44  <Method String String.substring(int, int)>
	//   19   35:areturn         
		}
		return "";
	//   20   36:ldc1            #46  <String "">
	//   21   38:areturn         
	}

	ZipInputStream getZipInputStreamOfApkFrom(Context context, String s)
		throws android.content.pm.PackageManager.NameNotFoundException, FileNotFoundException
	{
		return new ZipInputStream(((java.io.InputStream) (new FileInputStream(context.getPackageManager().getApplicationInfo(s, 0).sourceDir))));
	//    0    0:new             #18  <Class ZipInputStream>
	//    1    3:dup             
	//    2    4:new             #55  <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #61  <Method PackageManager Context.getPackageManager()>
	//    6   12:aload_2         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #67  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   17:getfield        #73  <Field String ApplicationInfo.sourceDir>
	//   10   20:invokespecial   #76  <Method void FileInputStream(String)>
	//   11   23:invokespecial   #79  <Method void ZipInputStream(java.io.InputStream)>
	//   12   26:areturn         
	}

	public volatile Object load(Context context)
		throws Exception
	{
		return ((Object) (load(context)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method String load(Context)>
	//    3    5:areturn         
	}

	public String load(Context context)
		throws Exception
	{
		long l;
		Object obj;
		Context context1;
		Context context2;
		Context context3;
		String s;
		l = System.nanoTime();
	//    0    0:invokestatic    #92  <Method long System.nanoTime()>
	//    1    3:lstore          4
		s = "";
	//    2    5:ldc1            #46  <String "">
	//    3    7:astore          10
		context1 = null;
	//    4    9:aconst_null     
	//    5   10:astore          7
		context2 = null;
	//    6   12:aconst_null     
	//    7   13:astore          8
		context3 = null;
	//    8   15:aconst_null     
	//    9   16:astore          9
		obj = null;
	//   10   18:aconst_null     
	//   11   19:astore          6
		context = ((Context) (getZipInputStreamOfApkFrom(context, "io.crash.air")));
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:ldc1            #94  <String "io.crash.air">
	//   15   25:invokevirtual   #96  <Method ZipInputStream getZipInputStreamOfApkFrom(Context, String)>
	//   16   28:astore_1        
		obj = ((Object) (context));
	//   17   29:aload_1         
	//   18   30:astore          6
		context1 = context;
	//   19   32:aload_1         
	//   20   33:astore          7
		context2 = context;
	//   21   35:aload_1         
	//   22   36:astore          8
		context3 = context;
	//   23   38:aload_1         
	//   24   39:astore          9
		String s1 = determineDeviceToken(((ZipInputStream) (context)));
	//   25   41:aload_0         
	//   26   42:aload_1         
	//   27   43:invokevirtual   #98  <Method String determineDeviceToken(ZipInputStream)>
	//   28   46:astore          11
		obj = ((Object) (s1));
	//   29   48:aload           11
	//   30   50:astore          6
		if(context == null) goto _L2; else goto _L1
	//   31   52:aload_1         
	//   32   53:ifnull          216
_L1:
		obj = ((Object) (s1));
	//   33   56:aload           11
	//   34   58:astore          6
		((ZipInputStream) (context)).close();
	//   35   60:aload_1         
	//   36   61:invokevirtual   #101 <Method void ZipInputStream.close()>
		obj = ((Object) (s1));
	//   37   64:aload           11
	//   38   66:astore          6
		  goto _L2
	//*  39   68:goto            216
		context;
	//   40   71:astore_1        
		Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//   41   72:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//   42   75:ldc1            #109 <String "Beta">
	//   43   77:ldc1            #111 <String "Failed to close the APK file">
	//   44   79:aload_1         
	//   45   80:invokeinterface #117 <Method void Logger.e(String, String, Throwable)>
		  goto _L2
	//*  46   85:goto            216
		context;
	//   47   88:astore_1        
		  goto _L3
	//*  48   89:goto            280
		context;
	//   49   92:astore_1        
		obj = ((Object) (context1));
	//   50   93:aload           7
	//   51   95:astore          6
		Fabric.getLogger().e("Beta", "Failed to read the APK file", ((Throwable) (context)));
	//   52   97:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//   53  100:ldc1            #109 <String "Beta">
	//   54  102:ldc1            #119 <String "Failed to read the APK file">
	//   55  104:aload_1         
	//   56  105:invokeinterface #117 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//   57  110:aload           10
	//   58  112:astore          6
		if(context1 == null) goto _L2; else goto _L4
	//   59  114:aload           7
	//   60  116:ifnull          216
_L4:
		obj = ((Object) (s));
	//   61  119:aload           10
	//   62  121:astore          6
		((ZipInputStream) (context1)).close();
	//   63  123:aload           7
	//   64  125:invokevirtual   #101 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//   65  128:aload           10
	//   66  130:astore          6
		  goto _L2
	//*  67  132:goto            216
		context;
	//   68  135:astore_1        
		obj = ((Object) (context2));
	//   69  136:aload           8
	//   70  138:astore          6
		Fabric.getLogger().e("Beta", "Failed to find the APK file", ((Throwable) (context)));
	//   71  140:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//   72  143:ldc1            #109 <String "Beta">
	//   73  145:ldc1            #121 <String "Failed to find the APK file">
	//   74  147:aload_1         
	//   75  148:invokeinterface #117 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//   76  153:aload           10
	//   77  155:astore          6
		if(context2 == null) goto _L2; else goto _L5
	//   78  157:aload           8
	//   79  159:ifnull          216
_L5:
		obj = ((Object) (s));
	//   80  162:aload           10
	//   81  164:astore          6
		((ZipInputStream) (context2)).close();
	//   82  166:aload           8
	//   83  168:invokevirtual   #101 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//   84  171:aload           10
	//   85  173:astore          6
		  goto _L2
	//*  86  175:goto            216
_L8:
		obj = ((Object) (context3));
	//   87  178:aload           9
	//   88  180:astore          6
		Fabric.getLogger().d("Beta", "Beta by Crashlytics app is not installed");
	//   89  182:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//   90  185:ldc1            #109 <String "Beta">
	//   91  187:ldc1            #123 <String "Beta by Crashlytics app is not installed">
	//   92  189:invokeinterface #127 <Method void Logger.d(String, String)>
		obj = ((Object) (s));
	//   93  194:aload           10
	//   94  196:astore          6
		if(context3 == null) goto _L2; else goto _L6
	//   95  198:aload           9
	//   96  200:ifnull          216
_L6:
		obj = ((Object) (s));
	//   97  203:aload           10
	//   98  205:astore          6
		((ZipInputStream) (context3)).close();
	//   99  207:aload           9
	//  100  209:invokevirtual   #101 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//  101  212:aload           10
	//  102  214:astore          6
_L2:
		double d = (double)(System.nanoTime() - l) / 1000000D;
	//  103  216:invokestatic    #92  <Method long System.nanoTime()>
	//  104  219:lload           4
	//  105  221:lsub            
	//  106  222:l2d             
	//  107  223:ldc2w           #128 <Double 1000000D>
	//  108  226:ddiv            
	//  109  227:dstore_2        
		context = ((Context) (Fabric.getLogger()));
	//  110  228:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//  111  231:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//  112  232:new             #131 <Class StringBuilder>
	//  113  235:dup             
	//  114  236:invokespecial   #132 <Method void StringBuilder()>
	//  115  239:astore          7
		stringbuilder.append("Beta device token load took ");
	//  116  241:aload           7
	//  117  243:ldc1            #134 <String "Beta device token load took ">
	//  118  245:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  119  248:pop             
		stringbuilder.append(d);
	//  120  249:aload           7
	//  121  251:dload_2         
	//  122  252:invokevirtual   #141 <Method StringBuilder StringBuilder.append(double)>
	//  123  255:pop             
		stringbuilder.append("ms");
	//  124  256:aload           7
	//  125  258:ldc1            #143 <String "ms">
	//  126  260:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//  127  263:pop             
		((Logger) (context)).d("Beta", stringbuilder.toString());
	//  128  264:aload_1         
	//  129  265:ldc1            #109 <String "Beta">
	//  130  267:aload           7
	//  131  269:invokevirtual   #146 <Method String StringBuilder.toString()>
	//  132  272:invokeinterface #127 <Method void Logger.d(String, String)>
		return ((String) (obj));
	//  133  277:aload           6
	//  134  279:areturn         
_L3:
		if(obj != null)
	//* 135  280:aload           6
	//* 136  282:ifnull          309
			try
			{
				((ZipInputStream) (obj)).close();
	//  137  285:aload           6
	//  138  287:invokevirtual   #101 <Method void ZipInputStream.close()>
			}
	//* 139  290:goto            309
			catch(IOException ioexception)
	//* 140  293:astore          6
			{
				Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (ioexception)));
	//  141  295:invokestatic    #107 <Method Logger Fabric.getLogger()>
	//  142  298:ldc1            #109 <String "Beta">
	//  143  300:ldc1            #111 <String "Failed to close the APK file">
	//  144  302:aload           6
	//  145  304:invokeinterface #117 <Method void Logger.e(String, String, Throwable)>
			}
		throw context;
	//  146  309:aload_1         
	//  147  310:athrow          
		context;
	//  148  311:astore_1        
		if(true) goto _L8; else goto _L7
_L7:
	//* 149  312:goto            178
	}
}
