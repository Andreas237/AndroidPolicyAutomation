// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEvent, CustomEventNativeListener

public interface CustomEventNative
	extends CustomEvent
{

	public abstract void requestNativeAd(Context context, CustomEventNativeListener customeventnativelistener, String s, NativeMediationAdRequest nativemediationadrequest, Bundle bundle);
}
