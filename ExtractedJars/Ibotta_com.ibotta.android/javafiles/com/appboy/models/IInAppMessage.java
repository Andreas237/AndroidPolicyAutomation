// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.enums.inappmessage.*;
import java.util.Map;

// Referenced classes of package com.appboy.models:
//			IPutIntoJson

public interface IInAppMessage
	extends IPutIntoJson
{

	public abstract boolean getAnimateIn();

	public abstract boolean getAnimateOut();

	public abstract int getBackgroundColor();

	public abstract Bitmap getBitmap();

	public abstract ClickAction getClickAction();

	public abstract CropType getCropType();

	public abstract DismissType getDismissType();

	public abstract int getDurationInMilliseconds();

	public abstract long getExpirationTimestamp();

	public abstract Map getExtras();

	public abstract String getIcon();

	public abstract int getIconBackgroundColor();

	public abstract int getIconColor();

	public abstract boolean getImageDownloadSuccessful();

	public abstract String getImageUrl();

	public abstract String getLocalImageUrl();

	public abstract String getMessage();

	public abstract TextAlign getMessageTextAlign();

	public abstract int getMessageTextColor();

	public abstract boolean getOpenUriInWebView();

	public abstract Orientation getOrientation();

	public abstract String getRemoteAssetPathForPrefetch();

	public abstract String getRemoteImageUrl();

	public abstract Uri getUri();

	public abstract boolean isControl();

	public abstract boolean logClick();

	public abstract boolean logDisplayFailure(InAppMessageFailureType inappmessagefailuretype);

	public abstract boolean logImpression();

	public abstract void onAfterClosed();

	public abstract void setAnimateIn(boolean flag);

	public abstract void setAnimateOut(boolean flag);

	public abstract void setBackgroundColor(int i);

	public abstract void setBitmap(Bitmap bitmap);

	public abstract boolean setClickAction(ClickAction clickaction);

	public abstract boolean setClickAction(ClickAction clickaction, Uri uri);

	public abstract void setCropType(CropType croptype);

	public abstract void setDismissType(DismissType dismisstype);

	public abstract void setDurationInMilliseconds(int i);

	public abstract void setExpirationTimestamp(long l);

	public abstract void setIcon(String s);

	public abstract void setIconBackgroundColor(int i);

	public abstract void setIconColor(int i);

	public abstract void setImageDownloadSuccessful(boolean flag);

	public abstract void setImageUrl(String s);

	public abstract void setLocalAssetPathForPrefetch(String s);

	public abstract void setLocalImageUrl(String s);

	public abstract void setMessage(String s);

	public abstract void setMessageTextAlign(TextAlign textalign);

	public abstract void setMessageTextColor(int i);

	public abstract void setOpenUriInWebView(boolean flag);

	public abstract void setOrientation(Orientation orientation);

	public abstract void setRemoteImageUrl(String s);
}
