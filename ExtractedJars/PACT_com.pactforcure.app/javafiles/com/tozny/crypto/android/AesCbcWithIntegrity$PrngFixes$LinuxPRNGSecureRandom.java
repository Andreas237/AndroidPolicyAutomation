// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import android.util.Log;
import java.io.*;
import java.security.SecureRandomSpi;

// Referenced classes of package com.tozny.crypto.android:
//			AesCbcWithIntegrity

public static class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom extends SecureRandomSpi
{

	private DataInputStream getUrandomInputStream()
	{
		Object obj = sLock;
	//    0    0:getstatic       #38  <Field Object sLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		DataInputStream datainputstream = sUrandomIn;
	//    4    6:getstatic       #46  <Field DataInputStream sUrandomIn>
	//    5    9:astore_2        
		if(datainputstream != null)
			break MISSING_BLOCK_LABEL_34;
	//    6   10:aload_2         
	//    7   11:ifnonnull       34
		sUrandomIn = new DataInputStream(((java.io.InputStream) (new FileInputStream(URANDOM_FILE))));
	//    8   14:new             #48  <Class DataInputStream>
	//    9   17:dup             
	//   10   18:new             #50  <Class FileInputStream>
	//   11   21:dup             
	//   12   22:getstatic       #32  <Field File URANDOM_FILE>
	//   13   25:invokespecial   #53  <Method void FileInputStream(File)>
	//   14   28:invokespecial   #56  <Method void DataInputStream(java.io.InputStream)>
	//   15   31:putstatic       #46  <Field DataInputStream sUrandomIn>
		datainputstream = sUrandomIn;
	//   16   34:getstatic       #46  <Field DataInputStream sUrandomIn>
	//   17   37:astore_2        
		obj;
	//   18   38:aload_1         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return datainputstream;
	//   20   40:aload_2         
	//   21   41:areturn         
		Object obj1;
		obj1;
	//   22   42:astore_2        
		throw new SecurityException((new StringBuilder()).append("Failed to open ").append(((Object) (URANDOM_FILE))).append(" for reading").toString(), ((Throwable) (obj1)));
	//   23   43:new             #58  <Class SecurityException>
	//   24   46:dup             
	//   25   47:new             #60  <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #61  <Method void StringBuilder()>
	//   28   54:ldc1            #63  <String "Failed to open ">
	//   29   56:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:getstatic       #32  <Field File URANDOM_FILE>
	//   31   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   32   65:ldc1            #72  <String " for reading">
	//   33   67:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   35   73:aload_2         
	//   36   74:invokespecial   #79  <Method void SecurityException(String, Throwable)>
	//   37   77:athrow          
		obj1;
	//   38   78:astore_2        
		obj;
	//   39   79:aload_1         
		JVM INSTR monitorexit ;
	//   40   80:monitorexit     
		throw obj1;
	//   41   81:aload_2         
	//   42   82:athrow          
	}

