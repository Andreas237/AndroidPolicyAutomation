// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.contentevents;

import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel;
import com.ibotta.android.mvp.base.MvpView;
import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;
import com.ibotta.api.model.RetailerModel;

public interface ContentEventsView
	extends MvpView
{

	public abstract void showContentDetail(ContentId contentid);

	public abstract void showDealDetail(String s);

	public abstract void showEngagement(int i, Integer integer);

	public abstract void showFullScreenImage(String s);

	public abstract void showMcommEscort(McommEscortParamsParcel mcommescortparamsparcel);

	public transient abstract void showOfferSpotlight(Integer integer, Integer integer1, int ai[]);

	public abstract void showProductDetail(String s);

	public abstract void showRetailerGallery(RetailerModel retailermodel, RetailerCategoryParcel retailercategoryparcel);
}
