// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide:
//			ListPreloader

private static final class ListPreloader$PreloadTarget extends BaseTarget
{

	public void getSize(SizeReadyCallback sizereadycallback)
	{
		sizereadycallback.onSizeReady(photoWidth, photoHeight);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int photoWidth>
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field int photoHeight>
	//    5    9:invokeinterface #29  <Method void SizeReadyCallback.onSizeReady(int, int)>
	//    6   14:return          
	}

	public void onResourceReady(Object obj, Transition transition)
	{
	//    0    0:return          
	}

	public void removeCallback(SizeReadyCallback sizereadycallback)
	{
	//    0    0:return          
	}

	int photoHeight;
	int photoWidth;

	ListPreloader$PreloadTarget()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseTarget()>
	//    2    4:return          
	}
}
