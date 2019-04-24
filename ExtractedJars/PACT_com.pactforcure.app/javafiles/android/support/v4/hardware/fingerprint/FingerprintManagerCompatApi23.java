// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class FingerprintManagerCompatApi23
{
	public static abstract class AuthenticationCallback
	{

		public void onAuthenticationError(int i, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void onAuthenticationFailed()
		{
		//    0    0:return          
		}

		public void onAuthenticationHelp(int i, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void onAuthenticationSucceeded(AuthenticationResultInternal authenticationresultinternal)
		{
		//    0    0:return          
		}

		public AuthenticationCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class AuthenticationResultInternal
	{

		public CryptoObject getCryptoObject()
		{
			return mCryptoObject;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field FingerprintManagerCompatApi23$CryptoObject mCryptoObject>
		//    2    4:areturn         
		}

		private CryptoObject mCryptoObject;

		public AuthenticationResultInternal(CryptoObject cryptoobject)
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

	public static class CryptoObject
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

		public CryptoObject(Signature signature)
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

		public CryptoObject(Cipher cipher)
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

		public CryptoObject(Mac mac)
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


	public FingerprintManagerCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	static void authenticate(Context context, CryptoObject cryptoobject, int i, Object obj, AuthenticationCallback authenticationcallback, Handler handler)
	{
		context = ((Context) (getFingerprintManagerOrNull(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          29
			((FingerprintManager) (context)).authenticate(wrapCryptoObject(cryptoobject), (CancellationSignal)obj, i, wrapCallback(authenticationcallback), handler);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #43  <Method android.hardware.fingerprint.FingerprintManager$CryptoObject wrapCryptoObject(FingerprintManagerCompatApi23$CryptoObject)>
	//    8   14:aload_3         
	//    9   15:checkcast       #45  <Class CancellationSignal>
	//   10   18:iload_2         
	//   11   19:aload           4
	//   12   21:invokestatic    #49  <Method android.hardware.fingerprint.FingerprintManager$AuthenticationCallback wrapCallback(FingerprintManagerCompatApi23$AuthenticationCallback)>
	//   13   24:aload           5
	//   14   26:invokevirtual   #54  <Method void FingerprintManager.authenticate(android.hardware.fingerprint.FingerprintManager$CryptoObject, CancellationSignal, int, android.hardware.fingerprint.FingerprintManager$AuthenticationCallback, Handler)>
	//   15   29:return          
	}

	private static FingerprintManager getFingerprintManagerOrNull(Context context)
	{
		if(context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #61  <Method PackageManager Context.getPackageManager()>
	//*   2    4:ldc1            #63  <String "android.hardware.fingerprint">
	//*   3    6:invokevirtual   #69  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   4    9:ifeq            22
			return (FingerprintManager)context.getSystemService(android/hardware/fingerprint/FingerprintManager);
	//    5   12:aload_0         
	//    6   13:ldc1            #51  <Class FingerprintManager>
	//    7   15:invokevirtual   #73  <Method Object Context.getSystemService(Class)>
	//    8   18:checkcast       #51  <Class FingerprintManager>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	static boolean hasEnrolledFingerprints(Context context)
	{
		context = ((Context) (getFingerprintManagerOrNull(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//    2    4:astore_0        
		return context != null && ((FingerprintManager) (context)).hasEnrolledFingerprints();
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokevirtual   #78  <Method boolean FingerprintManager.hasEnrolledFingerprints()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	static boolean isHardwareDetected(Context context)
	{
		context = ((Context) (getFingerprintManagerOrNull(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//    2    4:astore_0        
		return context != null && ((FingerprintManager) (context)).isHardwareDetected();
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method boolean FingerprintManager.isHardwareDetected()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject)
	{
		if(cryptoobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
		{
			if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #87  <Method Cipher android.hardware.fingerprint.FingerprintManager$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
				return new CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #14  <Class FingerprintManagerCompatApi23$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #87  <Method Cipher android.hardware.fingerprint.FingerprintManager$CryptoObject.getCipher()>
	//   11   21:invokespecial   #90  <Method void FingerprintManagerCompatApi23$CryptoObject(Cipher)>
	//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #94  <Method Signature android.hardware.fingerprint.FingerprintManager$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
				return new CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #14  <Class FingerprintManagerCompatApi23$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #94  <Method Signature android.hardware.fingerprint.FingerprintManager$CryptoObject.getSignature()>
	//   20   40:invokespecial   #97  <Method void FingerprintManagerCompatApi23$CryptoObject(Signature)>
	//   21   43:areturn         
			if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #101 <Method Mac android.hardware.fingerprint.FingerprintManager$CryptoObject.getMac()>
	//*  24   48:ifnull          4
				return new CryptoObject(cryptoobject.getMac());
	//   25   51:new             #14  <Class FingerprintManagerCompatApi23$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #101 <Method Mac android.hardware.fingerprint.FingerprintManager$CryptoObject.getMac()>
	//   29   59:invokespecial   #104 <Method void FingerprintManagerCompatApi23$CryptoObject(Mac)>
	//   30   62:areturn         
		}
		return null;
	}

	private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(AuthenticationCallback authenticationcallback)
	{
		return ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) (new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback(authenticationcallback) {

			public void onAuthenticationError(int i, CharSequence charsequence)
			{
				callback.onAuthenticationError(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompatApi23$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method void FingerprintManagerCompatApi23$AuthenticationCallback.onAuthenticationError(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationFailed()
			{
				callback.onAuthenticationFailed();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompatApi23$AuthenticationCallback val$callback>
			//    2    4:invokevirtual   #28  <Method void FingerprintManagerCompatApi23$AuthenticationCallback.onAuthenticationFailed()>
			//    3    7:return          
			}

			public void onAuthenticationHelp(int i, CharSequence charsequence)
			{
				callback.onAuthenticationHelp(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompatApi23$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #31  <Method void FingerprintManagerCompatApi23$AuthenticationCallback.onAuthenticationHelp(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationresult)
			{
				callback.onAuthenticationSucceeded(new AuthenticationResultInternal(FingerprintManagerCompatApi23.unwrapCryptoObject(authenticationresult.getCryptoObject())));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompatApi23$AuthenticationCallback val$callback>
			//    2    4:new             #35  <Class FingerprintManagerCompatApi23$AuthenticationResultInternal>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokevirtual   #41  <Method android.hardware.fingerprint.FingerprintManager$CryptoObject android.hardware.fingerprint.FingerprintManager$AuthenticationResult.getCryptoObject()>
			//    6   12:invokestatic    #45  <Method FingerprintManagerCompatApi23$CryptoObject FingerprintManagerCompatApi23.access$000(android.hardware.fingerprint.FingerprintManager$CryptoObject)>
			//    7   15:invokespecial   #48  <Method void FingerprintManagerCompatApi23$AuthenticationResultInternal(FingerprintManagerCompatApi23$CryptoObject)>
			//    8   18:invokevirtual   #51  <Method void FingerprintManagerCompatApi23$AuthenticationCallback.onAuthenticationSucceeded(FingerprintManagerCompatApi23$AuthenticationResultInternal)>
			//    9   21:return          
			}

			final AuthenticationCallback val$callback;

			
			{
				callback = authenticationcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FingerprintManagerCompatApi23$AuthenticationCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.hardware.fingerprint.FingerprintManager$AuthenticationCallback()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class FingerprintManagerCompatApi23$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void FingerprintManagerCompatApi23$1(FingerprintManagerCompatApi23$AuthenticationCallback)>
	//    4    8:areturn         
	}

	private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoobject)
	{
		if(cryptoobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
		{
			if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #108 <Method Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
				return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #83  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #108 <Method Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
	//   11   21:invokespecial   #109 <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Cipher)>
	//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #110 <Method Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
				return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #83  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #110 <Method Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
	//   20   40:invokespecial   #111 <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Signature)>
	//   21   43:areturn         
			if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #112 <Method Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
	//*  24   48:ifnull          4
				return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getMac());
	//   25   51:new             #83  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #112 <Method Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
	//   29   59:invokespecial   #113 <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Mac)>
	//   30   62:areturn         
		}
		return null;
	}


/*
	static CryptoObject access$000(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject)
	{
		return unwrapCryptoObject(cryptoobject);
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method FingerprintManagerCompatApi23$CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager$CryptoObject)>
	//    2    4:areturn         
	}

*/
}
