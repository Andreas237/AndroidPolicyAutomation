// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			AdDisplayContainer

public interface AdsRequest
{

	public abstract AdDisplayContainer getAdDisplayContainer();

	public abstract String getAdTagUrl();

	public abstract String getAdsResponse();

	public abstract ContentProgressProvider getContentProgressProvider();

	public abstract String getExtraParameter(String s);

	public abstract Map getExtraParameters();

	public abstract Object getUserRequestContext();

	public abstract void setAdDisplayContainer(AdDisplayContainer addisplaycontainer);

	public abstract void setAdTagUrl(String s);

	public abstract void setAdWillAutoPlay(boolean flag);

	public abstract void setAdsResponse(String s);

	public abstract void setContentDuration(float f);

	public abstract void setContentKeywords(List list);

	public abstract void setContentProgressProvider(ContentProgressProvider contentprogressprovider);

	public abstract void setContentTitle(String s);

	public abstract void setExtraParameter(String s, String s1);

	public abstract void setUserRequestContext(Object obj);
}
