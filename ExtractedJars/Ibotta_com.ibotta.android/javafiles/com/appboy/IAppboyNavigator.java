// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.actions.UriAction;

public interface IAppboyNavigator
{

	public abstract void gotoNewsFeed(Context context, NewsfeedAction newsfeedaction);

	public abstract void gotoUri(Context context, UriAction uriaction);
}
