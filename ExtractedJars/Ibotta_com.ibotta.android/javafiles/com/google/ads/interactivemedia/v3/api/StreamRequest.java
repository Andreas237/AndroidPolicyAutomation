// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			StreamDisplayContainer

public interface StreamRequest
{

	public abstract Map getAdTagParameters();

	public abstract String getApiKey();

	public abstract String getAssetKey();

	public abstract String getContentSourceId();

	public abstract String getManifestSuffix();

	public abstract StreamDisplayContainer getStreamDisplayContainer();

	public abstract Object getUserRequestContext();

	public abstract String getVideoId();

	public abstract boolean isPrerollRequested();

	public abstract void setAdTagParameters(Map map);

	public abstract void setManifestSuffix(String s);

	public abstract void setPrerollRequested(boolean flag);

	public abstract void setUserRequestContext(Object obj);
}
