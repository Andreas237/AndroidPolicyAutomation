// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class FingerprintManagerCompat
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

		public void onAuthenticationSucceeded(AuthenticationResult authenticationresult)
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

	public static final class AuthenticationResult
	{

		public CryptoObject getCryptoObject()
		{
			return mCryptoObject;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field FingerprintManagerCompat$CryptoObject mCryptoObject>
		//    2    4:areturn         
		}

		private final CryptoObject mCryptoObject;

		public AuthenticationResult(CryptoObject cryptoobject)
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

	public static class CryptoObject
	{

		public Cipher getCipher()
		{
			return mCipher;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Cipher mCipher>
		//    2    4:areturn         
		}

		public Mac getMac()
		{
			return mMac;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Mac mMac>
		//    2    4:areturn         
		}

		public Signature getSignature()
		{
			return mSignature;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Signature mSignature>
		//    2    4:areturn         
		}

		private final Cipher mCipher;
		private final Mac mMac;
		private final Signature mSignature;

		public CryptoObject(Signature signature)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mSignature = signature;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Signature mSignature>
			mCipher = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field Cipher mCipher>
			mMac = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #25  <Field Mac mMac>
		//   11   19:return          
		}

		public CryptoObject(Cipher cipher)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mCipher = cipher;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Cipher mCipher>
			mSignature = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #21  <Field Signature mSignature>
			mMac = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #25  <Field Mac mMac>
		//   11   19:return          
		}

		public CryptoObject(Mac mac)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mMac = mac;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field Mac mMac>
			mCipher = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #23  <Field Cipher mCipher>
			mSignature = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #21  <Field Signature mSignature>
		//   11   19:return          
		}
	}


	private FingerprintManagerCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Context mContext>
	//    5    9:return          
	}

	public static FingerprintManagerCompat from(Context context)
	{
		return new FingerprintManagerCompat(context);
	//    0    0:new             #2   <Class FingerprintManagerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void FingerprintManagerCompat(Context)>
	//    4    8:areturn         
	}

	private static FingerprintManager getFingerprintManagerOrNull(Context context)
	{
		if(context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method PackageManager Context.getPackageManager()>
	//*   2    4:ldc1            #51  <String "android.hardware.fingerprint">
	//*   3    6:invokevirtual   #57  <Method boolean PackageManager.hasSystemFeature(String)>
	//*   4    9:ifeq            22
			return (FingerprintManager)context.getSystemService(android/hardware/fingerprint/FingerprintManager);
	//    5   12:aload_0         
	//    6   13:ldc1            #59  <Class FingerprintManager>
	//    7   15:invokevirtual   #63  <Method Object Context.getSystemService(Class)>
	//    8   18:checkcast       #59  <Class FingerprintManager>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	private static CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject)
	{
		if(cryptoobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #69  <Method Cipher android.hardware.fingerprint.FingerprintManager$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
			return new CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #14  <Class FingerprintManagerCompat$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #69  <Method Cipher android.hardware.fingerprint.FingerprintManager$CryptoObject.getCipher()>
	//   11   21:invokespecial   #72  <Method void FingerprintManagerCompat$CryptoObject(Cipher)>
	//   12   24:areturn         
		if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #76  <Method Signature android.hardware.fingerprint.FingerprintManager$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
			return new CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #14  <Class FingerprintManagerCompat$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #76  <Method Signature android.hardware.fingerprint.FingerprintManager$CryptoObject.getSignature()>
	//   20   40:invokespecial   #79  <Method void FingerprintManagerCompat$CryptoObject(Signature)>
	//   21   43:areturn         
		if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #83  <Method Mac android.hardware.fingerprint.FingerprintManager$CryptoObject.getMac()>
	//*  24   48:ifnull          63
			return new CryptoObject(cryptoobject.getMac());
	//   25   51:new             #14  <Class FingerprintManagerCompat$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #83  <Method Mac android.hardware.fingerprint.FingerprintManager$CryptoObject.getMac()>
	//   29   59:invokespecial   #86  <Method void FingerprintManagerCompat$CryptoObject(Mac)>
	//   30   62:areturn         
		else
			return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
	}

	private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(AuthenticationCallback authenticationcallback)
	{
		return ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) (new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback(authenticationcallback) {

			public void onAuthenticationError(int i, CharSequence charsequence)
			{
				callback.onAuthenticationError(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationError(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationFailed()
			{
				callback.onAuthenticationFailed();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:invokevirtual   #28  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationFailed()>
			//    3    7:return          
			}

			public void onAuthenticationHelp(int i, CharSequence charsequence)
			{
				callback.onAuthenticationHelp(i, charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #31  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationHelp(int, CharSequence)>
			//    5    9:return          
			}

			public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationresult)
			{
				callback.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(authenticationresult.getCryptoObject())));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
			//    2    4:new             #35  <Class FingerprintManagerCompat$AuthenticationResult>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokevirtual   #41  <Method android.hardware.fingerprint.FingerprintManager$CryptoObject android.hardware.fingerprint.FingerprintManager$AuthenticationResult.getCryptoObject()>
			//    6   12:invokestatic    #45  <Method FingerprintManagerCompat$CryptoObject FingerprintManagerCompat.access$000(android.hardware.fingerprint.FingerprintManager$CryptoObject)>
			//    7   15:invokespecial   #48  <Method void FingerprintManagerCompat$AuthenticationResult(FingerprintManagerCompat$CryptoObject)>
			//    8   18:invokevirtual   #51  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationSucceeded(FingerprintManagerCompat$AuthenticationResult)>
			//    9   21:return          
			}

			final AuthenticationCallback val$callback;

			
			{
				callback = authenticationcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.hardware.fingerprint.FingerprintManager$AuthenticationCallback()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class FingerprintManagerCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #91  <Method void FingerprintManagerCompat$1(FingerprintManagerCompat$AuthenticationCallback)>
	//    4    8:areturn         
	}

	private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoobject)
	{
		if(cryptoobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(cryptoobject.getCipher() != null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #94  <Method Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
	//*   6   10:ifnull          25
			return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getCipher());
	//    7   13:new             #65  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #94  <Method Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
	//   11   21:invokespecial   #95  <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Cipher)>
	//   12   24:areturn         
		if(cryptoobject.getSignature() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #96  <Method Signature FingerprintManagerCompat$CryptoObject.getSignature()>
	//*  15   29:ifnull          44
			return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getSignature());
	//   16   32:new             #65  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokevirtual   #96  <Method Signature FingerprintManagerCompat$CryptoObject.getSignature()>
	//   20   40:invokespecial   #97  <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Signature)>
	//   21   43:areturn         
		if(cryptoobject.getMac() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #98  <Method Mac FingerprintManagerCompat$CryptoObject.getMac()>
	//*  24   48:ifnull          63
			return new android.hardware.fingerprint.FingerprintManager.CryptoObject(cryptoobject.getMac());
	//   25   51:new             #65  <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokevirtual   #98  <Method Mac FingerprintManagerCompat$CryptoObject.getMac()>
	//   29   59:invokespecial   #99  <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(Mac)>
	//   30   62:areturn         
		else
			return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
	}

	public void authenticate(CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, AuthenticationCallback authenticationcallback, Handler handler)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #109 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          60
		{
			FingerprintManager fingerprintmanager = getFingerprintManagerOrNull(mContext);
	//    3    8:aload_0         
	//    4    9:getfield        #24  <Field Context mContext>
	//    5   12:invokestatic    #111 <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//    6   15:astore          6
			if(fingerprintmanager != null)
	//*   7   17:aload           6
	//*   8   19:ifnull          60
			{
				if(cancellationsignal != null)
	//*   9   22:aload_3         
	//*  10   23:ifnull          37
					cancellationsignal = ((CancellationSignal) ((android.os.CancellationSignal)cancellationsignal.getCancellationSignalObject()));
	//   11   26:aload_3         
	//   12   27:invokevirtual   #117 <Method Object CancellationSignal.getCancellationSignalObject()>
	//   13   30:checkcast       #119 <Class android.os.CancellationSignal>
	//   14   33:astore_3        
				else
	//*  15   34:goto            42
					cancellationsignal = null;
	//   16   37:aconst_null     
	//   17   38:astore_3        
	//*  18   39:goto            34
				fingerprintmanager.authenticate(wrapCryptoObject(cryptoobject), ((android.os.CancellationSignal) (cancellationsignal)), i, wrapCallback(authenticationcallback), handler);
	//   19   42:aload           6
	//   20   44:aload_1         
	//   21   45:invokestatic    #121 <Method android.hardware.fingerprint.FingerprintManager$CryptoObject wrapCryptoObject(FingerprintManagerCompat$CryptoObject)>
	//   22   48:aload_3         
	//   23   49:iload_2         
	//   24   50:aload           4
	//   25   52:invokestatic    #123 <Method android.hardware.fingerprint.FingerprintManager$AuthenticationCallback wrapCallback(FingerprintManagerCompat$AuthenticationCallback)>
	//   26   55:aload           5
	//   27   57:invokevirtual   #126 <Method void FingerprintManager.authenticate(android.hardware.fingerprint.FingerprintManager$CryptoObject, android.os.CancellationSignal, int, android.hardware.fingerprint.FingerprintManager$AuthenticationCallback, Handler)>
			}
		}
	//   28   60:return          
	}

	public boolean hasEnrolledFingerprints()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #109 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		if(i >= 23)
	//*   4    6:iload_1         
	//*   5    7:bipush          23
	//*   6    9:icmplt          42
		{
			FingerprintManager fingerprintmanager = getFingerprintManagerOrNull(mContext);
	//    7   12:aload_0         
	//    8   13:getfield        #24  <Field Context mContext>
	//    9   16:invokestatic    #111 <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//   10   19:astore          4
			boolean flag = flag1;
	//   11   21:iload_3         
	//   12   22:istore_2        
			if(fingerprintmanager != null)
	//*  13   23:aload           4
	//*  14   25:ifnull          40
			{
				flag = flag1;
	//   15   28:iload_3         
	//   16   29:istore_2        
				if(fingerprintmanager.hasEnrolledFingerprints())
	//*  17   30:aload           4
	//*  18   32:invokevirtual   #130 <Method boolean FingerprintManager.hasEnrolledFingerprints()>
	//*  19   35:ifeq            40
					flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_2        
			}
			return flag;
	//   22   40:iload_2         
	//   23   41:ireturn         
		} else
		{
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		}
	}

	public boolean isHardwareDetected()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #109 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		if(i >= 23)
	//*   4    6:iload_1         
	//*   5    7:bipush          23
	//*   6    9:icmplt          42
		{
			FingerprintManager fingerprintmanager = getFingerprintManagerOrNull(mContext);
	//    7   12:aload_0         
	//    8   13:getfield        #24  <Field Context mContext>
	//    9   16:invokestatic    #111 <Method FingerprintManager getFingerprintManagerOrNull(Context)>
	//   10   19:astore          4
			boolean flag = flag1;
	//   11   21:iload_3         
	//   12   22:istore_2        
			if(fingerprintmanager != null)
	//*  13   23:aload           4
	//*  14   25:ifnull          40
			{
				flag = flag1;
	//   15   28:iload_3         
	//   16   29:istore_2        
				if(fingerprintmanager.isHardwareDetected())
	//*  17   30:aload           4
	//*  18   32:invokevirtual   #133 <Method boolean FingerprintManager.isHardwareDetected()>
	//*  19   35:ifeq            40
					flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_2        
			}
			return flag;
	//   22   40:iload_2         
	//   23   41:ireturn         
		} else
		{
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		}
	}

	private final Context mContext;


/*
	static CryptoObject access$000(android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject)
	{
		return unwrapCryptoObject(cryptoobject);
	//    0    0:aload_0         
	//    1    1:invokestatic    #30  <Method FingerprintManagerCompat$CryptoObject unwrapCryptoObject(android.hardware.fingerprint.FingerprintManager$CryptoObject)>
	//    2    4:areturn         
	}

*/
}
