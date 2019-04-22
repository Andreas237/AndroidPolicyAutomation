// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import java.util.List;

public abstract class UnifiedNativeAd
{
	public static interface OnUnifiedNativeAdLoadedListener
	{

		public abstract void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiednativead);
	}

	public static interface UnconfirmedClickListener
	{

		public abstract void onUnconfirmedClickCancelled();

		public abstract void onUnconfirmedClickReceived(String s);
	}


	public UnifiedNativeAd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public abstract void cancelUnconfirmedClick();

	public abstract void destroy();

	public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

	public abstract String getAdvertiser();

	public abstract String getBody();

	public abstract String getCallToAction();

	public abstract Bundle getExtras();

	public abstract String getHeadline();

	public abstract NativeAd.Image getIcon();

	public abstract List getImages();

	public abstract String getMediationAdapterClassName();

	public abstract String getPrice();

	public abstract Double getStarRating();

	public abstract String getStore();

	public abstract VideoController getVideoController();

	public abstract void performClick(Bundle bundle);

	public abstract boolean recordImpression(Bundle bundle);

	public abstract void reportTouchEvent(Bundle bundle);

	public abstract void setUnconfirmedClickListener(UnconfirmedClickListener unconfirmedclicklistener);

	protected abstract Object zzbe();

	public abstract Object zzbh();
}
