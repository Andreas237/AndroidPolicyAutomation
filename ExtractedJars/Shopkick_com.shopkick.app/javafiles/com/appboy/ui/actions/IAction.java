// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.actions;

import android.content.Context;
import com.appboy.enums.Channel;

public interface IAction
{

	public abstract void execute(Context context);

	public abstract Channel getChannel();
}
