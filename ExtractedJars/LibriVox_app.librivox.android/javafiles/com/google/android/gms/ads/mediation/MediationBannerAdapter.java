// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.f;

// Referenced classes of package com.google.android.gms.ads.mediation:
//			b, d, a

public interface MediationBannerAdapter
	extends b
{

	public abstract View getBannerView();

	public abstract void requestBannerAd(Context context, d d, Bundle bundle, f f, a a, Bundle bundle1);
}
