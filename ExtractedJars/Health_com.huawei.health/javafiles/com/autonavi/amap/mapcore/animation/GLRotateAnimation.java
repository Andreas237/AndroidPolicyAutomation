// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;


// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLRotateAnimation extends GLAnimation
{

	public GLRotateAnimation(float f, float f1, float f2, float f3, float f4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void GLAnimation()>
		mFromDegrees = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #14  <Field float mFromDegrees>
		mToDegrees = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #16  <Field float mToDegrees>
		mFromDegrees = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #14  <Field float mFromDegrees>
		mToDegrees = f1;
	//   11   19:aload_0         
	//   12   20:fload_2         
	//   13   21:putfield        #16  <Field float mToDegrees>
	//   14   24:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
		gltransformation.rotate = mFromDegrees + (mToDegrees - mFromDegrees) * f;
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field float mFromDegrees>
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field float mToDegrees>
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field float mFromDegrees>
	//    7   13:fsub            
	//    8   14:fload_1         
	//    9   15:fmul            
	//   10   16:fadd            
	//   11   17:f2d             
	//   12   18:putfield        #25  <Field double GLTransformation.rotate>
	//   13   21:return          
	}

	private float mFromDegrees;
	private float mToDegrees;
}
