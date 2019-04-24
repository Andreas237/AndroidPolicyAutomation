// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import com.gigya.socialize.android.keyStore.BaseKey;

// Referenced classes of package com.gigya.socialize.android.managers:
//			FingerprintOperation

public static interface FingerprintOperation$FingerprintCallback
{

	public abstract void onError(Exception exception);

	public abstract void onFingerprintSuccess(BaseKey basekey);
}
