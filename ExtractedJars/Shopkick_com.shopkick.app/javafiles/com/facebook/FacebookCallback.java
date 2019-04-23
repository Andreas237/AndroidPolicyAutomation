// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookException

public interface FacebookCallback
{

	public abstract void onCancel();

	public abstract void onError(FacebookException facebookexception);

	public abstract void onSuccess(Object obj);
}
