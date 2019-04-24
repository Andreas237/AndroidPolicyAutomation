// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.*;

// Referenced classes of package com.tozny.crypto.android:
//			AesCbcWithIntegrity

public static final class AesCbcWithIntegrity$PrngFixes
{
	public static class LinuxPRNGSecureRandom extends SecureRandomSpi
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
				engineSetSeed(AesCbcWithIntegrity.PrngFixes.generateSeed());
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

		public LinuxPRNGSecureRandom()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void SecureRandomSpi()>
		//    2    4:return          
		}
	}

	private static class LinuxPRNGSecureRandomProvider extends Provider
	{

		public LinuxPRNGSecureRandomProvider()
		{
			super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "LinuxPRNG">
		//    2    3:dconst_1        
		//    3    4:ldc1            #16  <String "A Linux-specific random number provider that uses /dev/urandom">
		//    4    6:invokespecial   #19  <Method void Provider(String, double, String)>
			put("SecureRandom.SHA1PRNG", ((Object) (((Class) (com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom)).getName())));
		//    5    9:aload_0         
		//    6   10:ldc1            #21  <String "SecureRandom.SHA1PRNG">
		//    7   12:ldc1            #23  <Class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom>
		//    8   14:invokevirtual   #29  <Method String Class.getName()>
		//    9   17:invokevirtual   #33  <Method Object put(Object, Object)>
		//   10   20:pop             
			put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
		//   11   21:aload_0         
		//   12   22:ldc1            #35  <String "SecureRandom.SHA1PRNG ImplementedIn">
		//   13   24:ldc1            #37  <String "Software">
		//   14   26:invokevirtual   #33  <Method Object put(Object, Object)>
		//   15   29:pop             
		//   16   30:return          
		}
	}


	public static void apply()
	{
		applyOpenSSLFix();
	//    0    0:invokestatic    #40  <Method void applyOpenSSLFix()>
		installLinuxPRNGSecureRandom();
	//    1    3:invokestatic    #43  <Method void installLinuxPRNGSecureRandom()>
	//    2    6:return          
	}

	private static void applyOpenSSLFix()
		throws SecurityException
	{
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 18) goto _L2; else goto _L1
	//    0    0:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          16
	//    3    8:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//    4   11:bipush          18
	//    5   13:icmple          17
_L1:
		return;
	//    6   16:return          
_L2:
		int i;
		try
		{
			Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", new Class[] {
				[B
			}).invoke(((Object) (null)), new Object[] {
				generateSeed()
			});
	//    7   17:ldc1            #54  <String "org.apache.harmony.xnet.provider.jsse.NativeCrypto">
	//    8   19:invokestatic    #60  <Method Class Class.forName(String)>
	//    9   22:ldc1            #62  <String "RAND_seed">
	//   10   24:iconst_1        
	//   11   25:anewarray       Class[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:ldc1            #63  <Class byte[]>
	//   15   32:aastore         
	//   16   33:invokevirtual   #67  <Method Method Class.getMethod(String, Class[])>
	//   17   36:aconst_null     
	//   18   37:iconst_1        
	//   19   38:anewarray       Object[]
	//   20   41:dup             
	//   21   42:iconst_0        
	//   22   43:invokestatic    #36  <Method byte[] generateSeed()>
	//   23   46:aastore         
	//   24   47:invokevirtual   #73  <Method Object Method.invoke(Object, Object[])>
	//   25   50:pop             
			i = ((Integer)Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", new Class[] {
				java/lang/String, Long.TYPE
			}).invoke(((Object) (null)), new Object[] {
				"/dev/urandom", Integer.valueOf(1024)
			})).intValue();
	//   26   51:ldc1            #54  <String "org.apache.harmony.xnet.provider.jsse.NativeCrypto">
	//   27   53:invokestatic    #60  <Method Class Class.forName(String)>
	//   28   56:ldc1            #75  <String "RAND_load_file">
	//   29   58:iconst_2        
	//   30   59:anewarray       Class[]
	//   31   62:dup             
	//   32   63:iconst_0        
	//   33   64:ldc1            #77  <Class String>
	//   34   66:aastore         
	//   35   67:dup             
	//   36   68:iconst_1        
	//   37   69:getstatic       #83  <Field Class Long.TYPE>
	//   38   72:aastore         
	//   39   73:invokevirtual   #67  <Method Method Class.getMethod(String, Class[])>
	//   40   76:aconst_null     
	//   41   77:iconst_2        
	//   42   78:anewarray       Object[]
	//   43   81:dup             
	//   44   82:iconst_0        
	//   45   83:ldc1            #85  <String "/dev/urandom">
	//   46   85:aastore         
	//   47   86:dup             
	//   48   87:iconst_1        
	//   49   88:sipush          1024
	//   50   91:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//   51   94:aastore         
	//   52   95:invokevirtual   #73  <Method Object Method.invoke(Object, Object[])>
	//   53   98:checkcast       #87  <Class Integer>
	//   54  101:invokevirtual   #95  <Method int Integer.intValue()>
	//   55  104:istore_0        
		}
	//*  56  105:iload_0         
	//*  57  106:sipush          1024
	//*  58  109:icmpeq          16
	//*  59  112:new             #97  <Class IOException>
	//*  60  115:dup             
	//*  61  116:new             #99  <Class StringBuilder>
	//*  62  119:dup             
	//*  63  120:invokespecial   #100 <Method void StringBuilder()>
	//*  64  123:ldc1            #102 <String "Unexpected number of bytes read from Linux PRNG: ">
	//*  65  125:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//*  66  128:iload_0         
	//*  67  129:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//*  68  132:invokevirtual   #113 <Method String StringBuilder.toString()>
	//*  69  135:invokespecial   #116 <Method void IOException(String)>
	//*  70  138:athrow          
		catch(Exception exception)
	//*  71  139:astore_1        
		{
			throw new SecurityException("Failed to seed OpenSSL PRNG", ((Throwable) (exception)));
	//   72  140:new             #45  <Class SecurityException>
	//   73  143:dup             
	//   74  144:ldc1            #118 <String "Failed to seed OpenSSL PRNG">
	//   75  146:aload_1         
	//   76  147:invokespecial   #121 <Method void SecurityException(String, Throwable)>
	//   77  150:athrow          
		}
		if(i == 1024) goto _L1; else goto _L3
