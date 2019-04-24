// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.*;
import java.io.*;

// Referenced classes of package com.google.android.gms.common.util:
//			IOUtils

public class ProcessUtils
{
	public static class SystemGroupsNotAvailableException extends Exception
	{

		SystemGroupsNotAvailableException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		SystemGroupsNotAvailableException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}
	}


	private ProcessUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static String getCallingProcessName()
	{
		int i = Binder.getCallingPid();
	//    0    0:invokestatic    #26  <Method int Binder.getCallingPid()>
	//    1    3:istore_0        
		if(i == zzde())
	//*   2    4:iload_0         
	//*   3    5:invokestatic    #29  <Method int zzde()>
	//*   4    8:icmpne          15
			return getMyProcessName();
	//    5   11:invokestatic    #32  <Method String getMyProcessName()>
	//    6   14:areturn         
		else
			return zzl(i);
	//    7   15:iload_0         
	//    8   16:invokestatic    #36  <Method String zzl(int)>
	//    9   19:areturn         
	}

	public static String getMyProcessName()
	{
		if(zzaai == null)
	//*   0    0:getstatic       #39  <Field String zzaai>
	//*   1    3:ifnonnull       15
			zzaai = zzl(zzde());
	//    2    6:invokestatic    #29  <Method int zzde()>
	//    3    9:invokestatic    #36  <Method String zzl(int)>
	//    4   12:putstatic       #39  <Field String zzaai>
		return zzaai;
	//    5   15:getstatic       #39  <Field String zzaai>
	//    6   18:areturn         
	}

	public static boolean hasSystemGroups()
		throws SystemGroupsNotAvailableException
	{
		Object obj;
		Object obj1;
		Object obj3;
		obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		obj = obj1;
	//    4    5:aload_3         
	//    5    6:astore_2        
		int i = zzde();
	//    6    7:invokestatic    #29  <Method int zzde()>
	//    7   10:istore_0        
		obj = obj1;
	//    8   11:aload_3         
	//    9   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(24);
	//   10   13:new             #45  <Class StringBuilder>
	//   11   16:dup             
	//   12   17:bipush          24
	//   13   19:invokespecial   #48  <Method void StringBuilder(int)>
	//   14   22:astore          4
		obj = obj1;
	//   15   24:aload_3         
	//   16   25:astore_2        
		stringbuilder.append("/proc/");
	//   17   26:aload           4
	//   18   28:ldc1            #50  <String "/proc/">
	//   19   30:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   20   33:pop             
		obj = obj1;
	//   21   34:aload_3         
	//   22   35:astore_2        
		stringbuilder.append(i);
	//   23   36:aload           4
	//   24   38:iload_0         
	//   25   39:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   26   42:pop             
		obj = obj1;
	//   27   43:aload_3         
	//   28   44:astore_2        
		stringbuilder.append("/status");
	//   29   45:aload           4
	//   30   47:ldc1            #59  <String "/status">
	//   31   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   32   52:pop             
		obj = obj1;
	//   33   53:aload_3         
	//   34   54:astore_2        
		obj1 = ((Object) (zzm(stringbuilder.toString())));
	//   35   55:aload           4
	//   36   57:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   37   60:invokestatic    #66  <Method BufferedReader zzm(String)>
	//   38   63:astore_3        
		boolean flag = zzk(((BufferedReader) (obj1)));
	//   39   64:aload_3         
	//   40   65:invokestatic    #70  <Method boolean zzk(BufferedReader)>
	//   41   68:istore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (obj1)));
	//   42   69:aload_3         
	//   43   70:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return flag;
	//   44   73:iload_1         
	//   45   74:ireturn         
		obj;
	//   46   75:astore_2        
		break MISSING_BLOCK_LABEL_113;
	//   47   76:goto            113
		Object obj2;
		obj2;
	//   48   79:astore          4
		obj = obj1;
	//   49   81:aload_3         
	//   50   82:astore_2        
		break MISSING_BLOCK_LABEL_101;
	//   51   83:goto            101
		obj2;
	//   52   86:astore          4
		obj1 = obj;
	//   53   88:aload_2         
	//   54   89:astore_3        
		obj = obj2;
	//   55   90:aload           4
	//   56   92:astore_2        
		break MISSING_BLOCK_LABEL_113;
	//   57   93:goto            113
		obj2;
	//   58   96:astore          4
		obj = ((Object) (obj3));
	//   59   98:aload           5
	//   60  100:astore_2        
		throw new SystemGroupsNotAvailableException("Unable to access /proc/pid/status.", ((Throwable) (obj2)));
	//   61  101:new             #6   <Class ProcessUtils$SystemGroupsNotAvailableException>
	//   62  104:dup             
	//   63  105:ldc1            #78  <String "Unable to access /proc/pid/status.">
	//   64  107:aload           4
	//   65  109:invokespecial   #81  <Method void ProcessUtils$SystemGroupsNotAvailableException(String, Throwable)>
	//   66  112:athrow          
		IOUtils.closeQuietly(((java.io.Closeable) (obj1)));
	//   67  113:aload_3         
	//   68  114:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj;
	//   69  117:aload_2         
	//   70  118:athrow          
	}

	private static int zzde()
	{
		if(zzaaj == 0)
	//*   0    0:getstatic       #84  <Field int zzaaj>
	//*   1    3:ifne            12
			zzaaj = Process.myPid();
	//    2    6:invokestatic    #89  <Method int Process.myPid()>
	//    3    9:putstatic       #84  <Field int zzaaj>
		return zzaaj;
	//    4   12:getstatic       #84  <Field int zzaaj>
	//    5   15:ireturn         
	}

	private static boolean zzk(BufferedReader bufferedreader)
		throws IOException, SystemGroupsNotAvailableException
	{
_L4:
		String s = bufferedreader.readLine();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method String BufferedReader.readLine()>
	//    2    4:astore          5
		if(s == null) goto _L2; else goto _L1
	//    3    6:aload           5
	//    4    8:ifnull          93
_L1:
		s = s.trim();
	//    5   11:aload           5
	//    6   13:invokevirtual   #101 <Method String String.trim()>
	//    7   16:astore          5
		if(!s.startsWith("Groups:")) goto _L4; else goto _L3
	//    8   18:aload           5
	//    9   20:ldc1            #103 <String "Groups:">
	//   10   22:invokevirtual   #107 <Method boolean String.startsWith(String)>
	//   11   25:ifeq            0
_L3:
		int i;
		int j;
		bufferedreader = ((BufferedReader) (s.substring(7).trim().split("\\s", -1)));
	//   12   28:aload           5
	//   13   30:bipush          7
	//   14   32:invokevirtual   #110 <Method String String.substring(int)>
	//   15   35:invokevirtual   #101 <Method String String.trim()>
	//   16   38:ldc1            #112 <String "\\s">
	//   17   40:iconst_m1       
	//   18   41:invokevirtual   #116 <Method String[] String.split(String, int)>
	//   19   44:astore_0        
		j = bufferedreader.length;
	//   20   45:aload_0         
	//   21   46:arraylength     
	//   22   47:istore_2        
		i = 0;
	//   23   48:iconst_0        
	//   24   49:istore_1        
_L6:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   25   50:iload_1         
	//   26   51:iload_2         
	//   27   52:icmpge          91
		s = ((String) (bufferedreader[i]));
	//   28   55:aload_0         
	//   29   56:iload_1         
	//   30   57:aaload          
	//   31   58:astore          5
		long l = Long.parseLong(s);
	//   32   60:aload           5
	//   33   62:invokestatic    #122 <Method long Long.parseLong(String)>
	//   34   65:lstore_3        
		if(l >= 1000L && l < 2000L)
	//*  35   66:lload_3         
	//*  36   67:ldc2w           #123 <Long 1000L>
	//*  37   70:lcmp            
	//*  38   71:iflt            84
	//*  39   74:lload_3         
	//*  40   75:ldc2w           #125 <Long 2000L>
	//*  41   78:lcmp            
	//*  42   79:ifge            84
			return true;
	//   43   82:iconst_1        
	//   44   83:ireturn         
_L7:
		i++;
	//   45   84:iload_1         
	//   46   85:iconst_1        
	//   47   86:iadd            
	//   48   87:istore_1        
		if(true) goto _L6; else goto _L5
	//   49   88:goto            50
_L5:
		return false;
	//   50   91:iconst_0        
	//   51   92:ireturn         
_L2:
		throw new SystemGroupsNotAvailableException("Missing Groups entry from proc/pid/status.");
	//   52   93:new             #6   <Class ProcessUtils$SystemGroupsNotAvailableException>
	//   53   96:dup             
	//   54   97:ldc1            #128 <String "Missing Groups entry from proc/pid/status.">
	//   55   99:invokespecial   #131 <Method void ProcessUtils$SystemGroupsNotAvailableException(String)>
	//   56  102:athrow          
		NumberFormatException numberformatexception;
		numberformatexception;
	//   57  103:astore          5
		  goto _L7
	//*  58  105:goto            84
	}

	private static String zzl(int i)
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
	//    6    8:new             #45  <Class StringBuilder>
	//    7   11:dup             
	//    8   12:bipush          25
	//    9   14:invokespecial   #48  <Method void StringBuilder(int)>
	//   10   17:astore_1        
		((StringBuilder) (obj)).append("/proc/");
	//   11   18:aload_1         
	//   12   19:ldc1            #50  <String "/proc/">
	//   13   21:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   14   24:pop             
		((StringBuilder) (obj)).append(i);
	//   15   25:aload_1         
	//   16   26:iload_0         
	//   17   27:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   18   30:pop             
		((StringBuilder) (obj)).append("/cmdline");
	//   19   31:aload_1         
	//   20   32:ldc1            #133 <String "/cmdline">
	//   21   34:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
		obj = ((Object) (zzm(((StringBuilder) (obj)).toString())));
	//   23   38:aload_1         
	//   24   39:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   25   42:invokestatic    #66  <Method BufferedReader zzm(String)>
	//   26   45:astore_1        
		String s = ((BufferedReader) (obj)).readLine().trim();
	//   27   46:aload_1         
	//   28   47:invokevirtual   #96  <Method String BufferedReader.readLine()>
	//   29   50:invokevirtual   #101 <Method String String.trim()>
	//   30   53:astore_2        
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   31   54:aload_1         
	//   32   55:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
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
	//   41   68:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
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
	//   47   76:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
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

	private static BufferedReader zzm(String s)
		throws IOException
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskReads();
	//    0    0:invokestatic    #139 <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    1    3:astore_1        
		s = ((String) (new BufferedReader(((java.io.Reader) (new FileReader(s))))));
	//    2    4:new             #93  <Class BufferedReader>
	//    3    7:dup             
	//    4    8:new             #141 <Class FileReader>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #142 <Method void FileReader(String)>
	//    8   16:invokespecial   #145 <Method void BufferedReader(java.io.Reader)>
	//    9   19:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   10   20:aload_1         
	//   11   21:invokestatic    #149 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((BufferedReader) (s));
	//   12   24:aload_0         
	//   13   25:areturn         
		s;
	//   14   26:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   15   27:aload_1         
	//   16   28:invokestatic    #149 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw s;
	//   17   31:aload_0         
	//   18   32:athrow          
	}

	private static String zzaai;
	private static int zzaaj;

	static 
	{
	//    0    0:return          
	}
}
