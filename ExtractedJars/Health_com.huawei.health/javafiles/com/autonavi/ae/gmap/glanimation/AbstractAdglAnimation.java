// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;


public abstract class AbstractAdglAnimation
{

	public AbstractAdglAnimation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		duration = 300;
	//    2    4:aload_0         
	//    3    5:sipush          300
	//    4    8:putfield        #35  <Field int duration>
		isOver = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #37  <Field boolean isOver>
		startTime = -1L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #38  <Long -1L>
	//   10   20:putfield        #41  <Field long startTime>
		offsetTime = 0L;
	//   11   23:aload_0         
	//   12   24:lconst_0        
	//   13   25:putfield        #43  <Field long offsetTime>
	//   14   28:return          
	}

	public abstract void doAnimation(Object obj);

	public boolean isOver()
	{
		return isOver;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean isOver>
	//    2    4:ireturn         
	}

	public boolean isValid()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static final int DEFAULT_DURATION = 250;
	public static final int INTERPOLATOR_ACCELERATE = 1;
	public static final int INTERPOLATOR_ACCELERATE_DECELERATE = 3;
	public static final int INTERPOLATOR_BOUNCE = 4;
	public static final int INTERPOLATOR_DECELERATE = 2;
	public static final int INTERPOLATOR_DOUBLE_RAISE = 6;
	public static final int INTERPOLATOR_LINEAR = 0;
	public static final int INTERPOLATOR_OVERSHOOT = 5;
	public static final int INVALIDE_VALUE = -9999;
	protected int duration;
	protected boolean isOver;
	protected long offsetTime;
	protected long startTime;
}
