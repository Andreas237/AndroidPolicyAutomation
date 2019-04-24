// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;


// Referenced classes of package com.startapp.android.publish.ads.banner:
//			BannerListener

public interface BannerInterface
{

	public abstract void hideBanner();

	public abstract void setBannerListener(BannerListener bannerlistener);

	public abstract void showBanner();
}
