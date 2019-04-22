// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAd

public abstract class NativeAppInstallAd extends NativeAd
{
	public static interface OnAppInstallAdLoadedListener
	{

		public abstract void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad);
	}


	public NativeAppInstallAd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void NativeAd()>
	//    2    4:return          
	}

	public abstract void destroy();

	public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

	public abstract CharSequence getBody();

	public abstract CharSequence getCallToAction();

	public abstract Bundle getExtras();

	public abstract CharSequence getHeadline();

	public abstract NativeAd.Image getIcon();

	public abstract List getImages();

	public abstract CharSequence getMediationAdapterClassName();

	public abstract CharSequence getPrice();

	public abstract Double getStarRating();

	public abstract CharSequence getStore();

	public abstract VideoController getVideoController();

	public static final String ASSET_ATTRIBUTION_ICON_IMAGE = "2009";
	public static final String ASSET_BODY = "2004";
	public static final String ASSET_CALL_TO_ACTION = "2002";
	public static final String ASSET_HEADLINE = "2001";
	public static final String ASSET_ICON = "2003";
	public static final String ASSET_IMAGE = "2007";
	public static final String ASSET_MEDIA_VIDEO = "2011";
	public static final String ASSET_PRICE = "2006";
	public static final String ASSET_STAR_RATING = "2008";
	public static final String ASSET_STORE = "2005";
}
