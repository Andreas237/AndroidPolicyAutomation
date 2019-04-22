// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.bumptech.glide.request.transition:
//			Transition

public static interface Transition$ViewAdapter
{

	public abstract Drawable getCurrentDrawable();

	public abstract View getView();

	public abstract void setDrawable(Drawable drawable);
}
