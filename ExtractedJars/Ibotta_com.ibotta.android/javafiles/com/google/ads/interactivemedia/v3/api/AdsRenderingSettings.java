// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

public interface AdsRenderingSettings
{

	public abstract int getBitrateKbps();

	public abstract boolean getEnablePreloading();

	public abstract List getMimeTypes();

	public abstract boolean isRenderCompanions();

	public abstract void setBitrateKbps(int i);

	public abstract void setEnablePreloading(boolean flag);

	public abstract void setMimeTypes(List list);

	public abstract void setPlayAdsAfterTime(double d);

	public abstract void setRenderCompanions(boolean flag);

	public abstract void setUiElements(Set set);
}
