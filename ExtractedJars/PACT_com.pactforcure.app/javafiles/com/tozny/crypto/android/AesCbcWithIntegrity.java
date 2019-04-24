// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.*;
import javax.crypto.spec.*;

public class AesCbcWithIntegrity
{
	public static class CipherTextIvMac
	{

		public static byte[] ivCipherConcat(byte abyte0[], byte abyte1[])
		{
			byte abyte2[] = new byte[abyte0.length + abyte1.length];
		//    0    0:aload_0         
		//    1    1:arraylength     
		//    2    2:aload_1         
		//    3    3:arraylength     
		//    4    4:iadd            
		//    5    5:newarray        byte[]
		//    6    7:astore_2        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), 0, abyte0.length);
		//    7    8:aload_0         
		//    8    9:iconst_0        
		//    9   10:aload_2         
		//   10   11:iconst_0        
		//   11   12:aload_0         
		//   12   13:arraylength     
		//   13   14:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), abyte0.length, abyte1.length);
		//   14   17:aload_1         
		//   15   18:iconst_0        
		//   16   19:aload_2         
		//   17   20:aload_0         
		//   18   21:arraylength     
		//   19   22:aload_1         
		//   20   23:arraylength     
		//   21   24:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte2;
		//   22   27:aload_2         
		//   23   28:areturn         
		}

