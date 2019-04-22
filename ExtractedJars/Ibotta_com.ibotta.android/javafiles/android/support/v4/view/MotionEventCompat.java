// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MotionEvent;

public final class MotionEventCompat
{

	public static int findPointerIndex(MotionEvent motionevent, int i)
	{
		return motionevent.findPointerIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #12  <Method int MotionEvent.findPointerIndex(int)>
	//    3    5:ireturn         
	}

	public static int getActionIndex(MotionEvent motionevent)
	{
		return motionevent.getActionIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int MotionEvent.getActionIndex()>
	//    2    4:ireturn         
	}

	public static int getPointerId(MotionEvent motionevent, int i)
	{
		return motionevent.getPointerId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #22  <Method int MotionEvent.getPointerId(int)>
	//    3    5:ireturn         
	}

	public static float getX(MotionEvent motionevent, int i)
	{
		return motionevent.getX(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method float MotionEvent.getX(int)>
	//    3    5:freturn         
	}

	public static boolean isFromSource(MotionEvent motionevent, int i)
	{
		return (motionevent.getSource() & i) == i;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int MotionEvent.getSource()>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}
}
