// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;
import java.util.Collection;

public interface BaseDisplayContainer
{

	public abstract ViewGroup getAdContainer();

	public abstract Collection getCompanionSlots();

	public abstract void setAdContainer(ViewGroup viewgroup);

	public abstract void setCompanionSlots(Collection collection);
}
