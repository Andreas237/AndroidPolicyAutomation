// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompatApi23

public final class FingerprintManagerCompat
{
	static class Api23FingerprintManagerCompatImpl
		implements FingerprintManagerCompatImpl
	{

		static CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoobject)
		{
			if(cryptoobject == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			if(cryptoobject.getCipher() != null)
		//*   4    6:aload_0         
		//*   5    7:invokevirtual   #24  <Method Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
		//*   6   10:ifnull          25
				return new CryptoObject(cryptoobject.getCipher());
		//    7   13:new             #26  <Class FingerprintManagerCompat$CryptoObject>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:invokevirtual   #24  <Method Cipher FingerprintManagerCompatApi23$CryptoObject.getCipher()>
		//   11   21:invokespecial   #29  <Method void FingerprintManagerCompat$CryptoObject(Cipher)>
		//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #33  <Method Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
		//*  15   29:ifnull          44
				return new CryptoObject(cryptoobject.getSignature());
		//   16   32:new             #26  <Class FingerprintManagerCompat$CryptoObject>
		//   17   35:dup             
		//   18   36:aload_0         
		//   19   37:invokevirtual   #33  <Method Signature FingerprintManagerCompatApi23$CryptoObject.getSignature()>
		//   20   40:invokespecial   #36  <Method void FingerprintManagerCompat$CryptoObject(Signature)>
		//   21   43:areturn         
			if(cryptoobject.getMac() != null)
		//*  22   44:aload_0         
		//*  23   45:invokevirtual   #40  <Method Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
		//*  24   48:ifnull          63
				return new CryptoObject(cryptoobject.getMac());
		//   25   51:new             #26  <Class FingerprintManagerCompat$CryptoObject>
		//   26   54:dup             
		//   27   55:aload_0         
		//   28   56:invokevirtual   #40  <Method Mac FingerprintManagerCompatApi23$CryptoObject.getMac()>
		//   29   59:invokespecial   #43  <Method void FingerprintManagerCompat$CryptoObject(Mac)>
		//   30   62:areturn         
			else
				return null;
		//   31   63:aconst_null     
		//   32   64:areturn         
		}

		private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(AuthenticationCallback authenticationcallback)
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
					callback.onAuthenticationSucceeded(new AuthenticationResult(Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationresultinternal.getCryptoObject())));
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

