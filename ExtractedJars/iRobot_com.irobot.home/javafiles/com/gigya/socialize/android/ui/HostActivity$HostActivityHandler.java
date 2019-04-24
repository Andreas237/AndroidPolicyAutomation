// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.gigya.socialize.android.ui:
//			HostActivity

public static interface HostActivity$HostActivityHandler
{

	public abstract void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent);

	public abstract void onCancel(FragmentActivity fragmentactivity);

	public abstract void onCreate(FragmentActivity fragmentactivity, Bundle bundle);

	public abstract void onResume(FragmentActivity fragmentactivity);

	public abstract void onStart(FragmentActivity fragmentactivity);
}
