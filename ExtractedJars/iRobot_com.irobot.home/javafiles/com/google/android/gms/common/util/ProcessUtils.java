// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.*;

// Referenced classes of package com.google.android.gms.common.util:
//			IOUtils

public class ProcessUtils
{

	private ProcessUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String getMyProcessName()
	{
		if(zzhd == null)
	//*   0    0:getstatic       #20  <Field String zzhd>
	//*   1    3:ifnonnull       27
		{
			if(zzhe == 0)
	//*   2    6:getstatic       #22  <Field int zzhe>
	//*   3    9:ifne            18
				zzhe = Process.myPid();
	//    4   12:invokestatic    #28  <Method int Process.myPid()>
	//    5   15:putstatic       #22  <Field int zzhe>
			zzhd = zzd(zzhe);
	//    6   18:getstatic       #22  <Field int zzhe>
	//    7   21:invokestatic    #32  <Method String zzd(int)>
	//    8   24:putstatic       #20  <Field String zzhd>
		}
		return zzhd;
	//    9   27:getstatic       #20  <Field String zzhd>
	//   10   30:areturn         
	}

	private static String zzd(int i)
	{
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(i <= 0)
	//*   2    2:iload_0         
	//*   3    3:ifgt            8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		Object obj;
		obj = ((Object) (new StringBuilder(25)));
	//    6    8:new             #38  <Class StringBuilder>
	//    7   11:dup             
	//    8   12:bipush          25
	//    9   14:invokespecial   #41  <Method void StringBuilder(int)>
	//   10   17:astore_1        
		((StringBuilder) (obj)).append("/proc/");
	//   11   18:aload_1         
	//   12   19:ldc1            #43  <String "/proc/">
	//   13   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   14   24:pop             
		((StringBuilder) (obj)).append(i);
	//   15   25:aload_1         
	//   16   26:iload_0         
	//   17   27:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   18   30:pop             
		((StringBuilder) (obj)).append("/cmdline");
	//   19   31:aload_1         
	//   20   32:ldc1            #52  <String "/cmdline">
	//   21   34:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
		obj = ((Object) (zzj(((StringBuilder) (obj)).toString())));
	//   23   38:aload_1         
	//   24   39:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   25   42:invokestatic    #59  <Method BufferedReader zzj(String)>
	//   26   45:astore_1        
		String s = ((BufferedReader) (obj)).readLine().trim();
	//   27   46:aload_1         
	//   28   47:invokevirtual   #64  <Method String BufferedReader.readLine()>
	//   29   50:invokevirtual   #69  <Method String String.trim()>
	//   30   53:astore_2        
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   31   54:aload_1         
	//   32   55:invokestatic    #75  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return s;
	//   33   58:aload_2         
	//   34   59:areturn         
		Object obj1;
		obj1;
	//   35   60:astore_2        
		break MISSING_BLOCK_LABEL_67;
	//   36   61:goto            67
		obj1;
	//   37   64:astore_2        
		obj = ((Object) (obj2));
	//   38   65:aload_3         
	//   39   66:astore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   40   67:aload_1         
	//   41   68:invokestatic    #75  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj1;
	//   42   71:aload_2         
	//   43   72:athrow          
_L1:
		obj = null;
	//   44   73:aconst_null     
	//   45   74:astore_1        
_L2:
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   46   75:aload_1         
	//   47   76:invokestatic    #75  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   48   79:aconst_null     
	//   49   80:areturn         
		IOException ioexception;
		ioexception;
	//   50   81:astore_1        
		  goto _L1
	//*  51   82:goto            73
		obj1;
	//   52   85:astore_2        
		  goto _L2
	//*  53   86:goto            75
	}

	private static BufferedReader zzj(String s)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskReads();
	//    0    0:invokestatic    #81  <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    1    3:astore_1        
		s = ((String) (new BufferedReader(((java.io.Reader) (new FileReader(s))))));
	//    2    4:new             #61  <Class BufferedReader>
	//    3    7:dup             
	//    4    8:new             #83  <Class FileReader>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #86  <Method void FileReader(String)>
	//    8   16:invokespecial   #89  <Method void BufferedReader(java.io.Reader)>
	//    9   19:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   10   20:aload_1         
	//   11   21:invokestatic    #93  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((BufferedReader) (s));
	//   12   24:aload_0         
	//   13   25:areturn         
		s;
	//   14   26:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   15   27:aload_1         
	//   16   28:invokestatic    #93  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw s;
	//   17   31:aload_0         
	//   18   32:athrow          
	}

	private static String zzhd;
	private static int zzhe;

	static 
	{
	//    0    0:return          
	}
}
