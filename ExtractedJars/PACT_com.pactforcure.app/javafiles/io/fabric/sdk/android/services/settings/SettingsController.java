// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


// Referenced classes of package io.fabric.sdk.android.services.settings:
//			SettingsData, SettingsCacheBehavior

public interface SettingsController
{

	public abstract SettingsData loadSettingsData();

	public abstract SettingsData loadSettingsData(SettingsCacheBehavior settingscachebehavior);
}
