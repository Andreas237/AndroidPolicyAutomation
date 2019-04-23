// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class RuntimeCompat
{

	private RuntimeCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	static int availableProcessors()
	{
		int j = Runtime.getRuntime().availableProcessors();
	//    0    0:invokestatic    #29  <Method Runtime Runtime.getRuntime()>
	//    1    3:invokevirtual   #31  <Method int Runtime.availableProcessors()>
	//    2    6:istore_1        
		int i = j;
	//    3    7:iload_1         
	//    4    8:istore_0        
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   5    9:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          17
	//*   7   14:icmpge          25
			i = Math.max(getCoreCountPre17(), j);
	//    8   17:invokestatic    #40  <Method int getCoreCountPre17()>
	//    9   20:iload_1         
	//   10   21:invokestatic    #46  <Method int Math.max(int, int)>
	//   11   24:istore_0        
		return i;
	//   12   25:iload_0         
	//   13   26:ireturn         
	}

	private static int getCoreCountPre17()
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskReads();
	//    0    0:invokestatic    #54  <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    1    3:astore_2        
		Object obj = ((Object) ((new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

			public boolean accept(File file, String s)
			{
				return cpuNamePattern.matcher(((CharSequence) (s))).matches();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field Pattern val$cpuNamePattern>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #29  <Method Matcher Pattern.matcher(CharSequence)>
			//    4    8:invokevirtual   #35  <Method boolean Matcher.matches()>
			//    5   11:ireturn         
			}

			final Pattern val$cpuNamePattern;

			
			{
				cpuNamePattern = pattern;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Pattern val$cpuNamePattern>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    2    4:new             #56  <Class File>
	//    3    7:dup             
	//    4    8:ldc1            #10  <String "/sys/devices/system/cpu/">
	//    5   10:invokespecial   #59  <Method void File(String)>
	//    6   13:new             #6   <Class RuntimeCompat$1>
	//    7   16:dup             
	//    8   17:ldc1            #13  <String "cpu[0-9]+">
	//    9   19:invokestatic    #65  <Method Pattern Pattern.compile(String)>
	//   10   22:invokespecial   #68  <Method void RuntimeCompat$1(Pattern)>
	//   11   25:invokevirtual   #72  <Method File[] File.listFiles(FilenameFilter)>
	//   12   28:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   13   29:aload_2         
	//   14   30:invokestatic    #76  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		break MISSING_BLOCK_LABEL_66;
	//   15   33:goto            66
		obj;
	//   16   36:astore_1        
		break MISSING_BLOCK_LABEL_84;
	//   17   37:goto            84
		obj;
	//   18   40:astore_1        
		if(Log.isLoggable("GlideRuntimeCompat", 6))
	//*  19   41:ldc1            #16  <String "GlideRuntimeCompat">
	//*  20   43:bipush          6
	//*  21   45:invokestatic    #82  <Method boolean Log.isLoggable(String, int)>
	//*  22   48:ifeq            60
			Log.e("GlideRuntimeCompat", "Failed to calculate accurate cpu count", ((Throwable) (obj)));
	//   23   51:ldc1            #16  <String "GlideRuntimeCompat">
	//   24   53:ldc1            #84  <String "Failed to calculate accurate cpu count">
	//   25   55:aload_1         
	//   26   56:invokestatic    #88  <Method int Log.e(String, String, Throwable)>
	//   27   59:pop             
		StrictMode.setThreadPolicy(threadpolicy);
	//   28   60:aload_2         
	//   29   61:invokestatic    #76  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		obj = null;
	//   30   64:aconst_null     
	//   31   65:astore_1        
		int i;
		if(obj != null)
	//*  32   66:aload_1         
	//*  33   67:ifnull          76
			i = obj.length;
	//   34   70:aload_1         
	//   35   71:arraylength     
	//   36   72:istore_0        
		else
	//*  37   73:goto            78
			i = 0;
	//   38   76:iconst_0        
	//   39   77:istore_0        
		return Math.max(1, i);
	//   40   78:iconst_1        
	//   41   79:iload_0         
	//   42   80:invokestatic    #46  <Method int Math.max(int, int)>
	//   43   83:ireturn         
		StrictMode.setThreadPolicy(threadpolicy);
	//   44   84:aload_2         
	//   45   85:invokestatic    #76  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw obj;
	//   46   88:aload_1         
	//   47   89:athrow          
	}

	private static final String CPU_LOCATION = "/sys/devices/system/cpu/";
	private static final String CPU_NAME_REGEX = "cpu[0-9]+";
	private static final String TAG = "GlideRuntimeCompat";
}
