// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


// Referenced classes of package com.digits.sdk.android:
//			DigitsException, DigitsSession

public interface AuthCallback
{

	public abstract void failure(DigitsException digitsexception);

	public abstract void success(DigitsSession digitssession, String s);
}
