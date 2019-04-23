// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.Bundle;

public interface APSMediaPlayerTrackingEventListener
{

	public abstract void onTrackingEventReceived(com.appscend.media.APSMediaTrackingEvents.MediaEventType mediaeventtype, Bundle bundle);
}
