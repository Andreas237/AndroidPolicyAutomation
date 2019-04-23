// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$2 extends android.view.tor.SimpleOnScaleGestureListener
{

	public boolean onScale(ScaleGestureDetector scalegesturedetector)
	{
		userPinched(scalegesturedetector.getScaleFactor());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field APSMediaPlayer this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method float ScaleGestureDetector.getScaleFactor()>
	//    4    8:invokevirtual   #31  <Method void APSMediaPlayer.userPinched(float)>
		return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
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

	final APSMediaPlayer this$0;

	APSMediaPlayer$2()
	{
		this$0 = APSMediaPlayer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field APSMediaPlayer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener()>
	//    5    9:return          
	}
}
