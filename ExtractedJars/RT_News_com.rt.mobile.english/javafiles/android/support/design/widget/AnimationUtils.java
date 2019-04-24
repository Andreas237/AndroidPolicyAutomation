// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.animation.*;
import android.view.animation.*;

class AnimationUtils
{

	AnimationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	static float lerp(float f, float f1, float f2)
	{
		return f + f2 * (f1 - f);
	//    0    0:fload_0         
	//    1    1:fload_2         
	//    2    2:fload_1         
	//    3    3:fload_0         
	//    4    4:fsub            
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:freturn         
	}

	static int lerp(int i, int j, float f)
	{
		return i + Math.round(f * (float)(j - i));
	//    0    0:iload_0         
	//    1    1:fload_2         
	//    2    2:iload_1         
	//    3    3:iload_0         
	//    4    4:isub            
	//    5    5:i2f             
	//    6    6:fmul            
	//    7    7:invokestatic    #50  <Method int Math.round(float)>
	//    8   10:iadd            
	//    9   11:ireturn         
	}

	static final Interpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
	static final Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
	static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
	static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
	static final Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();

	static 
	{
	//    0    0:new             #14  <Class LinearInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void LinearInterpolator()>
	//    3    7:putstatic       #19  <Field Interpolator LINEAR_INTERPOLATOR>
	//    4   10:new             #21  <Class FastOutSlowInInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void FastOutSlowInInterpolator()>
	//    7   17:putstatic       #24  <Field Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR>
	//    8   20:new             #26  <Class FastOutLinearInInterpolator>
	//    9   23:dup             
	//   10   24:invokespecial   #27  <Method void FastOutLinearInInterpolator()>
	//   11   27:putstatic       #29  <Field Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   12   30:new             #31  <Class LinearOutSlowInInterpolator>
	//   13   33:dup             
	//   14   34:invokespecial   #32  <Method void LinearOutSlowInInterpolator()>
	//   15   37:putstatic       #34  <Field Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   16   40:new             #36  <Class DecelerateInterpolator>
	//   17   43:dup             
	//   18   44:invokespecial   #37  <Method void DecelerateInterpolator()>
	//   19   47:putstatic       #39  <Field Interpolator DECELERATE_INTERPOLATOR>
	//*  20   50:return          
	}
}
