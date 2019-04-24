// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.ScaleGestureDetector;

// Referenced classes of package o:
//			kr, ks

class kr$3
	implements android.view.GestureDetector.OnScaleGestureListener
{

	public boolean onScale(ScaleGestureDetector scalegesturedetector)
	{
		float f = scalegesturedetector.getScaleFactor();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method float ScaleGestureDetector.getScaleFactor()>
	//    2    4:fstore_2        
		if(Float.isNaN(f) || Float.isInfinite(f))
	//*   3    5:fload_2         
	//*   4    6:invokestatic    #34  <Method boolean Float.isNaN(float)>
	//*   5    9:ifne            19
	//*   6   12:fload_2         
	//*   7   13:invokestatic    #37  <Method boolean Float.isInfinite(float)>
	//*   8   16:ifeq            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			kr.b(d).d(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field kr d>
	//   13   25:invokestatic    #41  <Method ks kr.b(kr)>
	//   14   28:fload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #44  <Method float ScaleGestureDetector.getFocusX()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #47  <Method float ScaleGestureDetector.getFocusY()>
	//   19   37:invokeinterface #52  <Method void ks.d(float, float, float)>
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
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

	final kr d;

	kr$3(kr kr1)
	{
		d = kr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field kr d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
