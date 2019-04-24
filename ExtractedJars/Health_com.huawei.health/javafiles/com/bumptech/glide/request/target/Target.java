// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide.request.target:
//			SizeReadyCallback

public interface Target
	extends LifecycleListener
{

	public abstract Request getRequest();

	public abstract void getSize(SizeReadyCallback sizereadycallback);

	public abstract void onLoadCleared(Drawable drawable);

	public abstract void onLoadFailed(Drawable drawable);

	public abstract void onLoadStarted(Drawable drawable);

	public abstract void onResourceReady(Object obj, Transition transition);

	public abstract void removeCallback(SizeReadyCallback sizereadycallback);

	public abstract void setRequest(Request request);

	public static final int SIZE_ORIGINAL = 0x80000000;
}