	private OutputStream getUrandomOutputStream()
		throws IOException
	{
		OutputStream outputstream;
		synchronized(sLock)
	//*   0    0:getstatic       #38  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(sUrandomOut == null)
	//*   4    6:getstatic       #83  <Field OutputStream sUrandomOut>
	//*   5    9:ifnonnull       25
				sUrandomOut = ((OutputStream) (new FileOutputStream(URANDOM_FILE)));
	//    6   12:new             #85  <Class FileOutputStream>
	//    7   15:dup             
	//    8   16:getstatic       #32  <Field File URANDOM_FILE>
	//    9   19:invokespecial   #86  <Method void FileOutputStream(File)>
	//   10   22:putstatic       #83  <Field OutputStream sUrandomOut>
			outputstream = sUrandomOut;
	//   11   25:getstatic       #83  <Field OutputStream sUrandomOut>
	//   12   28:astore_2        
		}
	//   13   29:aload_1         
	//   14   30:monitorexit     
		return outputstream;
	//   15   31:aload_2         
	//   16   32:areturn         
		exception;
	//   17   33:astore_2        
		obj;
	//   18   34:aload_1         
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		throw exception;
	//   20   36:aload_2         
	//   21   37:athrow          
	}

	protected byte[] engineGenerateSeed(int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		engineNextBytes(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:invokevirtual   #93  <Method void engineNextBytes(byte[])>
		return abyte0;
	//    6    9:aload_2         
	//    7   10:areturn         
	}

	protected void engineNextBytes(byte abyte0[])
	{
		if(!mSeeded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean mSeeded>
	//*   2    4:ifne            14
			engineSetSeed(AesCbcWithIntegrity.PrngFixes.access$000());
	//    3    7:aload_0         
	//    4    8:invokestatic    #99  <Method byte[] AesCbcWithIntegrity$PrngFixes.access$000()>
	//    5   11:invokevirtual   #102 <Method void engineSetSeed(byte[])>
		DataInputStream datainputstream;
		synchronized(sLock)
	//*   6   14:getstatic       #38  <Field Object sLock>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:monitorenter    
		{
			datainputstream = getUrandomInputStream();
	//   10   20:aload_0         
	//   11   21:invokespecial   #104 <Method DataInputStream getUrandomInputStream()>
	//   12   24:astore_3        
		}
	//   13   25:aload_2         
	//   14   26:monitorexit     
		datainputstream;
	//   15   27:aload_3         
		JVM INSTR monitorenter ;
	//   16   28:monitorenter    
		datainputstream.readFully(abyte0);
	//   17   29:aload_3         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #107 <Method void DataInputStream.readFully(byte[])>
		datainputstream;
	//   20   34:aload_3         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		abyte0;
	//   23   37:astore_1        
		obj;
	//   24   38:aload_2         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		try
		{
			throw abyte0;
	//   26   40:aload_1         
	//   27   41:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  28   42:astore_1        
		{
			throw new SecurityException((new StringBuilder()).append("Failed to read from ").append(((Object) (URANDOM_FILE))).toString(), ((Throwable) (abyte0)));
	//   29   43:new             #58  <Class SecurityException>
	//   30   46:dup             
	//   31   47:new             #60  <Class StringBuilder>
	//   32   50:dup             
	//   33   51:invokespecial   #61  <Method void StringBuilder()>
	//   34   54:ldc1            #109 <String "Failed to read from ">
	//   35   56:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   36   59:getstatic       #32  <Field File URANDOM_FILE>
	//   37   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   38   65:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   39   68:aload_1         
	//   40   69:invokespecial   #79  <Method void SecurityException(String, Throwable)>
	//   41   72:athrow          
		}
		abyte0;
	//   42   73:astore_1        
		datainputstream;
	//   43   74:aload_3         
		JVM INSTR monitorexit ;
	//   44   75:monitorexit     
		throw abyte0;
	//   45   76:aload_1         
	//   46   77:athrow          
	}

	protected void engineSetSeed(byte abyte0[])
	{
		OutputStream outputstream;
		synchronized(sLock)
	//*   0    0:getstatic       #38  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			outputstream = getUrandomOutputStream();
	//    4    6:aload_0         
	//    5    7:invokespecial   #111 <Method OutputStream getUrandomOutputStream()>
	//    6   10:astore_3        
		}
	//    7   11:aload_2         
	//    8   12:monitorexit     
		outputstream.write(abyte0);
	//    9   13:aload_3         
	//   10   14:aload_1         
	//   11   15:invokevirtual   #116 <Method void OutputStream.write(byte[])>
		outputstream.flush();
	//   12   18:aload_3         
	//   13   19:invokevirtual   #119 <Method void OutputStream.flush()>
		mSeeded = true;
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:putfield        #95  <Field boolean mSeeded>
		return;
	//   17   27:return          
		abyte0;
	//   18   28:astore_1        
		obj;
	//   19   29:aload_2         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		try
		{
			throw abyte0;
	//   21   31:aload_1         
	//   22   32:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   23   33:astore_1        
		Log.w(((Class) (com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes)).getSimpleName(), (new StringBuilder()).append("Failed to mix seed into ").append(((Object) (URANDOM_FILE))).toString());
	//   24   34:ldc1            #6   <Class AesCbcWithIntegrity$PrngFixes>
	//   25   36:invokevirtual   #124 <Method String Class.getSimpleName()>
	//   26   39:new             #60  <Class StringBuilder>
	//   27   42:dup             
	//   28   43:invokespecial   #61  <Method void StringBuilder()>
	//   29   46:ldc1            #126 <String "Failed to mix seed into ">
	//   30   48:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   31   51:getstatic       #32  <Field File URANDOM_FILE>
	//   32   54:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   33   57:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   34   60:invokestatic    #132 <Method int Log.w(String, String)>
	//   35   63:pop             
		mSeeded = true;
	//   36   64:aload_0         
	//   37   65:iconst_1        
	//   38   66:putfield        #95  <Field boolean mSeeded>
		return;
	//   39   69:return          
		abyte0;
	//   40   70:astore_1        
		mSeeded = true;
	//   41   71:aload_0         
	//   42   72:iconst_1        
	//   43   73:putfield        #95  <Field boolean mSeeded>
		throw abyte0;
	//   44   76:aload_1         
	//   45   77:athrow          
	}

	private static final File URANDOM_FILE = new File("/dev/urandom");
	private static final Object sLock = new Object();
	private static DataInputStream sUrandomIn;
	private static OutputStream sUrandomOut;
	private boolean mSeeded;

	static 
	{
	//    0    0:new             #24  <Class File>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "/dev/urandom">
	//    3    6:invokespecial   #30  <Method void File(String)>
	//    4    9:putstatic       #32  <Field File URANDOM_FILE>
	//    5   12:new             #34  <Class Object>
	//    6   15:dup             
	//    7   16:invokespecial   #36  <Method void Object()>
	//    8   19:putstatic       #38  <Field Object sLock>
	//*   9   22:return          
	}

	public AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void SecureRandomSpi()>
	//    2    4:return          
	}
}
