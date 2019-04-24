// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

public static class FingerprintManagerCompat$CryptoObject
{

	public Cipher getCipher()
	{
		return mCipher;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Cipher mCipher>
	//    2    4:areturn         
	}

	public Mac getMac()
	{
		return mMac;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Mac mMac>
	//    2    4:areturn         
	}

	public Signature getSignature()
	{
		return mSignature;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Signature mSignature>
	//    2    4:areturn         
	}

	private final Cipher mCipher;
	private final Mac mMac;
	private final Signature mSignature;

	public FingerprintManagerCompat$CryptoObject(Signature signature)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mSignature = signature;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Signature mSignature>
		mCipher = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field Cipher mCipher>
		mMac = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field Mac mMac>
	//   11   19:return          
	}

	public FingerprintManagerCompat$CryptoObject(Cipher cipher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mCipher = cipher;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Cipher mCipher>
		mSignature = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field Signature mSignature>
		mMac = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field Mac mMac>
	//   11   19:return          
	}

	public FingerprintManagerCompat$CryptoObject(Mac mac)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mMac = mac;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Mac mMac>
		mCipher = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field Cipher mCipher>
		mSignature = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field Signature mSignature>
	//   11   19:return          
	}
}
