// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAd

public abstract class NativeContentAd extends NativeAd
{
	public static interface OnContentAdLoadedListener
	{

		public abstract void onContentAdLoaded(NativeContentAd nativecontentad);
	}


	public NativeContentAd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void NativeAd()>
	//    2    4:return          
	}

	public abstract void destroy();

	public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

	public abstract CharSequence getAdvertiser();

	public abstract CharSequence getBody();

	public abstract CharSequence getCallToAction();

	public abstract Bundle getExtras();

	public abstract CharSequence getHeadline();

	public abstract List getImages();

	public abstract NativeAd.Image getLogo();

	public abstract CharSequence getMediationAdapterClassName();

	public abstract VideoController getVideoController();

	public static final String ASSET_ADVERTISER = "1004";
	public static final String ASSET_ATTRIBUTION_ICON_IMAGE = "1007";
	public static final String ASSET_BODY = "1002";
	public static final String ASSET_CALL_TO_ACTION = "1003";
	public static final String ASSET_HEADLINE = "1001";
	public static final String ASSET_IMAGE = "1005";
	public static final String ASSET_LOGO = "1006";
	public static final String ASSET_MEDIA_VIDEO = "1009";
}
