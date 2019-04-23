// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.view.MotionEvent;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SimpleSwipeDismissTouchListener

private final class SimpleSwipeDismissTouchListener$SwipeGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
{

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		f1 = motionevent1.getX() - motionevent.getX();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #33  <Method float MotionEvent.getX()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method float MotionEvent.getX()>
	//    4    8:fsub            
	//    5    9:fstore          4
		float f2 = motionevent1.getY();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #36  <Method float MotionEvent.getY()>
	//    8   15:fstore          5
		float f3 = motionevent.getY();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #36  <Method float MotionEvent.getY()>
	//   11   21:fstore          6
		if(Math.abs(f1) > Math.abs(f2 - f3) && Math.abs(f1) > 120F && Math.abs(f) > 90F)
	//*  12   23:fload           4
	//*  13   25:invokestatic    #42  <Method float Math.abs(float)>
	//*  14   28:fload           5
	//*  15   30:fload           6
	//*  16   32:fsub            
	//*  17   33:invokestatic    #42  <Method float Math.abs(float)>
	//*  18   36:fcmpl           
	//*  19   37:ifle            87
	//*  20   40:fload           4
	//*  21   42:invokestatic    #42  <Method float Math.abs(float)>
	//*  22   45:ldc1            #43  <Float 120F>
	//*  23   47:fcmpl           
	//*  24   48:ifle            87
	//*  25   51:fload_3         
	//*  26   52:invokestatic    #42  <Method float Math.abs(float)>
	//*  27   55:ldc1            #44  <Float 90F>
	//*  28   57:fcmpl           
	//*  29   58:ifle            87
		{
			if(f1 > 0.0F)
	//*  30   61:fload           4
	//*  31   63:fconst_0        
	//*  32   64:fcmpl           
	//*  33   65:ifle            78
				onSwipeRight();
	//   34   68:aload_0         
	//   35   69:getfield        #18  <Field SimpleSwipeDismissTouchListener this$0>
	//   36   72:invokevirtual   #47  <Method void SimpleSwipeDismissTouchListener.onSwipeRight()>
			else
	//*  37   75:goto            85
				onSwipeLeft();
	//   38   78:aload_0         
	//   39   79:getfield        #18  <Field SimpleSwipeDismissTouchListener this$0>
	//   40   82:invokevirtual   #50  <Method void SimpleSwipeDismissTouchListener.onSwipeLeft()>
			return true;
	//   41   85:iconst_1        
	//   42   86:ireturn         
		} else
		{
			return false;
	//   43   87:iconst_0        
	//   44   88:ireturn         
		}
	}

	private static final int SWIPE_DISTANCE_THRESHOLD = 120;
	private static final int SWIPE_VELOCITY_THRESHOLD = 90;
	final SimpleSwipeDismissTouchListener this$0;

	private SimpleSwipeDismissTouchListener$SwipeGestureListener()
	{
		this$0 = SimpleSwipeDismissTouchListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SimpleSwipeDismissTouchListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
	//    5    9:return          
	}

	SimpleSwipeDismissTouchListener$SwipeGestureListener(SimpleSwipeDismissTouchListener._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void SimpleSwipeDismissTouchListener$SwipeGestureListener(SimpleSwipeDismissTouchListener)>
	//    3    5:return          
	}
}
