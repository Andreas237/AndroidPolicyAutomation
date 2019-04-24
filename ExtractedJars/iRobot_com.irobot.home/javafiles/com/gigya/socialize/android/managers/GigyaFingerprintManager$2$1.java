// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import com.gigya.socialize.android.GigyaException;
import com.gigya.socialize.android.ICallback;
import com.gigya.socialize.android.keyStore.BaseKey;
import com.gigya.socialize.android.keyStore.KeyStoreHelper;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.managers:
//			IFingerprintCallbacks, GigyaFingerprintManager, SessionManager

class GigyaFingerprintManager$2$1
	implements ICallback
{

	public void onError(Exception exception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("optIn:onError: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #29  <String "optIn:onError: ">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(exception.getMessage());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #39  <Method String Exception.getMessage()>
	//   11   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		GigyaLog.e("GigyaFingerprintManager", stringbuilder.toString());
	//   13   24:ldc1            #41  <String "GigyaFingerprintManager">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #50  <Method void GigyaLog.e(String, String)>
		val$response.onError(exception);
	//   17   33:aload_0         
	//   18   34:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
	//   19   37:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
	//   20   40:aload_1         
	//   21   41:invokeinterface #58  <Method void IFingerprintCallbacks.onError(Exception)>
	//   22   46:return          
	}

	public volatile void onError(Throwable throwable)
	{
		onError((Exception)throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Exception>
	//    3    5:invokevirtual   #60  <Method void onError(Exception)>
	//    4    8:return          
	}

	public void onSuccess()
	{
		GigyaLog.d("GigyaFingerprintManager", "optIn:onSuccess");
	//    0    0:ldc1            #41  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #65  <String "optIn:onSuccess">
	//    2    4:invokestatic    #68  <Method void GigyaLog.d(String, String)>
		try
		{
			KeyStoreHelper.getInstance().deleteKey("fingerprint");
	//    3    7:invokestatic    #74  <Method KeyStoreHelper KeyStoreHelper.getInstance()>
	//    4   10:ldc1            #76  <String "fingerprint">
	//    5   12:invokevirtual   #80  <Method void KeyStoreHelper.deleteKey(String)>
			val$response.onSuccess();
	//    6   15:aload_0         
	//    7   16:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
	//    8   19:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
	//    9   22:invokeinterface #82  <Method void IFingerprintCallbacks.onSuccess()>
			return;
	//   10   27:return          
		}
		catch(com.gigya.socialize.android.keyStore.rException rexception)
	//*  11   28:astore_1        
		{
			GigyaLog.e("GigyaFingerprintManager", "Error: delete key operation was failed", ((Throwable) (rexception)));
	//   12   29:ldc1            #41  <String "GigyaFingerprintManager">
	//   13   31:ldc1            #84  <String "Error: delete key operation was failed">
	//   14   33:aload_1         
	//   15   34:invokestatic    #87  <Method void GigyaLog.e(String, String, Throwable)>
			val$response.onError(((Exception) (new GigyaException("Error: delete key operation was failed", ((Throwable) (rexception))))));
	//   16   37:aload_0         
	//   17   38:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
	//   18   41:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
	//   19   44:new             #89  <Class GigyaException>
	//   20   47:dup             
	//   21   48:ldc1            #84  <String "Error: delete key operation was failed">
	//   22   50:aload_1         
	//   23   51:invokespecial   #92  <Method void GigyaException(String, Throwable)>
	//   24   54:invokeinterface #58  <Method void IFingerprintCallbacks.onError(Exception)>
			return;
	//   25   59:return          
		}
	}

	final GigyaFingerprintManager._cls2 this$1;

	GigyaFingerprintManager$2$1()
	{
		this$1 = GigyaFingerprintManager._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GigyaFingerprintManager$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/gigya/socialize/android/managers/GigyaFingerprintManager$2

/* anonymous class */
	class GigyaFingerprintManager._cls2
		implements FingerprintOperation.FingerprintCallback
	{

		public void onError(Exception exception)
		{
			response.onError(exception);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field IFingerprintCallbacks val$response>
		//    2    4:aload_1         
		//    3    5:invokeinterface #33  <Method void IFingerprintCallbacks.onError(Exception)>
		//    4   10:return          
		}

		public void onFingerprintSuccess(BaseKey basekey)
		{
			GigyaFingerprintManager.access$000(GigyaFingerprintManager.this).fingerprintOptOut(((ICallback) (new GigyaFingerprintManager._cls2._cls1())));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field GigyaFingerprintManager this$0>
		//    2    4:invokestatic    #39  <Method SessionManager GigyaFingerprintManager.access$000(GigyaFingerprintManager)>
		//    3    7:new             #13  <Class GigyaFingerprintManager$2$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #42  <Method void GigyaFingerprintManager$2$1(GigyaFingerprintManager$2)>
		//    7   15:invokevirtual   #48  <Method void SessionManager.fingerprintOptOut(ICallback)>
		//    8   18:return          
		}

		final GigyaFingerprintManager this$0;
		final IFingerprintCallbacks val$response;

			
			{
				this$0 = final_gigyafingerprintmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GigyaFingerprintManager this$0>
				response = IFingerprintCallbacks.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field IFingerprintCallbacks val$response>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
