// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.appboy.models.IInAppMessage;

public interface IInAppMessageViewFactory
{

	public abstract View createInAppMessageView(Activity activity, IInAppMessage iinappmessage);
}
