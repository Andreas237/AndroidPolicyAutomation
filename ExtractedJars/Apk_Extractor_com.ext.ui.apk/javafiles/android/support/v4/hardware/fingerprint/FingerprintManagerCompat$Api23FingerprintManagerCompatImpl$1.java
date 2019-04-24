// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;


// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

static final class FingerprintManagerCompat$Api23FingerprintManagerCompatImpl$1 extends FingerprintManagerCompatApi23.AuthenticationCallback
{

	public void onAuthenticationError(int i, CharSequence charsequence)
	{
		val$callback.onAuthenticationError(i, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #28  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationError(int, CharSequence)>
	//    5    9:return          
	}

	public void onAuthenticationFailed()
	{
		val$callback.onAuthenticationFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:invokevirtual   #31  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationFailed()>
	//    3    7:return          
	}

	public void onAuthenticationHelp(int i, CharSequence charsequence)
	{
		val$callback.onAuthenticationHelp(i, charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #34  <Method void FingerprintManagerCompat$AuthenticationCallback.onAuthenticationHelp(int, CharSequence)>
	//    5    9:return          
	}

	public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationresultinternal)
	{
		val$callback.onAuthenticationSucceeded(new FingerprintManagerCompat.AuthenticationResult(FingerprintManagerCompat.Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationresultinternal.getCryptoObject())));
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

	FingerprintManagerCompat$Api23FingerprintManagerCompatImpl$1(FingerprintManagerCompat.AuthenticationCallback authenticationcallback)
	{
		val$callback = authenticationcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field FingerprintManagerCompat$AuthenticationCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void FingerprintManagerCompatApi23$AuthenticationCallback()>
	//    5    9:return          
	}
}
