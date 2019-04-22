// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SwipeDismissTouchListener

public class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener
{
	public static interface ITouchListener
	{

		public abstract void onTouchEnded();

		public abstract void onTouchStartedOrContinued();
	}


	public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismisscallbacks)
	{
		super(view, obj, dismisscallbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void SwipeDismissTouchListener(View, Object, SwipeDismissTouchListener$DismissCallbacks)>
	//    5    7:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		int i = motionevent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #22  <Method int MotionEvent.getAction()>
	//    2    4:istore_3        
		if(i == 3) goto _L2; else goto _L1
	//    3    5:iload_3         
	//    4    6:iconst_3        
	//    5    7:icmpeq          56
_L1:
		i;
	//    6   10:iload_3         
		JVM INSTR tableswitch 0 1: default 32
	//	               0 35
	//	               1 56;
	//    7   11:tableswitch     0 1: default 32
	//	               0 35
	//	               1 56
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//    8   32:goto            74
_L4:
		ITouchListener itouchlistener = mTouchListener;
	//    9   35:aload_0         
	//   10   36:getfield        #24  <Field TouchAwareSwipeDismissTouchListener$ITouchListener mTouchListener>
	//   11   39:astore          4
		if(itouchlistener != null)
	//*  12   41:aload           4
	//*  13   43:ifnull          74
			itouchlistener.onTouchStartedOrContinued();
	//   14   46:aload           4
	//   15   48:invokeinterface #28  <Method void TouchAwareSwipeDismissTouchListener$ITouchListener.onTouchStartedOrContinued()>
		break; /* Loop/switch isn't completed */
	//   16   53:goto            74
_L2:
		ITouchListener itouchlistener1 = mTouchListener;
	//   17   56:aload_0         
	//   18   57:getfield        #24  <Field TouchAwareSwipeDismissTouchListener$ITouchListener mTouchListener>
	//   19   60:astore          4
		if(itouchlistener1 != null)
	//*  20   62:aload           4
	//*  21   64:ifnull          74
			itouchlistener1.onTouchEnded();
	//   22   67:aload           4
	//   23   69:invokeinterface #31  <Method void TouchAwareSwipeDismissTouchListener$ITouchListener.onTouchEnded()>
		return super.onTouch(view, motionevent);
	//   24   74:aload_0         
	//   25   75:aload_1         
	//   26   76:aload_2         
	//   27   77:invokespecial   #33  <Method boolean SwipeDismissTouchListener.onTouch(View, MotionEvent)>
	//   28   80:ireturn         
	}

	public void setTouchListener(ITouchListener itouchlistener)
	{
		mTouchListener = itouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field TouchAwareSwipeDismissTouchListener$ITouchListener mTouchListener>
	//    3    5:return          
	}

	private ITouchListener mTouchListener;
}
