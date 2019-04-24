// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;


// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompatApi23

public static final class FingerprintManagerCompatApi23$AuthenticationResultInternal
{

	public FingerprintManagerCompatApi23.CryptoObject getCryptoObject()
	{
		return mCryptoObject;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field FingerprintManagerCompatApi23$CryptoObject mCryptoObject>
	//    2    4:areturn         
	}

	private FingerprintManagerCompatApi23.CryptoObject mCryptoObject;

	public FingerprintManagerCompatApi23$AuthenticationResultInternal(FingerprintManagerCompatApi23.CryptoObject cryptoobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mCryptoObject = cryptoobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field FingerprintManagerCompatApi23$CryptoObject mCryptoObject>
	//    5    9:return          
	}
}