_L3:
		throw new IOException((new StringBuilder()).append("Unexpected number of bytes read from Linux PRNG: ").append(i).toString());
	}

	private static byte[] generateSeed()
	{
		byte abyte0[];
		try
		{
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #124 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void ByteArrayOutputStream()>
	//    3    7:astore_0        
			DataOutputStream dataoutputstream = new DataOutputStream(((OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #127 <Class DataOutputStream>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #130 <Method void DataOutputStream(OutputStream)>
	//    8   16:astore_1        
			dataoutputstream.writeLong(System.currentTimeMillis());
	//    9   17:aload_1         
	//   10   18:invokestatic    #136 <Method long System.currentTimeMillis()>
	//   11   21:invokevirtual   #140 <Method void DataOutputStream.writeLong(long)>
			dataoutputstream.writeLong(System.nanoTime());
	//   12   24:aload_1         
	//   13   25:invokestatic    #143 <Method long System.nanoTime()>
	//   14   28:invokevirtual   #140 <Method void DataOutputStream.writeLong(long)>
			dataoutputstream.writeInt(Process.myPid());
	//   15   31:aload_1         
	//   16   32:invokestatic    #148 <Method int Process.myPid()>
	//   17   35:invokevirtual   #152 <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.writeInt(Process.myUid());
	//   18   38:aload_1         
	//   19   39:invokestatic    #155 <Method int Process.myUid()>
	//   20   42:invokevirtual   #152 <Method void DataOutputStream.writeInt(int)>
			dataoutputstream.write(BUILD_FINGERPRINT_AND_DEVICE_SERIAL);
	//   21   45:aload_1         
	//   22   46:getstatic       #28  <Field byte[] BUILD_FINGERPRINT_AND_DEVICE_SERIAL>
	//   23   49:invokevirtual   #159 <Method void DataOutputStream.write(byte[])>
			dataoutputstream.close();
	//   24   52:aload_1         
	//   25   53:invokevirtual   #162 <Method void DataOutputStream.close()>
			abyte0 = bytearrayoutputstream.toByteArray();
	//   26   56:aload_0         
	//   27   57:invokevirtual   #165 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   28   60:astore_0        
		}
	//*  29   61:aload_0         
	//*  30   62:areturn         
		catch(IOException ioexception)
	//*  31   63:astore_0        
		{
			throw new SecurityException("Failed to generate seed", ((Throwable) (ioexception)));
	//   32   64:new             #45  <Class SecurityException>
	//   33   67:dup             
	//   34   68:ldc1            #167 <String "Failed to generate seed">
	//   35   70:aload_0         
	//   36   71:invokespecial   #121 <Method void SecurityException(String, Throwable)>
	//   37   74:athrow          
		}
		return abyte0;
	}

	private static byte[] getBuildFingerprintAndDeviceSerial()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:astore_0        
		String s = Build.FINGERPRINT;
	//    4    8:getstatic       #175 <Field String Build.FINGERPRINT>
	//    5   11:astore_1        
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          22
			stringbuilder.append(s);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		s = getDeviceSerialNumber();
	//   12   22:invokestatic    #178 <Method String getDeviceSerialNumber()>
	//   13   25:astore_1        
		if(s != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          36
			stringbuilder.append(s);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		byte abyte0[];
		try
		{
			abyte0 = stringbuilder.toString().getBytes("UTF-8");
	//   20   36:aload_0         
	//   21   37:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   22   40:ldc1            #180 <String "UTF-8">
	//   23   42:invokevirtual   #184 <Method byte[] String.getBytes(String)>
	//   24   45:astore_0        
		}
	//*  25   46:aload_0         
	//*  26   47:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  27   48:astore_0        
		{
			throw new RuntimeException("UTF-8 encoding not supported");
	//   28   49:new             #186 <Class RuntimeException>
	//   29   52:dup             
	//   30   53:ldc1            #188 <String "UTF-8 encoding not supported">
	//   31   55:invokespecial   #189 <Method void RuntimeException(String)>
	//   32   58:athrow          
		}
		return abyte0;
	}

	private static String getDeviceSerialNumber()
	{
		String s;
		try
		{
			s = (String)((Class) (android/os/Build)).getField("SERIAL").get(((Object) (null)));
	//    0    0:ldc1            #171 <Class Build>
	//    1    2:ldc1            #191 <String "SERIAL">
	//    2    4:invokevirtual   #195 <Method Field Class.getField(String)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #201 <Method Object Field.get(Object)>
	//    5   11:checkcast       #77  <Class String>
	//    6   14:astore_0        
		}
	//*   7   15:aload_0         
	//*   8   16:areturn         
		catch(Exception exception)
	//*   9   17:astore_0        
		{
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return s;
	}

	private static void installLinuxPRNGSecureRandom()
		throws SecurityException
	{
		if(android.os.Build.VERSION.SDK_INT > 18)
	//*   0    0:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmple          9
			return;
	//    3    8:return          
		Provider aprovider[] = Security.getProviders("SecureRandom.SHA1PRNG");
	//    4    9:ldc1            #205 <String "SecureRandom.SHA1PRNG">
	//    5   11:invokestatic    #211 <Method Provider[] Security.getProviders(String)>
	//    6   14:astore_0        
		java/security/Security;
	//    7   15:ldc1            #207 <Class Security>
		JVM INSTR monitorenter ;
	//    8   17:monitorenter    
		if(aprovider == null)
			break MISSING_BLOCK_LABEL_45;
	//    9   18:aload_0         
	//   10   19:ifnull          45
		if(aprovider.length >= 1 && ((Object) (aprovider[0])).getClass().getSimpleName().equals("LinuxPRNGSecureRandomProvider"))
			break MISSING_BLOCK_LABEL_57;
	//   11   22:aload_0         
	//   12   23:arraylength     
	//   13   24:iconst_1        
	//   14   25:icmplt          45
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:aaload          
	//   18   31:invokevirtual   #215 <Method Class Object.getClass()>
	//   19   34:invokevirtual   #218 <Method String Class.getSimpleName()>
	//   20   37:ldc1            #219 <String "LinuxPRNGSecureRandomProvider">
	//   21   39:invokevirtual   #223 <Method boolean String.equals(Object)>
	//   22   42:ifne            57
		Security.insertProviderAt(((Provider) (new LinuxPRNGSecureRandomProvider())), 1);
	//   23   45:new             #12  <Class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider>
	//   24   48:dup             
	//   25   49:invokespecial   #224 <Method void AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider()>
	//   26   52:iconst_1        
	//   27   53:invokestatic    #228 <Method int Security.insertProviderAt(Provider, int)>
	//   28   56:pop             
		SecureRandom securerandom = new SecureRandom();
	//   29   57:new             #230 <Class SecureRandom>
	//   30   60:dup             
	//   31   61:invokespecial   #231 <Method void SecureRandom()>
	//   32   64:astore_0        
		if(!((Object) (securerandom.getProvider())).getClass().getSimpleName().equals("LinuxPRNGSecureRandomProvider"))
	//*  33   65:aload_0         
	//*  34   66:invokevirtual   #235 <Method Provider SecureRandom.getProvider()>
	//*  35   69:invokevirtual   #215 <Method Class Object.getClass()>
	//*  36   72:invokevirtual   #218 <Method String Class.getSimpleName()>
	//*  37   75:ldc1            #219 <String "LinuxPRNGSecureRandomProvider">
	//*  38   77:invokevirtual   #223 <Method boolean String.equals(Object)>
	//*  39   80:ifne            122
			throw new SecurityException((new StringBuilder()).append("new SecureRandom() backed by wrong Provider: ").append(((Object) (((Object) (securerandom.getProvider())).getClass()))).toString());
	//   40   83:new             #45  <Class SecurityException>
	//   41   86:dup             
	//   42   87:new             #99  <Class StringBuilder>
	//   43   90:dup             
	//   44   91:invokespecial   #100 <Method void StringBuilder()>
	//   45   94:ldc1            #237 <String "new SecureRandom() backed by wrong Provider: ">
	//   46   96:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   47   99:aload_0         
	//   48  100:invokevirtual   #235 <Method Provider SecureRandom.getProvider()>
	//   49  103:invokevirtual   #215 <Method Class Object.getClass()>
	//   50  106:invokevirtual   #240 <Method StringBuilder StringBuilder.append(Object)>
	//   51  109:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   52  112:invokespecial   #241 <Method void SecurityException(String)>
	//   53  115:athrow          
		break MISSING_BLOCK_LABEL_122;
		Exception exception;
		exception;
	//   54  116:astore_0        
		java/security/Security;
	//   55  117:ldc1            #207 <Class Security>
		JVM INSTR monitorexit ;
	//   56  119:monitorexit     
		throw exception;
	//   57  120:aload_0         
	//   58  121:athrow          
		SecureRandom securerandom1 = null;
	//   59  122:aconst_null     
	//   60  123:astore_0        
		SecureRandom securerandom2 = SecureRandom.getInstance("SHA1PRNG");
	//   61  124:ldc1            #243 <String "SHA1PRNG">
	//   62  126:invokestatic    #247 <Method SecureRandom SecureRandom.getInstance(String)>
	//   63  129:astore_1        
		securerandom1 = securerandom2;
	//   64  130:aload_1         
	//   65  131:astore_0        
_L1:
		if(!((Object) (securerandom1.getProvider())).getClass().getSimpleName().equals("LinuxPRNGSecureRandomProvider"))
	//*  66  132:aload_0         
	//*  67  133:invokevirtual   #235 <Method Provider SecureRandom.getProvider()>
	//*  68  136:invokevirtual   #215 <Method Class Object.getClass()>
	//*  69  139:invokevirtual   #218 <Method String Class.getSimpleName()>
	//*  70  142:ldc1            #219 <String "LinuxPRNGSecureRandomProvider">
	//*  71  144:invokevirtual   #223 <Method boolean String.equals(Object)>
	//*  72  147:ifne            198
			throw new SecurityException((new StringBuilder()).append("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ").append(((Object) (((Object) (securerandom1.getProvider())).getClass()))).toString());
	//   73  150:new             #45  <Class SecurityException>
	//   74  153:dup             
	//   75  154:new             #99  <Class StringBuilder>
	//   76  157:dup             
	//   77  158:invokespecial   #100 <Method void StringBuilder()>
	//   78  161:ldc1            #249 <String "SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: ">
	//   79  163:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   80  166:aload_0         
	//   81  167:invokevirtual   #235 <Method Provider SecureRandom.getProvider()>
	//   82  170:invokevirtual   #215 <Method Class Object.getClass()>
	//   83  173:invokevirtual   #240 <Method StringBuilder StringBuilder.append(Object)>
	//   84  176:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   85  179:invokespecial   #241 <Method void SecurityException(String)>
	//   86  182:athrow          
		break MISSING_BLOCK_LABEL_198;
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   87  183:astore_1        
		new SecurityException("SHA1PRNG not available", ((Throwable) (nosuchalgorithmexception)));
	//   88  184:new             #45  <Class SecurityException>
	//   89  187:dup             
	//   90  188:ldc1            #251 <String "SHA1PRNG not available">
	//   91  190:aload_1         
	//   92  191:invokespecial   #121 <Method void SecurityException(String, Throwable)>
	//   93  194:pop             
		  goto _L1
	//*  94  195:goto            132
		java/security/Security;
	//   95  198:ldc1            #207 <Class Security>
		JVM INSTR monitorexit ;
	//   96  200:monitorexit     
	//   97  201:return          
	}

	private static final byte BUILD_FINGERPRINT_AND_DEVICE_SERIAL[] = getBuildFingerprintAndDeviceSerial();
	private static final int VERSION_CODE_JELLY_BEAN = 16;
	private static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;

	static 
	{
	//    0    0:invokestatic    #26  <Method byte[] getBuildFingerprintAndDeviceSerial()>
	//    1    3:putstatic       #28  <Field byte[] BUILD_FINGERPRINT_AND_DEVICE_SERIAL>
	//*   2    6:return          
	}


/*
	static byte[] access$000()
	{
		return generateSeed();
	//    0    0:invokestatic    #36  <Method byte[] generateSeed()>
	//    1    3:areturn         
	}

*/

	private AesCbcWithIntegrity$PrngFixes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
