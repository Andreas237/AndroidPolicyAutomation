// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.cp.common;

import android.util.Base64;
import com.sec.android.service.health.util.LOG;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;
import javax.crypto.spec.*;

public class AESEncryption
{

	public AESEncryption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		str = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #54  <Field String str>
		iv = generateIV();
	//    5    9:aload_0         
	//    6   10:invokespecial   #58  <Method byte[] generateIV()>
	//    7   13:putstatic       #60  <Field byte[] iv>
		str = loadStr();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #64  <Method String loadStr()>
	//   11   21:putfield        #54  <Field String str>
		salt = loadSalt();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #67  <Method String loadSalt()>
	//   14   28:putstatic       #34  <Field String salt>
		try
		{
			cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
	//   15   31:aload_0         
	//   16   32:ldc1            #8   <String "AES/CBC/PKCS7Padding">
	//   17   34:invokestatic    #73  <Method Cipher Cipher.getInstance(String)>
	//   18   37:putfield        #75  <Field Cipher cipher>
			return;
	//   19   40:return          
		}
		catch(NoSuchAlgorithmException nosuchalgorithmexception)
	//*  20   41:astore_1        
		{
			nosuchalgorithmexception.printStackTrace();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #78  <Method void NoSuchAlgorithmException.printStackTrace()>
			LOG.e(TAG, "NoSuchAlgorithmException");
	//   23   46:getstatic       #36  <Field Class TAG>
	//   24   49:ldc1            #80  <String "NoSuchAlgorithmException">
	//   25   51:invokestatic    #86  <Method void LOG.e(Class, String)>
			cipher = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #75  <Field Cipher cipher>
			return;
	//   29   59:return          
		}
		catch(NoSuchPaddingException nosuchpaddingexception)
	//*  30   60:astore_1        
		{
			nosuchpaddingexception.printStackTrace();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #87  <Method void NoSuchPaddingException.printStackTrace()>
		}
		LOG.e(TAG, "NoSuchPaddingException");
	//   33   65:getstatic       #36  <Field Class TAG>
	//   34   68:ldc1            #89  <String "NoSuchPaddingException">
	//   35   70:invokestatic    #86  <Method void LOG.e(Class, String)>
		cipher = null;
	//   36   73:aload_0         
	//   37   74:aconst_null     
	//   38   75:putfield        #75  <Field Cipher cipher>
	//   39   78:return          
	}

	private byte[] generateIV()
	{
		byte abyte0[];
		try
		{
			abyte0 = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(Exception exception)
	//*   5    7:astore_1        
		{
			LOG.e(TAG, exception.getMessage());
	//    6    8:getstatic       #36  <Field Class TAG>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #94  <Method String Exception.getMessage()>
	//    9   15:invokestatic    #86  <Method void LOG.e(Class, String)>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return abyte0;
	}

	public String decrypt(String s, String s1)
		throws UnsupportedEncodingException
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #104 <Method int String.length()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		try
		{
			IvParameterSpec ivparameterspec = new IvParameterSpec(iv);
	//    7   13:new             #106 <Class IvParameterSpec>
	//    8   16:dup             
	//    9   17:getstatic       #60  <Field byte[] iv>
	//   10   20:invokespecial   #109 <Method void IvParameterSpec(byte[])>
	//   11   23:astore_3        
			cipher.init(2, ((java.security.Key) (getSecretKey(s1))), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field Cipher cipher>
	//   14   28:iconst_2        
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #113 <Method SecretKey getSecretKey(String)>
	//   18   34:aload_3         
	//   19   35:invokevirtual   #117 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			s = ((String) (cipher.doFinal(Base64.decode(s, 0))));
	//   20   38:aload_0         
	//   21   39:getfield        #75  <Field Cipher cipher>
	//   22   42:aload_1         
	//   23   43:iconst_0        
	//   24   44:invokestatic    #123 <Method byte[] Base64.decode(String, int)>
	//   25   47:invokevirtual   #127 <Method byte[] Cipher.doFinal(byte[])>
	//   26   50:astore_1        
		}
	//*  27   51:new             #100 <Class String>
	//*  28   54:dup             
	//*  29   55:aload_1         
	//*  30   56:ldc1            #129 <String "UTF-8">
	//*  31   58:invokespecial   #132 <Method void String(byte[], String)>
	//*  32   61:astore_1        
	//*  33   62:getstatic       #36  <Field Class TAG>
	//*  34   65:new             #134 <Class StringBuilder>
	//*  35   68:dup             
	//*  36   69:invokespecial   #135 <Method void StringBuilder()>
	//*  37   72:ldc1            #137 <String "decrypted : ">
	//*  38   74:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//*  41   81:invokevirtual   #144 <Method String StringBuilder.toString()>
	//*  42   84:invokestatic    #147 <Method void LOG.i(Class, String)>
	//*  43   87:aload_1         
	//*  44   88:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   89:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   46   90:aload_1         
	//   47   91:invokevirtual   #148 <Method void Exception.printStackTrace()>
			return null;
	//   48   94:aconst_null     
	//   49   95:areturn         
		}
		s = new String(((byte []) (s)), "UTF-8");
		LOG.i(TAG, (new StringBuilder()).append("decrypted : ").append(s).toString());
		return s;
	}

	public String encrypt(String s, String s1)
	{
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #104 <Method int String.length()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		try
		{
			IvParameterSpec ivparameterspec = new IvParameterSpec(iv);
	//    7   13:new             #106 <Class IvParameterSpec>
	//    8   16:dup             
	//    9   17:getstatic       #60  <Field byte[] iv>
	//   10   20:invokespecial   #109 <Method void IvParameterSpec(byte[])>
	//   11   23:astore_3        
			cipher.init(1, ((java.security.Key) (getSecretKey(s1))), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field Cipher cipher>
	//   14   28:iconst_1        
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #113 <Method SecretKey getSecretKey(String)>
	//   18   34:aload_3         
	//   19   35:invokevirtual   #117 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			s = Base64.encodeToString(cipher.doFinal(s.getBytes("UTF-8")), 0);
	//   20   38:aload_0         
	//   21   39:getfield        #75  <Field Cipher cipher>
	//   22   42:aload_1         
	//   23   43:ldc1            #129 <String "UTF-8">
	//   24   45:invokevirtual   #154 <Method byte[] String.getBytes(String)>
	//   25   48:invokevirtual   #127 <Method byte[] Cipher.doFinal(byte[])>
	//   26   51:iconst_0        
	//   27   52:invokestatic    #158 <Method String Base64.encodeToString(byte[], int)>
	//   28   55:astore_1        
		}
	//*  29   56:getstatic       #36  <Field Class TAG>
	//*  30   59:new             #134 <Class StringBuilder>
	//*  31   62:dup             
	//*  32   63:invokespecial   #135 <Method void StringBuilder()>
	//*  33   66:ldc1            #160 <String "encoded txt :">
	//*  34   68:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//*  37   75:invokevirtual   #144 <Method String StringBuilder.toString()>
	//*  38   78:invokestatic    #147 <Method void LOG.i(Class, String)>
	//*  39   81:aload_1         
	//*  40   82:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  41   83:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   42   84:aload_1         
	//   43   85:invokevirtual   #148 <Method void Exception.printStackTrace()>
			return null;
	//   44   88:aconst_null     
	//   45   89:areturn         
		}
		LOG.i(TAG, (new StringBuilder()).append("encoded txt :").append(s).toString());
		return s;
	}

	public SecretKey getSecretKey(String s)
	{
		try
		{
			s = ((String) (new PBEKeySpec(s.toCharArray(), salt.getBytes("UTF-8"), 100, 128)));
	//    0    0:new             #162 <Class PBEKeySpec>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method char[] String.toCharArray()>
	//    4    8:getstatic       #34  <Field String salt>
	//    5   11:ldc1            #129 <String "UTF-8">
	//    6   13:invokevirtual   #154 <Method byte[] String.getBytes(String)>
	//    7   16:bipush          100
	//    8   18:sipush          128
	//    9   21:invokespecial   #169 <Method void PBEKeySpec(char[], byte[], int, int)>
	//   10   24:astore_1        
			s = ((String) (new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(((java.security.spec.KeySpec) (s))).getEncoded(), "AES")));
	//   11   25:new             #171 <Class SecretKeySpec>
	//   12   28:dup             
	//   13   29:ldc1            #21  <String "PBKDF2WithHmacSHA1">
	//   14   31:invokestatic    #176 <Method SecretKeyFactory SecretKeyFactory.getInstance(String)>
	//   15   34:aload_1         
	//   16   35:invokevirtual   #180 <Method SecretKey SecretKeyFactory.generateSecret(java.security.spec.KeySpec)>
	//   17   38:invokeinterface #185 <Method byte[] SecretKey.getEncoded()>
	//   18   43:ldc1            #14  <String "AES">
	//   19   45:invokespecial   #186 <Method void SecretKeySpec(byte[], String)>
	//   20   48:astore_1        
		}
	//*  21   49:aload_1         
	//*  22   50:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   51:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   24   52:aload_1         
	//   25   53:invokevirtual   #148 <Method void Exception.printStackTrace()>
			return null;
	//   26   56:aconst_null     
	//   27   57:areturn         
		}
		return ((SecretKey) (s));
	}

	public native String loadSalt();

	public native String loadStr();

	private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS7Padding";
	private static final int IV_LENGTH = 16;
	private static final String KEY_ALGORITHM = "AES";
	private static final int PBE_ITERATION_COUNT = 100;
	private static final int PBE_KEY_LENGTH = 128;
	private static final String SECRET_KEY_ALGORITHM = "PBKDF2WithHmacSHA1";
	public static Class TAG = com/sec/android/service/health/cp/common/AESEncryption;
	static byte iv[];
	private static String salt = null;
	private Cipher cipher;
	public String str;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #34  <Field String salt>
	//    2    4:ldc1            #2   <Class AESEncryption>
	//    3    6:putstatic       #36  <Field Class TAG>
		System.loadLibrary("PlatformStrings");
	//    4    9:ldc1            #38  <String "PlatformStrings">
	//    5   11:invokestatic    #44  <Method void System.loadLibrary(String)>
	//*   6   14:return          
	}
}
