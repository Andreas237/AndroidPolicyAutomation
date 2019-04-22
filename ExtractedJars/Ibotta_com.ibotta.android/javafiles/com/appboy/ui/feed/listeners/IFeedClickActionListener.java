// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.feed.listeners;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.ui.actions.IAction;

public interface IFeedClickActionListener
{

	public abstract boolean onFeedCardClicked(Context context, Card card, IAction iaction);
}
