// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.reward.mediation:
//			MediationRewardedVideoAdAdapter, a

public interface InitializableMediationRewardedVideoAdAdapter
	extends MediationRewardedVideoAdAdapter
{

	public abstract void initialize(Context context, a a, List list);
}
