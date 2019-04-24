// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;


// Referenced classes of package com.gigya.socialize.android.managers:
//			FingerprintOperation, IFingerprintCallbacks

class FingerprintOperation$1
	implements android.os.ncelListener
{

	public void onCancel()
	{
		FingerprintOperation.access$002(FingerprintOperation.this, ((android.os.CancellationSignal) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FingerprintOperation this$0>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #29  <Method android.os.CancellationSignal FingerprintOperation.access$002(FingerprintOperation, android.os.CancellationSignal)>
	//    4    8:pop             
		val$callbacks.onCancel();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field IFingerprintCallbacks val$callbacks>
	//    7   13:invokeinterface #33  <Method void IFingerprintCallbacks.onCancel()>
	//    8   18:return          
	}

	final FingerprintOperation this$0;
	final IFingerprintCallbacks val$callbacks;

	FingerprintOperation$1()
	{
		this$0 = final_fingerprintoperation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field FingerprintOperation this$0>
		val$callbacks = IFingerprintCallbacks.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field IFingerprintCallbacks val$callbacks>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
