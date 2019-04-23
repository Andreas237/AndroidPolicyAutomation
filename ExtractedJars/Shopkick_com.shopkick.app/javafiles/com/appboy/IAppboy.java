// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import android.content.Intent;
import com.appboy.events.IEventSubscriber;
import com.appboy.models.outgoing.AppboyProperties;
import java.math.BigDecimal;

// Referenced classes of package com.appboy:
//			IAppboyImageLoader, AppboyUser

public interface IAppboy
{

	public abstract void changeUser(String s);

	public abstract void closeSession(Activity activity);

	public abstract IAppboyImageLoader getAppboyImageLoader();

	public abstract String getAppboyPushMessageRegistrationId();

	public abstract AppboyUser getCurrentUser();

	public abstract String getInstallTrackingId();

	public abstract void logCustomEvent(String s);

	public abstract void logCustomEvent(String s, AppboyProperties appboyproperties);

	public abstract void logFeedCardClick(String s);

	public abstract void logFeedCardImpression(String s);

	public abstract void logFeedDisplayed();

	public abstract void logFeedbackDisplayed();

	public abstract void logPurchase(String s, String s1, BigDecimal bigdecimal);

	public abstract void logPurchase(String s, String s1, BigDecimal bigdecimal, int i);

	public abstract void logPurchase(String s, String s1, BigDecimal bigdecimal, int i, AppboyProperties appboyproperties);

	public abstract void logPurchase(String s, String s1, BigDecimal bigdecimal, AppboyProperties appboyproperties);

	public abstract void logPushDeliveryEvent(String s);

	public abstract void logPushNotificationActionClicked(String s, String s1);

	public abstract void logPushNotificationOpened(Intent intent);

	public abstract void logPushNotificationOpened(String s);

	public abstract void logPushStoryPageClicked(String s, String s1);

	public abstract void openSession(Activity activity);

	public abstract void registerAppboyPushMessages(String s);

	public abstract void removeSingleSubscription(IEventSubscriber ieventsubscriber, Class class1);

	public abstract void requestFeedRefresh();

	public abstract void requestFeedRefreshFromCache();

	public abstract void requestImmediateDataFlush();

	public abstract void setAppboyImageLoader(IAppboyImageLoader iappboyimageloader);

	public abstract void submitFeedback(String s, String s1, boolean flag);

	public abstract void subscribeToFeedUpdates(IEventSubscriber ieventsubscriber);

	public abstract void subscribeToFeedbackRequestEvents(IEventSubscriber ieventsubscriber, IEventSubscriber ieventsubscriber1);

	public abstract void subscribeToNewInAppMessages(IEventSubscriber ieventsubscriber);
}
