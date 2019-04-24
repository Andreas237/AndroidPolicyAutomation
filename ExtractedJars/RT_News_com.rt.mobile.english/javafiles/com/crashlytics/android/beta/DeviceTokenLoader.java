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
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	String determineDeviceToken(ZipInputStream zipinputstream)
		throws IOException
	{
		do
		{
			Object obj = ((Object) (zipinputstream.getNextEntry()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method ZipEntry ZipInputStream.getNextEntry()>
	//    2    4:astore_2        
			if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          39
			{
				obj = ((Object) (((ZipEntry) (obj)).getName()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #32  <Method String ZipEntry.getName()>
	//    7   13:astore_2        
				if(((String) (obj)).startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token="))
	//*   8   14:aload_2         
	//*   9   15:ldc1            #11  <String "assets/com.crashlytics.android.beta/dirfactor-device-token=">
	//*  10   17:invokevirtual   #38  <Method boolean String.startsWith(String)>
	//*  11   20:ifeq            0
					return ((String) (obj)).substring("assets/com.crashlytics.android.beta/dirfactor-device-token=".length(), ((String) (obj)).length() - 1);
	//   12   23:aload_2         
	//   13   24:ldc1            #11  <String "assets/com.crashlytics.android.beta/dirfactor-device-token=">
	//   14   26:invokevirtual   #42  <Method int String.length()>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #42  <Method int String.length()>
	//   17   33:iconst_1        
	//   18   34:isub            
	//   19   35:invokevirtual   #46  <Method String String.substring(int, int)>
	//   20   38:areturn         
			} else
			{
				return "";
	//   21   39:ldc1            #48  <String "">
	//   22   41:areturn         
			}
		} while(true);
	}

	ZipInputStream getZipInputStreamOfAppApkFrom(Context context)
		throws android.content.pm.PackageManager.NameNotFoundException, FileNotFoundException
	{
		return new ZipInputStream(((java.io.InputStream) (new FileInputStream(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir))));
	//    0    0:new             #22  <Class ZipInputStream>
	//    1    3:dup             
	//    2    4:new             #57  <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #63  <Method PackageManager Context.getPackageManager()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #66  <Method String Context.getPackageName()>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #72  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   10   20:getfield        #77  <Field String ApplicationInfo.sourceDir>
	//   11   23:invokespecial   #80  <Method void FileInputStream(String)>
	//   12   26:invokespecial   #83  <Method void ZipInputStream(java.io.InputStream)>
	//   13   29:areturn         
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
		String s;
		Object obj2;
		Object obj3;
		Object obj4;
		l = System.nanoTime();
	//    0    0:invokestatic    #96  <Method long System.nanoTime()>
	//    1    3:lstore          4
		s = "";
	//    2    5:ldc1            #48  <String "">
	//    3    7:astore          8
		obj2 = null;
	//    4    9:aconst_null     
	//    5   10:astore          9
		obj3 = null;
	//    6   12:aconst_null     
	//    7   13:astore          10
		obj4 = null;
	//    8   15:aconst_null     
	//    9   16:astore          11
		obj = null;
	//   10   18:aconst_null     
	//   11   19:astore          6
		context = ((Context) (getZipInputStreamOfAppApkFrom(context)));
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #98  <Method ZipInputStream getZipInputStreamOfAppApkFrom(Context)>
	//   15   26:astore_1        
		obj = ((Object) (determineDeviceToken(((ZipInputStream) (context)))));
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #100 <Method String determineDeviceToken(ZipInputStream)>
	//   19   32:astore          6
		if(context != null)
	//*  20   34:aload_1         
	//*  21   35:ifnull          59
			try
			{
				((ZipInputStream) (context)).close();
	//   22   38:aload_1         
	//   23   39:invokevirtual   #103 <Method void ZipInputStream.close()>
			}
	//*  24   42:goto            59
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  25   45:astore_1        
			{
				Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//   26   46:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//   27   49:ldc1            #111 <String "Beta">
	//   28   51:ldc1            #113 <String "Failed to close the APK file">
	//   29   53:aload_1         
	//   30   54:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
			}
		break MISSING_BLOCK_LABEL_233;
	//   31   59:goto            233
		Object obj1;
		obj1;
	//   32   62:astore          7
		obj = ((Object) (context));
	//   33   64:aload_1         
	//   34   65:astore          6
		context = ((Context) (obj1));
	//   35   67:aload           7
	//   36   69:astore_1        
		break MISSING_BLOCK_LABEL_297;
	//   37   70:goto            297
		obj1;
	//   38   73:astore          7
		break MISSING_BLOCK_LABEL_97;
	//   39   75:goto            97
		obj1;
	//   40   78:astore          7
		break MISSING_BLOCK_LABEL_138;
	//   41   80:goto            138
		obj1;
	//   42   83:astore          7
		break MISSING_BLOCK_LABEL_179;
	//   43   85:goto            179
		context;
	//   44   88:astore_1        
		break MISSING_BLOCK_LABEL_297;
	//   45   89:goto            297
		obj1;
	//   46   92:astore          7
		context = ((Context) (obj2));
	//   47   94:aload           9
	//   48   96:astore_1        
		obj = ((Object) (context));
	//   49   97:aload_1         
	//   50   98:astore          6
		Fabric.getLogger().e("Beta", "Failed to read the APK file", ((Throwable) (obj1)));
	//   51  100:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//   52  103:ldc1            #111 <String "Beta">
	//   53  105:ldc1            #121 <String "Failed to read the APK file">
	//   54  107:aload           7
	//   55  109:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//   56  114:aload           8
	//   57  116:astore          6
		if(context == null)
			break MISSING_BLOCK_LABEL_233;
	//   58  118:aload_1         
	//   59  119:ifnull          233
		((ZipInputStream) (context)).close();
	//   60  122:aload_1         
	//   61  123:invokevirtual   #103 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//   62  126:aload           8
	//   63  128:astore          6
		break MISSING_BLOCK_LABEL_233;
	//   64  130:goto            233
		obj1;
	//   65  133:astore          7
		context = ((Context) (obj3));
	//   66  135:aload           10
	//   67  137:astore_1        
		obj = ((Object) (context));
	//   68  138:aload_1         
	//   69  139:astore          6
		Fabric.getLogger().e("Beta", "Failed to find the APK file", ((Throwable) (obj1)));
	//   70  141:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//   71  144:ldc1            #111 <String "Beta">
	//   72  146:ldc1            #123 <String "Failed to find the APK file">
	//   73  148:aload           7
	//   74  150:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//   75  155:aload           8
	//   76  157:astore          6
		if(context == null)
			break MISSING_BLOCK_LABEL_233;
	//   77  159:aload_1         
	//   78  160:ifnull          233
		((ZipInputStream) (context)).close();
	//   79  163:aload_1         
	//   80  164:invokevirtual   #103 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//   81  167:aload           8
	//   82  169:astore          6
		break MISSING_BLOCK_LABEL_233;
	//   83  171:goto            233
		obj1;
	//   84  174:astore          7
		context = ((Context) (obj4));
	//   85  176:aload           11
	//   86  178:astore_1        
		obj = ((Object) (context));
	//   87  179:aload_1         
	//   88  180:astore          6
		Fabric.getLogger().e("Beta", "Failed to find this app in the PackageManager", ((Throwable) (obj1)));
	//   89  182:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//   90  185:ldc1            #111 <String "Beta">
	//   91  187:ldc1            #125 <String "Failed to find this app in the PackageManager">
	//   92  189:aload           7
	//   93  191:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//   94  196:aload           8
	//   95  198:astore          6
		if(context == null)
			break MISSING_BLOCK_LABEL_233;
	//   96  200:aload_1         
	//   97  201:ifnull          233
		((ZipInputStream) (context)).close();
	//   98  204:aload_1         
	//   99  205:invokevirtual   #103 <Method void ZipInputStream.close()>
		obj = ((Object) (s));
	//  100  208:aload           8
	//  101  210:astore          6
		break MISSING_BLOCK_LABEL_233;
	//  102  212:goto            233
		context;
	//  103  215:astore_1        
		Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (context)));
	//  104  216:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//  105  219:ldc1            #111 <String "Beta">
	//  106  221:ldc1            #113 <String "Failed to close the APK file">
	//  107  223:aload_1         
	//  108  224:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
		obj = ((Object) (s));
	//  109  229:aload           8
	//  110  231:astore          6
		double d = (double)(System.nanoTime() - l) / 1000000D;
	//  111  233:invokestatic    #96  <Method long System.nanoTime()>
	//  112  236:lload           4
	//  113  238:lsub            
	//  114  239:l2d             
	//  115  240:ldc2w           #126 <Double 1000000D>
	//  116  243:ddiv            
	//  117  244:dstore_2        
		context = ((Context) (Fabric.getLogger()));
	//  118  245:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//  119  248:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//  120  249:new             #129 <Class StringBuilder>
	//  121  252:dup             
	//  122  253:invokespecial   #130 <Method void StringBuilder()>
	//  123  256:astore          7
		stringbuilder.append("Beta device token load took ");
	//  124  258:aload           7
	//  125  260:ldc1            #132 <String "Beta device token load took ">
	//  126  262:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  127  265:pop             
		stringbuilder.append(d);
	//  128  266:aload           7
	//  129  268:dload_2         
	//  130  269:invokevirtual   #139 <Method StringBuilder StringBuilder.append(double)>
	//  131  272:pop             
		stringbuilder.append("ms");
	//  132  273:aload           7
	//  133  275:ldc1            #141 <String "ms">
	//  134  277:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//  135  280:pop             
		((Logger) (context)).d("Beta", stringbuilder.toString());
	//  136  281:aload_1         
	//  137  282:ldc1            #111 <String "Beta">
	//  138  284:aload           7
	//  139  286:invokevirtual   #144 <Method String StringBuilder.toString()>
	//  140  289:invokeinterface #148 <Method void Logger.d(String, String)>
		return ((String) (obj));
	//  141  294:aload           6
	//  142  296:areturn         
		if(obj != null)
	//* 143  297:aload           6
	//* 144  299:ifnull          326
			try
			{
				((ZipInputStream) (obj)).close();
	//  145  302:aload           6
	//  146  304:invokevirtual   #103 <Method void ZipInputStream.close()>
			}
	//* 147  307:goto            326
			catch(IOException ioexception)
	//* 148  310:astore          6
			{
				Fabric.getLogger().e("Beta", "Failed to close the APK file", ((Throwable) (ioexception)));
	//  149  312:invokestatic    #109 <Method Logger Fabric.getLogger()>
	//  150  315:ldc1            #111 <String "Beta">
	//  151  317:ldc1            #113 <String "Failed to close the APK file">
	//  152  319:aload           6
	//  153  321:invokeinterface #119 <Method void Logger.e(String, String, Throwable)>
			}
		throw context;
	//  154  326:aload_1         
	//  155  327:athrow          
	}

	private static final String DIRFACTOR_DEVICE_TOKEN_PREFIX = "assets/com.crashlytics.android.beta/dirfactor-device-token=";
}
