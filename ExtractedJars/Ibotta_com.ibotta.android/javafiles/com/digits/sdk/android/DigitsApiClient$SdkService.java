// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.Callback;

// Referenced classes of package com.digits.sdk.android:
//			DigitsApiClient

protected static interface DigitsApiClient$SdkService
{

	public abstract void account(String s, String s1, Callback callback);

	public abstract void auth(String s, String s1, Callback callback);

	public abstract void login(String s, long l, String s1, Callback callback);

	public abstract void verifyPin(String s, long l, String s1, Callback callback);
}
