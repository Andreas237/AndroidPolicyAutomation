// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoController;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.formats:
//			MediaView

public interface NativeCustomTemplateAd
{
	public static interface OnCustomClickListener
	{

		public abstract void onCustomClick(NativeCustomTemplateAd nativecustomtemplatead, String s);
	}

	public static interface OnCustomTemplateAdLoadedListener
	{

		public abstract void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativecustomtemplatead);
	}


	public abstract void destroy();

	public abstract List getAvailableAssetNames();

	public abstract String getCustomTemplateId();

	public abstract NativeAd.Image getImage(String s);

	public abstract CharSequence getText(String s);

	public abstract VideoController getVideoController();

	public abstract MediaView getVideoMediaView();

	public abstract void performClick(String s);

	public abstract void recordImpression();

	public static final String ASSET_NAME_VIDEO = "_videoMediaView";
}
