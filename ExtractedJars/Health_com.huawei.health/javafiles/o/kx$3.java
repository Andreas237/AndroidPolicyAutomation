// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;

// Referenced classes of package o:
//			kx, kt

class kx$3 extends android.view.reDetector.SimpleOnGestureListener
{

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		if(kx.a(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field kx b>
	//*   2    4:invokestatic    #24  <Method kt kx.a(kx)>
	//*   3    7:ifnull          66
		{
			if(b.b() > kx.g())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field kx b>
	//*   6   14:invokevirtual   #27  <Method float kx.b()>
	//*   7   17:invokestatic    #30  <Method float kx.g()>
	//*   8   20:fcmpl           
	//*   9   21:ifle            26
				return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
			if(MotionEventCompat.getPointerCount(motionevent) > kx.k() || MotionEventCompat.getPointerCount(motionevent1) > kx.k())
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #36  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
	//*  14   30:invokestatic    #40  <Method int kx.k()>
	//*  15   33:icmpgt          46
	//*  16   36:aload_2         
	//*  17   37:invokestatic    #36  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
	//*  18   40:invokestatic    #40  <Method int kx.k()>
	//*  19   43:icmple          48
				return false;
	//   20   46:iconst_0        
	//   21   47:ireturn         
			else
				return kx.a(b).d(motionevent, motionevent1, f, f1);
	//   22   48:aload_0         
	//   23   49:getfield        #14  <Field kx b>
	//   24   52:invokestatic    #24  <Method kt kx.a(kx)>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:fload_3         
	//   28   58:fload           4
	//   29   60:invokeinterface #45  <Method boolean kt.d(MotionEvent, MotionEvent, float, float)>
	//   30   65:ireturn         
		} else
		{
			return false;
	//   31   66:iconst_0        
	//   32   67:ireturn         
		}
	}

	public void onLongPress(MotionEvent motionevent)
	{
		if(kx.d(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field kx b>
	//*   2    4:invokestatic    #50  <Method android.view.View$OnLongClickListener kx.d(kx)>
	//*   3    7:ifnull          30
			kx.d(b).onLongClick(((android.view.View) (kx.c(b))));
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field kx b>
	//    6   14:invokestatic    #50  <Method android.view.View$OnLongClickListener kx.d(kx)>
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field kx b>
	//    9   21:invokestatic    #54  <Method android.widget.ImageView kx.c(kx)>
	//   10   24:invokeinterface #60  <Method boolean android.view.View$OnLongClickListener.onLongClick(android.view.View)>
	//   11   29:pop             
	//   12   30:return          
	}

	final kx b;

	kx$3(kx kx1)
	{
		b = kx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field kx b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}
}
