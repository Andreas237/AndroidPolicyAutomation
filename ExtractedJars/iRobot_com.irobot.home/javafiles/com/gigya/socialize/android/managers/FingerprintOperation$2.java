// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import com.gigya.socialize.android.GigyaException;
import com.gigya.socialize.android.keyStore.BaseKey;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.managers:
//			FingerprintOperation

class FingerprintOperation$2 extends android.hardware.fingerprint.enticationCallback
{

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
		if(!FingerprintOperation.access$100(FingerprintOperation.this))
	//*  16   30:aload_0         
	//*  17   31:getfield        #17  <Field FingerprintOperation this$0>
	//*  18   34:invokestatic    #52  <Method boolean FingerprintOperation.access$100(FingerprintOperation)>
	//*  19   37:ifne            65
			FingerprintOperation.access$200(FingerprintOperation.this).onError(((Exception) (new GigyaException(charsequence.toString()))));
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
		FingerprintOperation.access$200(FingerprintOperation.this).onError(((Exception) (new GigyaException("Fingerprint not recognized. Try again"))));
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
		FingerprintOperation.access$200(FingerprintOperation.this).onError(((Exception) (new GigyaException(charsequence.toString()))));
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

	public void onAuthenticationSucceeded(android.hardware.fingerprint.enticationResult enticationresult)
	{
		GigyaLog.i("FingerprintOperation", "onAuthenticationSucceeded");
	//    0    0:ldc1            #38  <String "FingerprintOperation">
	//    1    2:ldc1            #80  <String "onAuthenticationSucceeded">
	//    2    4:invokestatic    #48  <Method void GigyaLog.i(String, String)>
		FingerprintOperation.access$200(FingerprintOperation.this).onFingerprintSuccess(val$key);
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

	FingerprintOperation$2()
	{
		this$0 = final_fingerprintoperation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FingerprintOperation this$0>
		val$key = BaseKey.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field BaseKey val$key>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void android.hardware.fingerprint.FingerprintManager$AuthenticationCallback()>
	//    8   14:return          
	}
}
