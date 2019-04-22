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
		BufferedReader bufferedreader;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		bufferedreader = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		obj = ((Object) (bufferedreader));
	//    4    6:aload           4
	//    5    8:astore_2        
		obj1 = ((Object) (obj2));
	//    6    9:aload           5
	//    7   11:astore_3        
		int i = zzde();
	//    8   12:invokestatic    #29  <Method int zzde()>
	//    9   15:istore_0        
		obj = ((Object) (bufferedreader));
	//   10   16:aload           4
	//   11   18:astore_2        
		obj1 = ((Object) (obj2));
	//   12   19:aload           5
	//   13   21:astore_3        
		StringBuilder stringbuilder = new StringBuilder(24);
	//   14   22:new             #45  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:bipush          24
	//   17   28:invokespecial   #48  <Method void StringBuilder(int)>
	//   18   31:astore          6
		obj = ((Object) (bufferedreader));
	//   19   33:aload           4
	//   20   35:astore_2        
		obj1 = ((Object) (obj2));
	//   21   36:aload           5
	//   22   38:astore_3        
		stringbuilder.append("/proc/");
	//   23   39:aload           6
	//   24   41:ldc1            #50  <String "/proc/">
	//   25   43:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		obj = ((Object) (bufferedreader));
	//   27   47:aload           4
	//   28   49:astore_2        
		obj1 = ((Object) (obj2));
	//   29   50:aload           5
	//   30   52:astore_3        
		stringbuilder.append(i);
	//   31   53:aload           6
	//   32   55:iload_0         
	//   33   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   34   59:pop             
		obj = ((Object) (bufferedreader));
	//   35   60:aload           4
	//   36   62:astore_2        
		obj1 = ((Object) (obj2));
	//   37   63:aload           5
	//   38   65:astore_3        
		stringbuilder.append("/status");
	//   39   66:aload           6
	//   40   68:ldc1            #59  <String "/status">
	//   41   70:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   42   73:pop             
		obj = ((Object) (bufferedreader));
	//   43   74:aload           4
	//   44   76:astore_2        
		obj1 = ((Object) (obj2));
	//   45   77:aload           5
	//   46   79:astore_3        
		bufferedreader = zzm(stringbuilder.toString());
	//   47   80:aload           6
	//   48   82:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   49   85:invokestatic    #66  <Method BufferedReader zzm(String)>
	//   50   88:astore          4
		obj = ((Object) (bufferedreader));
	//   51   90:aload           4
	//   52   92:astore_2        
		obj1 = ((Object) (bufferedreader));
	//   53   93:aload           4
	//   54   95:astore_3        
		boolean flag = zzk(bufferedreader);
	//   55   96:aload           4
	//   56   98:invokestatic    #70  <Method boolean zzk(BufferedReader)>
	//   57  101:istore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (bufferedreader)));
	//   58  102:aload           4
	//   59  104:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return flag;
	//   60  107:iload_1         
	//   61  108:ireturn         
		obj1;
	//   62  109:astore_3        
		break MISSING_BLOCK_LABEL_129;
	//   63  110:goto            129
		IOException ioexception;
		ioexception;
	//   64  113:astore          4
		obj = obj1;
	//   65  115:aload_3         
	//   66  116:astore_2        
		throw new SystemGroupsNotAvailableException("Unable to access /proc/pid/status.", ((Throwable) (ioexception)));
	//   67  117:new             #6   <Class ProcessUtils$SystemGroupsNotAvailableException>
	//   68  120:dup             
	//   69  121:ldc1            #78  <String "Unable to access /proc/pid/status.">
	//   70  123:aload           4
	//   71  125:invokespecial   #81  <Method void ProcessUtils$SystemGroupsNotAvailableException(String, Throwable)>
	//   72  128:athrow          
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   73  129:aload_2         
	//   74  130:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj1;
	//   75  133:aload_3         
	//   76  134:athrow          
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
		Object obj1;
		String s;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		s = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		if(i <= 0)
	//*   4    4:iload_0         
	//*   5    5:ifgt            10
			return null;
	//    6    8:aconst_null     
	//    7    9:areturn         
		Object obj;
		obj = ((Object) (new StringBuilder(25)));
	//    8   10:new             #45  <Class StringBuilder>
	//    9   13:dup             
	//   10   14:bipush          25
	//   11   16:invokespecial   #48  <Method void StringBuilder(int)>
	//   12   19:astore_1        
		((StringBuilder) (obj)).append("/proc/");
	//   13   20:aload_1         
	//   14   21:ldc1            #50  <String "/proc/">
	//   15   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   16   26:pop             
		((StringBuilder) (obj)).append(i);
	//   17   27:aload_1         
	//   18   28:iload_0         
	//   19   29:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   20   32:pop             
		((StringBuilder) (obj)).append("/cmdline");
	//   21   33:aload_1         
	//   22   34:ldc1            #133 <String "/cmdline">
	//   23   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   24   39:pop             
		obj = ((Object) (zzm(((StringBuilder) (obj)).toString())));
	//   25   40:aload_1         
	//   26   41:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   27   44:invokestatic    #66  <Method BufferedReader zzm(String)>
	//   28   47:astore_1        
		s = ((BufferedReader) (obj)).readLine().trim();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #96  <Method String BufferedReader.readLine()>
	//   31   52:invokevirtual   #101 <Method String String.trim()>
	//   32   55:astore_3        
		obj1 = ((Object) (s));
	//   33   56:aload_3         
	//   34   57:astore_2        
		  goto _L1
	//*  35   58:goto            76
		obj1;
	//   36   61:astore_2        
		break MISSING_BLOCK_LABEL_68;
	//   37   62:goto            68
		obj1;
	//   38   65:astore_2        
		obj = ((Object) (s));
	//   39   66:aload_3         
	//   40   67:astore_1        
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   41   68:aload_1         
	//   42   69:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		throw obj1;
	//   43   72:aload_2         
	//   44   73:athrow          
_L2:
		obj = null;
	//   45   74:aconst_null     
	//   46   75:astore_1        
_L1:
		IOUtils.closeQuietly(((java.io.Closeable) (obj)));
	//   47   76:aload_1         
	//   48   77:invokestatic    #76  <Method void IOUtils.closeQuietly(java.io.Closeable)>
		return ((String) (obj1));
	//   49   80:aload_2         
	//   50   81:areturn         
		IOException ioexception;
		ioexception;
	//   51   82:astore_1        
		  goto _L2
	//*  52   83:goto            74
		IOException ioexception1;
		ioexception1;
	//   53   86:astore_3        
		  goto _L1
	//*  54   87:goto            76
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
