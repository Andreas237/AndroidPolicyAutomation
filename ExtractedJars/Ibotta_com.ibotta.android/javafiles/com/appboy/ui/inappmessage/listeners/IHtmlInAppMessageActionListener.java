// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.models.IInAppMessage;

public interface IHtmlInAppMessageActionListener
{

	public abstract void onCloseClicked(IInAppMessage iinappmessage, String s, Bundle bundle);

	public abstract boolean onCustomEventFired(IInAppMessage iinappmessage, String s, Bundle bundle);

	public abstract boolean onNewsfeedClicked(IInAppMessage iinappmessage, String s, Bundle bundle);

	public abstract boolean onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle);
}
