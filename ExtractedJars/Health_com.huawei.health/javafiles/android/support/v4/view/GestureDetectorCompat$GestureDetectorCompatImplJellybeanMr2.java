// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//			GestureDetectorCompat

static class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2
	implements GestureDetectorCompat.GestureDetectorCompatImpl
{

	public boolean isLongpressEnabled()
	{
		return mDetector.isLongpressEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field GestureDetector mDetector>
	//    2    4:invokevirtual   #27  <Method boolean GestureDetector.isLongpressEnabled()>
	//    3    7:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		return mDetector.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field GestureDetector mDetector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//    4    8:ireturn         
	}

	public void setIsLongpressEnabled(boolean flag)
	{
		mDetector.setIsLongpressEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field GestureDetector mDetector>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #35  <Method void GestureDetector.setIsLongpressEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		mDetector.setOnDoubleTapListener(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field GestureDetector mDetector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
	//    4    8:return          
	}

	private final GestureDetector mDetector;

	public GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mDetector = new GestureDetector(context, ongesturelistener, handler);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class GestureDetector>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #20  <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener, Handler)>
	//    9   15:putfield        #22  <Field GestureDetector mDetector>
	//   10   18:return          
	}
}
