// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			AccessToken

public interface LoginStatusCallback
{

	public abstract void onCompleted(AccessToken accesstoken);

	public abstract void onError(Exception exception);

	public abstract void onFailure();
}
