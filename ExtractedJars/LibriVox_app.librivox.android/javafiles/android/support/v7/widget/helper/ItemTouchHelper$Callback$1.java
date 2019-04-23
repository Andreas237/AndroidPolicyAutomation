// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.view.animation.Interpolator;

final class ItemTouchHelper$Callback$1
	implements Interpolator
{

	public float getInterpolation(float f)
	{
		return f * f * f * f * f;
	//    0    0:fload_1         
	//    1    1:fload_1         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fmul            
	//    5    5:fload_1         
	//    6    6:fmul            
	//    7    7:fload_1         
	//    8    8:fmul            
	//    9    9:freturn         
	}

	ItemTouchHelper$Callback$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
