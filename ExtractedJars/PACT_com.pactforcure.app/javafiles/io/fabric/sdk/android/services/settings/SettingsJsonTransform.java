// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsData

public interface SettingsJsonTransform
{

	public abstract SettingsData buildFromJson(CurrentTimeProvider currenttimeprovider, JSONObject jsonobject)
		throws JSONException;

	public abstract JSONObject toJson(SettingsData settingsdata)
		throws JSONException;
}
