// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import com.appboy.models.IInAppMessage;

public interface IInAppMessageViewWrapper
{

	public abstract void close();

	public abstract IInAppMessage getInAppMessage();

	public abstract View getInAppMessageView();

	public abstract boolean getIsAnimatingClose();

	public abstract void open(Activity activity);
}
