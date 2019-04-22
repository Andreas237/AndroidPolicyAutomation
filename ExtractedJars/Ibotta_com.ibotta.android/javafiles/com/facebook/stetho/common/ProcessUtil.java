// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.io.FileInputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.common:
//			Util

public class ProcessUtil
{

	public ProcessUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String getProcessName()
	{
		com/facebook/stetho/common/ProcessUtil;
	//    0    0:ldc1            #2   <Class ProcessUtil>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sProcessNameRead)
			break MISSING_BLOCK_LABEL_19;
	//    2    3:getstatic       #23  <Field boolean sProcessNameRead>
	//    3    6:ifne            19
		sProcessNameRead = true;
	//    4    9:iconst_1        
	//    5   10:putstatic       #23  <Field boolean sProcessNameRead>
		String s;
		Exception exception;
		try
		{
			sProcessName = readProcessName();
	//    6   13:invokestatic    #26  <Method String readProcessName()>
	//    7   16:putstatic       #28  <Field String sProcessName>
		}
	//*   8   19:getstatic       #28  <Field String sProcessName>
	//*   9   22:astore_0        
	//*  10   23:ldc1            #2   <Class ProcessUtil>
	//*  11   25:monitorexit     
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:astore_0        
	//*  15   29:ldc1            #2   <Class ProcessUtil>
	//*  16   31:monitorexit     
	//*  17   32:aload_0         
	//*  18   33:athrow          
		catch(IOException ioexception) { }
	//   19   34:astore_0        
		s = sProcessName;
		com/facebook/stetho/common/ProcessUtil;
		JVM INSTR monitorexit ;
		return s;
		exception;
		throw exception;
	//*  20   35:goto            19
	}

	private static int indexOf(byte abyte0[], int i, int j, byte byte0)
	{
		for(i = 0; i < abyte0.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          24
			if(abyte0[i] == byte0)
	//*   6    8:aload_0         
	//*   7    9:iload_1         
	//*   8   10:baload          
	//*   9   11:iload_3         
	//*  10   12:icmpne          17
				return i;
	//   11   15:iload_1         
	//   12   16:ireturn         

	//   13   17:iload_1         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_1        
	//*  17   21:goto            2
		return -1;
	//   18   24:iconst_m1       
	//   19   25:ireturn         
	}

	private static String readProcessName()
		throws IOException
	{
		int j;
		byte abyte0[];
		FileInputStream fileinputstream;
		abyte0 = new byte[64];
	//    0    0:bipush          64
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		fileinputstream = new FileInputStream("/proc/self/cmdline");
	//    3    5:new             #33  <Class FileInputStream>
	//    4    8:dup             
	//    5    9:ldc1            #35  <String "/proc/self/cmdline">
	//    6   11:invokespecial   #38  <Method void FileInputStream(String)>
	//    7   14:astore_3        
		j = 0;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		int i = fileinputstream.read(abyte0);
	//   10   17:aload_3         
	//   11   18:aload_2         
	//   12   19:invokevirtual   #42  <Method int FileInputStream.read(byte[])>
	//   13   22:istore_0        
		j = indexOf(abyte0, 0, i, (byte)0);
	//   14   23:aload_2         
	//   15   24:iconst_0        
	//   16   25:iload_0         
	//   17   26:iconst_0        
	//   18   27:invokestatic    #44  <Method int indexOf(byte[], int, int, byte)>
	//   19   30:istore_1        
		if(j > 0)
	//*  20   31:iload_1         
	//*  21   32:ifle            37
			i = j;
	//   22   35:iload_1         
	//   23   36:istore_0        
		String s = new String(abyte0, 0, i);
	//   24   37:new             #46  <Class String>
	//   25   40:dup             
	//   26   41:aload_2         
	//   27   42:iconst_0        
	//   28   43:iload_0         
	//   29   44:invokespecial   #49  <Method void String(byte[], int, int)>
	//   30   47:astore_2        
		Util.close(((java.io.Closeable) (fileinputstream)), false);
	//   31   48:aload_3         
	//   32   49:iconst_0        
	//   33   50:invokestatic    #55  <Method void Util.close(java.io.Closeable, boolean)>
		return s;
	//   34   53:aload_2         
	//   35   54:areturn         
		Exception exception;
		exception;
	//   36   55:astore_2        
		i = 1;
	//   37   56:iconst_1        
	//   38   57:istore_0        
		break MISSING_BLOCK_LABEL_64;
	//   39   58:goto            64
		exception;
	//   40   61:astore_2        
		i = j;
	//   41   62:iload_1         
	//   42   63:istore_0        
		Util.close(((java.io.Closeable) (fileinputstream)), ((boolean) (1 ^ i)));
	//   43   64:aload_3         
	//   44   65:iconst_1        
	//   45   66:iload_0         
	//   46   67:ixor            
	//   47   68:invokestatic    #55  <Method void Util.close(java.io.Closeable, boolean)>
		throw exception;
	//   48   71:aload_2         
	//   49   72:athrow          
	}

	private static final int CMDLINE_BUFFER_SIZE = 64;
	private static String sProcessName;
	private static boolean sProcessNameRead;
}
