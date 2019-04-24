// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.gigya.socialize.android.GigyaException;
import com.gigya.socialize.android.keyStore.BaseKey;
import com.gigya.socialize.android.keyStore.KeyStoreHelper;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.managers:
//			IFingerprintOperation, IFingerprintCallbacks

public class FingerprintOperation
	implements IFingerprintOperation
{
	public static interface FingerprintCallback
	{

		public abstract void onError(Exception exception);

		public abstract void onFingerprintSuccess(BaseKey basekey);
	}


	FingerprintOperation(FingerprintManager fingerprintmanager, FingerprintCallback fingerprintcallback, GigyaFingerprintManager.OperationMode operationmode, final IFingerprintCallbacks callbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mFingerprintManager = fingerprintmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field FingerprintManager mFingerprintManager>
		mFingerprintCallback = fingerprintcallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field FingerprintOperation$FingerprintCallback mFingerprintCallback>
		int i;
		if(operationmode == GigyaFingerprintManager.OperationMode.ENCRYPT)
	//*   8   14:aload_3         
	//*   9   15:getstatic       #45  <Field GigyaFingerprintManager$OperationMode GigyaFingerprintManager$OperationMode.ENCRYPT>
	//*  10   18:if_acmpne       33
			i = 1;
	//   11   21:iconst_1        
	//   12   22:istore          5
		else
	//*  13   24:aload_0         
	//*  14   25:iload           5
	//*  15   27:putfield        #47  <Field int mOperationMode>
	//*  16   30:goto            39
			i = 2;
	//   17   33:iconst_2        
	//   18   34:istore          5
		mOperationMode = i;
	//*  19   36:goto            24
		mCancellationSignal = new CancellationSignal();
	//   20   39:aload_0         
	//   21   40:new             #49  <Class CancellationSignal>
	//   22   43:dup             
	//   23   44:invokespecial   #50  <Method void CancellationSignal()>
	//   24   47:putfield        #52  <Field CancellationSignal mCancellationSignal>
		mCancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

			public void onCancel()
			{
				mCancellationSignal = null;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FingerprintOperation this$0>
			//    2    4:aconst_null     
			//    3    5:invokestatic    #29  <Method CancellationSignal FingerprintOperation.access$002(FingerprintOperation, CancellationSignal)>
			//    4    8:pop             
				callbacks.onCancel();
			//    5    9:aload_0         
			//    6   10:getfield        #20  <Field IFingerprintCallbacks val$callbacks>
			//    7   13:invokeinterface #33  <Method void IFingerprintCallbacks.onCancel()>
			//    8   18:return          
			}

			final FingerprintOperation this$0;
			final IFingerprintCallbacks val$callbacks;

			
			{
				this$0 = FingerprintOperation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FingerprintOperation this$0>
				callbacks = ifingerprintcallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field IFingerprintCallbacks val$callbacks>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   25   50:aload_0         
	//   26   51:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//   27   54:new             #8   <Class FingerprintOperation$1>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:aload           4
	//   31   61:invokespecial   #55  <Method void FingerprintOperation$1(FingerprintOperation, IFingerprintCallbacks)>
	//   32   64:invokevirtual   #59  <Method void CancellationSignal.setOnCancelListener(android.os.CancellationSignal$OnCancelListener)>
	//   33   67:return          
	}

	public void cancel()
	{
		GigyaLog.i("FingerprintOperation", "FingerprintOperation:cancel");
	//    0    0:ldc1            #20  <String "FingerprintOperation">
	//    1    2:ldc1            #71  <String "FingerprintOperation:cancel">
	//    2    4:invokestatic    #77  <Method void GigyaLog.i(String, String)>
		if(mCancellationSignal != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//*   5   11:ifnull          26
		{
			mSelfCancelled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #66  <Field boolean mSelfCancelled>
			mCancellationSignal.cancel();
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//   11   23:invokevirtual   #79  <Method void CancellationSignal.cancel()>
		}
	//   12   26:return          
	}

	protected void run()
	{
		try
		{
			GigyaLog.i("FingerprintOperation", "startFingerprintAuthentication");
	//    0    0:ldc1            #20  <String "FingerprintOperation">
	//    1    2:ldc1            #86  <String "startFingerprintAuthentication">
	//    2    4:invokestatic    #77  <Method void GigyaLog.i(String, String)>
			mSelfCancelled = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #66  <Field boolean mSelfCancelled>
			final BaseKey key = KeyStoreHelper.getInstance().createKey("fingerprint");
	//    6   12:invokestatic    #92  <Method KeyStoreHelper KeyStoreHelper.getInstance()>
	//    7   15:ldc1            #94  <String "fingerprint">
	//    8   17:invokevirtual   #98  <Method BaseKey KeyStoreHelper.createKey(String)>
	//    9   20:astore_1        
			android.hardware.fingerprint.FingerprintManager.CryptoObject cryptoobject = new android.hardware.fingerprint.FingerprintManager.CryptoObject(key.getCipher(mOperationMode));
	//   10   21:new             #100 <Class android.hardware.fingerprint.FingerprintManager$CryptoObject>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #47  <Field int mOperationMode>
	//   15   30:invokevirtual   #106 <Method javax.crypto.Cipher BaseKey.getCipher(int)>
	//   16   33:invokespecial   #109 <Method void android.hardware.fingerprint.FingerprintManager$CryptoObject(javax.crypto.Cipher)>
	//   17   36:astore_2        
			mFingerprintManager.authenticate(cryptoobject, mCancellationSignal, 0, ((android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) (new android.hardware.fingerprint.FingerprintManager.AuthenticationCallback() {

				public void onAuthenticationError(int i, CharSequence charsequence)
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #26  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #27  <Method void StringBuilder()>
				//    3    7:astore_3        
					stringbuilder.append("onAuthenticationError ");
				//    4    8:aload_3         
				//    5    9:ldc1            #29  <String "onAuthenticationError ">
				//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
				//    7   14:pop             
					stringbuilder.append(((Object) (charsequence)));
				//    8   15:aload_3         
				//    9   16:aload_2         
				//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
				//   11   20:pop             
					GigyaLog.i("FingerprintOperation", stringbuilder.toString());
				//   12   21:ldc1            #38  <String "FingerprintOperation">
				//   13   23:aload_3         
				//   14   24:invokevirtual   #42  <Method String StringBuilder.toString()>
				//   15   27:invokestatic    #48  <Method void GigyaLog.i(String, String)>
					if(!mSelfCancelled)
				//*  16   30:aload_0         
				//*  17   31:getfield        #17  <Field FingerprintOperation this$0>
				//*  18   34:invokestatic    #52  <Method boolean FingerprintOperation.access$100(FingerprintOperation)>
				//*  19   37:ifne            65
						mFingerprintCallback.onError(((Exception) (new GigyaException(charsequence.toString()))));
				//   20   40:aload_0         
				//   21   41:getfield        #17  <Field FingerprintOperation this$0>
				//   22   44:invokestatic    #56  <Method FingerprintOperation$FingerprintCallback FingerprintOperation.access$200(FingerprintOperation)>
				//   23   47:new             #58  <Class GigyaException>
				//   24   50:dup             
				//   25   51:aload_2         
				//   26   52:invokeinterface #61  <Method String CharSequence.toString()>
				//   27   57:invokespecial   #64  <Method void GigyaException(String)>
				//   28   60:invokeinterface #70  <Method void FingerprintOperation$FingerprintCallback.onError(Exception)>
				//   29   65:return          
				}

				public void onAuthenticationFailed()
				{
					GigyaLog.i("FingerprintOperation", "onAuthenticationFailed");
				//    0    0:ldc1            #38  <String "FingerprintOperation">
				//    1    2:ldc1            #72  <String "onAuthenticationFailed">
				//    2    4:invokestatic    #48  <Method void GigyaLog.i(String, String)>
					mFingerprintCallback.onError(((Exception) (new GigyaException("Fingerprint not recognized. Try again"))));
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field FingerprintOperation this$0>
				//    5   11:invokestatic    #56  <Method FingerprintOperation$FingerprintCallback FingerprintOperation.access$200(FingerprintOperation)>
				//    6   14:new             #58  <Class GigyaException>
				//    7   17:dup             
				//    8   18:ldc1            #74  <String "Fingerprint not recognized. Try again">
				//    9   20:invokespecial   #64  <Method void GigyaException(String)>
				//   10   23:invokeinterface #70  <Method void FingerprintOperation$FingerprintCallback.onError(Exception)>
				//   11   28:return          
				}

				public void onAuthenticationHelp(int i, CharSequence charsequence)
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #26  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #27  <Method void StringBuilder()>
				//    3    7:astore_3        
					stringbuilder.append("onAuthenticationHelp: ");
				//    4    8:aload_3         
				//    5    9:ldc1            #77  <String "onAuthenticationHelp: ">
				//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
				//    7   14:pop             
					stringbuilder.append(((Object) (charsequence)));
				//    8   15:aload_3         
				//    9   16:aload_2         
				//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(Object)>
				//   11   20:pop             
					GigyaLog.i("FingerprintOperation", stringbuilder.toString());
				//   12   21:ldc1            #38  <String "FingerprintOperation">
				//   13   23:aload_3         
				//   14   24:invokevirtual   #42  <Method String StringBuilder.toString()>
				//   15   27:invokestatic    #48  <Method void GigyaLog.i(String, String)>
					mFingerprintCallback.onError(((Exception) (new GigyaException(charsequence.toString()))));
				//   16   30:aload_0         
				//   17   31:getfield        #17  <Field FingerprintOperation this$0>
				//   18   34:invokestatic    #56  <Method FingerprintOperation$FingerprintCallback FingerprintOperation.access$200(FingerprintOperation)>
				//   19   37:new             #58  <Class GigyaException>
				//   20   40:dup             
				//   21   41:aload_2         
				//   22   42:invokeinterface #61  <Method String CharSequence.toString()>
				//   23   47:invokespecial   #64  <Method void GigyaException(String)>
				//   24   50:invokeinterface #70  <Method void FingerprintOperation$FingerprintCallback.onError(Exception)>
				//   25   55:return          
				}

				public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult authenticationresult)
				{
					GigyaLog.i("FingerprintOperation", "onAuthenticationSucceeded");
				//    0    0:ldc1            #38  <String "FingerprintOperation">
				//    1    2:ldc1            #80  <String "onAuthenticationSucceeded">
				//    2    4:invokestatic    #48  <Method void GigyaLog.i(String, String)>
					mFingerprintCallback.onFingerprintSuccess(key);
				//    3    7:aload_0         
				//    4    8:getfield        #17  <Field FingerprintOperation this$0>
				//    5   11:invokestatic    #56  <Method FingerprintOperation$FingerprintCallback FingerprintOperation.access$200(FingerprintOperation)>
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field BaseKey val$key>
				//    8   18:invokeinterface #84  <Method void FingerprintOperation$FingerprintCallback.onFingerprintSuccess(BaseKey)>
				//    9   23:return          
				}

				final FingerprintOperation this$0;
				final BaseKey val$key;

			
			{
				this$0 = FingerprintOperation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FingerprintOperation this$0>
				key = basekey;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field BaseKey val$key>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void android.hardware.fingerprint.FingerprintManager$AuthenticationCallback()>
			//    8   14:return          
			}
			}
)), ((android.os.Handler) (null)));
	//   18   37:aload_0         
	//   19   38:getfield        #37  <Field FingerprintManager mFingerprintManager>
	//   20   41:aload_2         
	//   21   42:aload_0         
	//   22   43:getfield        #52  <Field CancellationSignal mCancellationSignal>
	//   23   46:iconst_0        
	//   24   47:new             #10  <Class FingerprintOperation$2>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokespecial   #112 <Method void FingerprintOperation$2(FingerprintOperation, BaseKey)>
	//   29   56:aconst_null     
	//   30   57:invokevirtual   #118 <Method void FingerprintManager.authenticate(android.hardware.fingerprint.FingerprintManager$CryptoObject, CancellationSignal, int, android.hardware.fingerprint.FingerprintManager$AuthenticationCallback, android.os.Handler)>
			return;
	//   31   60:return          
		}
		catch(Object obj)
	//*  32   61:astore_1        
		{
			mFingerprintCallback.onError(((Exception) (obj)));
	//   33   62:aload_0         
	//   34   63:getfield        #39  <Field FingerprintOperation$FingerprintCallback mFingerprintCallback>
	//   35   66:aload_1         
	//   36   67:invokeinterface #122 <Method void FingerprintOperation$FingerprintCallback.onError(Exception)>
		}
	//   37   72:return          
	}

	private static final String TAG = "FingerprintOperation";
	private CancellationSignal mCancellationSignal;
	private FingerprintCallback mFingerprintCallback;
	private FingerprintManager mFingerprintManager;
	private int mOperationMode;
	private boolean mSelfCancelled;


/*
	static CancellationSignal access$002(FingerprintOperation fingerprintoperation, CancellationSignal cancellationsignal)
	{
		fingerprintoperation.mCancellationSignal = cancellationsignal;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field CancellationSignal mCancellationSignal>
		return cancellationsignal;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$100(FingerprintOperation fingerprintoperation)
	{
		return fingerprintoperation.mSelfCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean mSelfCancelled>
	//    2    4:ireturn         
	}

*/


/*
	static FingerprintCallback access$200(FingerprintOperation fingerprintoperation)
	{
		return fingerprintoperation.mFingerprintCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field FingerprintOperation$FingerprintCallback mFingerprintCallback>
	//    2    4:areturn         
	}

*/
}
