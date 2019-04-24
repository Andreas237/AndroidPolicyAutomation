// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;


// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

static final class FingerprintManagerCompat$1 extends android.hardware.fingerprint.cationCallback
{

	public void onAuthenticationError(int i, CharSequence charsequence)
	{
		val$callback.onAuthenticationError(i, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationError(int, CharSequence)>
	//    5    9:return          
	}

	public void onAuthenticationFailed()
	{
		val$callback.onAuthenticationFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:invokevirtual   #28  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationFailed()>
	//    3    7:return          
	}

	public void onAuthenticationHelp(int i, CharSequence charsequence)
	{
		val$callback.onAuthenticationHelp(i, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationHelp(int, CharSequence)>
	//    5    9:return          
	}

	public void onAuthenticationSucceeded(android.hardware.fingerprint.cationResult cationresult)
	{
		val$callback.onAuthenticationSucceeded(new thenticationResult(FingerprintManagerCompat.access$000(cationresult.getCryptoObject())));
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

	final thenticationCallback val$callback;

	FingerprintManagerCompat$1(thenticationCallback thenticationcallback)
	{
		val$callback = thenticationcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.hardware.fingerprint.FingerprintManager$AuthenticationCallback()>
	//    5    9:return          
	}
}
