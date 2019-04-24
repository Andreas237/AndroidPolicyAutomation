// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.request.transition:
//			BitmapContainerTransitionFactory, TransitionFactory

public class BitmapTransitionFactory extends BitmapContainerTransitionFactory
{

	public BitmapTransitionFactory(TransitionFactory transitionfactory)
	{
		super(transitionfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void BitmapContainerTransitionFactory(TransitionFactory)>
	//    3    5:return          
	}

	protected Bitmap getBitmap(Bitmap bitmap)
	{
		return bitmap;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected volatile Bitmap getBitmap(Object obj)
	{
		return getBitmap((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Bitmap>
	//    3    5:invokevirtual   #22  <Method Bitmap getBitmap(Bitmap)>
	//    4    8:areturn         
	}
}
