// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.keyStore;

import android.util.Base64;
import com.gigya.socialize.android.utils.Utils;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.*;

// Referenced classes of package com.gigya.socialize.android.keyStore:
//			BaseKey

public class FingerprintKey extends BaseKey
{

	public FingerprintKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void BaseKey()>
	//    2    4:return          
	}

	private android.security.keystore.KeyGenParameterSpec.Builder buildKeyGenParameterSpecBuilder()
	{
		return (new android.security.keystore.KeyGenParameterSpec.Builder("fingerprint", 3)).setBlockModes(new String[] {
			"CBC"
		}).setUserAuthenticationRequired(true).setEncryptionPaddings(new String[] {
			"PKCS7Padding"
		});
	//    0    0:new             #29  <Class android.security.keystore.KeyGenParameterSpec$Builder>
	//    1    3:dup             
	//    2    4:ldc1            #8   <String "fingerprint">
	//    3    6:iconst_3        
	//    4    7:invokespecial   #32  <Method void android.security.keystore.KeyGenParameterSpec$Builder(String, int)>
	//    5   10:iconst_1        
	//    6   11:anewarray       String[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #36  <String "CBC">
	//   10   18:aastore         
	//   11   19:invokevirtual   #40  <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setBlockModes(String[])>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #44  <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setUserAuthenticationRequired(boolean)>
	//   14   26:iconst_1        
	//   15   27:anewarray       String[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:ldc1            #46  <String "PKCS7Padding">
	//   19   34:aastore         
	//   20   35:invokevirtual   #49  <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setEncryptionPaddings(String[])>
	//   21   38:areturn         
	}

	public String decrypt(String s)
	{
		try
		{
			s = new String(Utils.toChars(mCipher.doFinal(Base64.decode(s, 0))));
	//    0    0:new             #34  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field Cipher mCipher>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #66  <Method byte[] Base64.decode(String, int)>
	//    7   13:invokevirtual   #72  <Method byte[] Cipher.doFinal(byte[])>
	//    8   16:invokestatic    #78  <Method char[] Utils.toChars(byte[])>
	//    9   19:invokespecial   #81  <Method void String(char[])>
	//   10   22:astore_1        
		}
	//*  11   23:aload_1         
	//*  12   24:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   25:astore_1        
		{
			throw new BaseKey.KeyException(((BaseKey) (this)), "Error: decrypt operation failed", ((Throwable) (s)));
	//   14   26:new             #83  <Class BaseKey$KeyException>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:ldc1            #85  <String "Error: decrypt operation failed">
	//   18   33:aload_1         
	//   19   34:invokespecial   #88  <Method void BaseKey$KeyException(BaseKey, String, Throwable)>
	//   20   37:athrow          
		}
		return s;
	}

	public String encrypt(String s)
	{
		try
		{
			s = ((String) (mCipher.doFinal(Utils.toBytes(s.toCharArray()))));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Cipher mCipher>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method char[] String.toCharArray()>
	//    4    8:invokestatic    #99  <Method byte[] Utils.toBytes(char[])>
	//    5   11:invokevirtual   #72  <Method byte[] Cipher.doFinal(byte[])>
	//    6   14:astore_1        
			saveIvParameterSpec();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #102 <Method void saveIvParameterSpec()>
			s = Base64.encodeToString(((byte []) (s)), 0);
	//    9   19:aload_1         
	//   10   20:iconst_0        
	//   11   21:invokestatic    #106 <Method String Base64.encodeToString(byte[], int)>
	//   12   24:astore_1        
		}
	//*  13   25:aload_1         
	//*  14   26:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   27:astore_1        
		{
			throw new BaseKey.KeyException(((BaseKey) (this)), "Error: encrypt operation failed", ((Throwable) (s)));
	//   16   28:new             #83  <Class BaseKey$KeyException>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:ldc1            #108 <String "Error: encrypt operation failed">
	//   20   35:aload_1         
	//   21   36:invokespecial   #88  <Method void BaseKey$KeyException(BaseKey, String, Throwable)>
	//   22   39:athrow          
		}
		return s;
	}

	public SecretKey generateKey()
	{
		android.security.keystore.KeyGenParameterSpec.Builder builder = buildKeyGenParameterSpecBuilder();
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method android.security.keystore.KeyGenParameterSpec$Builder buildKeyGenParameterSpecBuilder()>
	//    2    4:astore_1        
		KeyGenerator keygenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
	//    3    5:ldc1            #114 <String "AES">
	//    4    7:ldc1            #116 <String "AndroidKeyStore">
	//    5    9:invokestatic    #122 <Method KeyGenerator KeyGenerator.getInstance(String, String)>
	//    6   12:astore_2        
		keygenerator.init(((java.security.spec.AlgorithmParameterSpec) (builder.setKeySize(256).build())));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:sipush          256
	//   10   18:invokevirtual   #126 <Method android.security.keystore.KeyGenParameterSpec$Builder android.security.keystore.KeyGenParameterSpec$Builder.setKeySize(int)>
	//   11   21:invokevirtual   #130 <Method android.security.keystore.KeyGenParameterSpec android.security.keystore.KeyGenParameterSpec$Builder.build()>
	//   12   24:invokevirtual   #134 <Method void KeyGenerator.init(java.security.spec.AlgorithmParameterSpec)>
		return keygenerator.generateKey();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #136 <Method SecretKey KeyGenerator.generateKey()>
	//   15   31:areturn         
	}

	protected String getCipherTransformation()
	{
		return "AES/CBC/PKCS7Padding";
	//    0    0:ldc1            #140 <String "AES/CBC/PKCS7Padding">
	//    1    2:areturn         
	}

	String getIVSpecName()
	{
		return "IV_fingerprint";
	//    0    0:ldc1            #11  <String "IV_fingerprint">
	//    1    2:areturn         
	}

	public static final String FINGERPRINT_KEY_NAME = "fingerprint";
	private static final String IVSPEC_NAME = "IV_fingerprint";
	private static final int KEY_SIZE = 256;
	private static final String TAG = "FingerprintKey";
}
