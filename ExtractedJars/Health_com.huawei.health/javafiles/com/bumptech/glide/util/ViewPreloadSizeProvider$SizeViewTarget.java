// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.view.View;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide.util:
//			ViewPreloadSizeProvider

static final class ViewPreloadSizeProvider$SizeViewTarget extends ViewTarget
{

	public void onResourceReady(Object obj, Transition transition)
	{
	//    0    0:return          
	}

	public ViewPreloadSizeProvider$SizeViewTarget(View view, SizeReadyCallback sizereadycallback)
	{
		super(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ViewTarget(View)>
		getSize(sizereadycallback);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #17  <Method void getSize(SizeReadyCallback)>
	//    6   10:return          
	}
}
