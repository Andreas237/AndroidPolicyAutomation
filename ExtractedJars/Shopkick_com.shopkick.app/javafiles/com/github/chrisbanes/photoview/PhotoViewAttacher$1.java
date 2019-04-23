// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;

// Referenced classes of package com.github.chrisbanes.photoview:
//			PhotoViewAttacher, OnSingleFlingListener

class PhotoViewAttacher$1 extends android.view.leOnGestureListener
{

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		if(PhotoViewAttacher.access$200(PhotoViewAttacher.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field PhotoViewAttacher this$0>
	//*   2    4:invokestatic    #24  <Method OnSingleFlingListener PhotoViewAttacher.access$200(PhotoViewAttacher)>
	//*   3    7:ifnull          68
		{
			if(getScale() > PhotoViewAttacher.access$300())
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field PhotoViewAttacher this$0>
	//*   6   14:invokevirtual   #28  <Method float PhotoViewAttacher.getScale()>
	//*   7   17:invokestatic    #31  <Method float PhotoViewAttacher.access$300()>
	//*   8   20:fcmpl           
	//*   9   21:ifle            26
				return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
			if(MotionEventCompat.getPointerCount(motionevent) <= PhotoViewAttacher.access$400())
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #37  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
	//*  14   30:invokestatic    #41  <Method int PhotoViewAttacher.access$400()>
	//*  15   33:icmpgt          66
			{
				if(MotionEventCompat.getPointerCount(motionevent1) > PhotoViewAttacher.access$400())
	//*  16   36:aload_2         
	//*  17   37:invokestatic    #37  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
	//*  18   40:invokestatic    #41  <Method int PhotoViewAttacher.access$400()>
	//*  19   43:icmple          48
					return false;
	//   20   46:iconst_0        
	//   21   47:ireturn         
				else
					return PhotoViewAttacher.access$200(PhotoViewAttacher.this).onFling(motionevent, motionevent1, f, f1);
	//   22   48:aload_0         
	//   23   49:getfield        #14  <Field PhotoViewAttacher this$0>
	//   24   52:invokestatic    #24  <Method OnSingleFlingListener PhotoViewAttacher.access$200(PhotoViewAttacher)>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:fload_3         
	//   28   58:fload           4
	//   29   60:invokeinterface #45  <Method boolean OnSingleFlingListener.onFling(MotionEvent, MotionEvent, float, float)>
	//   30   65:ireturn         
			} else
			{
				return false;
	//   31   66:iconst_0        
	//   32   67:ireturn         
			}
		} else
		{
			return false;
	//   33   68:iconst_0        
	//   34   69:ireturn         
		}
	}

	public void onLongPress(MotionEvent motionevent)
	{
		if(PhotoViewAttacher.access$000(PhotoViewAttacher.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field PhotoViewAttacher this$0>
	//*   2    4:invokestatic    #51  <Method android.view.View$OnLongClickListener PhotoViewAttacher.access$000(PhotoViewAttacher)>
	//*   3    7:ifnull          30
			PhotoViewAttacher.access$000(PhotoViewAttacher.this).onLongClick(((android.view.View) (PhotoViewAttacher.access$100(PhotoViewAttacher.this))));
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field PhotoViewAttacher this$0>
	//    6   14:invokestatic    #51  <Method android.view.View$OnLongClickListener PhotoViewAttacher.access$000(PhotoViewAttacher)>
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field PhotoViewAttacher this$0>
	//    9   21:invokestatic    #55  <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   10   24:invokeinterface #61  <Method boolean android.view.View$OnLongClickListener.onLongClick(android.view.View)>
	//   11   29:pop             
	//   12   30:return          
	}

	final PhotoViewAttacher this$0;

	PhotoViewAttacher$1()
	{
		this$0 = PhotoViewAttacher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PhotoViewAttacher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}
}
