// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MotionEvent;

public final class MotionEventCompat
{

	private MotionEventCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #112 <Method void Object()>
	//    2    4:return          
	}

	public static int findPointerIndex(MotionEvent motionevent, int i)
	{
		return motionevent.findPointerIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #120 <Method int MotionEvent.findPointerIndex(int)>
	//    3    5:ireturn         
	}

	public static int getActionIndex(MotionEvent motionevent)
	{
		return motionevent.getActionIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method int MotionEvent.getActionIndex()>
	//    2    4:ireturn         
	}

	public static int getActionMasked(MotionEvent motionevent)
	{
		return motionevent.getActionMasked();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method int MotionEvent.getActionMasked()>
	//    2    4:ireturn         
	}

	public static float getAxisValue(MotionEvent motionevent, int i)
	{
		return motionevent.getAxisValue(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #134 <Method float MotionEvent.getAxisValue(int)>
	//    3    5:freturn         
	}

	public static float getAxisValue(MotionEvent motionevent, int i, int j)
	{
		return motionevent.getAxisValue(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #138 <Method float MotionEvent.getAxisValue(int, int)>
	//    4    6:freturn         
	}

	public static int getButtonState(MotionEvent motionevent)
	{
		return motionevent.getButtonState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method int MotionEvent.getButtonState()>
	//    2    4:ireturn         
	}

	public static int getPointerCount(MotionEvent motionevent)
	{
		return motionevent.getPointerCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method int MotionEvent.getPointerCount()>
	//    2    4:ireturn         
	}

	public static int getPointerId(MotionEvent motionevent, int i)
	{
		return motionevent.getPointerId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #147 <Method int MotionEvent.getPointerId(int)>
	//    3    5:ireturn         
	}

	public static int getSource(MotionEvent motionevent)
	{
		return motionevent.getSource();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int MotionEvent.getSource()>
	//    2    4:ireturn         
	}

	public static float getX(MotionEvent motionevent, int i)
	{
		return motionevent.getX(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #153 <Method float MotionEvent.getX(int)>
	//    3    5:freturn         
	}

	public static float getY(MotionEvent motionevent, int i)
	{
		return motionevent.getY(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #156 <Method float MotionEvent.getY(int)>
	//    3    5:freturn         
	}

	public static boolean isFromSource(MotionEvent motionevent, int i)
	{
		return (motionevent.getSource() & i) == i;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method int MotionEvent.getSource()>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public static final int ACTION_HOVER_ENTER = 9;
	public static final int ACTION_HOVER_EXIT = 10;
	public static final int ACTION_HOVER_MOVE = 7;
	public static final int ACTION_MASK = 255;
	public static final int ACTION_POINTER_DOWN = 5;
	public static final int ACTION_POINTER_INDEX_MASK = 65280;
	public static final int ACTION_POINTER_INDEX_SHIFT = 8;
	public static final int ACTION_POINTER_UP = 6;
	public static final int ACTION_SCROLL = 8;
	public static final int AXIS_BRAKE = 23;
	public static final int AXIS_DISTANCE = 24;
	public static final int AXIS_GAS = 22;
	public static final int AXIS_GENERIC_1 = 32;
	public static final int AXIS_GENERIC_10 = 41;
	public static final int AXIS_GENERIC_11 = 42;
	public static final int AXIS_GENERIC_12 = 43;
	public static final int AXIS_GENERIC_13 = 44;
	public static final int AXIS_GENERIC_14 = 45;
	public static final int AXIS_GENERIC_15 = 46;
	public static final int AXIS_GENERIC_16 = 47;
	public static final int AXIS_GENERIC_2 = 33;
	public static final int AXIS_GENERIC_3 = 34;
	public static final int AXIS_GENERIC_4 = 35;
	public static final int AXIS_GENERIC_5 = 36;
	public static final int AXIS_GENERIC_6 = 37;
	public static final int AXIS_GENERIC_7 = 38;
	public static final int AXIS_GENERIC_8 = 39;
	public static final int AXIS_GENERIC_9 = 40;
	public static final int AXIS_HAT_X = 15;
	public static final int AXIS_HAT_Y = 16;
	public static final int AXIS_HSCROLL = 10;
	public static final int AXIS_LTRIGGER = 17;
	public static final int AXIS_ORIENTATION = 8;
	public static final int AXIS_PRESSURE = 2;
	public static final int AXIS_RELATIVE_X = 27;
	public static final int AXIS_RELATIVE_Y = 28;
	public static final int AXIS_RTRIGGER = 18;
	public static final int AXIS_RUDDER = 20;
	public static final int AXIS_RX = 12;
	public static final int AXIS_RY = 13;
	public static final int AXIS_RZ = 14;
	public static final int AXIS_SCROLL = 26;
	public static final int AXIS_SIZE = 3;
	public static final int AXIS_THROTTLE = 19;
	public static final int AXIS_TILT = 25;
	public static final int AXIS_TOOL_MAJOR = 6;
	public static final int AXIS_TOOL_MINOR = 7;
	public static final int AXIS_TOUCH_MAJOR = 4;
	public static final int AXIS_TOUCH_MINOR = 5;
	public static final int AXIS_VSCROLL = 9;
	public static final int AXIS_WHEEL = 21;
	public static final int AXIS_X = 0;
	public static final int AXIS_Y = 1;
	public static final int AXIS_Z = 11;
	public static final int BUTTON_PRIMARY = 1;
}
