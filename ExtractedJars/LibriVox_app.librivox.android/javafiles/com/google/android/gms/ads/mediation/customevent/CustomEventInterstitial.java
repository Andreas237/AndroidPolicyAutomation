// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.a;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			a, g

public interface CustomEventInterstitial
	extends com.google.android.gms.ads.mediation.customevent.a
{

	public abstract void requestInterstitialAd(Context context, g g, String s, a a1, Bundle bundle);

	public abstract void showInterstitial();
}
