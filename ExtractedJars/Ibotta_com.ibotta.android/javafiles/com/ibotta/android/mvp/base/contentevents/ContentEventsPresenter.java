// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.contentevents;

import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.api.model.ContentModel;
import com.ibotta.api.model.RetailerModel;
import com.ibotta.api.model.favorites.FavoriteRetailersManager;

public interface ContentEventsPresenter
	extends MvpPresenter
{

	public abstract void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel);

	public abstract void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel, RetailerCategoryParcel retailercategoryparcel);

	public abstract void onContentImageCardClicked(ContentModel contentmodel, RetailerModel retailermodel, boolean flag);

	public abstract void onFavoriteClicked(int i, FavoriteRetailersManager favoriteretailersmanager);

	public abstract void onFavoriteClicked(ContentId contentid, FavoriteRetailersManager favoriteretailersmanager);

	public abstract void onFavoriteClicked(RetailerModel retailermodel, FavoriteRetailersManager favoriteretailersmanager);

	public abstract void onMcommEscort(McommEscortParamsParcel mcommescortparamsparcel);

	public abstract void onModalCloseClicked();

	public abstract void onModalTopSpacingClicked();

	public abstract void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel);

	public abstract void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel, EventContext eventcontext, String s);

	public abstract void onUnlockClicked(ContentModel contentmodel, RetailerModel retailermodel);

	public abstract void onUnlockedClicked(ContentModel contentmodel, RetailerModel retailermodel);

	public abstract void setRetailerCategoryId(Integer integer);
}
