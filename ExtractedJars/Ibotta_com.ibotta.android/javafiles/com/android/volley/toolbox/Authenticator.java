// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;

public interface Authenticator
{

	public abstract String getAuthToken()
		throws AuthFailureError;

	public abstract void invalidateAuthToken(String s);
}
