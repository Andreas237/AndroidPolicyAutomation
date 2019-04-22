// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.handlers;

import android.content.Context;
import android.view.ViewGroup;
import com.appboy.ui.contentcards.view.ContentCardViewHolder;
import java.util.List;

public interface IContentCardsViewBindingHandler
{

	public abstract int getItemViewType(Context context, List list, int i);

	public abstract void onBindViewHolder(Context context, List list, ContentCardViewHolder contentcardviewholder, int i);

	public abstract ContentCardViewHolder onCreateViewHolder(Context context, List list, ViewGroup viewgroup, int i);
}
