// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login;

import android.support.v4.app.FragmentActivity;
import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android.login:
//			ProviderSelection

public static interface ProviderSelection$ProviderSelectionHandler
{

	public abstract void onCancel(ProviderSelection providerselection, FragmentActivity fragmentactivity);

	public abstract void onError(ProviderSelection providerselection, FragmentActivity fragmentactivity, GSObject gsobject);

	public abstract void onSelect(ProviderSelection providerselection, FragmentActivity fragmentactivity, String s, String s1);

	public abstract void onShow(ProviderSelection providerselection, FragmentActivity fragmentactivity);
}
