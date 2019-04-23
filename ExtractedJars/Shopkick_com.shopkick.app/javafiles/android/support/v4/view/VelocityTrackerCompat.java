// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.VelocityTracker;

public final class VelocityTrackerCompat
{

	private VelocityTrackerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static float getXVelocity(VelocityTracker velocitytracker, int i)
	{
		return velocitytracker.getXVelocity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #17  <Method float VelocityTracker.getXVelocity(int)>
	//    3    5:freturn         
	}

	public static float getYVelocity(VelocityTracker velocitytracker, int i)
	{
		return velocitytracker.getYVelocity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #21  <Method float VelocityTracker.getYVelocity(int)>
	//    3    5:freturn         
	}
}
