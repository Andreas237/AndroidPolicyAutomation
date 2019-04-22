// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.activity.CompatSupplier;
import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.fragment.retailer.RetailerParcel;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import java.util.List;

public interface MvpView
	extends CompatSupplier
{

	public abstract void finish();

	public abstract EventContext getEventContext();

	public abstract boolean isEmpty(String s);

	public abstract void runAsync(Runnable runnable);

	public abstract void setSubtitle(CharSequence charsequence);

	public abstract void setTitle(CharSequence charsequence);

	public abstract void showAccount();

	public abstract void showFeatured();

	public abstract void showFindRebates();

	public abstract void showIbottaInGooglePlayStore();

	public abstract void showMyRebates();

	public abstract void showNetworkConnectionErrorDialog();

	public abstract void showPwiFlow(RetailerParcel retailerparcel, ContentId contentid);

	public abstract void showRedeem();

	public abstract void showRedeem(RetailerParcel retailerparcel, List list);

	public abstract void showRedeemLoyaltyReceipt(RetailerParcel retailerparcel, List list);

	public abstract void showUnknownErrorMessage();

	public abstract void showUnlockAnimation();

	public abstract void showUnlockAnimation(android.content.DialogInterface.OnCancelListener oncancellistener, android.content.DialogInterface.OnDismissListener ondismisslistener);
}
