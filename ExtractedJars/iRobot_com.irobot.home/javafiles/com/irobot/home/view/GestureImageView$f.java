// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.irobot.home.view:
//			GestureImageView

private class GestureImageView$f extends android.view.r.SimpleOnScaleGestureListener
{

	public boolean onScale(ScaleGestureDetector scalegesturedetector)
	{
		GestureImageView.a(a, scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field GestureImageView a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method float ScaleGestureDetector.getScaleFactor()>
	//    4    8:f2d             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #31  <Method float ScaleGestureDetector.getFocusX()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #34  <Method float ScaleGestureDetector.getFocusY()>
	//    9   17:invokestatic    #37  <Method void GestureImageView.a(GestureImageView, double, float, float)>
		return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
	{
		GestureImageView.a(a, GestureImageView$g.ZOOM);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field GestureImageView a>
	//    2    4:getstatic       #44  <Field GestureImageView$g GestureImageView$g.ZOOM>
	//    3    7:invokestatic    #47  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
	}

	public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
	{
		super.onScaleEnd(scalegesturedetector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener.onScaleEnd(ScaleGestureDetector)>
		GestureImageView.a(a, GestureImageView$g.NONE);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field GestureImageView a>
	//    5    9:getstatic       #54  <Field GestureImageView$g GestureImageView$g.NONE>
	//    6   12:invokestatic    #47  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
	//    7   15:return          
	}

	final GestureImageView a;

	private GestureImageView$f(GestureImageView gestureimageview)
	{
		a = gestureimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field GestureImageView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener()>
	//    5    9:return          
	}

	GestureImageView$f(GestureImageView gestureimageview, GestureImageView$1 gestureimageview$1)
	{
		this(gestureimageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void GestureImageView$f(GestureImageView)>
	//    3    5:return          
	}
}
