// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.configuration.AppboyConfigurationProvider;

public interface IAppboyNotificationFactory
{

	public abstract Notification createNotification(AppboyConfigurationProvider appboyconfigurationprovider, Context context, Bundle bundle, Bundle bundle1);
}
