// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar;

import okhttp3.CookieJar;

public interface ClearableCookieJar
	extends CookieJar
{

	public abstract void clear();

	public abstract void clearSession();
}
