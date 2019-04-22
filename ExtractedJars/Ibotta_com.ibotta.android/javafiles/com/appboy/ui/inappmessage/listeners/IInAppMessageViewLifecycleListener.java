// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.view.View;
import com.appboy.models.*;
import com.appboy.ui.inappmessage.InAppMessageCloser;

public interface IInAppMessageViewLifecycleListener
{

	public abstract void afterClosed(IInAppMessage iinappmessage);

	public abstract void afterOpened(View view, IInAppMessage iinappmessage);

	public abstract void beforeClosed(View view, IInAppMessage iinappmessage);

	public abstract void beforeOpened(View view, IInAppMessage iinappmessage);

	public abstract void onButtonClicked(InAppMessageCloser inappmessagecloser, MessageButton messagebutton, IInAppMessageImmersive iinappmessageimmersive);

	public abstract void onClicked(InAppMessageCloser inappmessagecloser, View view, IInAppMessage iinappmessage);

	public abstract void onDismissed(View view, IInAppMessage iinappmessage);
}
