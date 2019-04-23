// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			b, e, a

public interface MediationInterstitialAdapter
	extends b
{

	public abstract void requestInterstitialAd(Context context, e e, Bundle bundle, a a, Bundle bundle1);

	public abstract void showInterstitial();
}