				final AuthenticationCallback val$callback;

			
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
		//    3    5:invokespecial   #48  <Method void FingerprintManagerCompat$Api23FingerprintManagerCompatImpl$1(FingerprintManagerCompat$AuthenticationCallback)>
		//    4    8:areturn         
		}

		private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(CryptoObject cryptoobject)
		{
			if(cryptoobject == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			if(cryptoobject.getCipher() != null)
		//*   4    6:aload_0         
		//*   5    7:invokevirtual   #51  <Method Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
		//*   6   10:ifnull          25
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getCipher());
		//    7   13:new             #20  <Class FingerprintManagerCompatApi23$CryptoObject>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:invokevirtual   #51  <Method Cipher FingerprintManagerCompat$CryptoObject.getCipher()>
		//   11   21:invokespecial   #52  <Method void FingerprintManagerCompatApi23$CryptoObject(Cipher)>
		//   12   24:areturn         
			if(cryptoobject.getSignature() != null)
		//*  13   25:aload_0         
		//*  14   26:invokevirtual   #53  <Method Signature FingerprintManagerCompat$CryptoObject.getSignature()>
		//*  15   29:ifnull          44
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getSignature());
		//   16   32:new             #20  <Class FingerprintManagerCompatApi23$CryptoObject>
		//   17   35:dup             
		//   18   36:aload_0         
		//   19   37:invokevirtual   #53  <Method Signature FingerprintManagerCompat$CryptoObject.getSignature()>
		//   20   40:invokespecial   #54  <Method void FingerprintManagerCompatApi23$CryptoObject(Signature)>
		//   21   43:areturn         
			if(cryptoobject.getMac() != null)
		//*  22   44:aload_0         
		//*  23   45:invokevirtual   #55  <Method Mac FingerprintManagerCompat$CryptoObject.getMac()>
		//*  24   48:ifnull          63
				return new FingerprintManagerCompatApi23.CryptoObject(cryptoobject.getMac());
		//   25   51:new             #20  <Class FingerprintManagerCompatApi23$CryptoObject>
		//   26   54:dup             
		//   27   55:aload_0         
		//   28   56:invokevirtual   #55  <Method Mac FingerprintManagerCompat$CryptoObject.getMac()>
		//   29   59:invokespecial   #56  <Method void FingerprintManagerCompatApi23$CryptoObject(Mac)>
		//   30   62:areturn         
			else
				return null;
		//   31   63:aconst_null     
		//   32   64:areturn         
		}

		public void authenticate(Context context, CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, AuthenticationCallback authenticationcallback, Handler handler)
		{
			FingerprintManagerCompatApi23.CryptoObject cryptoobject1 = wrapCryptoObject(cryptoobject);
		//    0    0:aload_2         
		//    1    1:invokestatic    #60  <Method FingerprintManagerCompatApi23$CryptoObject wrapCryptoObject(FingerprintManagerCompat$CryptoObject)>
		//    2    4:astore          7
			if(cancellationsignal != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          20
				cryptoobject = ((CryptoObject) (cancellationsignal.getCancellationSignalObject()));
		//    5   11:aload           4
		//    6   13:invokevirtual   #66  <Method Object CancellationSignal.getCancellationSignalObject()>
		//    7   16:astore_2        
			else
		//*   8   17:goto            22
				cryptoobject = null;
		//    9   20:aconst_null     
		//   10   21:astore_2        
			FingerprintManagerCompatApi23.authenticate(context, cryptoobject1, i, ((Object) (cryptoobject)), wrapCallback(authenticationcallback), handler);
		//   11   22:aload_1         
		//   12   23:aload           7
		//   13   25:iload_3         
		//   14   26:aload_2         
		//   15   27:aload           5
		//   16   29:invokestatic    #68  <Method FingerprintManagerCompatApi23$AuthenticationCallback wrapCallback(FingerprintManagerCompat$AuthenticationCallback)>
		//   17   32:aload           6
		//   18   34:invokestatic    #73  <Method void FingerprintManagerCompatApi23.authenticate(Context, FingerprintManagerCompatApi23$CryptoObject, int, Object, FingerprintManagerCompatApi23$AuthenticationCallback, Handler)>
		//   19   37:return          
		}

		public boolean hasEnrolledFingerprints(Context context)
		{
			return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
		//    0    0:aload_1         
		//    1    1:invokestatic    #77  <Method boolean FingerprintManagerCompatApi23.hasEnrolledFingerprints(Context)>
		//    2    4:ireturn         
		}

		public boolean isHardwareDetected(Context context)
		{
			return FingerprintManagerCompatApi23.isHardwareDetected(context);
		//    0    0:aload_1         
		//    1    1:invokestatic    #80  <Method boolean FingerprintManagerCompatApi23.isHardwareDetected(Context)>
		//    2    4:ireturn         
		}

		public Api23FingerprintManagerCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

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

		private CryptoObject mCryptoObject;

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

	static interface FingerprintManagerCompatImpl
	{

		public abstract void authenticate(Context context, CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, AuthenticationCallback authenticationcallback, Handler handler);

		public abstract boolean hasEnrolledFingerprints(Context context);

		public abstract boolean isHardwareDetected(Context context);
	}

	static class LegacyFingerprintManagerCompatImpl
		implements FingerprintManagerCompatImpl
	{

		public void authenticate(Context context, CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, AuthenticationCallback authenticationcallback, Handler handler)
		{
		//    0    0:return          
		}

		public boolean hasEnrolledFingerprints(Context context)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isHardwareDetected(Context context)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public LegacyFingerprintManagerCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private FingerprintManagerCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field Context mContext>
	//    5    9:return          
	}

	public static FingerprintManagerCompat from(Context context)
	{
		return new FingerprintManagerCompat(context);
	//    0    0:new             #2   <Class FingerprintManagerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method void FingerprintManagerCompat(Context)>
	//    4    8:areturn         
	}

	public void authenticate(CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, AuthenticationCallback authenticationcallback, Handler handler)
	{
		IMPL.authenticate(mContext, cryptoobject, i, cancellationsignal, authenticationcallback, handler);
	//    0    0:getstatic       #41  <Field FingerprintManagerCompat$FingerprintManagerCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #47  <Field Context mContext>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload           5
	//    8   14:invokeinterface #58  <Method void FingerprintManagerCompat$FingerprintManagerCompatImpl.authenticate(Context, FingerprintManagerCompat$CryptoObject, int, CancellationSignal, FingerprintManagerCompat$AuthenticationCallback, Handler)>
	//    9   19:return          
	}

	public boolean hasEnrolledFingerprints()
	{
		return IMPL.hasEnrolledFingerprints(mContext);
	//    0    0:getstatic       #41  <Field FingerprintManagerCompat$FingerprintManagerCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #47  <Field Context mContext>
	//    3    7:invokeinterface #64  <Method boolean FingerprintManagerCompat$FingerprintManagerCompatImpl.hasEnrolledFingerprints(Context)>
	//    4   12:ireturn         
	}

	public boolean isHardwareDetected()
	{
		return IMPL.isHardwareDetected(mContext);
	//    0    0:getstatic       #41  <Field FingerprintManagerCompat$FingerprintManagerCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #47  <Field Context mContext>
	//    3    7:invokeinterface #67  <Method boolean FingerprintManagerCompat$FingerprintManagerCompatImpl.isHardwareDetected(Context)>
	//    4   12:ireturn         
	}

	static final FingerprintManagerCompatImpl IMPL;
	private Context mContext;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			IMPL = ((FingerprintManagerCompatImpl) (new Api23FingerprintManagerCompatImpl()));
	//    3    8:new             #6   <Class FingerprintManagerCompat$Api23FingerprintManagerCompatImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #39  <Method void FingerprintManagerCompat$Api23FingerprintManagerCompatImpl()>
	//    6   15:putstatic       #41  <Field FingerprintManagerCompat$FingerprintManagerCompatImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((FingerprintManagerCompatImpl) (new LegacyFingerprintManagerCompatImpl()));
	//    8   19:new             #23  <Class FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #42  <Method void FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl()>
	//   11   26:putstatic       #41  <Field FingerprintManagerCompat$FingerprintManagerCompatImpl IMPL>
	//*  12   29:return          
	}
}
