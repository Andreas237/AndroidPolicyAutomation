// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.view.MotionEvent;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$3
	implements android.view.nGestureListener
{

	public boolean onDown(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onLongPress(MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onShowPress(MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		playerTapped();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
	//    2    4:invokevirtual   #33  <Method void APSMediaPlayer.playerTapped()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$3()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