		public boolean equals(Object obj)
		{
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
					return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
				if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #58  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #58  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
					return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
				obj = ((Object) ((CipherTextIvMac)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class AesCbcWithIntegrity$CipherTextIvMac>
		//   18   30:astore_1        
				if(!Arrays.equals(cipherText, ((CipherTextIvMac) (obj)).cipherText))
		//*  19   31:aload_0         
		//*  20   32:getfield        #42  <Field byte[] cipherText>
		//*  21   35:aload_1         
		//*  22   36:getfield        #42  <Field byte[] cipherText>
		//*  23   39:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
		//*  24   42:ifne            47
					return false;
		//   25   45:iconst_0        
		//   26   46:ireturn         
				if(!Arrays.equals(iv, ((CipherTextIvMac) (obj)).iv))
		//*  27   47:aload_0         
		//*  28   48:getfield        #38  <Field byte[] iv>
		//*  29   51:aload_1         
		//*  30   52:getfield        #38  <Field byte[] iv>
		//*  31   55:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
		//*  32   58:ifne            63
					return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
				if(!Arrays.equals(mac, ((CipherTextIvMac) (obj)).mac))
		//*  35   63:aload_0         
		//*  36   64:getfield        #40  <Field byte[] mac>
		//*  37   67:aload_1         
		//*  38   68:getfield        #40  <Field byte[] mac>
		//*  39   71:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
		//*  40   74:ifne            5
					return false;
		//   41   77:iconst_0        
		//   42   78:ireturn         
			}
			return true;
		}

		public byte[] getCipherText()
		{
			return cipherText;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field byte[] cipherText>
		//    2    4:areturn         
		}

		public byte[] getIv()
		{
			return iv;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field byte[] iv>
		//    2    4:areturn         
		}

		public byte[] getMac()
		{
			return mac;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field byte[] mac>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return ((Arrays.hashCode(cipherText) + 31) * 31 + Arrays.hashCode(iv)) * 31 + Arrays.hashCode(mac);
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field byte[] cipherText>
		//    2    4:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
		//    3    7:bipush          31
		//    4    9:iadd            
		//    5   10:bipush          31
		//    6   12:imul            
		//    7   13:aload_0         
		//    8   14:getfield        #38  <Field byte[] iv>
		//    9   17:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
		//   10   20:iadd            
		//   11   21:bipush          31
		//   12   23:imul            
		//   13   24:aload_0         
		//   14   25:getfield        #40  <Field byte[] mac>
		//   15   28:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
		//   16   31:iadd            
		//   17   32:ireturn         
		}

		public String toString()
		{
			String s = Base64.encodeToString(iv, 2);
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field byte[] iv>
		//    2    4:iconst_2        
		//    3    5:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
		//    4    8:astore_1        
			String s1 = Base64.encodeToString(cipherText, 2);
		//    5    9:aload_0         
		//    6   10:getfield        #42  <Field byte[] cipherText>
		//    7   13:iconst_2        
		//    8   14:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
		//    9   17:astore_2        
			String s2 = Base64.encodeToString(mac, 2);
		//   10   18:aload_0         
		//   11   19:getfield        #40  <Field byte[] mac>
		//   12   22:iconst_2        
		//   13   23:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
		//   14   26:astore_3        
			return String.format((new StringBuilder()).append(s).append(":").append(s2).append(":").append(s1).toString(), new Object[0]);
		//   15   27:new             #80  <Class StringBuilder>
		//   16   30:dup             
		//   17   31:invokespecial   #81  <Method void StringBuilder()>
		//   18   34:aload_1         
		//   19   35:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   20   38:ldc1            #18  <String ":">
		//   21   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   22   43:aload_3         
		//   23   44:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   24   47:ldc1            #18  <String ":">
		//   25   49:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   26   52:aload_2         
		//   27   53:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
		//   28   56:invokevirtual   #87  <Method String StringBuilder.toString()>
		//   29   59:iconst_0        
		//   30   60:anewarray       Object[]
		//   31   63:invokestatic    #91  <Method String String.format(String, Object[])>
		//   32   66:areturn         
		}

		private final byte cipherText[];
		private final byte iv[];
		private final byte mac[];

		public CipherTextIvMac(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			s = ((String) (s.split(":")));
		//    2    4:aload_1         
		//    3    5:ldc1            #18  <String ":">
		//    4    7:invokevirtual   #24  <Method String[] String.split(String)>
		//    5   10:astore_1        
			if(s.length != 3)
		//*   6   11:aload_1         
		//*   7   12:arraylength     
		//*   8   13:iconst_3        
		//*   9   14:icmpeq          27
			{
				throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
		//   10   17:new             #26  <Class IllegalArgumentException>
		//   11   20:dup             
		//   12   21:ldc1            #28  <String "Cannot parse iv:ciphertext:mac">
		//   13   23:invokespecial   #30  <Method void IllegalArgumentException(String)>
		//   14   26:athrow          
			} else
			{
				iv = Base64.decode(((String) (s[0])), 2);
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:iconst_0        
		//   18   30:aaload          
		//   19   31:iconst_2        
		//   20   32:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
		//   21   35:putfield        #38  <Field byte[] iv>
				mac = Base64.decode(((String) (s[1])), 2);
		//   22   38:aload_0         
		//   23   39:aload_1         
		//   24   40:iconst_1        
		//   25   41:aaload          
		//   26   42:iconst_2        
		//   27   43:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
		//   28   46:putfield        #40  <Field byte[] mac>
				cipherText = Base64.decode(((String) (s[2])), 2);
		//   29   49:aload_0         
		//   30   50:aload_1         
		//   31   51:iconst_2        
		//   32   52:aaload          
		//   33   53:iconst_2        
		//   34   54:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
		//   35   57:putfield        #42  <Field byte[] cipherText>
				return;
		//   36   60:return          
			}
		}

		public CipherTextIvMac(byte abyte0[], byte abyte1[], byte abyte2[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			cipherText = new byte[abyte0.length];
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:arraylength     
		//    5    7:newarray        byte[]
		//    6    9:putfield        #42  <Field byte[] cipherText>
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (cipherText)), 0, abyte0.length);
		//    7   12:aload_1         
		//    8   13:iconst_0        
		//    9   14:aload_0         
		//   10   15:getfield        #42  <Field byte[] cipherText>
		//   11   18:iconst_0        
		//   12   19:aload_1         
		//   13   20:arraylength     
		//   14   21:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			iv = new byte[abyte1.length];
		//   15   24:aload_0         
		//   16   25:aload_2         
		//   17   26:arraylength     
		//   18   27:newarray        byte[]
		//   19   29:putfield        #38  <Field byte[] iv>
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (iv)), 0, abyte1.length);
		//   20   32:aload_2         
		//   21   33:iconst_0        
		//   22   34:aload_0         
		//   23   35:getfield        #38  <Field byte[] iv>
		//   24   38:iconst_0        
		//   25   39:aload_2         
		//   26   40:arraylength     
		//   27   41:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
			mac = new byte[abyte2.length];
		//   28   44:aload_0         
		//   29   45:aload_3         
		//   30   46:arraylength     
		//   31   47:newarray        byte[]
		//   32   49:putfield        #40  <Field byte[] mac>
			System.arraycopy(((Object) (abyte2)), 0, ((Object) (mac)), 0, abyte2.length);
		//   33   52:aload_3         
		//   34   53:iconst_0        
		//   35   54:aload_0         
		//   36   55:getfield        #40  <Field byte[] mac>
		//   37   58:iconst_0        
		//   38   59:aload_3         
		//   39   60:arraylength     
		//   40   61:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		//   41   64:return          
		}
	}

	public static final class PrngFixes
	{

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

		private PrngFixes()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class PrngFixes.LinuxPRNGSecureRandom extends SecureRandomSpi
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
				engineSetSeed(PrngFixes.generateSeed());
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

		public PrngFixes.LinuxPRNGSecureRandom()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void SecureRandomSpi()>
		//    2    4:return          
		}
	}

	private static class PrngFixes.LinuxPRNGSecureRandomProvider extends Provider
	{

		public PrngFixes.LinuxPRNGSecureRandomProvider()
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

	public static class SecretKeys
	{

		public boolean equals(Object obj)
		{
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
					return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
				if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #29  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #29  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
					return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
				obj = ((Object) ((SecretKeys)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class AesCbcWithIntegrity$SecretKeys>
		//   18   30:astore_1        
				if(!((Object) (integrityKey)).equals(((Object) (((SecretKeys) (obj)).integrityKey))))
		//*  19   31:aload_0         
		//*  20   32:getfield        #31  <Field SecretKey integrityKey>
		//*  21   35:aload_1         
		//*  22   36:getfield        #31  <Field SecretKey integrityKey>
		//*  23   39:invokevirtual   #33  <Method boolean Object.equals(Object)>
		//*  24   42:ifne            47
					return false;
		//   25   45:iconst_0        
		//   26   46:ireturn         
				if(!((Object) (confidentialityKey)).equals(((Object) (((SecretKeys) (obj)).confidentialityKey))))
		//*  27   47:aload_0         
		//*  28   48:getfield        #35  <Field SecretKey confidentialityKey>
		//*  29   51:aload_1         
		//*  30   52:getfield        #35  <Field SecretKey confidentialityKey>
		//*  31   55:invokevirtual   #33  <Method boolean Object.equals(Object)>
		//*  32   58:ifne            5
					return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
			}
			return true;
		}

		public SecretKey getConfidentialityKey()
		{
			return confidentialityKey;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field SecretKey confidentialityKey>
		//    2    4:areturn         
		}

		public SecretKey getIntegrityKey()
		{
			return integrityKey;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field SecretKey integrityKey>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return (((Object) (confidentialityKey)).hashCode() + 31) * 31 + ((Object) (integrityKey)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field SecretKey confidentialityKey>
		//    2    4:invokevirtual   #42  <Method int Object.hashCode()>
		//    3    7:bipush          31
		//    4    9:iadd            
		//    5   10:bipush          31
		//    6   12:imul            
		//    7   13:aload_0         
		//    8   14:getfield        #31  <Field SecretKey integrityKey>
		//    9   17:invokevirtual   #42  <Method int Object.hashCode()>
		//   10   20:iadd            
		//   11   21:ireturn         
		}

		public void setConfidentialityKey(SecretKey secretkey)
		{
			confidentialityKey = secretkey;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field SecretKey confidentialityKey>
		//    3    5:return          
		}

		public void setIntegrityKey(SecretKey secretkey)
		{
			integrityKey = secretkey;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field SecretKey integrityKey>
		//    3    5:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append(Base64.encodeToString(getConfidentialityKey().getEncoded(), 2)).append(":").append(Base64.encodeToString(getIntegrityKey().getEncoded(), 2)).toString();
		//    0    0:new             #46  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #49  <Method SecretKey getConfidentialityKey()>
		//    5   11:invokeinterface #55  <Method byte[] SecretKey.getEncoded()>
		//    6   16:iconst_2        
		//    7   17:invokestatic    #61  <Method String Base64.encodeToString(byte[], int)>
		//    8   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//    9   23:ldc1            #67  <String ":">
		//   10   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   11   28:aload_0         
		//   12   29:invokevirtual   #69  <Method SecretKey getIntegrityKey()>
		//   13   32:invokeinterface #55  <Method byte[] SecretKey.getEncoded()>
		//   14   37:iconst_2        
		//   15   38:invokestatic    #61  <Method String Base64.encodeToString(byte[], int)>
		//   16   41:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   17   44:invokevirtual   #71  <Method String StringBuilder.toString()>
		//   18   47:areturn         
		}

		private SecretKey confidentialityKey;
		private SecretKey integrityKey;

		public SecretKeys(SecretKey secretkey, SecretKey secretkey1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			setConfidentialityKey(secretkey);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #19  <Method void setConfidentialityKey(SecretKey)>
			setIntegrityKey(secretkey1);
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #22  <Method void setIntegrityKey(SecretKey)>
		//    8   14:return          
		}
	}


	public AesCbcWithIntegrity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
	//    2    4:return          
	}

	public static boolean constantTimeEq(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length == abyte1.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:icmpeq          9
	//*   5    7:iconst_0        
	//*   6    8:ireturn         
		{
			int j = 0;
	//    7    9:iconst_0        
	//    8   10:istore_3        
			for(int i = 0; i < abyte0.length; i++)
	//*   9   11:iconst_0        
	//*  10   12:istore_2        
	//*  11   13:iload_2         
	//*  12   14:aload_0         
	//*  13   15:arraylength     
	//*  14   16:icmpge          36
				j |= abyte0[i] ^ abyte1[i];
	//   15   19:iload_3         
	//   16   20:aload_0         
	//   17   21:iload_2         
	//   18   22:baload          
	//   19   23:aload_1         
	//   20   24:iload_2         
	//   21   25:baload          
	//   22   26:ixor            
	//   23   27:ior             
	//   24   28:istore_3        

	//   25   29:iload_2         
	//   26   30:iconst_1        
	//   27   31:iadd            
	//   28   32:istore_2        
	//*  29   33:goto            13
			if(j == 0)
	//*  30   36:iload_3         
	//*  31   37:ifne            7
				return true;
	//   32   40:iconst_1        
	//   33   41:ireturn         
		}
		return false;
	}

	private static byte[] copyOfRange(byte abyte0[], int i, int j)
	{
		j -= i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore_2        
		byte abyte1[] = new byte[j];
	//    4    4:iload_2         
	//    5    5:newarray        byte[]
	//    6    7:astore_3        
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
	//    7    8:aload_0         
	//    8    9:iload_1         
	//    9   10:aload_3         
	//   10   11:iconst_0        
	//   11   12:iload_2         
	//   12   13:invokestatic    #75  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//   13   16:aload_3         
	//   14   17:areturn         
	}

	public static byte[] decrypt(CipherTextIvMac ciphertextivmac, SecretKeys secretkeys)
		throws GeneralSecurityException
	{
		if(constantTimeEq(generateMac(CipherTextIvMac.ivCipherConcat(ciphertextivmac.getIv(), ciphertextivmac.getCipherText()), secretkeys.getIntegrityKey()), ciphertextivmac.getMac()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #83  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.getIv()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #86  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.getCipherText()>
	//*   4    8:invokestatic    #90  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.ivCipherConcat(byte[], byte[])>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #94  <Method SecretKey AesCbcWithIntegrity$SecretKeys.getIntegrityKey()>
	//*   7   15:invokestatic    #98  <Method byte[] generateMac(byte[], SecretKey)>
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #101 <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.getMac()>
	//*  10   22:invokestatic    #103 <Method boolean constantTimeEq(byte[], byte[])>
	//*  11   25:ifeq            63
		{
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	//   12   28:ldc1            #34  <String "AES/CBC/PKCS5Padding">
	//   13   30:invokestatic    #109 <Method Cipher Cipher.getInstance(String)>
	//   14   33:astore_2        
			cipher.init(2, ((java.security.Key) (secretkeys.getConfidentialityKey())), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(ciphertextivmac.getIv()))));
	//   15   34:aload_2         
	//   16   35:iconst_2        
	//   17   36:aload_1         
	//   18   37:invokevirtual   #112 <Method SecretKey AesCbcWithIntegrity$SecretKeys.getConfidentialityKey()>
	//   19   40:new             #114 <Class IvParameterSpec>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:invokevirtual   #83  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.getIv()>
	//   23   48:invokespecial   #117 <Method void IvParameterSpec(byte[])>
	//   24   51:invokevirtual   #121 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			return cipher.doFinal(ciphertextivmac.getCipherText());
	//   25   54:aload_2         
	//   26   55:aload_0         
	//   27   56:invokevirtual   #86  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.getCipherText()>
	//   28   59:invokevirtual   #125 <Method byte[] Cipher.doFinal(byte[])>
	//   29   62:areturn         
		} else
		{
			throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
	//   30   63:new             #79  <Class GeneralSecurityException>
	//   31   66:dup             
	//   32   67:ldc1            #127 <String "MAC stored in civ does not match computed MAC.">
	//   33   69:invokespecial   #130 <Method void GeneralSecurityException(String)>
	//   34   72:athrow          
		}
	}

	public static String decryptString(CipherTextIvMac ciphertextivmac, SecretKeys secretkeys)
		throws UnsupportedEncodingException, GeneralSecurityException
	{
		return decryptString(ciphertextivmac, secretkeys, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #137 <String "UTF-8">
	//    3    4:invokestatic    #140 <Method String decryptString(AesCbcWithIntegrity$CipherTextIvMac, AesCbcWithIntegrity$SecretKeys, String)>
	//    4    7:areturn         
	}

	public static String decryptString(CipherTextIvMac ciphertextivmac, SecretKeys secretkeys, String s)
		throws UnsupportedEncodingException, GeneralSecurityException
	{
		return new String(decrypt(ciphertextivmac, secretkeys), s);
	//    0    0:new             #142 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #144 <Method byte[] decrypt(AesCbcWithIntegrity$CipherTextIvMac, AesCbcWithIntegrity$SecretKeys)>
	//    5    9:aload_2         
	//    6   10:invokespecial   #147 <Method void String(byte[], String)>
	//    7   13:areturn         
	}

	public static CipherTextIvMac encrypt(String s, SecretKeys secretkeys)
		throws UnsupportedEncodingException, GeneralSecurityException
	{
		return encrypt(s, secretkeys, "UTF-8");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #137 <String "UTF-8">
	//    3    4:invokestatic    #152 <Method AesCbcWithIntegrity$CipherTextIvMac encrypt(String, AesCbcWithIntegrity$SecretKeys, String)>
	//    4    7:areturn         
	}

	public static CipherTextIvMac encrypt(String s, SecretKeys secretkeys, String s1)
		throws UnsupportedEncodingException, GeneralSecurityException
	{
		return encrypt(s.getBytes(s1), secretkeys);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #156 <Method byte[] String.getBytes(String)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #159 <Method AesCbcWithIntegrity$CipherTextIvMac encrypt(byte[], AesCbcWithIntegrity$SecretKeys)>
	//    5    9:areturn         
	}

	public static CipherTextIvMac encrypt(byte abyte0[], SecretKeys secretkeys)
		throws GeneralSecurityException
	{
		byte abyte1[] = generateIv();
	//    0    0:invokestatic    #162 <Method byte[] generateIv()>
	//    1    3:astore_3        
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	//    2    4:ldc1            #34  <String "AES/CBC/PKCS5Padding">
	//    3    6:invokestatic    #109 <Method Cipher Cipher.getInstance(String)>
	//    4    9:astore_2        
		cipher.init(1, ((java.security.Key) (secretkeys.getConfidentialityKey())), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte1))));
	//    5   10:aload_2         
	//    6   11:iconst_1        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #112 <Method SecretKey AesCbcWithIntegrity$SecretKeys.getConfidentialityKey()>
	//    9   16:new             #114 <Class IvParameterSpec>
	//   10   19:dup             
	//   11   20:aload_3         
	//   12   21:invokespecial   #117 <Method void IvParameterSpec(byte[])>
	//   13   24:invokevirtual   #121 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		abyte1 = cipher.getIV();
	//   14   27:aload_2         
	//   15   28:invokevirtual   #165 <Method byte[] Cipher.getIV()>
	//   16   31:astore_3        
		abyte0 = cipher.doFinal(abyte0);
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #125 <Method byte[] Cipher.doFinal(byte[])>
	//   20   37:astore_0        
		return new CipherTextIvMac(abyte0, abyte1, generateMac(CipherTextIvMac.ivCipherConcat(abyte1, abyte0), secretkeys.getIntegrityKey()));
	//   21   38:new             #6   <Class AesCbcWithIntegrity$CipherTextIvMac>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:aload_3         
	//   25   44:aload_3         
	//   26   45:aload_0         
	//   27   46:invokestatic    #90  <Method byte[] AesCbcWithIntegrity$CipherTextIvMac.ivCipherConcat(byte[], byte[])>
	//   28   49:aload_1         
	//   29   50:invokevirtual   #94  <Method SecretKey AesCbcWithIntegrity$SecretKeys.getIntegrityKey()>
	//   30   53:invokestatic    #98  <Method byte[] generateMac(byte[], SecretKey)>
	//   31   56:invokespecial   #168 <Method void AesCbcWithIntegrity$CipherTextIvMac(byte[], byte[], byte[])>
	//   32   59:areturn         
	}

	private static void fixPrng()
	{
		if(prngFixed.get())
			break MISSING_BLOCK_LABEL_41;
	//    0    0:getstatic       #62  <Field AtomicBoolean prngFixed>
	//    1    3:invokevirtual   #173 <Method boolean AtomicBoolean.get()>
	//    2    6:ifne            41
		com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes;
	//    3    9:ldc1            #9   <Class AesCbcWithIntegrity$PrngFixes>
		JVM INSTR monitorenter ;
	//    4   11:monitorenter    
		if(!prngFixed.get())
	//*   5   12:getstatic       #62  <Field AtomicBoolean prngFixed>
	//*   6   15:invokevirtual   #173 <Method boolean AtomicBoolean.get()>
	//*   7   18:ifne            31
		{
			PrngFixes.apply();
	//    8   21:invokestatic    #176 <Method void AesCbcWithIntegrity$PrngFixes.apply()>
			prngFixed.set(true);
	//    9   24:getstatic       #62  <Field AtomicBoolean prngFixed>
	//   10   27:iconst_1        
	//   11   28:invokevirtual   #179 <Method void AtomicBoolean.set(boolean)>
		}
		com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes;
	//   12   31:ldc1            #9   <Class AesCbcWithIntegrity$PrngFixes>
		JVM INSTR monitorexit ;
	//   13   33:monitorexit     
		return;
	//   14   34:return          
		Exception exception;
		exception;
	//   15   35:astore_0        
		com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes;
	//   16   36:ldc1            #9   <Class AesCbcWithIntegrity$PrngFixes>
		JVM INSTR monitorexit ;
	//   17   38:monitorexit     
		throw exception;
	//   18   39:aload_0         
	//   19   40:athrow          
	//   20   41:return          
	}

	public static byte[] generateIv()
		throws GeneralSecurityException
	{
		return randomBytes(16);
	//    0    0:bipush          16
	//    1    2:invokestatic    #183 <Method byte[] randomBytes(int)>
	//    2    5:areturn         
	}

	public static SecretKeys generateKey()
		throws GeneralSecurityException
	{
		fixPrng();
	//    0    0:invokestatic    #187 <Method void fixPrng()>
		KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
	//    1    3:ldc1            #31  <String "AES">
	//    2    5:invokestatic    #192 <Method KeyGenerator KeyGenerator.getInstance(String)>
	//    3    8:astore_0        
		keygenerator.init(128);
	//    4    9:aload_0         
	//    5   10:sipush          128
	//    6   13:invokevirtual   #195 <Method void KeyGenerator.init(int)>
		return new SecretKeys(keygenerator.generateKey(), ((SecretKey) (new SecretKeySpec(randomBytes(32), "HmacSHA256"))));
	//    7   16:new             #18  <Class AesCbcWithIntegrity$SecretKeys>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:invokevirtual   #197 <Method SecretKey KeyGenerator.generateKey()>
	//   11   24:new             #199 <Class SecretKeySpec>
	//   12   27:dup             
	//   13   28:bipush          32
	//   14   30:invokestatic    #183 <Method byte[] randomBytes(int)>
	//   15   33:ldc1            #37  <String "HmacSHA256">
	//   16   35:invokespecial   #200 <Method void SecretKeySpec(byte[], String)>
	//   17   38:invokespecial   #203 <Method void AesCbcWithIntegrity$SecretKeys(SecretKey, SecretKey)>
	//   18   41:areturn         
	}

	public static SecretKeys generateKeyFromPassword(String s, String s1)
		throws GeneralSecurityException
	{
		return generateKeyFromPassword(s, s1, 10000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          10000
	//    3    5:invokestatic    #208 <Method AesCbcWithIntegrity$SecretKeys generateKeyFromPassword(String, String, int)>
	//    4    8:areturn         
	}

	public static SecretKeys generateKeyFromPassword(String s, String s1, int i)
		throws GeneralSecurityException
	{
		return generateKeyFromPassword(s, Base64.decode(s1, 2), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:invokestatic    #214 <Method byte[] Base64.decode(String, int)>
	//    4    6:iload_2         
	//    5    7:invokestatic    #217 <Method AesCbcWithIntegrity$SecretKeys generateKeyFromPassword(String, byte[], int)>
	//    6   10:areturn         
	}

	public static SecretKeys generateKeyFromPassword(String s, byte abyte0[])
		throws GeneralSecurityException
	{
		return generateKeyFromPassword(s, abyte0, 10000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          10000
	//    3    5:invokestatic    #217 <Method AesCbcWithIntegrity$SecretKeys generateKeyFromPassword(String, byte[], int)>
	//    4    8:areturn         
	}

	public static SecretKeys generateKeyFromPassword(String s, byte abyte0[], int i)
		throws GeneralSecurityException
	{
		fixPrng();
	//    0    0:invokestatic    #187 <Method void fixPrng()>
		s = ((String) (new PBEKeySpec(s.toCharArray(), abyte0, i, 384)));
	//    1    3:new             #220 <Class PBEKeySpec>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokevirtual   #224 <Method char[] String.toCharArray()>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:sipush          384
	//    8   16:invokespecial   #227 <Method void PBEKeySpec(char[], byte[], int, int)>
	//    9   19:astore_0        
		abyte0 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(((java.security.spec.KeySpec) (s))).getEncoded();
	//   10   20:ldc1            #44  <String "PBKDF2WithHmacSHA1">
	//   11   22:invokestatic    #232 <Method SecretKeyFactory SecretKeyFactory.getInstance(String)>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #236 <Method SecretKey SecretKeyFactory.generateSecret(java.security.spec.KeySpec)>
	//   14   29:invokeinterface #241 <Method byte[] SecretKey.getEncoded()>
	//   15   34:astore_1        
		s = ((String) (copyOfRange(abyte0, 0, 16)));
	//   16   35:aload_1         
	//   17   36:iconst_0        
	//   18   37:bipush          16
	//   19   39:invokestatic    #243 <Method byte[] copyOfRange(byte[], int, int)>
	//   20   42:astore_0        
		abyte0 = copyOfRange(abyte0, 16, 48);
	//   21   43:aload_1         
	//   22   44:bipush          16
	//   23   46:bipush          48
	//   24   48:invokestatic    #243 <Method byte[] copyOfRange(byte[], int, int)>
	//   25   51:astore_1        
		return new SecretKeys(((SecretKey) (new SecretKeySpec(((byte []) (s)), "AES"))), ((SecretKey) (new SecretKeySpec(abyte0, "HmacSHA256"))));
	//   26   52:new             #18  <Class AesCbcWithIntegrity$SecretKeys>
	//   27   55:dup             
	//   28   56:new             #199 <Class SecretKeySpec>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:ldc1            #31  <String "AES">
	//   32   63:invokespecial   #200 <Method void SecretKeySpec(byte[], String)>
	//   33   66:new             #199 <Class SecretKeySpec>
	//   34   69:dup             
	//   35   70:aload_1         
	//   36   71:ldc1            #37  <String "HmacSHA256">
	//   37   73:invokespecial   #200 <Method void SecretKeySpec(byte[], String)>
	//   38   76:invokespecial   #203 <Method void AesCbcWithIntegrity$SecretKeys(SecretKey, SecretKey)>
	//   39   79:areturn         
	}

	public static byte[] generateMac(byte abyte0[], SecretKey secretkey)
		throws NoSuchAlgorithmException, InvalidKeyException
	{
		Mac mac = Mac.getInstance("HmacSHA256");
	//    0    0:ldc1            #37  <String "HmacSHA256">
	//    1    2:invokestatic    #252 <Method Mac Mac.getInstance(String)>
	//    2    5:astore_2        
		mac.init(((java.security.Key) (secretkey)));
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #255 <Method void Mac.init(java.security.Key)>
		return mac.doFinal(abyte0);
	//    6   11:aload_2         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #256 <Method byte[] Mac.doFinal(byte[])>
	//    9   16:areturn         
	}

	public static byte[] generateSalt()
		throws GeneralSecurityException
	{
		return randomBytes(128);
	//    0    0:sipush          128
	//    1    3:invokestatic    #183 <Method byte[] randomBytes(int)>
	//    2    6:areturn         
	}

	public static String keyString(SecretKeys secretkeys)
	{
		return secretkeys.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #263 <Method String AesCbcWithIntegrity$SecretKeys.toString()>
	//    2    4:areturn         
	}

	public static SecretKeys keys(String s)
		throws InvalidKeyException
	{
		Object aobj[] = ((Object []) (s.split(":")));
	//    0    0:aload_0         
	//    1    1:ldc2            #267 <String ":">
	//    2    4:invokevirtual   #271 <Method String[] String.split(String)>
	//    3    7:astore_1        
		if(aobj.length != 2)
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          25
			throw new IllegalArgumentException("Cannot parse aesKey:hmacKey");
	//    8   14:new             #273 <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc2            #275 <String "Cannot parse aesKey:hmacKey">
	//   11   21:invokespecial   #276 <Method void IllegalArgumentException(String)>
	//   12   24:athrow          
		s = ((String) (Base64.decode(aobj[0], 2)));
	//   13   25:aload_1         
	//   14   26:iconst_0        
	//   15   27:aaload          
	//   16   28:iconst_2        
	//   17   29:invokestatic    #214 <Method byte[] Base64.decode(String, int)>
	//   18   32:astore_0        
		if(s.length != 16)
	//*  19   33:aload_0         
	//*  20   34:arraylength     
	//*  21   35:bipush          16
	//*  22   37:icmpeq          51
			throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
	//   23   40:new             #247 <Class InvalidKeyException>
	//   24   43:dup             
	//   25   44:ldc2            #278 <String "Base64 decoded key is not 128 bytes">
	//   26   47:invokespecial   #279 <Method void InvalidKeyException(String)>
	//   27   50:athrow          
		aobj = ((Object []) (Base64.decode(aobj[1], 2)));
	//   28   51:aload_1         
	//   29   52:iconst_1        
	//   30   53:aaload          
	//   31   54:iconst_2        
	//   32   55:invokestatic    #214 <Method byte[] Base64.decode(String, int)>
	//   33   58:astore_1        
		if(aobj.length != 32)
	//*  34   59:aload_1         
	//*  35   60:arraylength     
	//*  36   61:bipush          32
	//*  37   63:icmpeq          77
			throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
	//   38   66:new             #247 <Class InvalidKeyException>
	//   39   69:dup             
	//   40   70:ldc2            #281 <String "Base64 decoded key is not 256 bytes">
	//   41   73:invokespecial   #279 <Method void InvalidKeyException(String)>
	//   42   76:athrow          
		else
			return new SecretKeys(((SecretKey) (new SecretKeySpec(((byte []) (s)), 0, s.length, "AES"))), ((SecretKey) (new SecretKeySpec(((byte []) (aobj)), "HmacSHA256"))));
	//   43   77:new             #18  <Class AesCbcWithIntegrity$SecretKeys>
	//   44   80:dup             
	//   45   81:new             #199 <Class SecretKeySpec>
	//   46   84:dup             
	//   47   85:aload_0         
	//   48   86:iconst_0        
	//   49   87:aload_0         
	//   50   88:arraylength     
	//   51   89:ldc1            #31  <String "AES">
	//   52   91:invokespecial   #284 <Method void SecretKeySpec(byte[], int, int, String)>
	//   53   94:new             #199 <Class SecretKeySpec>
	//   54   97:dup             
	//   55   98:aload_1         
	//   56   99:ldc1            #37  <String "HmacSHA256">
	//   57  101:invokespecial   #200 <Method void SecretKeySpec(byte[], String)>
	//   58  104:invokespecial   #203 <Method void AesCbcWithIntegrity$SecretKeys(SecretKey, SecretKey)>
	//   59  107:areturn         
	}

	private static byte[] randomBytes(int i)
		throws GeneralSecurityException
	{
		fixPrng();
	//    0    0:invokestatic    #187 <Method void fixPrng()>
		SecureRandom securerandom = SecureRandom.getInstance("SHA1PRNG");
	//    1    3:ldc1            #50  <String "SHA1PRNG">
	//    2    5:invokestatic    #289 <Method SecureRandom SecureRandom.getInstance(String)>
	//    3    8:astore_1        
		byte abyte0[] = new byte[i];
	//    4    9:iload_0         
	//    5   10:newarray        byte[]
	//    6   12:astore_2        
		securerandom.nextBytes(abyte0);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #292 <Method void SecureRandom.nextBytes(byte[])>
		return abyte0;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public static String saltString(byte abyte0[])
	{
		return Base64.encodeToString(abyte0, 2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #298 <Method String Base64.encodeToString(byte[], int)>
	//    3    5:areturn         
	}

	private static final int AES_KEY_LENGTH_BITS = 128;
	private static final boolean ALLOW_BROKEN_PRNG = false;
	public static final int BASE64_FLAGS = 2;
	private static final String CIPHER = "AES";
	private static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
	private static final String HMAC_ALGORITHM = "HmacSHA256";
	private static final int HMAC_KEY_LENGTH_BITS = 256;
	private static final int IV_LENGTH_BYTES = 16;
	private static final String PBE_ALGORITHM = "PBKDF2WithHmacSHA1";
	private static final int PBE_ITERATION_COUNT = 10000;
	private static final int PBE_SALT_LENGTH_BITS = 128;
	private static final String RANDOM_ALGORITHM = "SHA1PRNG";
	static final AtomicBoolean prngFixed = new AtomicBoolean(false);

	static 
	{
	//    0    0:new             #56  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #60  <Method void AtomicBoolean(boolean)>
	//    4    8:putstatic       #62  <Field AtomicBoolean prngFixed>
	//*   5   11:return          
	}
}
