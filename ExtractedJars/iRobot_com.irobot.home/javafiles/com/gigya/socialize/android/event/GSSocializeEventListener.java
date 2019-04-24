// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import com.gigya.socialize.GSObject;

public interface GSSocializeEventListener
{

	public abstract void onConnectionAdded(String s, GSObject gsobject, Object obj);

	public abstract void onConnectionRemoved(String s, Object obj);

	public abstract void onLogin(String s, GSObject gsobject, Object obj);

	public abstract void onLogout(Object obj);
}
