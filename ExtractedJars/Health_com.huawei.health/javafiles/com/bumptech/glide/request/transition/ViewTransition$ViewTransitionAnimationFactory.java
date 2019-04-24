// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;

// Referenced classes of package com.bumptech.glide.request.transition:
//			ViewTransition

static interface ViewTransition$ViewTransitionAnimationFactory
{

	public abstract Animation build(Context context);
}
