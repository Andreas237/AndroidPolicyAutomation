// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsRequest

public interface SettingsSpiCall
{

	public abstract JSONObject invoke(SettingsRequest settingsrequest);
}
