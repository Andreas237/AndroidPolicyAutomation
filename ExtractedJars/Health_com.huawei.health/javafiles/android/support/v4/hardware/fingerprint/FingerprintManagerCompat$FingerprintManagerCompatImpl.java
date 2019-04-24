// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.fingerprint;

import android.content.Context;
import android.os.Handler;
import android.support.v4.os.CancellationSignal;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//			FingerprintManagerCompat

static interface FingerprintManagerCompat$FingerprintManagerCompatImpl
{

	public abstract void authenticate(Context context, FingerprintManagerCompat.CryptoObject cryptoobject, int i, CancellationSignal cancellationsignal, FingerprintManagerCompat.AuthenticationCallback authenticationcallback, Handler handler);

	public abstract boolean hasEnrolledFingerprints(Context context);

	public abstract boolean isHardwareDetected(Context context);
}
