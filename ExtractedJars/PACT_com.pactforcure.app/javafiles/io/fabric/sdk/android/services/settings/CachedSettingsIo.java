// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import org.json.JSONObject;

public interface CachedSettingsIo
{

	public abstract JSONObject readCachedSettings();

	public abstract void writeCachedSettings(long l, JSONObject jsonobject);
}
