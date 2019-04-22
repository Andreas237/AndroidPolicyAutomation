// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			MediationAdapter, MediationNativeListener, NativeMediationAdRequest

public interface MediationNativeAdapter
	extends MediationAdapter
{

	public abstract void requestNativeAd(Context context, MediationNativeListener mediationnativelistener, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1);
}
