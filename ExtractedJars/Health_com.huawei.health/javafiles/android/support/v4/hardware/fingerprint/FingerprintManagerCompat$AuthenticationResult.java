// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;


// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

public static final class FingerprintManagerCompat$AuthenticationResult
{

	public FingerprintManagerCompat.CryptoObject getCryptoObject()
	{
		return mCryptoObject;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field FingerprintManagerCompat$CryptoObject mCryptoObject>
	//    2    4:areturn         
	}

	private FingerprintManagerCompat.CryptoObject mCryptoObject;

	public FingerprintManagerCompat$AuthenticationResult(FingerprintManagerCompat.CryptoObject cryptoobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mCryptoObject = cryptoobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field FingerprintManagerCompat$CryptoObject mCryptoObject>
	//    5    9:return          
	}
}
