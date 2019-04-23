// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.support.v4.view.GestureDetectorCompat;
import android.view.*;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$4
	implements android.view.ner
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		view.performClick();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method boolean View.performClick()>
	//    2    4:pop             
		if(motionevent.getPointerCount() > 1)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #35  <Method int MotionEvent.getPointerCount()>
	//*   5    9:iconst_1        
	//*   6   10:icmple          27
		{
			APSMediaPlayer.access$000(APSMediaPlayer.this).onTouchEvent(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field APSMediaPlayer this$0>
	//    9   17:invokestatic    #39  <Method ScaleGestureDetector APSMediaPlayer.access$000(APSMediaPlayer)>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #45  <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
	//   12   24:pop             
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		} else
		{
			APSMediaPlayer.access$100(APSMediaPlayer.this).onTouchEvent(motionevent);
	//   15   27:aload_0         
	//   16   28:getfield        #17  <Field APSMediaPlayer this$0>
	//   17   31:invokestatic    #49  <Method GestureDetectorCompat APSMediaPlayer.access$100(APSMediaPlayer)>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #52  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
	//   20   38:pop             
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		}
	}

	final APSMediaPlayer this$0;

	APSMediaPlayer$4()
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
