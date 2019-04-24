// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.keyStore;

import android.util.Base64;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GigyaException;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.utils.GSEncryptedPrefs;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;

public abstract class BaseKey
{
	public class KeyException extends GigyaException
	{

		final BaseKey this$0;

		public KeyException(String s, Throwable throwable)
		{
			this$0 = BaseKey.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BaseKey this$0>
			super(s, throwable);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #16  <Method void GigyaException(String, Throwable)>
		//    7   11:return          
		}
	}


	public BaseKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	private Cipher createCipher(String s)
	{
		return Cipher.getInstance(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method Cipher Cipher.getInstance(String)>
	//    2    4:areturn         
	}

	private Cipher getCipherForDecryption()
	{
		byte abyte0[] = getIvParameterSpec();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method byte[] getIvParameterSpec()>
	//    2    4:astore_1        
		mCipher = createCipher(getCipherTransformation());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #43  <Method String getCipherTransformation()>
	//    7   11:invokespecial   #45  <Method Cipher createCipher(String)>
	//    8   14:putfield        #47  <Field Cipher mCipher>
		mCipher.init(2, ((java.security.Key) (mSecretKey)), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte0))));
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field Cipher mCipher>
	//   11   21:iconst_2        
	//   12   22:aload_0         
	//   13   23:getfield        #49  <Field SecretKey mSecretKey>
	//   14   26:new             #51  <Class IvParameterSpec>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokespecial   #54  <Method void IvParameterSpec(byte[])>
	//   18   34:invokevirtual   #58  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		return mCipher;
	//   19   37:aload_0         
	//   20   38:getfield        #47  <Field Cipher mCipher>
	//   21   41:areturn         
	}

	private Cipher getCipherForEncryption()
	{
		mCipher = createCipher(getCipherTransformation());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #43  <Method String getCipherTransformation()>
	//    4    6:invokespecial   #45  <Method Cipher createCipher(String)>
	//    5    9:putfield        #47  <Field Cipher mCipher>
		mCipher.init(1, ((java.security.Key) (mSecretKey)));
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field Cipher mCipher>
	//    8   16:iconst_1        
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field SecretKey mSecretKey>
	//   11   21:invokevirtual   #63  <Method void Cipher.init(int, java.security.Key)>
		saveIvParameterSpec();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #66  <Method void saveIvParameterSpec()>
		return mCipher;
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field Cipher mCipher>
	//   16   32:areturn         
	}

	private byte[] getIvParameterSpec()
	{
		return Base64.decode(GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext()).getString(getIVSpecName(), ((String) (null))), 0);
	//    0    0:invokestatic    #71  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #75  <Method android.content.Context GSAPI.getContext()>
	//    2    6:invokestatic    #80  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(android.content.Context)>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #83  <Method String getIVSpecName()>
	//    5   13:aconst_null     
	//    6   14:invokevirtual   #87  <Method String GSEncryptedPrefs.getString(String, String)>
	//    7   17:iconst_0        
	//    8   18:invokestatic    #93  <Method byte[] Base64.decode(String, int)>
	//    9   21:areturn         
	}

	public abstract String decrypt(String s);

	public abstract String encrypt(String s);

	abstract SecretKey generateKey();

	public Cipher getCipher(int i)
	{
		if(i != 1)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:icmpne          10
		return getCipherForEncryption();
	//    3    5:aload_0         
	//    4    6:invokespecial   #112 <Method Cipher getCipherForEncryption()>
	//    5    9:areturn         
		Cipher cipher = getCipherForDecryption();
	//    6   10:aload_0         
	//    7   11:invokespecial   #114 <Method Cipher getCipherForDecryption()>
	//    8   14:astore_2        
		return cipher;
	//    9   15:aload_2         
	//   10   16:areturn         
_L2:
		Object obj;
		GigyaLog.e("BaseKey", "Error: creating chiper was failed", ((Throwable) (obj)));
	//   11   17:ldc1            #14  <String "BaseKey">
	//   12   19:ldc1            #116 <String "Error: creating chiper was failed">
	//   13   21:aload_2         
	//   14   22:invokestatic    #122 <Method void GigyaLog.e(String, String, Throwable)>
		throw new KeyException("Error: creating chiper was failed", ((Throwable) (obj)));
	//   15   25:new             #6   <Class BaseKey$KeyException>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:ldc1            #116 <String "Error: creating chiper was failed">
	//   19   32:aload_2         
	//   20   33:invokespecial   #125 <Method void BaseKey$KeyException(BaseKey, String, Throwable)>
	//   21   36:athrow          
		obj;
	//   22   37:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  23   38:goto            17
	}

	abstract String getCipherTransformation();

	abstract String getIVSpecName();

	void saveIvParameterSpec()
	{
		byte abyte0[] = ((IvParameterSpec)mCipher.getParameters().getParameterSpec(javax/crypto/spec/IvParameterSpec)).getIV();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Cipher mCipher>
	//    2    4:invokevirtual   #129 <Method AlgorithmParameters Cipher.getParameters()>
	//    3    7:ldc1            #51  <Class IvParameterSpec>
	//    4    9:invokevirtual   #135 <Method java.security.spec.AlgorithmParameterSpec AlgorithmParameters.getParameterSpec(Class)>
	//    5   12:checkcast       #51  <Class IvParameterSpec>
	//    6   15:invokevirtual   #138 <Method byte[] IvParameterSpec.getIV()>
	//    7   18:astore_1        
		GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext()).setString(getIVSpecName(), Base64.encodeToString(abyte0, 0));
	//    8   19:invokestatic    #71  <Method GSAPI GSAPI.getInstance()>
	//    9   22:invokevirtual   #75  <Method android.content.Context GSAPI.getContext()>
	//   10   25:invokestatic    #80  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(android.content.Context)>
	//   11   28:aload_0         
	//   12   29:invokevirtual   #83  <Method String getIVSpecName()>
	//   13   32:aload_1         
	//   14   33:iconst_0        
	//   15   34:invokestatic    #142 <Method String Base64.encodeToString(byte[], int)>
	//   16   37:invokevirtual   #146 <Method void GSEncryptedPrefs.setString(String, String)>
	//   17   40:return          
	}

	public void setSecretKey(SecretKey secretkey)
	{
		mSecretKey = secretkey;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field SecretKey mSecretKey>
	//    3    5:return          
	}

	protected static final String ANDROID_KEY_STORE = "AndroidKeyStore";
	private static final String TAG = "BaseKey";
	Cipher mCipher;
	private SecretKey mSecretKey;
}
