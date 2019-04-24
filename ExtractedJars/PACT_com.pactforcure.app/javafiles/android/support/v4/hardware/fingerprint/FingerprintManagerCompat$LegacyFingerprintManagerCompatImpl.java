// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

private static class FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl
	implements FingerprintManagerCompat.FingerprintManagerCompatImpl
{

	public void authenticate(Context context, FingerprintManagerCompat.CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, FingerprintManagerCompat.AuthenticationCallback authenticationcallback, Handler handler)
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

	public FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
