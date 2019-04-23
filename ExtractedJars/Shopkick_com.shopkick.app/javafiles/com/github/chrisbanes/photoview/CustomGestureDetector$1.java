// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.github.chrisbanes.photoview:
//			CustomGestureDetector, OnGestureListener

class CustomGestureDetector$1
	implements android.view.caleGestureListener
{

	public boolean onScale(ScaleGestureDetector scalegesturedetector)
	{
		float f = scalegesturedetector.getScaleFactor();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method float ScaleGestureDetector.getScaleFactor()>
	//    2    4:fstore_2        
		if(!Float.isNaN(f) && !Float.isInfinite(f))
	//*   3    5:fload_2         
	//*   4    6:invokestatic    #34  <Method boolean Float.isNaN(float)>
	//*   5    9:ifne            45
	//*   6   12:fload_2         
	//*   7   13:invokestatic    #37  <Method boolean Float.isInfinite(float)>
	//*   8   16:ifeq            22
	//*   9   19:goto            45
		{
			CustomGestureDetector.access$000(CustomGestureDetector.this).onScale(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field CustomGestureDetector this$0>
	//   12   26:invokestatic    #41  <Method OnGestureListener CustomGestureDetector.access$000(CustomGestureDetector)>
	//   13   29:fload_2         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #44  <Method float ScaleGestureDetector.getFocusX()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #47  <Method float ScaleGestureDetector.getFocusY()>
	//   18   38:invokeinterface #52  <Method void OnGestureListener.onScale(float, float, float)>
			return true;
	//   19   43:iconst_1        
	//   20   44:ireturn         
		} else
		{
			return false;
	//   21   45:iconst_0        
	//   22   46:ireturn         
		}
	}

	public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
	{
	//    0    0:return          
	}

	final CustomGestureDetector this$0;

	CustomGestureDetector$1()
	{
		this$0 = CustomGestureDetector.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CustomGestureDetector this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
