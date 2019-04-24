// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat, FingerprintManagerCompatApi23

private static class FingerprintManagerCompat$Api23FingerprintManagerCompatImpl
	implements FingerprintManagerCompat.FingerprintManagerCompatImpl
{

	static FingerprintManagerCompat.CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoobject)
	{
		if(cryptoobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
		{
			if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #27  <Method javax.crypto.Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
				return new FingerprintManagerCompat.CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #29  <Class FingerprintManagerCompat$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #27  <Method javax.crypto.Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
	//   11   21:invokespecial   #32  <Method void FingerprintManagerCompat$CryptoObject(javax.crypto.Cipher)>
	//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #36  <Method java.security.Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
				return new FingerprintManagerCompat.CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #29  <Class FingerprintManagerCompat$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #36  <Method java.security.Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
	//   20   40:invokespecial   #39  <Method void FingerprintManagerCompat$CryptoObject(java.security.Signature)>
	//   21   43:areturn         
			if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #43  <Method javax.crypto.Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
	//*  24   48:ifnull          4
				return new FingerprintManagerCompat.CryptoObject(cryptoobject.getMac());
	//   25   51:new             #29  <Class FingerprintManagerCompat$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #43  <Method javax.crypto.Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
	//   29   59:invokespecial   #46  <Method void FingerprintManagerCompat$CryptoObject(javax.crypto.Mac)>
	//   30   62:areturn         
		}
		return null;
	}

	private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(FingerprintManagerCompat.AuthenticationCallback authenticationcallback)
	{
		return ((FingerprintManagerCompatApi23.AuthenticationCallback) (new FingerprintManagerCompatApi23.AuthenticationCallback(authenticationcallback) {

			public void onAuthenticationError(int i, CharSequence charsequence)
			{
				callback.onAuthenticationError(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #28  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationError(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationFailed()
			{
				callback.onAuthenticationFailed();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:invokevirtual   #31  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationFailed()>
			//    3    7:return          
			}

			public void onAuthenticationHelp(int i, CharSequence charsequence)
			{
				callback.onAuthenticationHelp(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #34  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationHelp(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationresultinternal)
			{
				callback.onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationresultinternal.getCryptoObject())));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:new             #38  <Class FingerprintManagerCompat$AuthenticationResult>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokevirtual   #44  <Method FingerprintManagerCompatApi23$CryptoObject FingerprintManagerCompatApi23$AuthenticationResultInternal.getCryptoObject()>
			//    6   12:invokestatic    #48  <Method FingerprintManagerCompat$CryptoObject FingerprintManagerCompat$Api23FingerprintManagerCompatImpl.unwrapCryptoObject(FingerprintManagerCompatApi23$CryptoObject)>
			//    7   15:invokespecial   #51  <Method void FingerprintManagerCompat$AuthenticationResult(FingerprintManagerCompat$CryptoObject)>
			//    8   18:invokevirtual   #54  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationSucceeded(FingerprintManagerCompat$AuthenticationResult)>
			//    9   21:return          
			}

			final FingerprintManagerCompat.AuthenticationCallback val$callback;

			
			{
				callback = authenticationcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void FingerprintManagerCompatApi23$AuthenticationCallback()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #11  <Class FingerprintManagerCompat$Api23FingerprintManagerCompatImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method void FingerprintManagerCompat$Api23FingerprintManagerCompatImpl$1(FingerprintManagerCompat$AuthenticationCallback)>
	//    4    8:areturn         
	}

	private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(FingerprintManagerCompat.CryptoObject cryptoobject)
	{
		if(cryptoobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
		{
			if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #54  <Method javax.crypto.Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #23  <Class FingerprintManagerCompatApi23$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #54  <Method javax.crypto.Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
	//   11   21:invokespecial   #55  <Method void FingerprintManagerCompatApi23$CryptoObject(javax.crypto.Cipher)>
	//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #56  <Method java.security.Signature FingerprintManagerCompat$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #23  <Class FingerprintManagerCompatApi23$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #56  <Method java.security.Signature FingerprintManagerCompat$CryptoObject.getSignature()>
	//   20   40:invokespecial   #57  <Method void FingerprintManagerCompatApi23$CryptoObject(java.security.Signature)>
	//   21   43:areturn         
			if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #58  <Method javax.crypto.Mac FingerprintManagerCompat$CryptoObject.getMac()>
	//*  24   48:ifnull          4
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getMac());
	//   25   51:new             #23  <Class FingerprintManagerCompatApi23$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #58  <Method javax.crypto.Mac FingerprintManagerCompat$CryptoObject.getMac()>
	//   29   59:invokespecial   #59  <Method void FingerprintManagerCompatApi23$CryptoObject(javax.crypto.Mac)>
	//   30   62:areturn         
		}
		return null;
	}

	public void authenticate(Context context, FingerprintManagerCompat.CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, FingerprintManagerCompat.AuthenticationCallback authenticationcallback, Handler handler)
	{
		FingerprintManagerCompatApi23.CryptoObject cryptoobject1 = wrapCryptoObject(cryptoobject);
	//    0    0:aload_2         
	//    1    1:invokestatic    #63  <Method FingerprintManagerCompatApi23$CryptoObject wrapCryptoObject(FingerprintManagerCompat$CryptoObject)>
	//    2    4:astore          7
		if(cancellationsignal != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          33
			cryptoobject = ((FingerprintManagerCompat.CryptoObject) (cancellationsignal.getCancellationSignalObject()));
	//    5   11:aload           4
	//    6   13:invokevirtual   #69  <Method Object CancellationSignal.getCancellationSignalObject()>
	//    7   16:astore_2        
		else
	//*   8   17:aload_1         
	//*   9   18:aload           7
	//*  10   20:iload_3         
	//*  11   21:aload_2         
	//*  12   22:aload           5
	//*  13   24:invokestatic    #71  <Method FingerprintManagerCompatApi23$AuthenticationCallback wrapCallback(FingerprintManagerCompat$AuthenticationCallback)>
	//*  14   27:aload           6
	//*  15   29:invokestatic    #76  <Method void FingerprintManagerCompatApi23.authenticate(Context, FingerprintManagerCompatApi23$CryptoObject, int, Object, FingerprintManagerCompatApi23$AuthenticationCallback, Handler)>
	//*  16   32:return          
			cryptoobject = null;
	//   17   33:aconst_null     
	//   18   34:astore_2        
		FingerprintManagerCompatApi23.authenticate(context, cryptoobject1, i, ((Object) (cryptoobject)), wrapCallback(authenticationcallback), handler);
	//*  19   35:goto            17
	}

	public boolean hasEnrolledFingerprints(Context context)
	{
		return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #80  <Method boolean FingerprintManagerCompatApi23.hasEnrolledFingerprints(Context)>
	//    2    4:ireturn         
	}

	public boolean isHardwareDetected(Context context)
	{
		return FingerprintManagerCompatApi23.isHardwareDetected(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method boolean FingerprintManagerCompatApi23.isHardwareDetected(Context)>
	//    2    4:ireturn         
	}

	public FingerprintManagerCompat$Api23FingerprintManagerCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
