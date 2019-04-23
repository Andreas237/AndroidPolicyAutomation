// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appscend.hub.KRAdapter;
import com.appscend.media.events.APSMediaOverlay;

public abstract class APSMediaPlayerOverlayController
	implements KRAdapter
{

	public APSMediaPlayerOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public abstract void addViewToContainer(ViewGroup viewgroup);

	public abstract float getAlpha();

	public abstract View getView();

	public abstract void hideOverlay();

	public abstract void load(Context context);

	public void refresh(Context context, ViewGroup viewgroup)
	{
	//    0    0:return          
	}

	public APSMediaOverlay overlay;
}
