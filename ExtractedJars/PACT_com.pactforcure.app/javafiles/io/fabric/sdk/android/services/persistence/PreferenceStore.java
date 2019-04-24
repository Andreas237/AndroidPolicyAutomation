// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;

public interface PreferenceStore
{

	public abstract android.content.SharedPreferences.Editor edit();

	public abstract SharedPreferences get();

	public abstract boolean save(android.content.SharedPreferences.Editor editor);
}
