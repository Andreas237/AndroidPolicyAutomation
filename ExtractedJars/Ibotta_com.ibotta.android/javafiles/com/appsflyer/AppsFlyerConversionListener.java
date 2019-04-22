// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import java.util.Map;

public interface AppsFlyerConversionListener
{

	public abstract void onAppOpenAttribution(Map map);

	public abstract void onAttributionFailure(String s);

	public abstract void onInstallConversionDataLoaded(Map map);

	public abstract void onInstallConversionFailure(String s);
}
