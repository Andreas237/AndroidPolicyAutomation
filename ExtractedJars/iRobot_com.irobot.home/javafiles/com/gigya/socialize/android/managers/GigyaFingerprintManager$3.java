// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import com.gigya.socialize.android.keyStore.BaseKey;

// Referenced classes of package com.gigya.socialize.android.managers:
//			GigyaFingerprintManager, IFingerprintCallbacks, SessionManager

class GigyaFingerprintManager$3
	implements rprintCallback
{

	public void onError(Exception exception)
	{
		val$response.onError(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IFingerprintCallbacks val$response>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method void IFingerprintCallbacks.onError(Exception)>
	//    4   10:return          
	}

	public void onFingerprintSuccess(BaseKey basekey)
	{
		GigyaFingerprintManager.access$000(GigyaFingerprintManager.this).loadFingerprintSession(basekey, ((com.gigya.socialize.android.ICallback) (val$response)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GigyaFingerprintManager this$0>
	//    2    4:invokestatic    #37  <Method SessionManager GigyaFingerprintManager.access$000(GigyaFingerprintManager)>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field IFingerprintCallbacks val$response>
	//    6   12:invokevirtual   #43  <Method void SessionManager.loadFingerprintSession(BaseKey, com.gigya.socialize.android.ICallback)>
	//    7   15:return          
	}

	final GigyaFingerprintManager this$0;
	final IFingerprintCallbacks val$response;

	GigyaFingerprintManager$3()
	{
		this$0 = final_gigyafingerprintmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GigyaFingerprintManager this$0>
		val$response = IFingerprintCallbacks.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field IFingerprintCallbacks val$response>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
