// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.digits.sdk.android:
//			ActivityLifecycle

public interface DigitsActivityDelegate
	extends ActivityLifecycle
{

	public abstract int getLayoutId();

	public abstract void init(Activity activity, Bundle bundle);

	public abstract boolean isValid(Bundle bundle);
}
